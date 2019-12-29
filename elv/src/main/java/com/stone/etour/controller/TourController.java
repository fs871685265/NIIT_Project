package com.stone.etour.controller;

import com.stone.etour.bean.EtourUser;
import com.stone.etour.bean.Order;
import com.stone.etour.bean.Page;
import com.stone.etour.bean.Tour;
import com.stone.etour.service.TourService;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@SuppressWarnings("Duplicates")
@Controller
@RequestMapping("/tour")
public class TourController {
    private static final String DEST_FILE_DIR = "d:/upload";

    @Autowired
    TourService tourService;

    @RequestMapping("/add")
    public String addTour(Tour tour,
                          @RequestParam("pic") MultipartFile file) throws IOException {

        String tourNum = UUID.randomUUID().toString().replaceAll("-", "");

        //添加图片
        String oldFilename = file.getOriginalFilename();
        String suffix = FilenameUtils.getExtension(oldFilename);
        String newName = tourNum + "." + suffix;
        File destFile = new File("d:/upload", newName);
        file.transferTo(destFile);
        tour.setSavePath("/etour/pic/" + newName);
        System.out.println(tour.getType());
        //添加其他字段
        tour.setTourNum(tourNum);
        tour.setPeopleNum(0);
        tour.setTotal((double) 0);
        tour.setStatus(0);

        tourService.addTour(tour);
        return "admin";
    }

    @RequestMapping("/list")
    @ResponseBody
    public Page<Tour> queryList(
            @RequestParam(required=false,defaultValue="1") int pageNumber,
            @RequestParam(required=false,defaultValue="2") int pageSize,
            @RequestParam("tourname") String name
    ){
        Page<Tour> page = tourService.queryWithConditions(pageNumber,pageSize,name);
        return page;
    }

    @RequestMapping("/changeStatus")
    @ResponseBody
    public String changeStatus(@RequestParam("id") String id){
        System.out.println(id);
        Tour tour = tourService.queryOneById(id);
        if(tour.getStatus()==0){
            tour.setStatus(1);
            tourService.updateTour(tour);
            return "success";
        }else{
            tour.setStatus(0);
            tourService.updateTour(tour);
            return "success";
        }
    }

    @RequestMapping("/updateTour")
    public String updateUser(Tour tour,
                             @RequestParam("tourPic") MultipartFile file,
                             @RequestParam("hiddenPic") String hpic
    ) throws IOException {
        if ((int) file.getSize() != 0) {
            String oldname = file.getOriginalFilename();
            String suffix = FilenameUtils.getExtension(oldname);
            //获取一个新的文件名
            String newName = UUID.randomUUID().toString().replaceAll("-", "") + "." + suffix;
            //创建新的文件
            File destFile = new File(DEST_FILE_DIR, newName);
            file.transferTo(destFile);
            tour.setSavePath("/etour/pic/" + newName);
        } else {
            tour.setSavePath(hpic);
        }
        tourService.fix(tour);
        System.out.println("更新了吗？");
        return "redirect:/page/to_admin";
    }


    @RequestMapping("/xq")
    @ResponseBody
    public Tour queryOneById(
            @RequestParam("tourid") String tourId
    ){
        Tour tour = tourService.queryOneById(tourId);
        return tour;
    }

    @RequestMapping("/order")
    public String Order(
            @RequestParam("hiddenId") String id,
            @RequestParam("hiddenTotal") String total,
            @RequestParam("number") String number,
            @RequestParam("hiddenuser") String user
    ){
        Tour tour = tourService.queryOneById(id);
        tour.setTotal(tour.getTotal()+ Double.parseDouble(total));
        tour.setPeopleNum(tour.getPeopleNum()+ Integer.parseInt(number));
        tourService.updateTour(tour);
        Order order = new Order();
        order.setoName(tour.getName());
        order.setoPrice(Double.parseDouble(total));
        order.setoSimpleDes(tour.getSimpleDes());
        order.setoUser(user);
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        order.setoTime(sdf.format(date));
        tourService.addOrder(order);
        return "redirect:/page/to_order";
    }

    @RequestMapping("/orderList")
    @ResponseBody
    public Page<Order> getOrderList(Model model,
                                    @RequestParam(required=false,defaultValue="1") int pageNumber,
                                    @RequestParam(required=false,defaultValue="2") int pageSize,
                                    @RequestParam("userName") String name
    ){
        Page<Order> page = tourService.queryOrderWithUser(pageNumber,pageSize,name);
        model.addAttribute("page", page);
        return page;
    }

    @RequestMapping("/deleteOrder")
    public String updateUser(HttpServletRequest request,
                             EtourUser user,
                             @RequestParam("oId") int id
    ){
        tourService.deleteOrder(id);
        System.out.println("success============");
        return "redirect:/page/to_order";
    }

}

package com.stone.etour.controller;

import com.stone.etour.bean.EtourUser;
import com.stone.etour.exception.LoginException;
import com.stone.etour.service.UserService;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * User 登录注册
 */

@SuppressWarnings("Duplicates")
@Controller
@RequestMapping("/user")
public class UserController {
    private static final String DEST_FILE_DIR = "d:/upload";

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String login(HttpServletRequest request, //
                        EtourUser user, //
                        @RequestParam String verifyCode) {
        // 判断验证码
        HttpSession session = request.getSession();
        String code = String.valueOf(session.getAttribute("verifyCode"));
        if (!StringUtils.equalsIgnoreCase(verifyCode, code)) {
            throw new LoginException("验证码错误");
        }
        System.out.println(user.getPassword() + "+++++++++++");
        user = userService.queryUserWithNameAndPass(user.getName(), user.getPassword());
        if (ObjectUtils.isEmpty(user)) {
            throw new LoginException("用户名或密码错误");
        }
        session.setAttribute("user", user);
        if (user.getLevel() == 1) {
            return "redirect:/page/to_admin";
        } else {
            return "redirect:/page/to_user";
        }
    }

    @RequestMapping("/register")
    public String register(HttpServletRequest request, //
                           EtourUser user, //
                           @RequestParam String verifyCode,
                           @RequestParam("pic") MultipartFile file) throws IOException {
        // 判断验证码
        HttpSession session = request.getSession();
        String code = String.valueOf(session.getAttribute("verifyCode"));
        if (!StringUtils.equalsIgnoreCase(verifyCode, code)) {
            throw new LoginException("验证码错误");
        }
        System.out.println(user.getPassword() + "+++++++++++");

        //添加头像
        String oldFilename = file.getOriginalFilename();
        String suffix = FilenameUtils.getExtension(oldFilename);
        //获取一个新的文件名
        String newName = UUID.randomUUID().toString().replaceAll("-", "") + "." + suffix;
        //创建新的文件
        File destFile = new File(DEST_FILE_DIR, newName);
        file.transferTo(destFile);
        user.setSavePath("/etour/pic/" + newName);
        user.setLevel(0);
        userService.addUser(user);

        return "redirect:/page/to_login";
    }

    @RequestMapping("/checkName")
    @ResponseBody
    public String checkName(@RequestParam("name") String name) {
        int result = userService.queryUserByName(name);
        if (result != 0) {
            return "success";
        } else {
            return "good good study,day day up !";
        }
    }

    @RequestMapping("/checkPass")
    @ResponseBody
    public String checkPass(@RequestParam("name") String name,
                            @RequestParam("pass") String pass) {
        EtourUser user = userService.queryUserWithNameAndPass(name, pass);
        if (user != null) {
            return "success";
        } else {
            return "good good study,day day up !";
        }
    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute("user");

        // 销毁session，这样的话，session中所有的数据都会被清空
        session.invalidate();
        return "redirect:/page/to_login";
    }

    @RequestMapping("/updateUser")
        public String updateUser(HttpServletRequest request,
                                 EtourUser user,
                                 @RequestParam("userpic") MultipartFile file,
                                 @RequestParam("hiddenPic") String hpic
    ) throws IOException {
        if ((int) file.getSize() != 0) {
            String oldFilename = file.getOriginalFilename();
            String suffix = FilenameUtils.getExtension(oldFilename);
            //获取一个新的文件名
            String newName = UUID.randomUUID().toString().replaceAll("-", "") + "." + suffix;
            //创建新的文件
            File destFile = new File(DEST_FILE_DIR, newName);
            file.transferTo(destFile);
            user.setSavePath("/etour/pic/" + newName);
        } else {
            user.setSavePath(hpic);
        }
        userService.updateUser(user);
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        session.setAttribute("user", user);
        if (user.getLevel() == 1)
            return "redirect:/page/to_admin";
        else
            return "redirect:/page/to_user";
    }

}

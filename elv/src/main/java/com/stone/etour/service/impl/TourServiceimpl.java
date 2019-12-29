package com.stone.etour.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.stone.etour.bean.*;
import com.stone.etour.mapper.OrderMapper;
import com.stone.etour.mapper.TourMapper;
import com.stone.etour.service.TourService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TourServiceimpl implements TourService{
    @Resource
    TourMapper tourMapper;

    @Resource
    OrderMapper orderMapper;

    @Override
    public void addTour(Tour tour) {
        tourMapper.insert(tour);
    }

    @Override
    public Page<Tour> queryWithConditions(int pageNumber, int pageSize, String name) {
        TourExample example = new TourExample();
        TourExample.Criteria cri = example.createCriteria();
        if(name!=null && !("").equals(name))
            cri.andNameLike("%"+name+"%");
        PageHelper.startPage(pageNumber,pageSize);
        List<Tour> data = tourMapper.selectByExample(example);
        PageInfo<Tour> pageInfo = new PageInfo<>(data);
        Page<Tour> page = new Page<>();
        page.setRows(pageInfo.getList());
        page.setTotal((int) pageInfo.getTotal());
        page.setPageNumber(pageNumber);
        page.setPageSize(pageSize);
        return page;
    }

    @Override
    public Tour queryOneById(String id) {
        return tourMapper.selectByPrimaryKey(Integer.valueOf(id));
    }

    @Override
    public void updateTour(Tour tour) {
        tourMapper.updateByPrimaryKey(tour);
    }

    @Override
    public void fix(Tour tour) {
        tourMapper.updateTour(tour);
    }

    @Override
    public void addOrder(Order order) {
        orderMapper.insert(order);
    }

    @Override
    public void deleteOrder(int id) {
        orderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Page<Order> queryOrderWithUser(int pageNumber, int pageSize, String name) {
        OrderExample example = new OrderExample();
        OrderExample.Criteria cri = example.createCriteria();
        cri.andOUserEqualTo(name);
        PageHelper.startPage(pageNumber,pageSize);
        List<Order> data = orderMapper.selectByExample(example);
        PageInfo<Order> pageInfo = new PageInfo<>(data);
        Page<Order> page = new Page<>();
        page.setRows(pageInfo.getList());
        page.setTotal((int) pageInfo.getTotal());
        page.setPageNumber(pageNumber);
        page.setPageSize(pageSize);
        return page;
    }

}

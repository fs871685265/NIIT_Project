package com.stone.etour.service;

import com.stone.etour.bean.Order;
import com.stone.etour.bean.Page;
import com.stone.etour.bean.Tour;

public interface TourService {

    void addTour(Tour tour);

    Page<Tour> queryWithConditions(int pageNumber, int pageSize, String name);

    Tour queryOneById(String id);

    void updateTour(Tour tour);

    void fix(Tour tour);

    void addOrder(Order order);

    void deleteOrder(int id);

    Page<Order> queryOrderWithUser(int pageNumber, int pageSize, String name);
}

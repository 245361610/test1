package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;

/**
 * @Author xianci
 * @Date 2019/09/26 10:38
 */
public interface OrderService {
    /**
     * 根据订单id获取订单
     *
     * @param orderId
     * @return
     */
    Order getOrder(String orderId);

    /**
     * 新增订单
     *
     * @param order
     */
    void addOrder(Order order);
}

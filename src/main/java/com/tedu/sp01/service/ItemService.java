package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Item;

import java.util.List;

/**
 * @Author xianci
 * @Date 2019/09/26 10:37
 */
public interface ItemService {
    /**
     * 根据订单id获取商品列表
     *
     * @param orderId
     * @return
     */
    List<Item> getItems(String orderId);

    /**
     * 根据商品列表减小库存
     *
     * @param list
     */
    void decreaseNumbers(List<Item> list);
}

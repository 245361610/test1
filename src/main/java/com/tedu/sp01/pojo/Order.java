package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author xianci
 * @Date 2019/09/26 10:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String id;
    private User user;
    private List<Item> items;
}

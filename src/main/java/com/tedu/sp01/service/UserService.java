package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

/**
 * @Author xianci
 * @Date 2019/09/26 10:38
 */
public interface UserService {
    /**
     * 根据id查找用户
     *
     * @param id
     * @return
     */
    User getUser(Integer id);

    /**
     * 为用户增加积分
     *
     * @param id
     * @param score
     */
    void addScore(Integer id, Integer score);
}

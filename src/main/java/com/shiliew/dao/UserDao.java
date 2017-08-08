package com.shiliew.dao;

import com.shiliew.model.User;

import java.util.List;

/**
 * Created by huangwenhao on 2017/8/8.
 */
public interface UserDao {

    User selectUserById(Integer id);

    List<User> queryUsers();
}

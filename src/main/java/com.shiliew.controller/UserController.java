package com.shiliew.controller;

import com.shiliew.dao.UserDao;
import com.shiliew.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("queryUser")
    public ModelAndView queryUser(){
        ModelAndView mv = new ModelAndView("user");
        List<User> list = userDao.queryUsers();
        mv.addObject("list", list);
        return mv;
    }
}

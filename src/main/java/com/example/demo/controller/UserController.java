package com.example.demo.controller;



import com.example.demo.model.User;
import com.example.demo.repository.UserMyBatisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/test")
public class UserController {

    @Autowired
    private UserMyBatisRepository userMyBatisRepository;


    @RequestMapping("/qwer")
    @ResponseBody
    public List<User> first() {
//        userMyBatisRepository.insert(new User(1, "Ramesh", "Fadatare", "ramesh@gmail.com"));
//        userMyBatisRepository.insert(new User(2, "John", "Cena", "john@gmail.com"));
        List<User> users = userMyBatisRepository.findAll();
        for (int i = 0; i < users.size(); i++) {
            System.out.println("123");
            System.out.println(users.get(i).getFirstName());
            System.out.println(users.get(i).getLastName());
            System.out.println(users.get(i).getEmailId());
        }

        return users;
    }




}

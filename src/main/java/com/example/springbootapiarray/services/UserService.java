package com.example.springbootapiarray.services;


import com.example.springbootapiarray.dto.Userdto;
import com.example.springbootapiarray.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> list = new ArrayList<User>();

    public User add(Userdto userdto) {
        User user = null;
        user = new User(list.size() + 1, userdto);
        list.add(user);
        return user;
    }

    public List<User> getList(){
        return list;
    }
}

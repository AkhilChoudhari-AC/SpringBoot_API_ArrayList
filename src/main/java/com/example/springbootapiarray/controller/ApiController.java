package com.example.springbootapiarray.controller;


import com.example.springbootapiarray.dto.ResponseDto;
import com.example.springbootapiarray.dto.Userdto;
import com.example.springbootapiarray.model.User;
import com.example.springbootapiarray.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// controller control our all Api's
public class ApiController {

    //this is get api, display message by giving url
    @GetMapping("/add")
    public String getName(){
        return "My name is Akhil Choudhari";
    }
    @Autowired
    //dependence injection, class level injection
    UserService userService;

    @PostMapping("/createList")
    //api use to create data
    public ResponseEntity<ResponseDto> create(@RequestBody Userdto userdto){
        User user=userService.add(userdto);
        ResponseDto responseDto=new ResponseDto("Data is stored in the list",user);
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }
    @GetMapping("/getList")
    // api used to getting the data stored in the list

    public ResponseEntity<ResponseDto> save(){
        List<User> user = null;
        user = userService.getList();
        ResponseDto responseDto = new ResponseDto("Data is stored in the list",user);
        return new ResponseEntity<>(responseDto, HttpStatus.OK);

    }
}


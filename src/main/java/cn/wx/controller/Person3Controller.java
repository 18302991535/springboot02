package cn.wx.controller;

import cn.wx.dao.Person1Repository;
import cn.wx.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person3")
public class Person3Controller {
    @Autowired
    Person1Repository person1Repository;
    @RequestMapping("/getPersonByName")
    public User getUserByName(String username){
       return person1Repository.getUserByName(username);
    }
    @RequestMapping("/getUserByUsernameAndPassword")
    public User getUserByUsernameAndPassword(String username,String password){
        return person1Repository.getUserByUsernameAndPassword(username,password);
    }
}

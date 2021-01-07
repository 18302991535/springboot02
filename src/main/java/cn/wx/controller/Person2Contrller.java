package cn.wx.controller;

import cn.wx.dao.Person1Repository;
import cn.wx.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person2")
public class Person2Contrller {
    @Autowired
    Person1Repository person1Repository;
    @RequestMapping("/findByUsernameIs/{username}")
    public User findByName(@PathVariable("username") String username){
        return person1Repository.findByUsernameIs(username);
    }
    @RequestMapping("/findByUsernameContaining/{username}")
    public List<User> findByNameContaining(@PathVariable("username") String username){
        return person1Repository.findByUsernameContaining(username);
    }

}

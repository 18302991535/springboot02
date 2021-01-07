package cn.wx.controller;

import cn.wx.dao.Person1Repository;
import cn.wx.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    Person1Repository person1Repository;
    @RequestMapping("/addPerson")
    public void addUser(@RequestBody User user){
        person1Repository.save(user);
    }
    @RequestMapping("/getAll")
    public List<User> getAll(){
        return person1Repository.findAll();
    }
    @RequestMapping("/updateUser")
    public void updateUser(@RequestBody User user){
        person1Repository.saveAndFlush(user);
    }
    @RequestMapping("/deleteUser")
    public void deleteUser(@RequestParam String id){
        person1Repository.deleteById(id);

    }

}

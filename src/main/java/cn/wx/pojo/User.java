package cn.wx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
private String id;
    @Column(name="username",nullable = false,length = 20)
private String username;
    @Column(name="password",nullable = false,length = 50)
private String password;
    @Column(name="roleId",nullable = false,length = 50)
private int roleId;
    @Column(name="iconURL",nullable = false,length = 50)
private String iconURL;
}

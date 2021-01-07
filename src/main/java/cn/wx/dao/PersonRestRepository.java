package cn.wx.dao;

import cn.wx.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "myPath")
public interface PersonRestRepository extends JpaRepository<User,String> {
}

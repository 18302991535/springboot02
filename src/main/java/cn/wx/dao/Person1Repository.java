package cn.wx.dao;

import cn.wx.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface Person1Repository  extends JpaRepository<User,String> {
   //新增查询指定名字的人
    public User findByUsernameIs(String username);
    //查询指定名字及年龄的人
    //public User findByNameIsAndPassword(String name,String password);
    //查询包含指定名字的人
    public List<User> findByUsernameContaining(String username);
   //使用@Query查询指定名字的人
    @Query("select u from User u where u.username=:username")
    public User getUserByName(@Param("username") String username);
   @Query("select u from User u where u.username=?1 and u.password=?2")
    public User getUserByUsernameAndPassword(@Param("username") String username,@Param("password") String password);
    @Query("select u from User u where u.username like %:username%")
    public List<User> getNameLike(@Param("username") String username);
    @Query(value = "select * from user u where length(username)=6",nativeQuery = true)
    public List<User> getNameLengthString();
	public void demo1(String id);
}

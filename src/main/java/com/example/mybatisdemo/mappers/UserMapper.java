package com.example.mybatisdemo.mappers;

import com.example.mybatisdemo.models.User;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from users")
    List<User> findAll();

//    @Insert("insert into users(name,salary) values(#{name},#{salary})")
//    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id",
//            before = false, resultType = Integer.class)
//    void insert(User user);
//
//    @Update("update users set salary=#{salary} where name=#{name}")
//    void update(User users);
//
//    @Delete("delete from users where name=#{name}")
//    void delete(User users);
}

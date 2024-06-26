package com.example.mybatisdemo.mappers;

import com.example.mybatisdemo.models.User;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from users")
    List<User> findAll();

    @Insert("insert into users(name,salary) values(#{name},#{salary})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id",
            before = false, resultType = Integer.class)
    void insert(User user);

    @Update("update users set name=#{name}, salary=#{salary} where id=#{id}")
    void update(Integer id, String name, Long salary);

    @Delete("delete from users where id=#{id}")
    void delete(Integer id);
}

package com.example.scout_bbs_server.mapper;

import com.example.scout_bbs_server.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM tuku_user")
    List<User> findAllUser();

    @Insert("INSERT INTO tuku_user(name,phone,email,password,company) VALUES ( #{name}, #{phone}, #{email}, #{password}, #{company} )")
    int insert(User user);

    int update(User user);

    @Delete("DELETE FROM tuku_user WHERE userId = #{userId}")
    Integer deleteByUserId(@Param("userId") Integer userId);
}

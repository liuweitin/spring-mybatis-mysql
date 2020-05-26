package com.example.demo.repository;


import com.example.demo.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface UserMyBatisRepository {

    @Select("select * from users")
    public List<User> findAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    public User findById(long id);

    @Delete("DELETE FROM users WHERE id = #{id}")
    public int deleteById(long id);

    @Insert("INSERT INTO users(id, first_name, last_name,email_address) " +
            " VALUES (#{id}, #{firstName}, #{lastName}, #{emailId})")
    public int insert(User user);

    @Update("Update users set first_name=#{firstName}, " +
            " last_name=#{lastName}, email_address=#{emailId} where id=#{id}")
    public int update(User user);



}

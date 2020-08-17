package com.example.exam.embedded.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Mapper
@Repository
public interface MyDao {

    @Select("SELECT * FROM user_info WHERE login = #{map.userId} AND password = #{map.password}")
    Map<String, Object> userLogin(@Param(value = "map") Map<String, Object> map);
}

package com.example.paydemo1.dao;

import com.example.paydemo1.model.Order;
import org.apache.ibatis.annotations.*;
import org.mybatis.spring.annotation.MapperScan;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface OrderDao {

    /**
     * 新增用户
     * @param
     */
    @Insert("insert into t_user(id,name,age) values (#{id},#{name},#{age})")
    boolean add(Order order);

    /**
     * 删除用户
     * @param orderId
     */
    @Delete("delete from t_user where id = #{id} ")
    boolean delete(@Param("orderId") Long orderId);

    /**
     * 根据用户 ID 修改用户
     * @param
     */
    @Update("update t_user set name = #{name},age = #{age} where id = #{id} ")
    boolean update(Order order);

    /**
     * 根据 ID 查找用户
     * @param orderId
     * @return
     */
    @Select("select * from t_user where id = #{id}")
    Order select(Integer orderId);
}

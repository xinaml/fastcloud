package com.xinaml.order.dao;

import com.xinaml.order.bean.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author liguiqin
 * @date 2022/9/28
 */
@Mapper
@Repository
public interface OrderDao {
    int create(Order order);

    Order queryById(@Param("id") long id);
}

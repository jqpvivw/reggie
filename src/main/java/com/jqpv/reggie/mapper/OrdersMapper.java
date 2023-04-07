package com.jqpv.reggie.mapper;

import com.jqpv.reggie.entity.Orders;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 晚安
* @description 针对表【orders(订单表)】的数据库操作Mapper
* @createDate 2023-04-07 09:33:21
* @Entity com.jqpv.reggie.entity.Orders
*/
@Mapper
public interface OrdersMapper extends BaseMapper<Orders> {

}





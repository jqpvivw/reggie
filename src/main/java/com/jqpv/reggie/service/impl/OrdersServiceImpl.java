package com.jqpv.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jqpv.reggie.entity.Orders;
import com.jqpv.reggie.service.OrdersService;
import com.jqpv.reggie.mapper.OrdersMapper;
import org.springframework.stereotype.Service;

/**
* @author 晚安
* @description 针对表【orders(订单表)】的数据库操作Service实现
* @createDate 2023-04-07 09:33:21
*/
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders>
    implements OrdersService{

}





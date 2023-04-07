package com.jqpv.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jqpv.reggie.entity.OrderDetail;
import com.jqpv.reggie.service.OrderDetailService;
import com.jqpv.reggie.mapper.OrderDetailMapper;
import org.springframework.stereotype.Service;

/**
* @author 晚安
* @description 针对表【order_detail(订单明细表)】的数据库操作Service实现
* @createDate 2023-04-07 09:33:21
*/
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail>
    implements OrderDetailService{

}





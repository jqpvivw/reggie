package com.jqpv.reggie.mapper;

import com.jqpv.reggie.entity.OrderDetail;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 晚安
* @description 针对表【order_detail(订单明细表)】的数据库操作Mapper
* @createDate 2023-04-07 09:33:21
* @Entity com.jqpv.reggie.entity.OrderDetail
*/
@Mapper
public interface OrderDetailMapper extends BaseMapper<OrderDetail> {

}





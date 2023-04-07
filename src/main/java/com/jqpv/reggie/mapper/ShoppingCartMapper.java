package com.jqpv.reggie.mapper;

import com.jqpv.reggie.entity.ShoppingCart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 晚安
* @description 针对表【shopping_cart(购物车)】的数据库操作Mapper
* @createDate 2023-04-06 16:56:39
* @Entity com.jqpv.reggie.entity.ShoppingCart
*/
@Mapper
public interface ShoppingCartMapper extends BaseMapper<ShoppingCart> {

}





package com.jqpv.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jqpv.reggie.entity.ShoppingCart;
import com.jqpv.reggie.service.ShoppingCartService;
import com.jqpv.reggie.mapper.ShoppingCartMapper;
import org.springframework.stereotype.Service;

/**
* @author 晚安
* @description 针对表【shopping_cart(购物车)】的数据库操作Service实现
* @createDate 2023-04-06 16:56:39
*/
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart>
    implements ShoppingCartService{

}





package com.jqpv.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jqpv.reggie.entity.DishFlavor;
import com.jqpv.reggie.service.DishFlavorService;
import com.jqpv.reggie.mapper.DishFlavorMapper;
import org.springframework.stereotype.Service;

/**
* @author 晚安
* @description 针对表【dish_flavor(菜品口味关系表)】的数据库操作Service实现
* @createDate 2023-03-27 21:38:52
*/
@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor>
    implements DishFlavorService{

}





package com.jqpv.reggie.mapper;

import com.jqpv.reggie.entity.DishFlavor;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 晚安
* @description 针对表【dish_flavor(菜品口味关系表)】的数据库操作Mapper
* @createDate 2023-03-27 21:38:52
* @Entity com.jqpv.reggie.entity.DishFlavor
*/
@Mapper
public interface DishFlavorMapper extends BaseMapper<DishFlavor> {

}





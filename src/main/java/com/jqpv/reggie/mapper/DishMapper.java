package com.jqpv.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jqpv.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName:DishMapper
 * Package:com.jqpv.reggie.mapper
 * Description:
 *
 * @Author:梁杰圣
 * @Create:2023/3/26 - 12:28
 * @Version:v1.0
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}

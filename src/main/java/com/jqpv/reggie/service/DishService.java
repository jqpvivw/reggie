package com.jqpv.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jqpv.reggie.dto.DishDto;
import com.jqpv.reggie.entity.Dish;

/**
 * ClassName:DishSerice
 * Package:com.jqpv.reggie.service
 * Description:
 *
 * @Author:梁杰圣
 * @Create:2023/3/26 - 12:32
 * @Version:v1.0
 */
public interface DishService extends IService<Dish> {

    /**
     * 新增菜品，同时插入菜品对应的口味数据，需要操作两张表：dish、dish_flavor
     * @param dishDto
     */
    public void saveWithFlavor(DishDto dishDto);


    /**
     * 根据id查询菜品信息和对应的口味信息
     * @param id
     * @return
     */
    public DishDto getByIdWithFlavor (Long id);


    /**
     * 更新菜品信息，同时更新对应的口味信息
     * @param dishDto
     */
    public void updateWithFlavor(DishDto dishDto);
}

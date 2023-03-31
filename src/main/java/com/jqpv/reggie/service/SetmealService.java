package com.jqpv.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jqpv.reggie.dto.SetmealDto;
import com.jqpv.reggie.entity.Setmeal;

import java.util.List;
import java.util.Set;

/**
 * ClassName:SetmealService
 * Package:com.jqpv.reggie.service
 * Description:
 *
 * @Author:梁杰圣
 * @Create:2023/3/26 - 12:33
 * @Version:v1.0
 */
public interface SetmealService extends IService<Setmeal> {


    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，同时需要删除套餐和菜品的关联数据
     * @param ids
     */
    public  void removeWithDish(List<Long> ids);
}

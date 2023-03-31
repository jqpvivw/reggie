package com.jqpv.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jqpv.reggie.entity.Category;

/**
 * ClassName:CAtegoryService
 * Package:com.jqpv.reggie.service
 * Description:
 *
 * @Author:梁杰圣
 * @Create:2023/3/23 - 16:22
 * @Version:v1.0
 */
public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}

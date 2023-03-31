package com.jqpv.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jqpv.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName:EmployeeMapper
 * Package:com.jqpv.reggie.mapper
 * Description:
 *
 * @Author:梁杰圣
 * @Create:2023/3/11 - 21:11
 * @Version:v1.0
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}

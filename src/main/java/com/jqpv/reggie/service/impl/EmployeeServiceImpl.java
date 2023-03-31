package com.jqpv.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jqpv.reggie.entity.Employee;
import com.jqpv.reggie.mapper.EmployeeMapper;
import com.jqpv.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName:EmployeeServiceImpl
 * Package:com.jqpv.reggie.service.impl
 * Description:
 *
 * @Author:梁杰圣
 * @Create:2023/3/11 - 21:14
 * @Version:v1.0
 */

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}

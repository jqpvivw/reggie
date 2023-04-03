package com.jqpv.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jqpv.reggie.entity.Employee;
import com.jqpv.reggie.entity.User;

public interface UserService extends IService<User> {

        //发送邮件
       public void sendMsg(String to,String subject,String text);


}

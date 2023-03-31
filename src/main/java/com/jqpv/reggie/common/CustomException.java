package com.jqpv.reggie.common;

/**
 * ClassName:CustomException
 * Package:com.jqpv.reggie.common
 * Description:
 * 自定义业务异常类
 * @Author:梁杰圣
 * @Create:2023/3/26 - 12:59
 * @Version:v1.0
 */
public class CustomException extends RuntimeException{
    public CustomException(String message){
        super(message);
    }
}

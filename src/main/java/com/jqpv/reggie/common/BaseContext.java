package com.jqpv.reggie.common;

/**
 * ClassName:BaseContext
 * Package:com.jqpv.reggie.common
 * Description:
 * 基于ThreadLocal封装工具类，用户保存和获取当前登录用户id
 * @Author:梁杰圣
 * @Create:2023/3/22 - 19:13
 * @Version:v1.0
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

    public static Long getCurrentId(){
        return threadLocal.get();
    }
}

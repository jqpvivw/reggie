package com.jqpv.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.jqpv.reggie.common.R;
import com.jqpv.reggie.entity.User;
import com.jqpv.reggie.service.UserService;
import com.jqpv.reggie.utils.ValidateCodeUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * ClassName:UserController
 * Package:com.jqpv.reggie.controller
 * Description:
 *
 * @Author:梁杰圣
 * @Create:2023/4/3 - 19:50
 * @Version:v1.0
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 获取验证码
     * @param session
     * @param user
     * @return
     */

    @PostMapping("/sendMsg")
    public R<String> sendMsg(HttpSession session, @RequestBody User user){
        //获取邮箱号
        //相当于发送短信定义的String to
        String email = user.getPhone();
        String subject = "不知道写什么（测试）";

        //StringUtils.isNotEmpty字符串非空判断
        if (StringUtils.isNotEmpty(email)) {

            //发送一个6位数的验证码,把验证码变成String类型
            String code = ValidateCodeUtils.generateValidateCode(6).toString();
            String text = "【不知道写什么（测试）】您好，您的登录验证码为：" + code + "，请尽快登录";
            log.info("验证码为：" + code);

            //发送短信
            userService.sendMsg(email,subject,text);

            //将验证码保存到session当中
            session.setAttribute(email,code);
            return R.success("验证码发送成功");
        }
        return R.error("验证码发送异常，请重新发送");
    }

    /**
     * 移动端用户登录
     * @param map
     * @param session
     * @return
     */
    @PostMapping("/login")
    public R<User> login(@RequestBody Map map, HttpSession session){
        log.info(map.toString());

        //获取邮箱号
        String email = map.get("phone").toString();

        //获取验证码
        String code = map.get("code").toString();

        //从Session中获取保存的验证码
        Object codeInSession = session.getAttribute(email);

        //进行验证码的比对（页面提交的验证码和Session中保存的验证码比对）
        if(codeInSession != null && codeInSession.equals(code)){
            //如果能够比对成功，说明登录成功

            LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
            queryWrapper.eq(User::getPhone,email);

            User user = userService.getOne(queryWrapper);
            if(user == null){
                //判断当前邮箱号对应的用户是否为新用户，如果是新用户就自动完成注册
                user = new User();
                user.setPhone(email);
                user.setStatus(1);
                userService.save(user);
            }
            session.setAttribute("user",user.getId());
            return R.success(user);
        }
        return R.error("登录失败");
    }

    /**
     * 用户退出
     * @param request
     * @return
     */
    @PostMapping("/loginout")
    public R<String> logout(HttpServletRequest request){
        //清理Session中保存的当前登陆用户的id
        request.getSession().removeAttribute("user");
        return R.success("退出成功");
    }



}















package com.uizhi.test;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: jiwei
 * Date: 2018-01-01
 * Time: 22:05
 */

import com.uizhi.domain.User;
import com.uizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */

public class SpringTest {
    @Autowired
    public UserService userService;



    public static void main(String[] args) {
        ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService uService = (UserService) application.getBean("userService");
        User user = uService.getUserById(1);
        System.out.println(user.getUserName());
    }
}

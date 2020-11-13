package com.bright.test;

import com.bright.dao.UserDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 徐亮亮
 * @since 2020/11/13
 */
public class SpringTest {
    @Test
    public void test01() {
        // 测试 scope
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        // UserDao userDao1 = (UserDao) app.getBean("userDao");
        // UserDao userDao2 = (UserDao) app.getBean("userDao");
        // System.out.println("userDao1 = " + userDao1);
        // System.out.println("userDao2 = " + userDao2);

        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();
        // app.close();
    }
}

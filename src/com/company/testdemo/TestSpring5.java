package com.company.testdemo;

import com.company.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Project:     Spring5demo1
 * Package:     com.company.testdemo
 * Created:     1/9/2022 18:25
 * Author:      Ahmed-UTI
 * Email:       AhmedBughra@gmail.com
 * LinkedIn:    https://www.linkedin.com/in/ahmed-bughra/
 * CreatedWith: IntelliJ IDEA
 */
public class TestSpring5 {

    @Test
    public void testAdd() {
        // 1 add springconfig file bean1.xml
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        // 2 get the class file
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

}

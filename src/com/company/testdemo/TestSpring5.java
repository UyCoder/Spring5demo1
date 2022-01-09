package com.company.testdemo;

import com.company.Book;
import com.company.Orders;
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
        ApplicationContext context = // or "BeanFactory context= "
                new ClassPathXmlApplicationContext("bean1.xml");

        // 2 get the class file
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testdemo();
    }

    @Test
    public void testOrders() {
        // 1 add springconfig file bean1.xml
        ApplicationContext context = // or "BeanFactory context= "
                new ClassPathXmlApplicationContext("bean1.xml");

        // 2 get the class file
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        orders.testOrder();
    }



}

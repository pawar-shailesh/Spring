package com.yash.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context= new ClassPathXmlApplicationContext("NewFile.xml");
       Employee employee1=(Employee) context.getBean("Employee1");
       Employee employee2= (Employee) context.getBean("Employee2");
       
       System.out.println(employee1);
       System.out.println(employee2);
    }
}

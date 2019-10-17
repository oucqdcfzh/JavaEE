package edu.cn;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jca.context.ResourceAdapterApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MoviePerformerDAO moviePerformerDAOImpl = context.getBean(MoviePerformerDAOImpl.class);
        System.out.println(moviePerformerDAOImpl.queryByName("刘嘉玲"));
    }
}

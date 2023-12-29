package org.example.SpringCoreMaven;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	//BeanFactory factory = null;
    	//new FileSystemResource("spring.xml");
    	
    	ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
    	Alien obj = (Alien)factory.getBean("alien");
    	
    	obj.code();
    	
    	// application context: Xmlbean is deprecated so we can use application context used
    	// to create a 
    }
}

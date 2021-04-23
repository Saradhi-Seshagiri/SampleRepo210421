package com.TechM.PointOfSale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.TechM.PointOfSale.beans.Customer;

/**
 * Hello world!
 *
 */
public class CustomerClientApp 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //Step 1 : Configuring the Spring Container to load Customer beans...
        ApplicationContext newCustomerContext = new ClassPathXmlApplicationContext("SpringConfig.xml");
        
        //Step 2 :  Read/load the Customer beans from the Spring Context/Container...
        Customer abhinav = (Customer) newCustomerContext.getBean("abhinav");
        
        //Step 3 : Manage the bean/object provided by the Spring Container...
        System.out.println(abhinav);

        //Adding new Line for VCS...
        System.out.printl("Line added for VCS to track....");
	
    }
}

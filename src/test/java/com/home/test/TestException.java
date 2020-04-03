package com.home.test;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.home.common.InvalidCredentials;
import com.home.common.UserAlreadyExistException;
import com.home.common.UserDoesNotExistException;
import com.home.models.User;
import com.home.services.CustomerService;

import junit.framework.Assert;

public class TestException {
	@Test
    public void testForUserRegistration() throws UserAlreadyExistException 
    {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("couponbank-application.xml");
	 User user=new User();
     user.setPhoneNumber(1234567890);
     user.setEmail("james@gmail.com");
     user.setSsn(123456789);
     user.setUserName("john");
     user.setRetired(true);
     user.setPassword("hello12345");
	 CustomerService customerservice = (CustomerService) context.getBean("CustomerService");
	 customerservice.signUp(user.getUserName(), user.getPassword(),"hello12345");
Assert.assertEquals(UserAlreadyExistException.message," user already exists !..please login");
    }
	
	
	@Test
    public void testForUserLogin() throws UserDoesNotExistException  
    {
		
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("BusTicketReservation-application.xml");
	      CustomerService customerservice = (CustomerService) context.getBean("CustomerService");
	      User user=new User();
	      user.setPhoneNumber(1234567890);
	      user.setEmail("james@gmail.com");
	      user.setSsn(123456789);
	      user.setUserName("john");
	      user.setRetired(true);
	      user.setPassword("hello12345");

     customerservice.signIn(user.getUserName(),user.getPassword());
Assert.assertEquals(UserDoesNotExistException.message," user does not exists !..please register");
     }
	
	@Test
    public void testForvalidEmail() throws InvalidCredentials  
    {
		
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("BusTicketReservation-application.xml");
	 User user=new User();
     user.setPhoneNumber(1234567890);
     user.setEmail("james@gmail.com");
     user.setSsn(123456789);
     user.setUserName("john");
     user.setRetired(true);
     user.setPassword("hello12345");

     CustomerService customerservice = (CustomerService) context.getBean("CustomerService");
     customerservice.signIn(user.getUserName(), user.getPassword());
Assert.assertEquals(InvalidCredentials.message,"please enter valid email and password");
     }
	@Test
    public void testForvaliPassword() throws InvalidCredentials  
    {
		
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("BusTicketReservation-application.xml");
	 User user=new User();
     user.setPhoneNumber(1234567890);
     user.setEmail("james@gmail.com");
     user.setSsn(123456789);
     user.setUserName("john");
     user.setRetired(true);
     user.setPassword("hello12345");
String reEnterPassword="hello";
     CustomerService customerservice = (CustomerService) context.getBean("CustomerService");
     customerservice.signUp(user.getUserName(), user.getPassword(),reEnterPassword);
Assert.assertEquals(InvalidCredentials.message,"please enter valid email and password");
     }
	
}

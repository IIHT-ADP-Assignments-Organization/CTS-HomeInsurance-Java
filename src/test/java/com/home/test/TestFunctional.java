package com.home.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.home.models.Policy;
import com.home.models.Residance;
import com.home.models.User;
import com.home.services.AdminService;
import com.home.services.CustomerService;

public class TestFunctional {
	@Test
	public void testvalidregistration() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("BusTicketReservation-application.xml");
	User user=new User();
    user.setPhoneNumber(1234567890);
    user.setEmail("james@gmail.com");
    user.setSsn(123456789);
    user.setUserName("john");
    user.setRetired(true);
    user.setPassword("hello123");
    
String isRegistered=user.getUserName();
	

	CustomerService customerservice=(CustomerService) context.getBean("CustomerService");
	boolean registration =customerservice.signUp(user.getUserName(),user.getPassword(),"hello123");
	assertEquals(isRegistered,registration);
}
	@Test
	public void tesForValidLogin() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("BusTicketReservation-application.xml");
	User user=new User();
    user.setPhoneNumber(1234567890);
    user.setEmail("james@gmail.com");
    user.setSsn(123456789);
    user.setUserName("john");
    user.setRetired(true);
    user.setPassword("hello123");
	    CustomerService customerservice=(CustomerService) context.getBean("CustomerService");
	boolean userdetailsfromdb=customerservice.signIn(user.getUserName(),user.getPassword());
	assertEquals(true,userdetailsfromdb);
}
	@Test
	public void tesForValidLogout() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("BusTicketReservation-application.xml");
	
	    CustomerService customerservice=(CustomerService) context.getBean("CustomerService");
	boolean userdetailsfromdb=customerservice.signOut();
	assertEquals(true,userdetailsfromdb);
}
	@Test
	public void tesForValidBuyPolicy() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("BusTicketReservation-application.xml");
	
	    CustomerService customerservice=(CustomerService) context.getBean("CustomerService");
	Policy detailsfromdb=customerservice.buyPoilcy();
	assertNotNull(detailsfromdb);
}
	@Test
	public void tesForValidViewPolicy() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("BusTicketReservation-application.xml");
	Policy p=new Policy();
	p.setPolicyKey("P12");
	    CustomerService customerservice=(CustomerService) context.getBean("CustomerService");
	Policy detailsfromdb=customerservice.viewPolicy(p.getPolicyKey());
	assertNotNull(detailsfromdb);
}
	@Test
	public void tesForRetrieveQuote() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("BusTicketReservation-application.xml");
	User user=new User();
	user.setUserId(12345);
	
	    CustomerService customerservice=(CustomerService) context.getBean("CustomerService");
	Residance detailsfromdb=customerservice.retrieveQuote(user.getUserId());
	assertNotNull(detailsfromdb);
}
	@Test
	public void tesForRenewPolicy() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("BusTicketReservation-application.xml");
	Policy p=new Policy();
	p.setPolicyKey("P12");
	    AdminService adminservice=(AdminService) context.getBean("AdminService");
	Policy detailsfromdb=adminservice.renewPolicy(p.getPolicyKey());
	assertNotNull(detailsfromdb);
}
	@Test
	public void tesForCancellPolicy() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("BusTicketReservation-application.xml");
	Policy p=new Policy();
	p.setPolicyKey("P12");
	    AdminService adminservice=(AdminService) context.getBean("AdminService");
	Policy detailsfromdb=adminservice.cancellPolicy(p.getPolicyKey());
	assertNotNull(detailsfromdb);
}
	@Test
	public void tesForViewPolicy() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("BusTicketReservation-application.xml");
	Policy p=new Policy();
	p.setPolicyKey("P12");
	    AdminService adminservice=(AdminService) context.getBean("AdminService");
	Policy detailsfromdb=adminservice.viewPolicy(p.getPolicyKey());
	assertNotNull(detailsfromdb);
}
	@Test
	public void tesForSearchUser() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("BusTicketReservation-application.xml");
	User user=new User();
	user.setUserName("john");
	    AdminService adminservice=(AdminService) context.getBean("AdminService");
	User detailsfromdb=adminservice.searchUser(user.getUserName());
	assertNotNull(detailsfromdb);
}


}

package com.home.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.home.models.Residance;
import com.home.models.User;


public class TestBoundary {
	@Test
    public void validPassword()
    {
       User user=new User();
      user.setPhoneNumber(1234567890);
      user.setEmail("james@gmail.com");
      user.setSsn(123456789);
      user.setUserName("john");
      user.setRetired(true);
      
      int passwordLength=10;
assertEquals(passwordLength,user.getPassword().length());
}
	
	@Test
    public void validSsn()
    {
       User user=new User();
      user.setPhoneNumber(1234567890);
      user.setEmail("james@gmail.com");
      user.setSsn(123456789);
      user.setUserName("john");
      user.setRetired(true);
    int  SsnLength=9;
      
      int getLengthOfSsn=(Integer.toString(user.getSsn()).length());
  	assertEquals( SsnLength, getLengthOfSsn);
  	    }
	
	@Test
    public void validPhoneNumber()
    {
       User user=new User();
      user.setPhoneNumber(1234567890);
      user.setEmail("james@gmail.com");
      user.setSsn(123456789);
      user.setUserName("john");
      user.setRetired(true);
    int  phoneNumberLength=9;
      
      int getLengthOfPhoneNumber=(Integer.toString(user.getPhoneNumber()).length());
  	assertEquals( phoneNumberLength, getLengthOfPhoneNumber);
  	    }
	
	 @Test
	    public void validPincode()
	    {
		 Residance res= new Residance();
		 res.setZip(577301);
		 int pincodelength=6;
		 
	        int getLengthOfPin=(Integer.toString(res.getZip()).length());
	    	assertEquals( pincodelength, getLengthOfPin);
	}
	 
	 @Test
	    public void validName()
	    {
		 User user=new User();
	      user.setPhoneNumber(1234567890);
	      user.setEmail("james@gmail.com");
	      user.setSsn(123456789);
	      user.setUserName("john");
	      user.setRetired(true);

	        int min=2;
	        boolean name=user.getUserName().length()>min;
	        assertEquals(true,name);
	    }
	 
	 
	 @Test
	    public void validEmail()
	    {
		 User user=new User();
	      user.setPhoneNumber(1234567890);
	      user.setEmail("james@gmail.com");
	      user.setSsn(123456789);
	      user.setUserName("john");
	      user.setRetired(true);	        
	        boolean contains=user.getEmail().isEmpty();
	        assertEquals(false,contains);
	    }

	
}

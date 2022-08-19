package come.adel.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.adel.dto.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {

		System.out.println("this print method is called");

		return phone.getCountryCode() + "-" + phone.getUserNumber();
	}
 
	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {

		System.out.println("this completePhoneNumber method is called");
		 
	           Phone phone = new Phone();
			   //split the string received from the user
		       String[] phoneNumber = completePhoneNumber.split("-");
		       //Weather the number consists of - 
		       int index = completePhoneNumber.indexOf('-');
		       	       
		       //if the string does't have  '-' or start with  '-' add 91 before it
		       if(index == -1 || completePhoneNumber.startsWith("-"))
		       {
		    	
		    	     //if the '-' is not found, then add 91 as the default country code
					 phone.setCountryCode("91");
					 if(completePhoneNumber.startsWith("-"))
					 {
						 phone.setUserNumber(phoneNumber[1]);
					 }
					 else
					 {
						 phone.setUserNumber(phoneNumber[0]);
					 }
		       }
		       
		       else
		       {
		    	     //Extract the countryCode and set it to the phone class countryCode
					 phone.setCountryCode(phoneNumber[0]);
					 phone.setUserNumber(phoneNumber[1]);
		       }
		return phone ;
	}

}

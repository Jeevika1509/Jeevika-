package  com.xworkz.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	  @Autowired
	private Location location;
	public Company() {
		System.out.println("running company with no arg constructor");
	}
}

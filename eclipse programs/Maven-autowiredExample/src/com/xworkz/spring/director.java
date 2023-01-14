package  com.xworkz.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class director {
	  @Autowired
	private Experience experience;
	public director() {
		System.out.println("running director with no arg constructor");
	}
}

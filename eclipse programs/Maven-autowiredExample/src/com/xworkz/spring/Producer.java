package  com.xworkz.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {
	
	@Autowired
	private Assistant assistant;
	  @Autowired
	private Company company;
	
	public Producer() {
		System.out.println("running producer with no arg");
	}
	

}

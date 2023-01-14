package autowireExamples;

import org.springframework.stereotype.Component;

@Component
public class Area {

	public Area() {
		System.out.println("running area with no arg constructor");
	}
	
}

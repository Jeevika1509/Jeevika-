package autowireExamples;

import org.springframework.stereotype.Component;

@Component
public class Producer {
	
	private Assistant assistant;
	private Company company;
	
	public Producer() {
		System.out.println("running producer with no arg");
	}
	

}

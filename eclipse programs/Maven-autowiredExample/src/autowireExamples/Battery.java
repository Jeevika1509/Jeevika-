package autowireExamples;

import org.springframework.stereotype.Component;

@Component
public class Battery {

	private Capacity capacity;
	public Battery() {
		System.out.println("running battery with no arg constructor");
	}
}

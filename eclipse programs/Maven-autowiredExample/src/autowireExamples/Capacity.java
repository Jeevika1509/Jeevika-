package autowireExamples;

import org.springframework.stereotype.Component;

@Component
public class Capacity {

	public Capacity() {
		System.out.println("running capacity with no arg");
	}
}

package autowireExamples;

import org.springframework.stereotype.Component;

@Component
public class Lens {

	public Lens() {
		System.out.println("running constructor with no arg");
	}
}

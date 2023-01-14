package autowireExamples;

import org.springframework.stereotype.Component;

@Component
public class Assistant {

	public Assistant() {
		System.out.println("running assistant with no arg constructor");
	}
}

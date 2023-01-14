package autowireExamples;

import org.springframework.stereotype.Component;

@Component
public class director {

	private Experience experience;
	public director() {
		System.out.println("running director with no arg constructor");
	}
}

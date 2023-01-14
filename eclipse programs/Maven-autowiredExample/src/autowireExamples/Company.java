package autowireExamples;

import org.springframework.stereotype.Component;

@Component
public class Company {

	private Location location;
	public Company() {
		System.out.println("running company with no arg constructor");
	}
}

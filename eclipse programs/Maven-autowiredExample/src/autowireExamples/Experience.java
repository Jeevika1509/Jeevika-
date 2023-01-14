package autowireExamples;

import org.springframework.stereotype.Component;

@Component
public class Experience {

	private Skill skill;
	public Experience() {
		System.out.println("running experience with no arg constructor");
	}
}

package  com.xworkz.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Experience {
	  @Autowired
	private Skill skill;
	public Experience() {
		System.out.println("running experience with no arg constructor");
	}
}

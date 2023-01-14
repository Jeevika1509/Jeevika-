package autowireExamples;

import org.springframework.stereotype.Component;

@Component
public class Location {

	private Area area;
	public Location() {
		System.out.println("running location with no argument constructor");
	}
	
}

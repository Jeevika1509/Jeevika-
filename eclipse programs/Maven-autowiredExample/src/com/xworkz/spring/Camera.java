package  com.xworkz.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	  @Autowired
	private Lens lens;
	  @Autowired
	private Battery battery;
	
	public Camera() {
		System.out.println("running camera with no arg");
	}

}

package  com.xworkz.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CameraMan {
	  @Autowired
	private Camera camera;
	public CameraMan() {
		System.out.println("running camera man with no arg");
	}
}

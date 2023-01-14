package autowireExamples;

import org.springframework.stereotype.Component;

@Component
public class Camera {
	
	private Lens lens;
	private Battery battery;
	
	public Camera() {
		System.out.println("running camera with no arg");
	}

}

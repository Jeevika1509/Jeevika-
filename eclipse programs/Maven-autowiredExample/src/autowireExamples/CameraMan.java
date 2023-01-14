package autowireExamples;

import org.springframework.stereotype.Component;

@Component
public class CameraMan {

	private Camera camera;
	public CameraMan() {
		System.out.println("running camera man with no arg");
	}
}

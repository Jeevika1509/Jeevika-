package autowireExamples;

import org.springframework.stereotype.Component;

@Component
public class Movie {

	private director director1;
	private CameraMan cameraMan;
	private Producer producer;

	public Movie() {
		System.out.println("running movie with no arg constructor");
	}
}

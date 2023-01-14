package  com.xworkz.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
    @Autowired
	private director director1;
    @Autowired
	private CameraMan cameraMan;
    @Autowired
	private Producer producer;

	public Movie() {
		System.out.println("running movie with no arg constructor");
	}
}

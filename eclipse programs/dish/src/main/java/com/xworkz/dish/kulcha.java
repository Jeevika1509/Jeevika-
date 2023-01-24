package main.java.com.xworkz.dish;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 6,urlPatterns = "/message5")
public class kulcha extends HttpServlet {

	public kulcha() {
		System.out.println("running kulcha with no arg constructor");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet method in kulcha");
	}
}

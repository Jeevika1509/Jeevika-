package main.java.com.xworkz.dish;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 7,urlPatterns = "/message6")
public class paratha extends HttpServlet {


	public paratha() {
		System.out.println("running paratha with no arg constructor");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet method in paratha");
	}
}

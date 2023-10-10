import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet{

	String name;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie c[] = req.getCookies();
		
		for(Cookie cookie : c) {
			if(cookie.getName().equals("username")) {
				name=cookie.getValue();
			}
		}
				
		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<html><body><h1>"+"Welcome back "+name+"</h1></body></html>");
				
	}
	
}

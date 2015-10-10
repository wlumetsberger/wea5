package wea5;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyTestServlet extends HttpServlet {

	private static final long serialVersionUID = 7612625244896548197L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		PrintWriter writer = resp.getWriter();

		writer.append("<html>");
		writer.append("<body>");
		writer.append("<h1> Hello Servlet ! </h1>");
		writer.append("<p> my text </p>");
		writer.append("<body>");
		writer.append("</html>");

		writer.close();

	}

}

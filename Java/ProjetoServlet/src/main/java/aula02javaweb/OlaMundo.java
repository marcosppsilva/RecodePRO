package aula02javaweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/OlaMundo")
public class OlaMundo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public OlaMundo() {
        super();

    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		try {

			out.println("<html>");
			out.println(" <head>");
			out.println(" <title>Olá Mundo Servlet</title>");
			out.println(" </head>");
			out.println(" <body>");
			out.println(" <h1>Olá Mundo Servlet</h1>");
			out.println(" <h2 style=\"color:blue;text-align:center; padding: 5px; background-color: yellow; border-radius: 10px\">Olá em nível 2</h2>");
			out.println(" </body>");
			out.println("</html>");

		} finally {

			out.close();

		}
	}

}

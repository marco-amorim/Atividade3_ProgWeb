package application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Questions1Servlet
 */
@WebServlet("/Questions1Servlet")
public class Questions1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	String[] respostas;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Questions1Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html><body>");

		out.println("<form action=\"Questions2Servlet\" method=\"POST\">" + "Pergunta 1: <br>"
				+ "<select name=\"resposta1\">\r\n" + "		<option>Sim</option>\r\n"
				+ "		<option>Nao</option>\r\n" + "		<option>Nao Sei</option>" + "</select>"
				+ "<br><br>Pergunta 2: <br>" + "<select name=\"resposta1\">\r\n" + "		<option>Sim</option>\r\n"
				+ "		<option>Nao</option>\r\n" + "		<option>Nao Sei</option>" + "</select>"
				+ "<br><br>Pergunta 3: <br>" + "<select name=\"resposta1\">\r\n" + "		<option>Sim</option>\r\n"
				+ "		<option>Nao</option>\r\n" + "		<option>Nao Sei</option>" + "</select>"
				+ "<br><br>Pergunta 4: <br>" + "<select name=\"resposta1\">\r\n" + "		<option>Sim</option>\r\n"
				+ "		<option>Nao</option>\r\n" + "		<option>Nao Sei</option>" + "</select>"
				+ "<br><br>Pergunta 5: <br>" + "<select name=\"resposta1\">\r\n" + "		<option>Sim</option>\r\n"
				+ "		<option>Nao</option>\r\n" + "		<option>Nao Sei</option>" + "</select>" + "<br><br>"
				+ "<input type=\"submit\" value=\"Próximas Perguntas\"> " + "</form>");

		out.println("</body></html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		


	}
}

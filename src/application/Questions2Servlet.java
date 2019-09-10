package application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Questions2Servlet
 */
@WebServlet("/Questions2Servlet")
public class Questions2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Questions2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		
		out.println("<form action=\"AnswersServlet\" method=\"POST\">"
				+ "Pergunta 6: <br>"
				+ "<select name=\"resposta\">\r\n" + 
				"		<option>Sim</option>\r\n" + 
				"		<option>Nao</option>\r\n" + 
				"		<option>Nao Sei</option>"
				+ "</select>"
				+ "<br><br>Pergunta 7: <br>"
				+ "<select name=\"resposta\">\r\n" + 
				"		<option>Sim</option>\r\n" + 
				"		<option>Nao</option>\r\n" + 
				"		<option>Nao Sei</option>"
				+ "</select>"
				+ "<br><br>Pergunta 8: <br>"
				+ "<select name=\"resposta\">\r\n" + 
				"		<option>Sim</option>\r\n" + 
				"		<option>Nao</option>\r\n" + 
				"		<option>Nao Sei</option>"
				+ "</select>"
				+ "<br><br>Pergunta 9: <br>"
				+ "<select name=\"resposta\">\r\n" + 
				"		<option>Sim</option>\r\n" + 
				"		<option>Nao</option>\r\n" + 
				"		<option>Nao Sei</option>"
				+ "</select>"
				+ "<br><br>Pergunta 10: <br>"
				+ "<select name=\"resposta\">\r\n" + 
				"		<option>Sim</option>\r\n" + 
				"		<option>Nao</option>\r\n" + 
				"		<option>Nao Sei</option>"
				+ "</select>"
				+ "<br><br>"
				+ "<input type=\"submit\" value=\"Próximas Perguntas\"> "
				+ "</form>");
		
		
		
		out.println("</body></html>");
	}
	}



package application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AnswersServlet
 */
@WebServlet("/AnswersServlet")
public class AnswersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private int respostasPositivas = 0;
	private int respostasNegativas = 0;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AnswersServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html><body>");

		// String[] respostasPagina1= request.getParameterValues("resposta1");
		//int respostasPositivasPagina1 = (int) request.getAttribute("respPositivasPg1");
		//int respostasNegativasPagina1 = (int) request.getAttribute("respNegativasPg1");

		String[] respostasPagina2 = request.getParameterValues("resposta2");

		// String[] respostasPagina1 = (String[])
		// request.getAttribute("atributoRespostas");
		// String[] respostasPagina1 = (String[])
		// request.getSession().getAttribute("respostas");

//		for (String x : respostasPagina1) {
//
//			if (x.equalsIgnoreCase("Sim")) {
//				respostasPositivas++;
//			} else if (x.equalsIgnoreCase("Nao")) {
//			}
//
//		}

		for (String y : respostasPagina2) {

			if (y.equalsIgnoreCase("Sim")) {
				respostasPositivas++;
			} else if (y.equalsIgnoreCase("Nao")) {
				respostasNegativas++;
			}

		}

		out.println("<h2>Resultados das Respostas</h2>" + "Respostas Positivas: "
				+ respostasPositivas + "<br><br>" + "Respostas Negativas: "
				+ respostasNegativas);

		respostasPositivas = 0;
		respostasNegativas = 0;

		out.println("</body></html>");
	}

}

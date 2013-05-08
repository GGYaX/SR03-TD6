package Converter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DollarConverterServlet
 */
public class DollarConverterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DollarConverterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<form method=\"post\">");
        out.println("<input type=\"text\" name=\"dollars\" />");
        out.println("<input type=\"submit\" />");
        out.println("</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Float dollars = Float.parseFloat(request.getParameter("dollars"));
        EuroDollarConverterBean converter = new EuroDollarConverterBean();
        converter.setTaux(1.38f);
		converter.setDollars(dollars);
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Conversion de USD" + converter.getDollars().toString()+"<br />");
        out.println("Valeur en EUR: " + converter.getEuros().toString());
	}

}

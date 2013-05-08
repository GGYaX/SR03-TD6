package Converter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EuroConverterServlet
 */
public class EuroConverterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EuroConverterServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<form method=\"post\">");
        out.println("<input type=\"text\" name=\"euros\" />");
        out.println("<input type=\"submit\" />");
        out.println("</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Float euros = Float.parseFloat(request.getParameter("euros"));
        EuroDollarConverterBean converter = new EuroDollarConverterBean();
        converter.setTaux(1.25f);
		converter.setEuros(euros);
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Conversion de EUR" + converter.getEuros().toString()+"<br />");
        out.println("Valeur en USD: " + converter.getDollars().toString());
	}

}

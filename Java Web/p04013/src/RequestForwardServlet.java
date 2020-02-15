import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RequestForwardServlet  extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html;charset=utf-8");
		//1.�洢���ݵ�request������
		
		request.setAttribute("company", "IMUSTSE17");
		//2.����ת�����ڶ�����Servlet(resultSevelet)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/resultServlet");
		dispatcher.forward(request, response);
	}
}

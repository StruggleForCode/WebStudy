import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class IncludedServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		//�������ı���
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		
		//1.��ȡ��һ��Servlet�Ĳ���
		PrintWriter out = response.getWriter();
		out.print("����" + "<br/>");
		out.print("URI:" + request.getRequestURL() + "<br>");
		out.print("parameter p1�� " + request.getParameter("p1") + "<br>");
		
	}
}

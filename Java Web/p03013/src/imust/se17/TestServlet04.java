package imust.se17;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ����ʹ��ServletContextʵ��Servlet����������
 * @author 27289
 *
 */

public class TestServlet04 extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		ServletContext context = this.getServletContext();
		//ͨ��setAttribute������������ֵ
		context.setAttribute("saveData", "save data in TextServlet04 !");
		
		//ȡ��context���󱣴��ֵ
		String data = (String) context.getAttribute("saveData");
		PrintWriter out = response.getWriter(); 
		out.println("data = " + data);
	}
}

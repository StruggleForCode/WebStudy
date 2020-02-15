import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ���Ի�ȡ������Ϣ����Ϣ�ķ���
 * @author 27289
 *
 */


public class RequestLineServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//��ȡ��������Ϣ
		out.println("getMethod:" + request.getMethod() + "<br/>");
		//��÷��ʵĵ�ַ
		out.println("getRequestURI:" + request.getRequestURI() + "<br/>");
		out.println("getQueryString:" + request.getQueryString() + "<br/>");
		out.println("getProtocol:" + request.getProtocol() + "<br/>");
		out.println("getContextPath:" + request.getContextPath() + "<br/>");
		out.println("getServlet:" + request.getServletPath() + "<br/>");
		out.println("getRemoteAddr:" + request.getRemoteAddr() + "<br/>");
		out.println("getRemoteHost:" +  request.getRemoteHost() + "<br/>");
		out.println("getRemotePort:" + request.getRemotePort() + "<br/>");
		out.println("getLocalAddr:" + request.getLocalAddr() + "<br/>");
		out.println("getLocalName:" + request.getLocalName() + "<br/>");
		out.println("getLocalPort:" + request.getLocalPort() + "<br/>");
		out.println("getServerName:" + request.getServerName() + "<br/>");
		out.println("getServerPort:" + request.getServerPort() + "<br/>");
		out.println("getScheme:" + request.getScheme() + "<br/>");
		out.println("getRequestURL" + request.getRequestURI() + "<br/>");	
	}
}

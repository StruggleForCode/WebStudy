package imust.se17;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * ��½Servlet
 * @author 27289
 *
 */

public class LoginServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{
		//��ֹ��������
		response.setContentType("text/html;charset=utf-8");
		//1.��ȡ�û���������
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//2.�ж��û����������Ƿ���ȷ�������ȷ��������ӭҳ�棬����������½ҳ�����µ�½
		if("imust".equals(username) && "123".equals(password)){
			response.sendRedirect("welcome.html");
		}else{
			response.sendRedirect("login.html");
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException{
		doGet(request, response);
	}
	
}		

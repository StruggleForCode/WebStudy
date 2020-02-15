import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ResultServlet  extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html;charset=utf-8");
		//1.��ȡ request�д洢������
		
		String company =  (String)request.getAttribute("company");
		
		//2.��ӡrequest�е�����
		PrintWriter out = response.getWriter();
		if(company != null){
			out.print("��˾����:" + company + "<br/>");
		}
	}
}

package imust.se17;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * ʵ����ҳ�Ķ�ʱˢ�²���ת
 * @author 27289
 *
 */

public class RefreshServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{
		
		//response.setHeader("Refresh", "2;URL=http://www.imust.cn");
		//ÿ�����붨ʱˢ�µ�ǰҳ��
		response.setHeader("Refresh", "3");
		//�����ǰ�¼�
		response.getWriter().println(new Date());
		
	}
}

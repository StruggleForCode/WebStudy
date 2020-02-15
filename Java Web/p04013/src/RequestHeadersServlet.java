import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ���Ի�ȡ������Ϣͷ��Ϣ�ķ���
 * @author 27289
 *
 */


public class RequestHeadersServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//��ȡ������Ϣ������ͷ�ֶ�
		Enumeration headerNames = request.getHeaderNames();
		//ʹ��ѭ���������е�����ͷ,ͨ��getHeader()��������ȡָ�����Ƶ�ͷ�ֶ�
		while(headerNames.hasMoreElements()){
			String headerName = (String)headerNames.nextElement();
			out.println(headerName + ":" + request.getHeader(headerName) + "<br/>");
		}
	}
}

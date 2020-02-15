package imust.se17;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class HelloWorldServlet extends GenericServlet{
	public void service(ServletRequest request, ServletResponse response) throws IOException{
		
		PrintWriter out = response.getWriter();
		//���ServletConfig����
		//ServletConfig config = this.getServletConfig();
		//��ò�����Ϊencoding�Ķ�Ӧ�Ĳ���ֵ
		//String param = config.getInitParameter("encoding");
		
		//out.print("encoding = " + param);
		
		//�õ�ServletContext����
		ServletContext context = this.getServletContext();
		//�õ��������г�ʼ����������Enumeration����
		Enumeration<String> paramNames = context.getInitParameterNames();
		out.println("all the paramName and paramValue are following:");
		//�������еĳ�ʼ�����������õ���Ӧ�Ĳ���ֵ����ӡ
		while(paramNames.hasMoreElements()){
			String name = paramNames.nextElement();
			String value = context.getInitParameter(name);
			out.println(name + ":" + value);
		}
	}
}

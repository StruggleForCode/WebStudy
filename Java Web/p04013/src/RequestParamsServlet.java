import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RequestParamsServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response){
		//1.�����û�����Ĳ���ֵ
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String[] hobby = request.getParameterValues("hobby");
		//2.��ʾ�û�����Ĳ���ֵ
		System.out.println("username = " + username);
		System.out.println("password = " + password);
		for(int i = 0; i < hobby.length; i++){
//			System.out.println("jj");
			System.out.println(hobby[i] + ',');
		}
	}
}

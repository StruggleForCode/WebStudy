import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ��ʾ�û��ϴη��ʵ�ʱ�䣬ʹ��Cookie����ʵ��
 * @author 27289
 *
 */

public class LastAccessServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		//0.���ñ��룬��ֹ����
		response.setContentType("text/html;charset=utf-8");
		String lastAccessTime = null;
		
		//1.��ȡ�������е�Cookie �����Ǵ�ŵ�������
		
		Cookie[] cookies = request.getCookies();
		//����Cookie����
		for(int i = 0; cookies != null && i < cookies.length; i++){
			if("lastAccess".equals(cookies[i].getName())){
				//���Cookie������ΪlassAccess�����ȡCookie��ֵ
				 lastAccessTime = cookies[i].getValue();
				 break;
			}
		}
		
		//2.�ж��Ƿ��������ΪlassAccess ��Cookie ���������˵����һ�η��ʣ����� ����ϴη��ʵ�ʱ��
		if(lastAccessTime == null){
			response.getWriter().print("�����״η��ʱ���վ��");
		}else{
			response.getWriter().print("���ϴη��ʵ�ʱ���ǣ�" + lastAccessTime);
		}
		//3.�ѵ�ǰʱ����ΪCookieֵ���͵��ͻ���
		String currentTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
		//����һ��Cookie
		Cookie cookie = new Cookie("lastAccess", currentTime);
		//����Cookie
		response.addCookie(cookie);
		
	}
}

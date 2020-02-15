package cn.itcast.awt.demo;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameDome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.�������� Frame
		Frame f = new Frame("myFrame");
		//2. �Դ�����л�������
		f.setSize(500, 400);
		f.setLocation(400, 400);
		
		//���ò���
		f.setLayout(new FlowLayout());
		
		// ������������
		Button but = new Button("My button");
		
		//�����ı������
		TextField tf = new TextField(40);
		
		
		
		//�������ӵ�������
		f.add(but);
		f.add(tf);
		//3.�ô�����ʾ
		
		
		/*
		 * ���� �ı�����ֻ����������
		 * �¼�Դ���ı���
		 * �ı���ע����̼���
		 * �¼�����
		 */
		
		tf.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				//1. ��λ�ȡ¼������ݣ� ͨ�������¼������ȡ
//				char key = e.getKeyChar();
//				int code = e.getKeyCode();
//				System.out.println(key + "....." + KeyEvent.getKeyText(code));
				
				
//				int code = e.getKeyCode();
//				if(!(code >= KeyEvent.VK_0 && code <= KeyEvent.VK_9)) {
//					System.out.println("������0-9����");
//					e.consume();
//				}
				
				if(e.isControlDown() &&e.getKeyCode() ==  KeyEvent.VK_ENTER) {
					System.out.println("ctrl + enter run");
				}
				
			}
			
		});
		
		
		
		/*
		 * ���� ��Ҫ�����ť��Ч���� �����ӡһ�仰��
		 * ˼·��
		 * 1.ȷ���¼�Դ����ť
		 * 2.ȷ������������ť��Ӽ���������ť���������������ť�����в���
		 * 3.���崦��ʽ��
		 * 
		 * ����Ĺ淶�� xxxxxxxLinstender:xxx������
		 * 
		 */
		//1. �ڰ�ť���������ļ�����
		but.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println("��ť�������ˡ�����" + e);
				//System.exit(0);
				
			}
		});
		
		
		/*
		 * ������Ҫʵ�ֵ�������x�Ϳ���ʵ�ִ���Ĺر�
		 * ˼·��
		 * 1.�¼�Դ������
		 * 2.��������ͨ�����ڶ���ȥ��
		 * 3.�¼�����
		 * 
		 * ������Щ�����ӿ����������ࣿ
		 * ֻҪ�����ӿڵ��еķ�����2�����ڣ���û���������ࡣ�������ĳ���ֻΪ���㴴����������
		 * ����һ������ӿڶ���������
		 */
		
		f.addWindowListener(new WindowAdapter() {
			
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("window closing");
				System.exit(0);
			}

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				//super.windowOpened(e);
				System.out.println("kong que kai ping ");
			}
			
			
		});
		
		

		/*
		 * ��ʾ������
		 * 
		 * ��ť�¼�Դ
		 * ��������ע�ᵽ��ť�ϡ�
		 * 
		 * ���.addXXXListener(new XXXAdapter()
		 * {
		 * 		public void methodName(XXXEvent e){}
		 * });
		 * 
		 */
		
		
		
		but.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				/*
				 * 
				 * ��Ҫ�����˫�����д��� Ӧ��������¼����� ��Ϊ�¼�����һ�������ڲ���Ȼ��װ�¼�Դ�Լ��¼��������
				 * Ҫ��MouseEvent����
				 */
				
				if(arg0.getClickCount() == 2) {
					System.out.println("mouse Click");
				}
				
			}
			
		});
		
		
		
		f.setVisible(true);
		System.out.println("over");
	}

}

package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * ����һ���̳���JPanel���࣬��д����paint���� *
 */
class MyPanel extends JPanel
{
	private int x = 200;
	private int y = 200;
	
	public void display()
	{
		x ++;
		y ++;
		
		//�ػ�JPanel
		this.repaint();
	}
	
	/**
	 * repaint���������paint���������Զ����Graphics����
	 * Ȼ������øö������2D��ͼ
	 * ע���÷�������д��JPanel��paint����
	 */
	public void paint(Graphics g)
	{
		//���õ�super.paint(g),�ø�����һЩ��ǰ�Ĺ�������ˢ����Ļ
		super.paint(g);	
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(Color.RED);//���û�ͼ����ɫ
		g2d.fill3DRect(x, y, 100, 100, true);//���һ������		
	}
}
 
public class PanelTest
{
	public static void main(String[] args)
	{
		JFrame  jf = new JFrame();
		MyPanel jp = new MyPanel();
		
		jf.setBounds(200, 200, 500, 500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(jp);
		jf.setVisible(true);
		
		while(true)
		{
			//��ͣ���ػ�JPanel,ʵ�ֶ�����Ч��
			jp.display();
			
			try
			{
				Thread.sleep(300);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}


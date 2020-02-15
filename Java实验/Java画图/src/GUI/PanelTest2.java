package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * ����һ���̳���JPanel���࣬��д����paint���� *
 */
class MyPanel1 extends JPanel
{
	private int x = 200;
	private int y = 200;
	private Image image;	//ͼ�񻺳�
	private Graphics og;
	
	public void display()
	{
		x ++;
		y ++;
		
		if(og == null)
		{
			//JPanel�̳���Component�࣬����ʹ�����ķ���createImage����һ����JPanel��С��ͬ��ͼ�λ���
			//Ȼ������Image�ӿڵķ�����û�ͼ����
			image = this.createImage(this.getWidth(),this.getHeight());
			if(image != null)og = image.getGraphics();
		}
		
		if(og != null)
		{
			//���õ�super.paint(g),�ø�����һЩ��ǰ�Ĺ�������ˢ����Ļ
			super.paint(og);	
						
			og.setColor(Color.RED);				//���û�ͼ����ɫ
			og.fill3DRect(x, y, 100, 100, true);//��ͼ				
			//this.paint(this.getGraphics());
		}
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
		g.drawImage(image, 0, 0, this);	
	}
}
 
public class PanelTest2
{
	public static void main(String[] args)
	{
		JFrame  jf = new JFrame();
		MyPanel1 jp = new MyPanel1();
		
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

package GUI;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class TestDemo {
	
	public final static int maze_x = 180;
	public final static int maze_y = 130;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				MyFrame  frame = new MyFrame();
				frame.setVisible(true);
			}
		});
	}
	
	/*
	 * ����
	 */
	public static class MyFrame extends JFrame{
		public static final String TITLE = "JAVAͼ�λ���";
		
		public static final int WIDTH = 1000;
		public static final int HEIGHT = 1000;
		
		public MyFrame() {
			super();
			initFrame();
		}
		
		public void initFrame() {
			//���ô��ڱ��� �ʹ����С
			setTitle(TITLE);
			setSize(WIDTH, HEIGHT);
			
			//���ô���رհ�ť��Ĭ�ϲ���������ر�ʱ�˳����̣�
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			
			//�Ѵ���λ���Ƶ���Ļ������
			setLocationRelativeTo(null);
			
			//���ô�����������
			MyPanel panel = new MyPanel(this);
			setContentPane(panel);
		}
		
	}
	
	/*
	 * �������
	 * 
	 */
	
	public static class MyPanel extends JPanel{
		private MyFrame frame;
		public MyPanel(MyFrame myFrame) {
			super();
			this.frame = myFrame;
		}
		
		/*
		 * �����������ݣ�����Jpanel������һ�θ÷�����������
		 * ֮���������ı���Ҫ���»��ƣ��ɵ���updateUI() ��������
		 * ϵͳ�ٴε��øķ������Ƹ���JPanel ������
		 */
		
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			//drawLine(g);
			//drawRect(g);
			drawImage(g);
		}
		
		
		private void drawLine(Graphics g) {
			//frame.setTitle("1. �߶�/����");
			
			//����Graphics�ĸ����� ��Ҫ�ı�Graphics�Ĳ���
			//�������ʹ�ø���������Ӱ�쵽Graphicsԭ�е�����
			Graphics2D g2d = (Graphics2D)g.create();
			
			//�����
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			
			//���û�����ɫ
			g2d.setColor(Color.RED);
			
			//1. ���������߶Σ� �㣨20�� 50�� �㣨200�� 50����
			g2d.drawLine(20, 50, 200, 50);
			
			//2.����������:�㣨50�� 100�� �㣨100�� 130�� ��150�� 70) (200, 100);
			int[] xPoints = new int[] {50, 100, 150, 200};
			int[] yPoints = new int[] {100, 120, 80, 100};
			int nPoints = 4;
			g2d.drawPolyline(xPoints, yPoints, nPoints);
			

            // 3. ��������߶Σ������߿�Ϊ5px��: ��(50, 150), ��(200, 150)
            BasicStroke bs1 = new BasicStroke(5);       // �ʻ������������ʿ��/�߿�Ϊ5px��
            g2d.setStroke(bs1);
            g2d.drawLine(50, 150, 200, 150);

            // 4. ��������: �����߷�Ϊ���ɶΣ� ʵ�߶� �� �հ׶� ����Ϊ��һ�Σ�, ʵ�߶� �� �հ׶� �������,
            //             ���Ƶ�ÿһ�Σ����� ʵ�߶� �� �հ׶Σ��� ���� �� dash ����ģʽ������ȡֵ������
            //             Ԫ�ؿ�ʼѭ��ȡֵ��, �������鼴��ʾÿ�γ��ȷֱ�Ϊ: 5px, 10px, 5px, 10px, ...
            float[] dash = new float[] { 5, 10 };
            BasicStroke bs2 = new BasicStroke(
                    1,                      // ���ʿ��/�߿�
                    BasicStroke.CAP_SQUARE,
                    BasicStroke.JOIN_MITER,
                    10.0f,
                    dash,                   // ����ģʽ����
                    0.0f
            );
            g2d.setStroke(bs2);
            g2d.drawLine(50, 200, 200, 200);

			
			g2d.dispose();
			}
		
		/* 
		 * ����/�����
		 */
		
		private void drawRect(Graphics g) {
			Graphics2D g2d = (Graphics2D) g.create();
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g2d.setColor(Color.black);
			
			//1. ����һ�����Σ� ��㣨30�� 20���� ��80 ��100
		//	g2d.drawRect(maze_x, maze_y, maze_x + 500, maze_y + 500);
			
			BasicStroke bs1 = new BasicStroke(3);
			g2d.setStroke(bs1);
			
			for (int x = maze_x; x <= maze_x + 500; x += 25)
				g2d.drawLine(x, maze_y, x, maze_y + 500);
			for (int y = maze_y; y <= maze_y + 500; y+= 25)
				g2d.drawLine(maze_x, y, maze_x + 500, y);
			
			
			
			
//			//2.���һ������
//			g2d.fillRect(140, 20, 80, 100);
//			
//			//3.����һ��Բ�Ǿ���: ��㣨30�� 150�� ��80�� ��100�� Բ�ǿ�30�� Բ�Ǹ�30
//			g2d.drawRoundRect(30, 150, 80, 100, 30, 30);
//			
//			//4. ����һ������Σ�����β�������� �㣨140�� 150�� ��180�� 250  �� 220 200
//			int[] xPoint = new int[] {140, 180, 220};
//			int[] yPoint = new int[] {150, 250, 200};
//			int nPoint = 3;
//			g2d.drawPolygon(xPoint, yPoint, nPoint);
//			
//			g2d.dispose();
			
		}
			
		private void drawImage(Graphics g) {
			Graphics2D g2d = (Graphics2D)g.create();
			
			// �ӱ��ض�ȡһ��ͼƬ
			String filepath = "Map.jpg";
			Image image = Toolkit.getDefaultToolkit().getImage(filepath);
			
			//����ͼƬ�������ߴ��Ĳ���ͼƬԭ���Ŀ�ȣ� ��ͼƬ�����ʵ����Ż���
			g2d.drawImage(image, 100, 100, 30, 30,this);
			//g2d.drawImage(image,  500, 500, 30, 30,this);
			
			g2d.dispose();
			}
		}

}


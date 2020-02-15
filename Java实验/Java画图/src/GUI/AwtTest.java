package GUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.Timer;


public class AwtTest extends WindowAdapter {
	
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		// super.windowClosing(e);
		System.exit(0);
	}
	
	private Random rand = new Random(); // �����������
	
	private Frame f = new Frame("Welcome to Ball Game!"); // ��ܴ���
	private Button btn = new Button("Restart");
	
	// ����������
	// �����Ŀ�͸�
	private final int TABLE_WIDTH = 300;
	private final int TABLE_HEIGHT = 400;
	private BallCanvas table = new BallCanvas();
	
	// С�������
	private final int BALL_SIZE = 16; // ���ֱ��
	// С�����ʼλ�ã�Ҫ��֤��������Χ�ڣ�������Ͻǣ�
	private int ballX; // = rand.nextInt(200) + 20;
	private int ballY; // = rand.nextInt(10) + 20;
	// С�����ʾ���ʣ�Ϊ��λʱ���������������˶����پ��룩
	// ����x��y���������б��ʲ���������Ӻ�г��ģ��������̣�
	// ��ֵ��ʾ����
	private int ySpeed = 10;
	private int xSpeed = (int)(ySpeed * 2.0 * (rand.nextDouble() - 0.5));
	
	// ���ĵ�����
	// ���ĵĿ�͸�
	private final int RACKET_WIDTH = 60; 
	private final int RACKET_HEIGHT = 20;
	// ���ĵ���ʼλ�ã��������Ͻǣ���Ҫ��֤��������Χ֮��
	private int racketX; // = rand.nextInt(200);
	private final int racketY = 340; // ���ĵ�Y����̶���340��λ��
	private int racketSpeed = 10; // �����ƶ��ٶȹ̶�Ϊ10������ֻ�����˶�
	
	private boolean isLose = false; // �Ƿ�����
	
	Timer timer;
	
	class BallCanvas extends Canvas {
 
		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			// super.paint(g);
			if (isLose) {
				g.setColor(new Color(255, 0, 0));
				g.setFont(new Font("Times", Font.BOLD, 30));
				g.drawString("Game Over!", 50, 200);
			}
			else {
				int x = ballX;
				int y = ballY;
				
				if (ballX < 0) {
					x = 0;
				}
				if (ballX + BALL_SIZE > TABLE_WIDTH) {
					x = TABLE_WIDTH - BALL_SIZE;
				}
				if (ballY <= 0) {
					y = 0;
				}
				if (ballY + BALL_SIZE > racketY &&
						ballX + BALL_SIZE / 2 >= racketX &&
						ballX + BALL_SIZE / 2 <= racketX + RACKET_WIDTH) {
					y = racketY - BALL_SIZE;
				}
				
				g.setColor(new Color(240, 240, 80));
				g.fillOval(x, y, BALL_SIZE, BALL_SIZE);
				
				g.setColor(new Color(80, 80, 200));
				g.fillRect(racketX, racketY, RACKET_WIDTH, RACKET_HEIGHT);
			}
		}
		
	}
	
	private void initTable() {
		ballX = rand.nextInt(200) + 20;
		ballY = rand.nextInt(10) + 20;
		racketX = rand.nextInt(200);
		
		isLose = false;
		timer.start();
	}
	
	public void init() {
		
		f.addWindowListener(this);
		
		KeyAdapter keyCtrl = new KeyAdapter() { // �������Ұ����������Ķ���
 
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				// super.keyPressed(e);
				
				// ������ȸպ��������ٶȵ�����������˲����ж��Ƿ����
				// ֻ��Ҫ��ֹ��ǽ����
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					if (racketX > 0) {
						racketX -= racketSpeed;
					}
				}
				else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					if (racketX + RACKET_WIDTH < TABLE_WIDTH) {
						racketX += racketSpeed;
					}
				}
				else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
					System.exit(0);
				}
			}
			
		};
		f.addKeyListener(keyCtrl); // ���ں�����ͬʱ������������������һ����ý��㶼�ɽ�����Ϸ
		table.addKeyListener(keyCtrl);
		
		timer = new Timer(100, e -> {
			// ������ײ��
			if (ballX <= 0 || ballX + BALL_SIZE >= TABLE_WIDTH) { // ����ײ�߾�Ҫ����
				xSpeed = -xSpeed;
			}
			// �������ײ��
			if (ballY <= 0 || // ײ���ߣ�����������Ƿ�ײ��
					ballY + BALL_SIZE >= racketY &&
					ballY + BALL_SIZE <= racketY + RACKET_HEIGHT &&
						ballX + BALL_SIZE / 2 >= racketX && // (2) ��������λ�������ķ�Χ֮��
						ballX + BALL_SIZE / 2 <= racketX + RACKET_WIDTH) { // ���������������ʹ���ײ����
			// ����ײ�߻���ҲҪ����
				ySpeed = -ySpeed;
			}
			
			// �Ƿ�����
			if (ballY + BALL_SIZE > racketY + RACKET_HEIGHT) { // ֻҪ����±��س����ĵ��ϱ��ؾ�����
				isLose = true;
				timer.stop();
				table.repaint();
			}
			
			// ��λ��Ȼ���ػ�
			ballX += xSpeed;
			ballY += ySpeed;
			table.repaint();
		});
		
		btn.addActionListener(e -> {
			table.requestFocus();
			initTable();
		});
		
		table.setPreferredSize(new Dimension(TABLE_WIDTH, TABLE_HEIGHT));
		f.add(table);
		f.add(btn, BorderLayout.SOUTH);
		
		initTable();
		
		f.pack();
		f.setVisible(true);
		
		table.requestFocus();
	}
	
	public static void main(String[] args) {
		new AwtTest().init();
	}
 
}


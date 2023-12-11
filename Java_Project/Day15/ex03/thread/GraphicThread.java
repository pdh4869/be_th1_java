package ex03.thread;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JFrame;

public class GraphicThread extends JFrame implements Runnable {
	int num,x,y;
	Color color;
	Random random;
	
	
	public GraphicThread(int num) {
		this.num = num;
		color = Color.blue;
		random = new Random();
		setSize(500, 400); // 프레임 크기 (너비, 높이)
		setVisible(true); // 화면보여주기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

	@Override
	public void paint(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, 3, 3);
	}



	@Override
	public void run() {
		Rectangle rect = getBounds();
		
		for (int i=0;i<num;i++) {
			x = random.nextInt(rect.width);
			y = random.nextInt(rect.height);
			
			repaint();
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// 1. 
		//GraphicThread gt = new GraphicThread(100);
		//Thread t1 = new Thread(gt);
		//t1.start();
		
		// 2.
		new Thread(new GraphicThread(200)).start();
	}
}

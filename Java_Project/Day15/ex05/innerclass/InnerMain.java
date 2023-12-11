package ex05.innerclass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class InnerMain {
	
	class EventHandler implements ActionListener { // inner class

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("ActionEvent 발생");
			System.out.println(e.getActionCommand());
			System.out.println(e.getSource());
			System.out.println();
		} 
		
		
	}
	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스");
		Button btn = new Button("Button - Start");
		
//1.	EventHandler handler = new InnerMain().new EventHandler();
//		btn.addActionListener(handler);

		//2.
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent 발생");
				System.out.println(e.getActionCommand());
				System.out.println(e.getSource());
				System.out.println("지금만듬");	
			} // 익명(무명) 클래스
			
		}); // 버튼에 액션이벤트 추가
		
		frame.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		frame.add(btn); // 프레임(윈도우)에 버튼 컴포넌트 추가
		frame.setVisible(true);
		frame.setSize(300,200);
		frame.setLocation(300, 150);
	}
}

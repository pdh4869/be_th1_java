package quiz.abstract1;

public class MainEntry {
	public static void main(String[] args) {
		Trans[] trs = new Trans[3];
		Object[] name = {new Bus(), new Subway(), new Airplane()};
		trs[0] = new Bus();
		trs[1] = new Subway();
		trs[2] = new Airplane();
		
		for (int i=0;i<trs.length;i++) {
			trs[i].start();
		}
		System.out.println();
		for (int i=0;i<trs.length;i++) {
			trs[i].stop();
		}
	}
}

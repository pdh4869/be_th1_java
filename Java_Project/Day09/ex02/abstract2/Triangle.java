package ex02.abstract2;

public class Triangle extends Shape {

	@Override
	public double calc(double x) {
		result = 0.75 * x * x / 2;
		return result;
	}

	@Override
	public void show(String name) {
		calc(8);
		System.out.printf("넓이: %.2f인 %s이 만들어졌습니다.\n",result,name);
	}

}

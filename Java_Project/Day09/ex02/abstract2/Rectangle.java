package ex02.abstract2;

public class Rectangle extends Shape {

	@Override
	public double calc(double x) {
		result = x * x;
		return result;
	}

	@Override
	public void show(String name) {
		calc(9);
		System.out.printf("넓이: %.2f인 %s이 만들어졌습니다.\n",result,name);
	}

}

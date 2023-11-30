package ex02.abstract2;

public class Circle extends Shape {

	@Override
	public double calc(double x) {
		result =  x * x * Math.PI;
		return 0;
	}

	@Override
	public void show(String name) {
		calc(5.5);
		System.out.printf("넓이: %.2f인 %s이 만들어졌습니다.\n",result,name);
	}

}

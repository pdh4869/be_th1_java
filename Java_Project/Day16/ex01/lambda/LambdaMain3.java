/*
 * package ex01.lambda;
 * 
 * interface Message { int something(int x, int y); // void 형태 }
 * 
 * class Person { public void greeting(Message msg) { int su = msg.something(80,
 * 50); System.out.println("Number is: "+su); } }
 * 
 * public class LambdaMain3 { public static void main(String[] args) { Person p
 * = new Person(); p.greeting(new Message() {
 * 
 * @Override public int something(int x, int y) {
 * System.out.println("parameter value: "+x+", "+y); return 300; } });
 * 
 * System.out.println("--------------------------"); p.greeting((x,y)-> { // int
 * x처럼 타입 안써도 되며, 괄호 안써도 됨(변수가 하나일때) -> 람다
 * System.out.println("parameter value: "+x+", "+y); return 50; });
 * 
 * p.greeting((x,y) -> { return x+y;}); p.greeting((x,y) -> x+y); } }
 */
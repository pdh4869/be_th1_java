/*
 * package ex01.lambda;
 * 
 * interface Message { int something(); // void 형태 }
 * 
 * class Person { public void greeting(Message msg) { int su = msg.something();
 * System.out.println("Number is: "+su); } }
 * 
 * public class LambdaMain { public static void main(String[] args) { Person p =
 * new Person(); p.greeting(new Message() {
 * 
 * @Override public int something() { System.out.println("good morning");
 * System.out.println("nice to meet you"); return 300; } });
 * 
 * System.out.println("--------------------------"); p.greeting(()-> {
 * System.out.println("lambda good morning");
 * System.out.println("lambda nice to meet you"); return 50; }); } }
 */
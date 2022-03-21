package week1.day2;

public class MyCalculator {
	public static void main(String args[]) {
	Calculator nCalc= new Calculator();
    System.out.println(nCalc.getAdd(20, 34, 789));
    System.out.println(nCalc.getSub(560, 490));
    System.out.println(nCalc.getMul(5.3, 2));
    System.out.println(nCalc.getdivide(34.67f, 2.45f));
}
}

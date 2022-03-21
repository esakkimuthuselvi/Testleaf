package week1.day2;
 class Calculator {
	public int getAdd(int num1, int num2, int num3)
	{
		return num1+num2+num3;
	}
	public int getSub(int num1, int num2) {
		return num1-num2;
	}
	public double getMul(double num1,double num2) {
		return num1*num2;
	}
    public float getdivide(float num1, float num2) {
		return num1/num2;
	}
    public static void main(String args[]) {
		Calculator nCalc= new Calculator();
		//nCalc.getAdd(20, 34, 789);
	    System.out.println(nCalc.getAdd(20, 34, 789));
	    System.out.println(nCalc.getSub(560, 490));
	    System.out.println(nCalc.getMul(5.3, 2));
	    System.out.println(nCalc.getdivide(34.67f, 2.45f));
    }
    
}
//public class MyCalculator{
//	public static void main(String args[]) {
//		Calculator nCalc= new Calculator();
//		nCalc.getAdd(20, 34, 789);
////	    System.out.println(nCalc.getAdd(20, 34, 789));
////	    System.out.println(nCalc.getSub(560, 490));
////	    System.out.println(nCalc.getMul(5.3, 2));
////	    System.out.println(nCalc.getdivide(34.67f, 2.45f));
//    }
//}



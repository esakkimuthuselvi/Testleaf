package week1.day1;

public class Calculator {
	
	public int getAdd(int num1, int num2) {
		return  num1+num2;
		
	}
	public double getSub(double num1, double num2) {
		return  num1-num2;
	}
    public double getMul(double num1, double num2) {
    	return  num1*num2;
	}
    public int getdivide(int num1, int num2) {
    	return  num1/num2;
	}
	public static void main(String args[])
	{
		Calculator calc=new Calculator();
		System.out.println(calc.getAdd(10,15));
		System.out.println(calc.getSub(10.5,9.2));
		System.out.println(calc.getMul(6.3,9.2));
		System.out.println(calc.getdivide(15,5));
		//calc.getAdd(10,15);
	}

}

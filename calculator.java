package wipro_oops.com;

public class calculator {
	public static int powerInt(int num1,int num2) {
		return (int)Math.pow(num1, num2);
	}
	public static double powerdouble(double num1,int num2) {
		return Math.pow(num1,num2);
	}
	public static void main(String[] args) {
		System.out.println(calculator.powerInt(2,3));
		System.out.println(calculator.powerdouble(2.0,3));
	}
}

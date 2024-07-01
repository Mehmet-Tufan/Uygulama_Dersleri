package week02.day01;

public class Qestion002 {
	/*
	2- Türk Lirasınını dolara cevirelim.
	 */
	public static void main(String[] args) {
		
		double amount=100;
		double exchangeRate=32.68;
		float exchange = (float)(amount/exchangeRate);
		System.out.println(amount+" TL "+ exchange+ " dolara eşittir.");
	
	}
}
package week02.day01;

import java.util.Scanner;

public class Qestion005 {
	/*
	5- Dairenin alanını ve çevresini bulalım. (Çap ya da yarıçap input olarak gelsin).
	 */
	public static void main(String[] args) {
		/*final double PI= Math.PI;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen bir yaricap giriniz : ");
		double radius = scanner.nextDouble();
		double calculatedArea = PI*radius*radius;
		double circumference = 2*PI*radius;
		System.out.println("Dairenin Alani : " + calculatedArea +"\nDairenin Cevresi : " + circumference);
		scanner.close();*/
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Yarıçapı giriniz: ");
		double radius=scanner.nextDouble();
		double areaOfCircle,circumference;
		final double PI=Math.PI;
		areaOfCircle=PI*radius*radius;
		circumference=2*PI*radius;
		System.out.print("Dairenin alanı: "+(float)areaOfCircle+"\t"+"Dairenin çevresi: "+(float)circumference);
		scanner.close();
		
		
		
	}
}
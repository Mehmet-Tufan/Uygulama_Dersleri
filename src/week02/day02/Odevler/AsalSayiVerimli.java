package week02.day02.Odevler;

import java.time.LocalTime;
import java.util.Scanner;
/*
    1397311 Asal sayisi ile test edilmiştir.
 */
public class AsalSayiVerimli {
	public static void main(String[] args) {
		LocalTime startDate = LocalTime.now();
		int sayi;
		boolean asalMİ = true;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		sayi = scanner.nextInt();
		if (sayi <= 1 || sayi % 2 == 0 && sayi != 2) {
			System.out.println("Girdiginiz " + sayi + " sayisi asal değildir");
		}
		else {
			if (sayi == 2) {
				System.out.println("Girdiginiz " + sayi + " sayisi asaldır.");
			}
			else {
				for (int i = 3; i < sayi/2; i = i + 2) /*verimliliği arttırmak için sayi değişkeni ikiye bölünmüştür. */
				{
					if (sayi % i == 0) {
						asalMİ = false;
						i = sayi;
					}
				}
				
				if (asalMİ) {
					System.out.println("Girdiginiz " + sayi + " sayisi asaldır.");
					
				}
				else {
					System.out.println("Girdiginiz " + sayi + " sayisi asal değildir");
				}
			}
		}
		LocalTime endDAte = LocalTime.now();
		System.out.println(startDate);
		System.out.println(endDAte);
		double second = startDate.getSecond();
		double second2 = endDAte.getSecond();
		System.out.println(second);
		System.out.println(second2);
		System.out.println("saniye farkı = " + (second2 - second));
		
		scanner.close();
		
	}
	
}
package week02.day02.Odevler;

import java.util.Scanner;

public class AsalSayiVerimli {
	public static void main(String[] args) {
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
				for (int i = 3; i < sayi/2; i = i + 2) {
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
		scanner.close();
	}
}
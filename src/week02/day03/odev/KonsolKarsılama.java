package week02.day03.odev;

import java.util.Scanner;

public class KonsolKarsılama {
	/*
	Bir program oluşturacağız. Kullanıcıyı önce konsolda karşılayıp, sonrasında kullanıcıya hangi dilde devam etmek
	istersiniz diye soracağız.

Karşılama menüsü aşağıdaki gibidir;
Hoşgeldiniz! / Welcome!
Lutfen goruntuleme dilini seciniz. / Please select display language.

1-- Turkish (TR)
2-- English (EN)

Kullanıcının vereceği cevaba göre bizi 2 farlı menü karşılayabilecek.

Menü'nün Türkçe versiyonundaki işlevler aşağıdaki gibidir;
0 -- Çıkış Yap
1--  Merhaba Dünya yazdır.
2-- Faktoriyel Hesapla.
3-- Asal sayı kontrolü yap.

Kullanıcı çıkış yapmadığı sürece menü'de kalacak ve menü işlevlerini kullanmaya devam edebilecek. Çıkış yapmaya karar
 vermesi durumunda;

Program sonlandırılmıştır! Gorusmek uzere! gibi bir çıktı verip bitirebilirsiniz.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean cıkıs=true;
		while (cıkıs){
			
			System.out.println("Hoşgeldiniz! / Welcome!");
			System.out.println("1-- Turkish (TR)\n" + "2-- English (EN)");
			System.out.print("Lutfen goruntuleme dilini seciniz. / Please select display language. :");
			int secim = scanner.nextInt();
			
			int turkceMenu = 1;
			switch (turkceMenu) {
				case 1: {
					System.out.println("0 -- Çıkış Yap\n" + "1--  Merhaba Dünya yazdır.\n" + "2-- Faktoriyel Hesapla.\n" + "3-- Asal sayı kontrolü yap.");
				}
				break;
			}
			System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
			int islem = scanner.nextInt();
			switch (islem) {
				
				case 0: {System.out.println("Program sonlandırılmıştır! Gorusmek uzere! gibi bir çıktı verip bitirebilirsiniz.");
				
				}
				cıkıs=false;
				break;
			}
			
			switch (islem) {
				case 1: {
					System.out.println("Merhaba Dünya ");
				}
				break;
			}
			switch (islem) {
				case 2: {
					
					System.out.print("Lutfen faktoriyelinin hesaplanmasini istediginiz sayiyi giriniz : ");
					int sayi1 = scanner.nextInt();
					int faktorıyel = 1;
					
					for (int i = 2; i <= sayi1; i++) {
						faktorıyel  *= i;
					}
					System.out.println("Girdiginiz sayinin faktoriyeli : " + faktorıyel );
				}
				break;
			}
			switch (islem) {
				case 3: {
					
					System.out.print("Lütfen bir sayi giriniz : ");
					long sayi2 = scanner.nextLong();
					boolean asalMi = true;
					
					long sqrt = (long) Math.sqrt(sayi2);
					if (sayi2 <= 1 || sayi2 % 2 == 0 && sayi2 != 2) {
						System.out.println(sayi2 + " Asal değildir.");
					}
					else if (sayi2 == 2) {
						System.out.println(sayi2 + " Asaldır.");
					}
					else {
						
						for (long i = 3; i <= sqrt; i = i + 2) {
							if (sayi2 % i == 0) {
								asalMi = false;
								break;
							}
						}
						System.out.println(sayi2 + " Asaldır.");
						
					}
				}
				break;
			} }
		
		
	}
}
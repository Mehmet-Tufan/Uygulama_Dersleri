package week02.day02;

import java.util.Scanner;

public class Qestion001 {
	/*
	1- Dışarıdan taban değeri ve üs isimli 2 tane değişken alınacak. (2 üzeri 5 gibi) tabanın kuvvetini hesaplamak istiyorum.
Hesaplamayı yaptıktan sonra, kullanıcıya ismini soracağım. Sonra çıktı olarak; "kullaniciIsmi + "n üzeri x isleminin sonucu " "
	 */
	public static void main(String[] args) {
		int answer;
		Scanner scanner=new Scanner(System.in);
		System.out.print("taban giriniz: ");
		int raised=scanner.nextInt();
		System.out.print("üst giriniz: ");
		int power=scanner.nextInt();
		scanner.nextLine();
		System.out.print("isminizi giriniz: ");
		String name=scanner.nextLine();
		answer= (int) Math.pow(raised, power);
		System.out.println(name+" "+answer);

		/*
		  Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir taban degeri giriniz : ");
        int base = scanner.nextInt();
        System.out.print("Lutfen bir us degeri giriniz : ");
        int power = scanner.nextInt();
        scanner.nextLine();
        long result = 1;

        for (int i = 0; i<power ;i++){
            result *= base;
        }
        System.out.print("Lutfen adinizi giriniz : ");
        String name = scanner.nextLine();
        System.out.println(name + " girdigin " + base + " sayisinin "+ power +". kuvveti " + result + " sayisina esittir." );
		 */
		
	}
	
}
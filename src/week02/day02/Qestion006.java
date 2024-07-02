package week02.day02;

import java.util.Scanner;

public class Qestion006 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int phoneCode = 1234;
		int mailCode = 4321;
		
		System.out.print("Lutfen telefonunuza gelen 4 haneli kodu giriniz : ");
		int inputPhoneCode = scanner.nextInt();
		System.out.print("Lutfen mailinize gelen 4 haneli kodu giriniz : ");
		int inputMailCode = scanner.nextInt();
		
		if(phoneCode == inputPhoneCode && mailCode == inputMailCode){
			System.out.println("Basariyla giris yaptiniz!");
		} else if(phoneCode != inputPhoneCode && mailCode == inputMailCode){
			System.out.println("Girdiginiz sms kodu hatalidir.");
		} else if (mailCode != inputMailCode && phoneCode == inputPhoneCode){
			System.out.println("Girdiginiz email kodu hatalidir.");
		} else {
			System.out.println("Girdiginiz kodlar hatalidir. ");
		}
	}
}
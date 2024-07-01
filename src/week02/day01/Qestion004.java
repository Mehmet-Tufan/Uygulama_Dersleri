package week02.day01;

import java.util.Scanner;

public class Qestion004 {
	/*
	4- Kullanıcıdan önce yaşını, sonrasında da kullanıcının ismini girdi olarak isteyelim. İsmini ve yaşını ekrana yazdıralım.
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Lütfen yaşınızı giriniz: ");
		int age = scanner.nextInt();//scanner.nextInt()+"\n"
		scanner.nextLine();//-> bu boş nextline() bir üst satırdaki "\n" i yutacak
		System.out.print("Lütfen adınızı giriniz: ");
		String name = scanner.nextLine();//-> bu nextline kullanıcının gireceği stringi okur hale gelecek.
		System.out.println(name+" "+age);
		scanner.close();
	}
}
package week02.day01;

public class Qestion003 {
	/*
	3- İki tane string değişken, (isim ve soyisim), bu değişkenleri yazdıralım.
	
	3.1- bu değişkenleri tek bir çıktıda alt alta yazdıralım.
    
    3.2- a ve b karakterlerinin değerini ve karakterler değer toplamını yazdıralım.
	 */
	public static void main(String[] args) {
		String name = "Mehmet";
		String surName = "Tufan";
		System.out.println(name+" "+surName);
		System.out.println(name+"\n"+surName);
		System.out.println("Isim\t\tSoyisim");
		System.out.println(name+"\t\t"+surName);
		
		char a='a';
		char b='b';
		System.out.println((int) a+" "+a+"\n"+(int) b+" "+b);
		
	}
}
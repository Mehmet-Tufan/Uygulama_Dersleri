package week02.day02;

import java.util.Scanner;

public class Qestion003 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
			
				int S;
				double Ort, Toplam, Sayi;
				Toplam = 0;
				Sayi = 1;
				S = 0;
				
				while (Sayi != 0)
				{
					System.out.print("sayi giriniz: ");
					Sayi=scanner.nextInt();
					Toplam += Sayi;
					if (Sayi != 0) { S += 1; }
				}
				
				Ort = Toplam / S;
		
		System.out.println(Ort);
		/*
		Scanner scanner = new Scanner(System.in);
        int input = -1;
        int total = 0;
        int inputCount = 0;
        while(true){ // -> while(input != 0) da olur
            System.out.print("Lutfen bir sayi giriniz (0 -> Cikis): ");
            input = scanner.nextInt();
            if(input != 0){
                total += input;
                inputCount++;
            } else if (input == 0 && inputCount == 0){
                System.out.println("Hicbir sayi girmediginz icin hesaplama yapilamiyor. ");
                break;
            } else {
                System.out.println("Sum : " + total);
                System.out.println("Average : " + ((float)total/inputCount));
                break;
            }
        }
		 */
			
			
		
	}
}
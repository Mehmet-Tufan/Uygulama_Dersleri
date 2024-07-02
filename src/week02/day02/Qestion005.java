package week02.day02;

public class Qestion005 {
	public static void main(String[] args) {
		int evenSum = 0; //ciftToplam
		int oddSum = 0; //tekToplam
		double ratio;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			}
			else {
				oddSum += i;
			}
		}
		ratio = ((double) evenSum) / oddSum;
		System.out.println("Cift sayilarin tek sayilara orani : " + ratio);
	}
}
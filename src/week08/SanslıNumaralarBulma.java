package week08;

import java.util.*;
import java.util.stream.Collectors;

public class SanslıNumaralarBulma {
	public static void main(String[] args) {
		Random random = new Random();
		Map<Integer, Integer> rastgeleNumaralarMap = new HashMap<>();
		//1-Map kulanarak rastgele sayi üretme
		
		for (int i = 0; i < 10_000; i++) {
			int rastgeleSayi = random.nextInt(1, 101);
			
			rastgeleNumaralarMap.put(rastgeleSayi, rastgeleNumaralarMap.getOrDefault(rastgeleSayi, 0) + 1);
		}
//		System.out.println(rastgeleNumaralarMap);
		
		
		//2-Map içindeki değerleri List'e aktarma
		
		List<Integer> rastgeleNumaralarList = new ArrayList<>();
		for (Map.Entry<Integer, Integer> rastgeleSayilarEntry : rastgeleNumaralarMap.entrySet()) {
			for (int i = 0; i < rastgeleSayilarEntry.getValue(); i++) { // her bir getValue() yani sayinin tekrar
				// adedi kadar getKey() içinde sayi değerini listeye ekleyecek.
				rastgeleNumaralarList.add(rastgeleSayilarEntry.getKey());
			}
		}
//		System.out.println(rastgeleNumaralarList);
		
		//Listeden 10 adet rastgele sansli numara seçme
		
		Set<Integer> rastgeleSansliNumaralar = new HashSet<>();//aynı sayidan iki adet olmaması için hashset
		// kullanıldı.
		
		for (int i = 0; i < 10; i++) {
			int index = random.nextInt(rastgeleNumaralarList.size()); //rastgele 10 sayiyi Listenin boyutundan seçmek
			// için kullanıldı
			
			rastgeleSansliNumaralar.add(rastgeleNumaralarList.get(index));
		}
		System.out.println("\nŞanslı numaralar : " + rastgeleSansliNumaralar);
		
		
		//4. a-b- Şanslı Numaralar Üzerinde İşlemler:
		
		List<Integer> ellidenBuyukSayilar =
				
				rastgeleSansliNumaralar.stream().filter(numara -> numara > 50).collect(Collectors.toList());
		
		System.out.println("\nElliden büyük sayilar: " + ellidenBuyukSayilar);
		
		//4. c- Şanslı Numaralar Üzerinde İşlemler:
		System.out.println("\nTüm şanslı numaralar toplamı : "+rastgeleSansliNumaralar.stream().mapToInt(Integer::intValue).sum());//Stream API ile integer sınıfının toplama metodu kullanıldı
		
		//4. d- Şanslı Numaralar Üzerinde İşlemler:
		
		System.out.println("\nElliden büyük şanslı numaralar toplamı : "+ellidenBuyukSayilar.stream().mapToInt(Integer::intValue).sum());
		
		// Optional ile veri bütünlüğü kontrolü
		
		Optional<Integer> maxSayi = rastgeleSansliNumaralar.stream().max(Integer::compareTo);
		maxSayi.ifPresentOrElse(
				sayi -> System.out.println("\nEn büyük şanslı numara: " + sayi),
				() -> System.out.println("\nŞanslı numara bulunamadı.")
		);
		
		Optional<Integer> minSayi = rastgeleSansliNumaralar.stream().min(Integer::compareTo);
		minSayi.ifPresentOrElse(
				sayi -> System.out.println("\nEn küçük şanslı numara: " + sayi),
				() -> System.out.println("\nŞanslı numara bulunamadı.")
		);
		
	}
}
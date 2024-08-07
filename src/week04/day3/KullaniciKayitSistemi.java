package week04.day3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ÖNCELİKLE KULLANICILAR KAYDEDİLDİ
 * SONRASINDA İŞLEMLER YAPILDI
 
 */

public class KullaniciKayitSistemi {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("### KULLANICI KAYIT SISTEMI ###");
		System.out.println("Lütfen Sistemi Kaydınızı Yapınız");
		Kullanici kullanici = kullaniciKaydi();
		menu();
		
		
	}
	
	public static void menu() {
		int secim = 0;
		do {
			
			System.out.println("1- e mail kontrol");
			System.out.println("2- Tc No kontrol");
			System.out.println("3- Kullanıcı adı kontrol");
			System.out.println("4- Giriş Yap");
			System.out.println("5- Sifremi unuttum");
			System.out.println("0- Cikis");
			System.out.print("Lutfen bir secim yapiniz : ");
			secim = scanner.nextInt();
			scanner.nextLine();
			durum(secim);
			
			
		} while (secim != 0);
		
	}
	
	private static void durum(int secim) {
		switch (secim) {
			
			case 1: {
				mailKontrol();
				break;
			}
			case 2: {
				
				tcKimlikKontrol();
				break;
			}
			case 3: {
				kullaniciAdiKontrol();
				break;
			}
			case 4: {
				
				girisYap();
				break;
			}
			case 5: {
				
				sifremiUnuttum();
				break;
			}
		}
	}
	
	public static Kullanici kullaniciKaydi() {
		LocalDate dogumTarihi;
		Kullanici kullanici;
		dogumTarihi = dogumTarihiAl();
		if (dogumTarihKontrol(dogumTarihi)) {
			
			kullanici = new Kullanici();
			kullanici.setDogumTarihi(dogumTarihi);
			
			String[] isimSoyisim = isimSoyisimAl();
			kullanici.setIsim(isimSoyisim[0]);
			kullanici.setSoyisim(isimSoyisim[1]);
			kullanici.setEmail(emailAl());
//          kullanici.setTelNo(telNoAl());
			kullanici.setSifre(sifreAl());
			kullanici.setKullaniciAdi(kullaniciAdiAl());
			kullanici.setTcKimlik(tcKimlikAl());
			 KullaniciDB.save(kullanici);
			
			 KullaniciDB.findAll();
			
			return kullanici;
		}
		else {
			System.out.println("18 Yasindan kucukler kayit islemi gerceklestiremez.");
		}
		return null;
	}
	
	private static String mailKontrol() {
		String mail;
		while (true) {
			System.out.print("Lutfen mail adresini .........@gmail.com şeklinde giriniz  : ");
			mail = scanner.nextLine();
			for (int i = 0; i < KullaniciDB.findAll().length; i++) {
				if (KullaniciDB.findAll()[i].getEmail().equals(mail)) {
					System.out.println("Girdiğiniz mail baskasına aittir");
					continue;
				}
				
				System.out.println("Girmiş olduğunuz mail kullanılabilir.");
				return mail;
			}
			
			
		}
	}
	
	private static String tcKimlikKontrol() {
		String tcNo;
		while (true) {
			System.out.print("Lutfen TC kimlik numaranizi giriniz : ");
			tcNo = scanner.nextLine();
			for (int i = 0; i < KullaniciDB.findAll().length; i++) {
				if (KullaniciDB.findAll()[i].getTcKimlik().equals(tcNo)) {
					System.out.println("Girdiğiniz tcKimlik baskasına aittir.");
					continue;
				}
				else if (tcNo.length() != 11) {
					System.out.println("TC Kimlik No 11 haneli olmalidir.");
					continue;
				}
				else if (!numerikDegerKontrol(tcNo)) {
					System.out.println("TC Kimlik No sadece numerik karakterler barindirabilir. ");
					continue;
				}
				System.out.println("Girmiş olduğunuz tc no kullanılabilir.");
				return tcNo;
			}
			
			
		}
	}
	
	private static String kullaniciAdiKontrol() {
		
		String kullaniciAd;
		while (true) {
			System.out.print("Lutfen bir kullanici adi giriniz : ");
			kullaniciAd = scanner.nextLine();
			for (int i = 0; i < KullaniciDB.findAll().length; i++) {
				if (KullaniciDB.findAll()[i].getKullaniciAdi().equals(kullaniciAd)) {
					System.out.println("Girdiğiniz kullanıcı adı baskasına aittir");
					continue;
				}
				else if (kullaniciAd.length() < 4) {
					System.out.println("Kullanici adi 4 karakterden kisa olamaz.");
					continue;
				}
				else if (kullaniciAd.length() > 16) {
					System.out.println("Kullanici adi 16 karakterden uzun olamaz.");
					continue;
				}
				System.out.println("Girmiş olduğunuz kullanıcı adı kullanılabilir.");
				return kullaniciAd;
			}
			
			
		}
	}
	
	private static void girisYap() {
//		String sifre = sifreAl();
//		String kullaniciAdi = kullaniciAdiAl();
		
		String sifre;
		String kullaniciAdi;
			
			while (true) {
				System.out.print("Lutfen bir sifre giriniz : ");
				sifre = scanner.nextLine();
				for (int i = 0; i < KullaniciDB.findAll().length; i++) {
					if (!(KullaniciDB.findAll()[i].getSifre().equals(sifre))) {
						System.out.println("Şifrenizi tekrar giriniz : ");
						continue;
					}
					System.out.print("Lutfen bir kullanici adi giriniz : ");
					kullaniciAdi = scanner.nextLine();
					if (!(KullaniciDB.findAll()[i].getKullaniciAdi().equals(kullaniciAdi))) {
						System.out.println("K");
						continue;
					}
					System.out.println("Başarıyla Giriş Yaptınız");return;
				}
			}
			
	
	}
	
	private static void  sifremiUnuttum(){
		String tcNo;
		System.out.print("Şifre değişikliği için TC kimlik numaranizi giriniz : ");
		tcNo = scanner.nextLine();
		while (true)
		for (int i = 0; i <KullaniciDB.findAll().length ; i++) {
			if (!(KullaniciDB.findAll()[i].getTcKimlik().equals(tcNo))) {
				System.out.println("Dorulama başarısız");
				continue;
			}
			if (KullaniciDB.findAll()[i].getTcKimlik().equals(tcNo)){
				String yeniSifre = sifreAl();
				KullaniciDB.findAll()[i].setSifre(yeniSifre);
				
			}return;
			
		}
		
		
	}
	
	private static String tcKimlikAl() {
		String tcKimlik;
		while (true) {
			System.out.print("Lutfen TC kimlik numaranizi giriniz : ");
			tcKimlik = scanner.nextLine();
			if (tcKimlik.length() != 11) {
				System.out.println("TC Kimlik No 11 haneli olmalidir.");
				continue;
			}
			else if (!numerikDegerKontrol(tcKimlik)) {
				System.out.println("TC Kimlik No sadece numerik karakterler barindirabilir. ");
				continue;
			}
			
			return tcKimlik;
		}
	}
	
	private static boolean numerikDegerKontrol(String value) {
		for (int i = 0; i < value.length(); i++) {
			if (!Character.isDigit(value.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	private static String kullaniciAdiAl() {
		
		String kullaniciAdi;
		while (true) {
			System.out.print("Lutfen bir kullanici adi giriniz min 4 - max 16 karakter : ");
			kullaniciAdi = scanner.nextLine();
			if (kullaniciAdi.length() < 4) {
				System.out.println("Kullanici adi 4 karakterden kisa olamaz.");
				continue;
			}
			else if (kullaniciAdi.length() > 16) {
				System.out.println("Kullanici adi 16 karakterden uzun olamaz.");
				continue;
			}
			return kullaniciAdi;
		}
	}
	
	
	private static String sifreAl() {
		String sifre;
		String sifreYeniden;
		while (true) {
			System.out.print("Lutfen bir sifre giriniz min 8 - max 32 karakter : ");
			sifre = scanner.nextLine();
			if (sifre.length() < 8) {
				System.out.println("Sifre 8 karakterden kisa olamaz.");
				continue;
			}
			else if (sifre.length() > 32) {
				System.out.println("Sifre 32 karakterden uzun olamaz.");
				continue;
			}
			else {
				System.out.print("Lutfen sifreninizi tekrar giriniz : ");
				sifreYeniden = scanner.nextLine();
				if (sifre.equals(sifreYeniden)) {
					return sifre;
				}
				else {
					System.out.println("Girdiginiz sifreler eslesmiyor! ");
				}
			}
		}
		
	}
	
	private static String telNoAl() {
		System.out.print("Lutfen telefon numaranizi giriniz : +90 ");
		String telNo = scanner.nextLine();
		return telNo;
	}
	
	private static String emailAl() {
		System.out.print("Lutfen mailinizi giriniz : ");
		String email = scanner.nextLine();
		return email;
	}
	
	private static String[] isimSoyisimAl() {
		String[] isimSoyisim = new String[2];
		System.out.print("Lutfen adinizi giriniz : ");
		isimSoyisim[0] = scanner.nextLine();
		System.out.print("Lutfen soyadinizi giriniz : ");
		isimSoyisim[1] = scanner.nextLine();
		return isimSoyisim;
	}
	
	private static LocalDate dogumTarihiAl() {
		while (true) {
			System.out.print("Lutfen dogum tarihinizi giriniz (yyyy-MM-dd) : ");
			String date = scanner.nextLine();
			try {
				LocalDate localDate = LocalDate.parse(date);
				return localDate;
			}
			catch (Exception e) {
				System.out.println("Lutfen dogum tarihinizi yil-ay-gun formatinda giriniz!!!\n");
			}
		}
	}
	
	private static boolean dogumTarihKontrol(LocalDate date) {
		int yas = Period.between(date, LocalDate.now()).getYears();
		boolean resitMi = (yas < 18) ? false : true;
		return resitMi;
	}
}
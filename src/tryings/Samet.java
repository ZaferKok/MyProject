package tryings;

import java.util.Scanner;

public class Samet {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("ALMANYA'daki guncel saati giriniz:");
		int saat = scan.nextInt();
		System.out.println("ALMANYA'daki guncel dakikayi giriniz:");
		int dakika = scan.nextInt();
		
		System.out.println("This is the first gitHup trying");
		
		int amerikaSaat = (saat - 7 + 24), japonyaSaat = (saat + 8 + 24), turkiyeSaat = (saat + 1);

		if (amerikaSaat > 24) {
			amerikaSaat = (amerikaSaat % 24);
		}
		if (japonyaSaat > 24) {
			japonyaSaat = (japonyaSaat % 24);
		}
		if (turkiyeSaat > 24) {
			turkiyeSaat = (turkiyeSaat % 24);
		}

		System.out.println("hangi ulkenin saatini ogrenmek istersiniz..amerika, japonya, turkiye?");
		Scanner scan2 = new Scanner(System.in);
		String istek = scan2.nextLine();

		if (istek.equalsIgnoreCase("amerika")) {
			System.out.println("amerika'da guncel saat: " + amerikaSaat + ":" + dakika);
		} else if (istek.equals("japonya")) {
			System.out.println("japonya'da guncel saat: " + japonyaSaat + ":" + dakika);
		} else if (istek.equals("turkiye")) {
			System.out.println("turkiye'de guncel saat: " + turkiyeSaat + ":" + dakika);
		} else {
			System.out.println("hatali veri girdiniz");
		}

	}

}

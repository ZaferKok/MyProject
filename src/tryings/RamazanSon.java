package tryings;

import java.util.Arrays;

public class RamazanSon {

	public static void main(String[] args) {
		
		double x[] = {1.1 , 3.3 , 7.1 , 5.4 , 0.2 , -1.5};	// 6'lý Double Array olusturma
		
		System.out.println(Arrays.toString(x));		// dizi degerlerini yazdirma (medot ile)
		
		for (int i=0; i<6; i++)	{					// dizi degerlerini yazdirma (dongu ile)
		System.out.println(x[i]);
		}
		
		System.out.println(x);						// dizi adresini yazdirma
		System.out.println(maxAdr(x));				// en buyuk elemani 
		
	}
	public static double maxAdr(double a[]) { 		// double metod ile en buyugu geri dondurme
		
		double bigger = 0.0;
		for (int i = 0; i<6; i++) {
			if (a[i]>bigger) {
				bigger = a[i];
			}
		}
		return bigger;	
	}
}

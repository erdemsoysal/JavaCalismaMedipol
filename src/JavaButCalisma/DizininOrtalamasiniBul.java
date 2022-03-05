package JavaButCalisma;

public class DizininOrtalamasiniBul {

	public static void main(String[] args) 
	{
		int[] dizi = {1,7,3,876,123,2,7,34,89,612,286};
		System.out.print("Dizi ---> ");
		for (int i = 0; i < dizi.length; i++) 
		{
			System.out.print("(" + dizi[i] + ")");
		}
		System.out.println();
		
		ortalamasiniAl(dizi);
	}
	public static void ortalamasiniAl(int[] dizi) 
	{
		double diziToplam = 0;
		double diziOrtalama = 0;
		for (int i = 0; i < dizi.length; i++) 
		{
			diziToplam = diziToplam + dizi[i];
		}
		diziOrtalama = diziToplam / dizi.length;
		System.out.println("Dizideki elemanlarýn toplamý ---> " + diziToplam);
		System.out.println("Dizinin ortalamasý ---> " + diziOrtalama);
	}
}

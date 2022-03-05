package JavaFinalCalisma;

public class FinalOncesiTekrar2 {

	public static void main(String[] args) 
	{
		//Dizinin elemanlarýnýn ortalamasýný alan program.
		
		int[][] dizi = new int[][] 
				{ 
					{ 700, 600, 650 }, 
					{ 900, 800, 700 }, 
					{ 300, 400, 350 }, 
					{ 500, 450, 470 },
					{ 600, 500, 480 } 
				};
	
		ortalamaBul(dizi);
	
	}
	public static void ortalamaBul(int[][] dizi) 
	{
		int diziToplam = 0;
		int elemanSayisi = 0;
		for (int i = 0; i < dizi.length; i++) 
		{
			for (int j = 0; j < dizi[0].length; j++) 
			{
				diziToplam = diziToplam + dizi[i][j];
				System.out.print(dizi[i][j] + " ");
				elemanSayisi++;
			}
			System.out.println();
		}
		System.out.println("Dizi Toplam = " + diziToplam);
		
		int ortalama = diziToplam / elemanSayisi;
		System.out.println("Dizinin ortalamasý => " + diziToplam +" / " + elemanSayisi + " = " + ortalama);
		
	}

}

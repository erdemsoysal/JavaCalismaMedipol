package JavaFinalCalisma;

public class MatrisEnKucukIkinciEleman {

	public static void main(String[] args) 
	{
		int[][] matris = 
			{
					{56,23,678,231},
					{234,21,78,26},
					{654,33,32,67},
					{189,35,56,89}
			};
		
	enKucukIkinciElemaniBul(matris);
		
	}
	public static void enKucukIkinciElemaniBul(int[][] matris) 
	{
		int enKucukEleman = matris[0][0];
		int x = 0;
		int y = 0;
		
		for (int i = 0; i < matris.length; i++) 
		{
			for (int j = 0; j < matris[i].length; j++) 
			{
				if (enKucukEleman > matris[i][j]) 
				{
					enKucukEleman = matris[i][j];
					x = i;
					y = j;
				}
				System.out.print(matris[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("---> En küçük eleman = " + enKucukEleman);
		System.out.println();
		System.out.println();
		
		
		//BURADA EN KÜÇÜK DEÐERÝN ARTIK EN KÜÇÜK OLMAMASI ÝÇÝN DEÐERÝNÝ YÜKSEK BÝR SAYI YAPIYORUZ.
		//BÖYLECE EN KÜÇÜK ÝKÝNCÝ SAYI ARTIK EN KÜÇÜK OLUYOR.
		matris[x][y] = 10000000;
		enKucukEleman = matris[0][0];
		for (int i = 0; i < matris.length; i++) 
		{
			for (int j = 0; j < matris[i].length; j++) 
			{
				if (enKucukEleman > matris[i][j]) 
				{
					enKucukEleman = matris[i][j];
				}
				System.out.print(matris[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("---> En küçük ikinci eleman = " + enKucukEleman);
	}
}









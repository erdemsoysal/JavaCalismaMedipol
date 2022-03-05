package JavaButCalisma;

public class DizilerEnBuyukEnKucuk {

	public static void main(String[] args) 
	{
		int[][] matris =
			{
					{56,23,678,231},
					{234,21,78,23},
					{654,33,22,67},
					{189,35,56,89}
			};
		enBuyukElemaniBul(matris);
		enKucukElemaniBul(matris);
		satirlariTopla(matris);
		sutunlarýTopla(matris);
		satirdakiEnBuyukEleman(matris);
		satirdakiEnKucukEleman(matris);
		sutundakiEnBuyukEleman(matris);
		sutundakiEnKucukEleman(matris);
		//dizidekiEnBuyukIkinciyiBul(matris);
		//dizidekiEnKucukIkinciyiBul(matris);
	}
	public static void enBuyukElemaniBul(int[][] dizi)
	{
		int enBuyukEleman = dizi[0][0];
		for (int i = 0; i < dizi.length; i++) 
		{
			for (int j = 0; j < dizi[0].length; j++) 
			{
				if (enBuyukEleman <= dizi[i][j]) 
				{
					enBuyukEleman = dizi[i][j];
				}
			}
		}
		System.out.println("Dizideki en buyuk eleman = " + enBuyukEleman);
	}
	public static void enKucukElemaniBul(int[][] dizi) 
	{
		int enKucukEleman = dizi[0][0];
		for (int i = 0; i < dizi.length; i++) 
		{
			for (int j = 0; j < dizi[0].length; j++) 
			{
				if (enKucukEleman >= dizi[i][j]) 
				{
					enKucukEleman = dizi[i][j];
				}
			}
		}
		System.out.println("Dizideki en kucuk eleman = " + enKucukEleman);
	}
	public static void satirlariTopla(int[][] dizi) 
	{
		int satirToplam = 0;
		for (int i = 0; i < dizi.length; i++) 
		{
			satirToplam = 0;
			for (int j = 0; j < dizi[0].length; j++) 
			{
				satirToplam = satirToplam + dizi[i][j];
				System.out.print(dizi[i][j]+" ");
			}
			System.out.println("---TOPLAM---> " + satirToplam);
		}
		System.out.println();
	}
	public static void sutunlarýTopla(int[][] dizi) 
	{
		int sutunToplam = 0;
		for (int j = 0; j < dizi[0].length; j++) 
		{
			sutunToplam = 0;
			for (int i = 0; i < dizi.length; i++) 
			{
				sutunToplam = sutunToplam + dizi[i][j];
				System.out.print(dizi[i][j]+" ");
			}
			System.out.println("---TOPLAM---> " + sutunToplam);
		}
		System.out.println();
	}
	public static void satirdakiEnBuyukEleman(int[][] dizi) 
	{
		int satirdakiEnBuyuk = dizi[0][0];
		for (int i = 0; i < dizi.length; i++) 
		{	
			satirdakiEnBuyuk = dizi[0][0];
			for (int j = 0; j < dizi[0].length; j++) 
			{
				if (satirdakiEnBuyuk <= dizi[i][j]) 
				{
					satirdakiEnBuyuk = dizi[i][j];
					
				}
				System.out.print(dizi[i][j] + " ");
			}
			System.out.print(" ---En buyuk---> " + satirdakiEnBuyuk);
			System.out.println();
		}
		System.out.println();
	}
	public static void satirdakiEnKucukEleman(int[][] dizi) 
	{
		int satirdakiEnKucuk = dizi[0][0];
		for (int i = 0; i < dizi.length; i++) 
		{
			satirdakiEnKucuk = dizi[0][0];
			for (int j = 0; j < dizi[0].length; j++) 
			{
				if (satirdakiEnKucuk >= dizi[i][j]) 
				{
					satirdakiEnKucuk = dizi[i][j];
				}
				System.out.print(dizi[i][j] + " ");
			}
			System.out.print("---En kucuk---> " + satirdakiEnKucuk);
			System.out.println();
		}
		System.out.println();
	}
	public static void sutundakiEnBuyukEleman(int[][] dizi) 
	{
		int sutundakiEnBuyuk = dizi[0][0];
		for (int j = 0; j < dizi[0].length; j++) 
		{
			sutundakiEnBuyuk = dizi[0][0];
			for (int i = 0; i < dizi.length; i++) 
			{
				if (sutundakiEnBuyuk <= dizi[i][j]) 
				{
					sutundakiEnBuyuk = dizi[i][j];
				}
				System.out.print(dizi[i][j] + " ");
			}
			System.out.print("---En buyuk---> " + sutundakiEnBuyuk);
			System.out.println();
		}
		System.out.println();
	}
	public static void sutundakiEnKucukEleman(int[][] dizi) 
	{
		int sutundakiEnKucuk = dizi[0][0];
		for (int j = 0; j < dizi[0].length; j++) 
		{
			sutundakiEnKucuk = dizi[0][0];
			for (int i = 0; i < dizi.length; i++) 
			{
				if (sutundakiEnKucuk >= dizi[i][j]) 
				{
					sutundakiEnKucuk = dizi[i][j];
				}
				System.out.print(dizi[i][j] + " ");
			}
			System.out.print("---En kucuk---> " + sutundakiEnKucuk);
			System.out.println();
		}
		System.out.println();
	}
	public static void dizidekiEnBuyukIkinciyiBul(int[][] dizi) 
	{
		int enBuyuk = dizi[0][0];
		int x = 0;
		int y = 0;
		for (int i = 0; i < dizi.length; i++) 
		{
			for (int j = 0; j < dizi[0].length; j++) 
			{
				if (enBuyuk <= dizi[i][j]) 
				{
					enBuyuk = dizi[i][j];
					x = i;
					y = j;
				}
				System.out.print(dizi[i][j] + " ");
			}
			System.out.println();
		}
		dizi[x][y] = -10000;
		
		int enBuyukIkinci = dizi[0][0];
		for (int i = 0; i < dizi.length; i++) 
		{
			for (int j = 0; j < dizi[0].length; j++) 
			{
				if (enBuyukIkinci <= dizi[i][j]) 
				{
					enBuyukIkinci = dizi[i][j];
				}
			}
		}
		System.out.println("En buyuk ikinci eleman ---> " + enBuyukIkinci);
	}
	
	public static void dizidekiEnKucukIkinciyiBul(int[][] dizi) 
	{
		int enKucuk = dizi[0][0];
		int x = 0;
		int y = 0;
		for (int i = 0; i < dizi.length; i++) 
		{
			for (int j = 0; j < dizi[0].length; j++) 
			{
				if (enKucuk >= dizi[i][j]) 
				{
					enKucuk = dizi[i][j];
					x = i;
					y = j;
				}
				System.out.print(dizi[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		dizi[x][y] = 10000;
		
		int enKucukIkinci = dizi[0][0];
		for (int i = 0; i < dizi.length; i++) 
		{
			for (int j = 0; j < dizi[0].length; j++) 
			{
				if (enKucukIkinci >= dizi[i][j]) 
				{
					enKucukIkinci = dizi[i][j];
				}
			}
		}
		System.out.println("En kucuk ikinci eleman ---> " + enKucukIkinci);
	}





















}

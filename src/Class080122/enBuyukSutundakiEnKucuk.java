package Class080122;

import java.util.Iterator;

public class enBuyukSutundakiEnKucuk {

	public static void main(String[] args) 
	{
		double [][] matris = 
		{
				{56,23,678,231},
				{234,21,78,26},
				{654,33,32,67},
				{189,35,56,89}
					
		};
		//int[] dizi = tekOlanSayilariTekBoyutluDiziOlarakDon(matris);
		//System.out.println(dizi);
	}
	
	public static int[] tekOlanSayilariTekBoyutluDiziOlarakDon(int[][] dizi)
	{
		int[] tekBoyutluDizi = new int[0];
		int count = 0;
		int k = 0;
		for (int i = 0; i < dizi.length; i++) 
		{
			for (int j = 0; j < dizi[i].length; j++) 
			{
				if (dizi[i][j] % 2 != 0) 
				{
					count++;
				}
			}
		}
		tekBoyutluDizi = new int[count];
		for (int i = 0; i < dizi.length; i++) 
		{
			for (int j = 0; j < dizi.length; j++) 
			{
				if (dizi[i][j] % 2 != 0) 
				{
					tekBoyutluDizi[k++] = dizi[i][j];
				}
			}
		}
		return tekBoyutluDizi;
	}
}

package JavaFinalCalisma;

public class MatrisEnBuyukSutunEnKucukEleman {

	public static void main(String[] args) 
	{
		int[][] matris =
				{
						{56,23,678,231},
						{234,21,78,23},
						{654,33,22,67},
						{189,35,56,89}
				};
		
		sutunEnBuyukElemanEnKucuk(matris);
		
	}
	public static void sutunEnBuyukElemanEnKucuk(int[][] matris) 
	{
		int sutunEnBuyuk = matris[0][0];
		
		int enBuyukSutunDegeri = 0;
		
		for (int j = 0; j < matris[0].length; j++) 
		{
			for (int i = 0; i < matris.length; i++) 
			{
				if (sutunEnBuyuk < matris[i][j]) 
				{
					sutunEnBuyuk = matris[i][j];
					enBuyukSutunDegeri = j;
				}
				System.out.print(matris[i][j] + " ");
			}
			System.out.println();
		}
		int enKucukEleman = matris[0][enBuyukSutunDegeri];
		for (int i = 0; i <= 3; i++) 
		{
			if (enKucukEleman > matris[i][enBuyukSutunDegeri]) 
			{
				enKucukEleman = matris[i][enBuyukSutunDegeri];
			}
		}
		

		System.out.print("---> En büyük " + " = " + sutunEnBuyuk);
		System.out.println();
		System.out.print("---> En büyük sütundaki en küçük eleman = " + enKucukEleman);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}

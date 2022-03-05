package Class080122;

public class CokBoyutluDiziEnBuyukEnKucuk {

	public static void main(String[] args) 
	{
		
		double [][] dizi = new double [][] 
		{
			{34,11,-7,53},
			{256,8,-65,4},
			{110,64,33,26}
			
		};
		System.out.println("enKucukEleman: " + enKucukElemaniBul(dizi));
		System.out.print("enBuyukEleman: " + enBuyukElemaniBul(dizi));
	}
		
	public static double enKucukElemaniBul(double[][] parametreDizi) 
	{
		double enKucukEleman = parametreDizi[0][0];
		for (int i = 0; i < parametreDizi.length; i++) 
		{
			for (int j = 0; j < parametreDizi[i].length; j++) 
			{
				if (enKucukEleman > parametreDizi[i][j]) 
				{
					enKucukEleman = parametreDizi[i][j];
				}
			}
		}
		return enKucukEleman;
	}
		
		
	public static double enBuyukElemaniBul(double[][] parametreDizi) 
	{
		double enBuyukEleman = parametreDizi[0][0];
		for (int i = 0; i < parametreDizi.length; i++) 
		{
			for (int j = 0; j < parametreDizi[i].length; j++) 
			{
				if (enBuyukEleman < parametreDizi[i][j]) 
				{
					enBuyukEleman = parametreDizi[i][j];
				}
			}
		}
		return enBuyukEleman;
	}
		
	
		
		
		
		
		
		
		
		

}

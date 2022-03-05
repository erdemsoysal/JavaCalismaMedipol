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
		System.out.print("---> En k���k eleman = " + enKucukEleman);
		System.out.println();
		System.out.println();
		
		
		//BURADA EN K���K DE�ER�N ARTIK EN K���K OLMAMASI ���N DE�ER�N� Y�KSEK B�R SAYI YAPIYORUZ.
		//B�YLECE EN K���K �K�NC� SAYI ARTIK EN K���K OLUYOR.
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
		System.out.print("---> En k���k ikinci eleman = " + enKucukEleman);
	}
}









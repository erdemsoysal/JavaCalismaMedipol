package JavaFinalCalisma;
import java.util.Arrays;

public class SelectionShort {

	public static void main(String[] args) 
	{
		int[] dizi = {1,2,3,10,6,4,5,7};
		for (int i = 0; i < dizi.length; i++) 
		{
			int min = i;
			for (int j = i+1 ; j < dizi.length; j++) 
			{
				if (dizi[j] < dizi[min]) 
				{
					min = j;
				}
				
			}
			
			//--> Burada ge�ici bir de�i�ken olu�turup (temp) yukar�daki for d�ng�s�nde kendinden sonrakinden
			//daha y�ksek olan say�y� kaybolmas�n diye ona at�yoruz. Daha sonras�nda k���k olan� i'ye atad�ktan sonra
			//temp'te tuttu�umuz daha b�y�k olan de�eri j d�ng�s�nde elde etti�imiz k���k olan�n yerine at�yoruz ve b�ylece
			//asl�nda yer de�i�tirmi� oluyorlar.
			int temp = dizi[i];
			dizi[i] = dizi[min];
			dizi[min] = temp;
		}
		System.out.println(Arrays.toString(dizi));
	}
	
}

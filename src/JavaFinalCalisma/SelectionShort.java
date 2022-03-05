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
			
			//--> Burada geçici bir deðiþken oluþturup (temp) yukarýdaki for döngüsünde kendinden sonrakinden
			//daha yüksek olan sayýyý kaybolmasýn diye ona atýyoruz. Daha sonrasýnda küçük olaný i'ye atadýktan sonra
			//temp'te tuttuðumuz daha büyük olan deðeri j döngüsünde elde ettiðimiz küçük olanýn yerine atýyoruz ve böylece
			//aslýnda yer deðiþtirmiþ oluyorlar.
			int temp = dizi[i];
			dizi[i] = dizi[min];
			dizi[min] = temp;
		}
		System.out.println(Arrays.toString(dizi));
	}
	
}

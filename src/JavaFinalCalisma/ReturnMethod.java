package JavaFinalCalisma;

public class ReturnMethod {

	public static void main(String[] args) 
	{
		double sonuc = returnMethodu(5);
		System.out.println("returnMethodu'nun döndürdüðü deðer: " + sonuc);
	}
	public static double returnMethodu(double x) 
	{
		return x * 4;
		//Burada main methodunun içerisinde returnMethodu olarak aldýðýmýz deðeri 4 ile çarpýp return ediyoruz. 
		//Yukarýda "sonuç" olarak görünüyor
	}
	
}

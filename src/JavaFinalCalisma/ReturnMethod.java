package JavaFinalCalisma;

public class ReturnMethod {

	public static void main(String[] args) 
	{
		double sonuc = returnMethodu(5);
		System.out.println("returnMethodu'nun d�nd�rd��� de�er: " + sonuc);
	}
	public static double returnMethodu(double x) 
	{
		return x * 4;
		//Burada main methodunun i�erisinde returnMethodu olarak ald���m�z de�eri 4 ile �arp�p return ediyoruz. 
		//Yukar�da "sonu�" olarak g�r�n�yor
	}
	
}

package Arayuz;

public class Rectangle implements Polygon{
	public void getArea() {
		int lengh=6;
		int lengh2=5;
		int area=lengh*lengh2;
		System.out.println("Dikdortgenin alanı : "+ area);
	}
	public void getSides() {
		System.out.println("Kenar sayısı : 4 ");
	}

}

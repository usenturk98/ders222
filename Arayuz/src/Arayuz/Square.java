package Arayuz;

public class Square implements Polygon {
	public void getArea() {
		int lengh=6;
		int area=lengh*lengh;
		System.out.println("Karenin alanı : "+ area);
	}
	public void getSides() {
		System.out.println("Kenar sayısı : 4 ");
	}

}

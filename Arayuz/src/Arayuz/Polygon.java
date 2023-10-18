package Arayuz;

public interface Polygon {
	void getArea();
	default void getSides() {
		System.out.println("Poligonun kenar sayısı");
	}
	default void getPerimeter(int... sides) {
		int perimeter=0;
		for(int side: sides) {
			perimeter +=side;
		}
		System.out.println("Çevresi : "+ perimeter);
	}

}

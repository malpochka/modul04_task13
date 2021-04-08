package by.epam.country.view;

import by.epam.country.entity.*;

public class PolityView {

	public void print(Polity pl) {
		System.out.println("Столица государства: " + pl.getNameOfPolity() + "- " + pl.getCapital());
	}

	public void print(int c) {
		System.out.println("Количество областей равно  " + c);
	}

	public void printSquare(int s) {
		System.out.println("Площадь государства равна  " + s);
	}

	public void printOfDistrict(Polity pl) {
		System.out.println("Областные центры государства:");

		for (int i = 0; i < pl.getDis().size(); i++) {
			System.out.println(pl.getDis().get(i).getNameOfDistrict() + ";");
		}
	}

}

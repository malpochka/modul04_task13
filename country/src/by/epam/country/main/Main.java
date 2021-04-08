package by.epam.country.main;

import by.epam.country.entity.*;
import by.epam.country.logic.*;
import by.epam.country.view.*;

/*Создать объект класса Государство, используя классы Область,Район,Город.Методы: вывести на консоль столицу,
 * количество областей, площадь, областные центры. */

public class Main {

	public static void main(String[] args) {
		int c;
		int s;

		Polity pl = new Polity("Минск", "Республика беларусь");
		PolityView view = new PolityView();
		PolityLogic logic = new PolityLogic();

		pl.addDistrics(new District("Брестская область", 32786, new Region("Брестский"), new City("Брест")));
		pl.addDistrics(new District("Витебская область", 40051, new Region("Витебский"), new City("Витебск")));
		pl.addDistrics(new District("Гомельская область", 40372, new Region("Гомельский"), new City("Гомель")));
		pl.addDistrics(new District("Гродненская область", 25127, new Region("Гродненский"), new City("Гродно")));
		pl.addDistrics(new District("Минская область", 40202, new Region("Минский"), new City("Минск")));
		pl.addDistrics(new District("Могилевская область", 29068, new Region("Могилевский"), new City("Могилев")));

		view.print(pl);

		c = logic.numberOfDistrict(pl);
		view.print(c);

		s = logic.squareOfPolity(pl);
		view.printSquare(s);

		view.printOfDistrict(pl);

	}

}

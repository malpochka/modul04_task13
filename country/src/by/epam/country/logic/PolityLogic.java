package by.epam.country.logic;

import by.epam.country.entity.*;

public class PolityLogic {
	
	public int numberOfDistrict(Polity polity) {
		int count;
		count = 0;
		
		for (int i = 0; i < polity.getDis().size(); i++) {
			count++;
		}
		return count;
	}

	public int squareOfPolity(Polity pol) {
		int s;
		s = 0;
		
		for (int i = 0; i < pol.getDis().size(); i++) {
			s = s + pol.getDis().get(i).getS();
		}
		return s;

	}
}

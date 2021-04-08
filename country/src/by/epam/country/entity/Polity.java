package by.epam.country.entity;

import java.util.ArrayList;
import java.util.List;

public class Polity {

	private String capital;
	private String nameOfPolity;
	private List<District> dis;

	{
		dis = new ArrayList<District>();

	}

	public Polity() {

	}

	public Polity(String capital, String name) {
		super();
		this.capital = capital;
		this.nameOfPolity = name;
	}

	public void addDistrics(District district) {
		dis.add(district);

	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getNameOfPolity() {
		return nameOfPolity;
	}

	public void setNameOfPolity(String nameOfPolity) {
		this.nameOfPolity = nameOfPolity;
	}

	public List<District> getDis() {
		return dis;
	}

	public void setDis(List<District> dis) {
		this.dis = dis;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((dis == null) ? 0 : dis.hashCode());
		result = prime * result + ((nameOfPolity == null) ? 0 : nameOfPolity.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Polity other = (Polity) obj;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (dis == null) {
			if (other.dis != null)
				return false;
		} else if (!dis.equals(other.dis))
			return false;
		if (nameOfPolity == null) {
			if (other.nameOfPolity != null)
				return false;
		} else if (!nameOfPolity.equals(other.nameOfPolity))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Polity [capital=" + capital + ", nameOfPolity=" + nameOfPolity + ", dis=" + dis + "]";
	}
}

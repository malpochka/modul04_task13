package by.epam.country.entity;

public class District {
	
	private String nameOfDistrict;
	private int S;
	private Region region;
	private City city;

	public District(String n, int S, Region region, City city) {
		super();
		this.nameOfDistrict = n;
		this.region = region;
		this.city = city;
		this.S = S;
	}

	public District() {

	}

	public String getNameOfDistrict() {
		return nameOfDistrict;
	}

	public void setNameOfDistrict(String nameOfDistrict) {
		this.nameOfDistrict = nameOfDistrict;
	}

	public int getS() {
		return S;
	}

	public void setS(int s) {
		S = s;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + S;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((nameOfDistrict == null) ? 0 : nameOfDistrict.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
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
		District other = (District) obj;
		if (S != other.S)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (nameOfDistrict == null) {
			if (other.nameOfDistrict != null)
				return false;
		} else if (!nameOfDistrict.equals(other.nameOfDistrict))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "District [nameOfDistrict=" + nameOfDistrict + ", S=" + S + ", region=" + region + ", city=" + city
				+ "]";
	}
}

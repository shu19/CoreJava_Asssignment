package com.collection.basic;

//
//name, city and school district together define equality
//School : name, city, school district, greatSchoolRanking
public class School {
	private String name;
	private String city;
	private String District;
	private int greatSchoolRanking;

	/**
	 * @param name
	 * @param city
	 * @param district
	 * @param greatSchoolRanking
	 */
	public School(String name, String city, String district,
			int greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		District = district;
		this.greatSchoolRanking = greatSchoolRanking;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((District == null) ? 0 : District.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		School other = (School) obj;
		if (District == null) {
			if (other.District != null)
				return false;
		} else if (!District.equals(other.District))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", District="
				+ District + ", greatSchoolRanking=" + greatSchoolRanking + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public int getGreatSchoolRanking() {
		return greatSchoolRanking;
	}

	public void setGreatSchoolRanking(int greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}

}

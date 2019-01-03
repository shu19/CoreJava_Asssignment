package com.collection.basic;

/**
 * 
 * @author shuraut
 *
 */
public class School {
	private String name; // This variable stores school name
	private String city; // This variable stores city 
	private String district; // This variable stores district
	private int greatSchoolRanking; //This variable stores School Ranking

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
		this.district = district;
		this.greatSchoolRanking = greatSchoolRanking;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((district == null) ? 0 : district.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	//	name, city and schoolDistrict together define equality
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		if (district == null) {
			if (other.district != null)
				return false;
		} else if (!district.equals(other.district))
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
				+ district + ", greatSchoolRanking=" + greatSchoolRanking + "]";
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
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getGreatSchoolRanking() {
		return greatSchoolRanking;
	}

	public void setGreatSchoolRanking(int greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}

}

package com.collection.basic;

/**
 * 
 * 
 * @author shuraut
 *
 */
public class Student implements Comparable<Student> {

	private String name;
	private String favoriteFruits;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param favoriteFruits
	 */
	public Student(String name, String favoriteFruits) {
		super();
		this.name = name;
		this.favoriteFruits = favoriteFruits;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((favoriteFruits == null) ? 0 : favoriteFruits.hashCode());
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
		Student other = (Student) obj;
		if (favoriteFruits == null) {
			if (other.favoriteFruits != null)
				return false;
		} else if (!favoriteFruits.equals(other.favoriteFruits))
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
		return "Student [name=" + name + ", favoriteFruits=" + favoriteFruits
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFavoriteFruits() {
		return favoriteFruits;
	}

	public void setFavoriteFruits(String favoriteFruits) {
		this.favoriteFruits = favoriteFruits;
	}

	@Override
	public int compareTo(Student student) {
		return name.compareTo(student.name);
	}

}

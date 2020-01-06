package com.nt.serilizable;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Student implements Serializable{

	private transient int id;
	private transient static String name;
	private  String course;
	private String city;
	

	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCourse() {
		return course;
	}
	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", city=" + city + "]";
	}
	

	public boolean equals(Object o) {
		Student student = (Student) o;
        return student.getId() == id && student.getName().equals(this.name) && student.getCourse().equals(this.course) && student.city.equals(this.city);
	}
	@Override
	public int hashCode() {
		  return name.hashCode() + course.hashCode() + city.hashCode()+ id;
	}
}

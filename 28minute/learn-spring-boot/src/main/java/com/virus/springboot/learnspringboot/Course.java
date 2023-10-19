package com.virus.springboot.learnspringboot;

public class Course {

	private long id; 
	private String courseName; 
    private String auther;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", auther=" + auther + "]";
	}
	public Course(long id, String courseName, String auther) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.auther = auther;
	}
    
    
}

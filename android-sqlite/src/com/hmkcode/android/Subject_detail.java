package com.hmkcode.android;



public class Subject_detail {

	private int id;
	private String name;
	private int  Absent;
	private int  Present;
	private int  Total;
	private float percent;
	
	public Subject_detail(){}
	
	public Subject_detail(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return name;
	}
	public void setTitle(String name) {
		this.name = name;
	}
	public int getAbsent() {
		return Absent;
	}
	public void setAbsent(int Absent) {
		this.Absent = Absent;
	}
	public int getPresent() {
		return Present;
	}
	public void setPresent(int Present) {
		this.Present = Present;
	}
	public int getTotal() {
		return Total;
	}
	public void setTotal(int Total) {
		this.Total = Total;
	}
	public float getPercentage() {
		return percent;
	}
	public void setPercentage(Float percent) {
		this.percent = percent;
	}
	
	
	
}

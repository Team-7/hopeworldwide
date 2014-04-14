package com.dhliwayok.hopewwdatabase;

import java.sql.Timestamp;

public class BMI {
	
	private Timestamp date;
	private int height;
	private double weight;
	private double bmi_score;
	
	public BMI(int height, double weight){
	
		this.height = height;
		this.weight = weight;
	}
	
	public BMI(Timestamp date, int height, double weight){
		
		this.date = date;
		this.height = height;
		this.weight = weight;
	}
	
	public double calculateBMI(int h, double w){
		
		bmi_score = (w/(h*h));
		
		return bmi_score;
		
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBmi_score() {
		return bmi_score;
	}

	public void setBmi_score(double bmi_score) {
		this.bmi_score = bmi_score;
	}

	@Override
	public String toString() {
		return "BMI [date=" + date + ", height=" + height + ", weight="
				+ weight + ", bmi_score=" + bmi_score + "]";
	}
	
	

}

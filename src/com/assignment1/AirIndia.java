package com.assignment1;

public class AirIndia implements Airfare
{
	private int hours;
	private double costPerHour;
	
	//default
	public AirIndia()
	{
		this.hours=0;
		this.costPerHour=0.0;
	}
	
	//parameterized
	public AirIndia(int hours, double costPerHour) 
	{
		super();
		this.hours = hours;
		this.costPerHour = costPerHour;
	}
	
	
	//getters and setters
	public int getHours()
	{
		return hours;
	}

	public void setHours(int hours)
	{
		this.hours = hours;
	}

	public double getCostPerHour()
	{
		return costPerHour;
	}

	public void setCostPerHour(double costPerHour)
	{
		this.costPerHour = costPerHour;
	}

	@Override
	public double calculateAmount()
	{
		return hours * costPerHour;
	}

	@Override
	public void display() 
	{
		System.out.println("AirIndia - Hours : " + hours + " , Cost Per Hour : " + costPerHour  + ", Total Amount : " + calculateAmount());
	}
	
	
}

package com.assignment1;

public class KingFisher  implements Airfare
{
	private int hours;
	private double costPerHour;
	
	public KingFisher()
	{
		this.hours=0;
		this.costPerHour=0.0;
	}

	public KingFisher(int hours, double costPerHour)
	{
		super();
		this.hours = hours;
		this.costPerHour = costPerHour;
	}

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
		return (hours * costPerHour) * 4;
	}

	@Override
	public void display()
	{
		System.out.println("KingFisher - Hours : " + hours + " , Cost Per Hour : " + costPerHour  + ", Total Amount : " + calculateAmount());

	}
}

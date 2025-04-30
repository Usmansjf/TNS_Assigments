package com.assignment1;

public class Main
{

	public static void main(String[] args)
	{
		AirIndia A1 = new AirIndia(5 , 120.50);
		KingFisher F1 = new KingFisher(3 , 200.60);
		Indigo I1 = new Indigo(4, 140.50);
	
	
	double airIndiaAmount = Math.round(A1.calculateAmount()* 100.0) / 100.0;
	double kingFisherAmount = Math.round(F1.calculateAmount()* 100.0) / 100.0;
	double indigoAmount = Math.round(I1.calculateAmount()* 100.0 )/ 100.0;
	
	
	
	System.out.println("Air India Amount :" + airIndiaAmount);
	System.out.println("King Fisher Amount : " + kingFisherAmount);
	System.out.println(" Indigo Amount : " + indigoAmount);

	A1.display();
	F1.display();
	I1.display();
	
	}

	
	
}

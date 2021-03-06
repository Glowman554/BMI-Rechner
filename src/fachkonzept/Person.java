package fachkonzept;

public class Person
{
	private int gewicht;
	private double groesse;
	
	public Person()
	{

	}
	
	public Person(int pGewicht, double pGroesse)
	{
		if (pGewicht == 0 || pGroesse == 0)
		{
			throw new IllegalArgumentException("Gewicht und Groesse müssen ungleich 0 sein!");
		}

		// falls pGewicht und pGroesse gültige sind:
		this.gewicht = pGewicht < 0 ? -pGewicht : pGewicht;
		this.groesse = pGroesse < 0 ? -pGroesse : pGroesse;
	}

	public double berechneBMI()
	{
		return this.gewicht / (this.groesse * this.groesse);
	}

	public void setzeDaten(int pGewicht, double pGroesse)
	{
		if (pGewicht == 0 || pGroesse == 0)
		{
			throw new IllegalArgumentException("Gewicht und Groesse müssen ungleich 0 sein!");
		}

		// falls pGewicht und pGroesse gültige sind:
		this.gewicht = pGewicht < 0 ? -pGewicht : pGewicht;
		this.groesse = pGroesse < 0 ? -pGroesse : pGroesse;
	}

	// public String ermittleGewichtsklasse()
	// {
	// 	double my_bmi = this.berechneBMI();

	// 	if (my_bmi < 18.5)
	// 	{
	// 		return "Untergewicht";
	// 	}
	// 	else if (my_bmi < 25)
	// 	{
	// 		return "Normalgewicht";
	// 	}
	// 	else if (my_bmi < 30)
	// 	{
	// 		return "Übergewicht";
	// 	}
	// 	else
	// 	{
	// 		return "Adipositas";
	// 	}
	// }

	public String ermittleGewichtsklasse()
	{
		String gewichtsklasse = "";
		double my_bmi = this.berechneBMI();

		if (my_bmi < 18.5)
		{
			gewichtsklasse = "Untergewicht";
		}
		
		if (18.5 <= my_bmi && my_bmi < 25)
		{
			gewichtsklasse = "Normalgewicht";
		}

		if (25 <= my_bmi && my_bmi < 30)
		{
			gewichtsklasse = "Übergewicht";
		}

		if (30 <= my_bmi)
		{
			gewichtsklasse = "Adipositas";
		}

		return gewichtsklasse;
	}
}

package org.eclipse.classes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FirstClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df2 = new DecimalFormat("##.###");
		int x = 4;
		if (x >= 3)
			System.out.println("oui");
		else
			System.out.println("non");
		Scanner scanner = new Scanner(System.in);
		System.out.println("entrez le nombre de copie:");
		/*int nbre;
		nbre=scanner.nextInt();
		double prix=calculPrix(nbre);
		System.out.println("le prix à payer est : "+df2.format(prix));*/
		//saisieMaj(scanner);
		somme100();
		scanner.close();
	}

	public static void ValeurAbs(Scanner sc) {
		float f;
		System.out.print("entrez un réel::");
		f = sc.nextFloat();
		if (f < 0) {
			System.out.println("la valeur absolue de f est :" + -f);
		} else {
			System.out.println("1.la valeur absolue de f est :" + f);
		}

		System.out.println("if sans else");
		float y = f;
		if (f < 0) {
			y = -f;
		}
		System.out.println("2.la valeur absolue de f est :" + y);
		System.out.println("avec Math.abs");
		System.out.println("3.la valeur absolue de f est :" + Math.abs(f));
	}
	public static void divisiblePar3(Scanner sc)
	{
		System.out.print("Entrez un entier:");
		int n=sc.nextInt();
		if (n%3==0)
		{
			System.out.println(n+" est divisible par 3");
		}
		else
			System.out.println(n+" n'est pas divisible par 3");
	}
	public static void nbrePsitifNegatif(Scanner sc)
	{
		System.out.print("Entrez un nombre: ");
		int nb=sc.nextInt();
		if (nb<0)
		{
			System.out.println(nb +" est negatif");
		}
		else
		{
			if (nb==0)
				System.out.println(nb +" est nul");
			else 
				System.out.println(nb + " est positif");
		}
	}
	
	public static double calculPrix(int nb)
	{
		
		if (nb<10)
			return nb*0.5;
			else
				if (nb<20)
					return nb*0.4;
				else
					return nb*0.3;	
	}
	public static void saisieMaj(Scanner sc)
	{
		char c;
		System.out.print("Entrez une lettre majuscule:");
		c=sc.next().charAt(0);
		while((c<'A') || (c>'Z'))
		{	
			System.out.print("Saisie erronée, recommencez:");
			c=sc.next().charAt(0);
		}
		System.out.println("Saisie correcte: "+c);
	}
	public static void somme100()
	{
		int i,somme;
		i=0;
		somme=0;
		while (somme<=100)
		{
			i=i+1;
			somme+=i;
		}
		System.out.println("la valeur recherchée est N="+i);
	}
}

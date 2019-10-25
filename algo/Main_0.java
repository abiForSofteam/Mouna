package org.eclipse.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float [] tabl = new float[5];
		//saisieTab(tabl,sc);
		//afficheTab(tabl);
		//float [][] matrice= {{1,2,3,4},{5,6,7,8}};
		float [][] mat1= new float[3][4];
		float [][] mat2= new float[3][4];
		float [][] mat3= new float[3][4];
		saisieMatrice(3,4,mat1,sc);
		saisieMatrice(3,4,mat2,sc);
		System.out.println("premiere matrice");
		afficherMatrice(3,4,mat1);
		System.out.println("deuxieme matrice");
		afficherMatrice(3,4,mat2);
		sommeMatrices(3,4,mat1,mat2,mat3);
		System.out.println("troisieme matrice");
		afficherMatrice(3,4,mat3);
		//int i,nbre;
		//float [] notes= {1,5,17,10,11,4,8,16,18};
		//parcourir un tableau avec un for
		//for ( i=0; i<notes.length;i++)
		//	System.out.println(notes[i]);
		//
		//for(float f : notes)
		//	System.out.println(f);
		
	}
	public static void saisieTab( float [] tab,Scanner sc)
	{
		int i;
		for (i=0;i<tab.length;i++)
		{
			System.out.println("Saisie de l'element :"+(i+1));
			tab[i]=sc.nextFloat();
		}
			
	}
	public static void afficheTab(float [] tab )
	{
		int i;
		for(i=0;i<tab.length;i++)
		{
			System.out.println("tab["+i+"]="+tab[i]);
		}
	}
	public static void saisieMatrice(int n,int m, float [][]tab,Scanner sc)
	{
		int i,j;
		for (i=0;i<tab.length;i++)
		{
			System.out.println("Saisie de la ligne "+(i+1));	
			for (j=0;j<m;j++)
			{
				System.out.println("Entrez l'element de la ligne "+(i+1)+" et de la colonne "+(j+1));
				tab[i][j]=sc.nextFloat();
			}
		}
	}
	public static void afficherMatrice(int n,int m, float [][]tab)
	{
		int i,j;
		for (i=0;i<tab.length;i++)
		{	
			System.out.print("[");
			for (j=0;j<m;j++)
			{
				System.out.print(tab[i][j]);
				if (j<m-1)
					System.out.print("|");
			}
			System.out.println("]");
		}
	}
	public static void sommeMatrices(int n, int m, float[][] m1,float[][] m2,float[][] m3)
	{
		int i,j;
		for (i=0;i<n;i++)
			for (j=0;j<m;j++)
				m3[i][j]=m1[i][j]+m2[i][j];
	}
}

package org.eclipse.main;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] tab = {5,17,1,6,14,11,3,8,2};
		triRapide(tab,0,tab.length-1);
		for (int i = 0; i < tab.length; i++) {
			System.out.println("tab[" + i + "]=" + tab[i]);
		}
		// saisieTab(tabl,sc);
		// afficheTab(tabl);
		// float [][] matrice= {{1,2,3,4},{5,6,7,8}};
		/*float[][] mat1 = new float[3][4];
		float[][] mat2 = new float[3][4];
		float[][] mat3 = new float[3][4];
		saisieMatrice(3, 4, mat1, sc);
		saisieMatrice(3, 4, mat2, sc);
		System.out.println("premiere matrice");
		afficherMatrice(3, 4, mat1);
		System.out.println("deuxieme matrice");
		afficherMatrice(3, 4, mat2);
		sommeMatrices(3, 4, mat1, mat2, mat3);
		System.out.println("troisieme matrice");
		afficherMatrice(3, 4, mat3);*/
		// int i,nbre;
		// float [] notes= {1,5,17,10,11,4,8,16,18};
		// parcourir un tableau avec un for
		// for ( i=0; i<notes.length;i++)
		// System.out.println(notes[i]);
		//
		// for(float f : notes)
		// System.out.println(f);

	}

	public static void saisieTab(float[] tab, Scanner sc) {
		int i;
		for (i = 0; i < tab.length; i++) {
			System.out.println("Saisie de l'element :" + (i + 1));
			tab[i] = sc.nextFloat();
		}

	}

	public static void afficheTab(float[] tab) {
		int i;
		for (i = 0; i < tab.length; i++) {
			System.out.println("tab[" + i + "]=" + tab[i]);
		}
	}

	public static void saisieMatrice(int n, int m, float[][] tab, Scanner sc) {
		int i, j;
		for (i = 0; i < tab.length; i++) {
			System.out.println("Saisie de la ligne " + (i + 1));
			for (j = 0; j < m; j++) {
				System.out.println("Entrez l'element de la ligne " + (i + 1) + " et de la colonne " + (j + 1));
				tab[i][j] = sc.nextFloat();
			}
		}
	}

	public static void afficherMatrice(int n, int m, float[][] tab) {
		int i, j;
		for (i = 0; i < tab.length; i++) {
			System.out.print("[");
			for (j = 0; j < m; j++) {
				System.out.print(tab[i][j]);
				if (j < m - 1)
					System.out.print("|");
			}
			System.out.println("]");
		}
	}

	public static void sommeMatrices(int n, int m, float[][] m1, float[][] m2, float[][] m3) {
		int i, j;
		for (i = 0; i < n; i++)
			for (j = 0; j < m; j++)
				m3[i][j] = m1[i][j] + m2[i][j];
	}

	public static void rechercheSeq(int val, int[] tab) {
		int i = 0;
		boolean found = false;
		while (i < tab.length && !found) {
			if (tab[i] == val)
				found = true;
			else
				i++;
		}
		if (found)
			System.out.println(val + " appartient au tableau");
		else
			System.out.println(val + " n'appartient pas au tableau");
	}

	public static boolean recherche(int x, int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == x)
				return true;
		}
		return false;
	}

	public static void rechercheDicho(int x, int[] tab) {
		int inf = 0, sup = tab.length - 1, milieu = -1;
		boolean found = false;
		while ((inf <= sup) && !found) {
			milieu = (inf + sup) / 2;
			if (tab[milieu] == x)
				found = true;
			else if (x > tab[milieu])
				inf = milieu + 1;
			else
				sup = milieu - 1;
		}
		if (found)
			System.out.println(x + " appartient au tableau");
		else
			System.out.println(x + " n'appartient pas au tableau");
	}
	public static void triRapide(int[] tab,int p,int r)
	{
		int q=-1;
		//Random x=new Random();
		//q=x.nextInt((r-p)+1)+p;
		if(p<r)
		{
			q=partition(tab,p,r);
			triRapide(tab,p,q-1);
			triRapide(tab,q+1,r);
		}
		
	}
	public static int partition(int[]tab , int p,int r)
	{
		int i,j,pivot;
		pivot =tab[p];
		i=p+1;
		j=r;
		while(i<=j)
		{
			while(i<=r && tab[i]<=pivot)
				i++;
			while(j>=p && tab[j]>pivot)
				j--;
			if(i<j)
			{
				int tmp=tab[i];
				tab[i]=tab[j];
				tab[j]=tmp;
				i++;
				j--;
			}
		}
		int tmp=tab[j];
		tab[j]=tab[p];
		tab[p]=tmp;
		return j;
	}
}

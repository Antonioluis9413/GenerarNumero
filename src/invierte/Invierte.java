/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invierte;

/**
 *
 * @author Invitado
 */

public class Invierte
{
	static int MAX=25;
	static int a1[]=new int[MAX];
	static void rellenaraleatorios(int x[])
	{
		for(int i=0;i<x.length;i++)
		{
			x[i]=(int)(Math.random()*100+1);
		}
	}

	static void imprimir(int x[])
	{
		for(int i=0;i<x.length;i++)
		{
			System.out.print("numero "+"["+i+"]="+x[i]+"\t");

		}
	}

	static void invierte(int y[])
	{
		int z=0,k=0;
		for(int i=0;i<MAX/2;i++)
		{
			z=y[i];
			k=y[MAX-1-i];
			y[MAX-i-1]=z;

			y[i]=k;
		}
	}

	public static void main(String[] args)
	{
		rellenaraleatorios(a1);
		imprimir(a1);
		invierte(a1);
		System.out.print("__________");
		imprimir(a1);
	}
}
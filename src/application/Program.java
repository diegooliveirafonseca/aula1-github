package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a ordem da matriz");
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for(int i=0; i<mat.length; i++) {
			System.out.println("Digite os valores das colunas na linha "+i);
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Main diagonal:");
		
		for(int i=0;i<mat.length;i++) {
			System.out.print(mat[i][i]+" ");
		}
		
		int cont = 0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j] < 0) {
					cont++;
				}
			}
		}
		System.out.println();
		System.out.print("Negative numbers = "+ cont);
		
		sc.close();
	}

}

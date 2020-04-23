package replit;

import java.util.Scanner;

public class Q84STAR5 {

	public static void main(String[] args) {
		
			int[][] a = {
				{1,1,1},
				{1,1,1},
				{1,1,1}
			};
			System.out.println(isMagic(a)); //true
			int[][] b = {
				{1,1,2},
				{3,2,3},
				{1,4,1}
			};
			System.out.println(isMagic(b)); //false
			int[][] c = {
				{1,1,1},
				{2,2,2}
			};
			System.out.println(isMagic(c)); //false
			int[][] d = {
				{8,1,6},
				{3,5,7},
				{4,9,2}
			};
			System.out.println(isMagic(d)); //true

	  }
	public static boolean isMagic(int[][] array) {
		
		int aa = 0, bb = 0, cc=0, dd=0; 
		int a = 0, b = 0, c = 0, d = 0; 
		
		if (array.length==array[0].length) {
		for (int i=0; i<array.length; i++) {
			int sumRow = 0;	 
			for(int j=0; j<array[i].length; j++) {
				sumRow = sumRow+array[i][j];
			}System.out.println(sumRow); aa=sumRow;
		}a=aa;
		}

		if (array.length==array[0].length) {
		for (int i=0; i<array.length; i++) {
			int sumCol = 0;
			for(int j=0; j<array[i].length; j++) {
				sumCol = sumCol+array[j][i];
			}System.out.println(sumCol);bb=sumCol;
		}
		}b=bb;

		int sumDia1 = 0;
		if (array.length==array[0].length){
			for (int i=0; i<array.length; i++) {
			sumDia1 = sumDia1+array[i][i];
			}System.out.println(sumDia1);cc=sumDia1;
		}c=cc;
		
		int sumDia2 = 0;
		if (array.length==array[0].length) {
			for (int i=array.length-1; 0<=i; i--) {
			sumDia2 = sumDia2+array[i][i];
			}System.out.println(sumDia2); dd=sumDia2;
		}d=dd;
		
		
		System.out.println("eeia"+a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		if (array.length==array[0].length) {
			if (a==b && b==c && c==d) {		
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}
}
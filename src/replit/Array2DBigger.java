package replit;

import java.util.Arrays;

public class Array2DBigger {

	public static void main(String[] args) {
		//				-0-			-1-
		int arr[][]={{8,9,2,3,4},{5,1,8,7,6},{4,0,5,6,1}};
//		System.out.println(arr[1][3]); arr[0][0]<arr[0][1]
//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
//		//int arr[][]={{2,3},{6,5}};
//		//int arr[]={1,3,5,8,6,9,5,4,6,0};
//		int a=0, b=0, c=0;	
//		System.out.println(arr[0][0]);
//		System.out.println(Arrays.deepToString(arr));
//		if (arr[0][1]>arr[1][0]) {
//			a=arr[0][1]; System.out.println(a);
//		}
		 int biggest =arr[0][0];
		    for (int i=0;i<arr.length;i++){
		      for (int k=0;k<arr[i].length;k++){
		        if (arr[i][k]>biggest){
		          biggest = arr[i][k];
		        }
		      }
		    }
		    System.out.println(biggest);

		
//		for (int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length-1; j++) {
//				if (arr[i][j]<arr[i][j+1]) { // && arr[i][j+1]>a
//				b=arr[i][j+1];
//				}else {
//				c=arr[i][j];
//				}
//				a=arr[i][j+1];
//				
//			}
//			
//		}
//		if(a>b && a>c)System.out.println(a);
//		if(a<b && b>c)System.out.println(b);
//		if(c>b && b<c)System.out.println(c);
	}

}

package Array;

import java.util.Scanner;

public class date9 {

	public static void main(String[] args) {
	
//Pro:1(no. is present or not)
		
//		Scanner sc=new Scanner(System.in);
//		int no=sc.nextInt();
//		boolean status=false;
//		int[]arr= {1,12,13,4,51};
//		for(int i=0;i<arr.length;i++) {
//			if(no==arr[i]) {
//				status=true;
//			}
//		}
//		if(status) {
//			System.out.println("Number is present");
//	    }else {
//		     System.out.println("Not Present");   
//		}
		
//Pro :2 (sum==8)
		
//		int[]arr= {1,2,3,6,5,0,8,9,-1};
//		int sum=8;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if((arr[i]+arr[j])==sum) {
//					System.out.println(arr[i]+" "+arr[j]);
//				}
//			}
//		}
		
//Pro :3 (Separate +ve and -ve no.)
		
		int arr[]= {1,-1,-2,8,-3};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					System.out.println(arr[i]+" "+arr[j]);

				}
			}
		}
		
//Pro :4
		
//		int arr[]= {1,1,2,2,3};
//		int count[]=new int [arr.length];
//		
//		for(int i=0;i<arr.length;i++) {
//			   int temp=1;
//			   
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					temp++;
//					count[j]=-1;
//				}
//			}
//			 if(count[i]!=-1) {
//				count[i]=temp;
//			 }
//		}
//		         for(int i=0;i<5;i++) {
//					if(count[i]!=-1) {
//						System.out.println(arr[i]+"|"+count[i]);
//					}
//				}	
	}
}

package Array;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
	
//pro : 3
		
//		Random rd=new Random();
//		int[]arr=new int[5];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=rd.nextInt(20);
//			System.out.print(arr[i]+"\t");
//		}
		
//pro :4(min.& max.no.)
		
		Random rd=new Random();
		int[]arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=rd.nextInt(10);
			System.out.print(arr[i]+"\t");
		}
		  int min=arr[0];
		for(int i=0;i<arr.length;i++) {
				if(arr[i]<min) {
					min=arr[i];
				}
			System.out.println("Minimum value is : "+min);

			}
	}
}

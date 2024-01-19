package Array;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		
		int[] marks = new int[3];
		
		Scanner sc=new Scanner(System.in);
	
		for(int i=0;i<marks.length;i++) {
			System.out.println("Enter Marks");
			marks[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<marks.length;i++) {
			temp=temp+marks[i];
		}
		System.out.println("Marks is ");
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]+"\t");
		}
        System.out.println("\n Total Marks is : "+temp);
        System.out.println("Total Percentage is : "+temp/marks.length);
	}

}

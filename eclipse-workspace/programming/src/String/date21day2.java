package String;

import java.util.Scanner;

public class date21day2 {

	public static void main(String[] args) {
		
//Pro 1 :
		
//		 String str="abaabaaabca";
//		 System.out.println(str.replace("b","*"));
//		 System.out.println(str.replaceFirst("b","*"));
//		 System.out.println(str.substring(0,4)+"*"+str.substring(5));
//		 System.out.println(str.substring(0,8)+"*"+str.substring(9));

//Pro 2 :
		 
//		 Scanner sc=new Scanner(System.in);
//		 System.out.println("Enter a String Value : ");
//		 String str=sc.next();
//		 System.out.println(str.substring(0,1));
//		 System.out.println(str.substring(0,2));
//		 System.out.println(str.substring(0,3));
//		 System.out.println(str.substring(1,2));
//		 System.out.println(str.substring(1,3));
//		 System.out.println(str.substring(2));
		
//(OR) :
		 
//		for(int i=0;i<str.length();i++) {
//			for(int j=i+1;j<=str.length();j++) {
//				System.out.println(str.substring(i,j));
//			}
//		}


		 
//Pro 3 :
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String value :");
		String str=sc.nextLine();
		
		System.out.println("Enter how many equals part you want ");
		int num=sc.nextInt();
		if(str.length()%num==0){
			int ch=str.length()/num;
			for(int i=0;i<str.length();i=i+ch) {
				System.out.println(str.substring(i,i+ch));
			}
			
		}else {
			System.out.println("cant divide into equal parts"+"");
		}	
	}
}

package PatternProgramming;

public class day6 {

	public static void main(String[] args) {
//Pro 1 :
		
//		int row =9;
//		int space =4;
//		int star=1;
//	
//		for(int i=1;i<=row;i++ ) {
//	
//		for(int j=1;j<=space;j++) {
//	         System.out.print(" ");
//			 }
//		for(int k=1;k<=star;k++) {
//		    System.out.print("* ");
//		    
//			 }
//	     System.out.println();
//	       if(i<=4) {
//           star++;
//           space--;
//	       } else {
//			space++;
//			star--;
//	       }
//		}
		
//Pro 2 :
		
		int row =9;
		int space =4;
		int star=1;

		for(int i=1;i<=row;i++ ) {
	        int no=1;
		for(int j=1;j<=space;j++) {
	         System.out.print(" ");
			 }
		for(int k=1;k<=star;k++) {
		    System.out.print(no+" ");
		    no++;
			 }
	     System.out.println();
	       if(i<=4) {
           star++;
           space--;
	       } else {
			space++;
			star--;
	       }
		}

//Pro 4:
		
//		int row =9;
//		int space =4;
//		int star=1;
//	
//		for(int i=1;i<=row;i++ ) {
//	
//		for(int j=1;j<=space;j++) {
//			if(j==1 || i==j || i+j==10)
//	         System.out.print("* ");
//			 }
//		for(int k=1;k<=star;k++) {
//		    System.out.print(" ");
//			 }
//		System.out.println();
//			space++;
//			star--;
//	       
//		}
	}
}

package PatternProgramming;

public class day5 {
  public static void main(String[]args) {

	  
//P1 :
	  
//		 int row=5;
//		 int col=5;
//		 
//		 for(int i=1;i<=row; i++) {
//		 for(int j=1;j<=col; j++) {
//			 if(j<i) {
//				 System.out.print(j+"\t");
//			 } else {
//				 System.out.print(i+"\t");
//			 }
//		 }
//		 System.out.println();
//		 }
	  
	  
//P2 :
	  
//		 int row=5;
//		 int col=5;
//		 
//		 for(int i=1;i<=row; i++) {
//			 int no=5;
//		 
//		 for(int j=1;j<=col; j++) {
//			 if(i%2==1) {
//				 System.out.print(j+"\t");
//			 } else {
//				 System.out.print(no+"\t");
//				 no--;
//			 }
//		 }
//		 System.out.println();
//		 }	
	  
	  
//P3 :
	  
//		 int row=5;
//		 int col=5;
//		 
//		     int no=1;
//		 for(int i=1;i<=row; i++) {
//	     for(int j=1;j<=col; j++) {
//			 if(i%2==1) {
//				 System.out.print(no+"\t");
//				 no++;
//			 } else {
//				 --no;
//				 System.out.print(no+"\t");	 
//			 }
//		 }
//		 System.out.println();
//		 no+=5;
//		 }  
 
	  
//P3(2) :
	  
//		 int row=5;
//		 int col=5;
//		 
//		     int no=1;
//		 for(int i=1;i<=row; i++) {
//		 for(int j=1;j<=col; j++) {
//			 if(i%2==1) {
//				 System.out.print(no++ +"\t");
//			 } else {
//				 System.out.print(--no+"\t");	 
//			 }
//		 }
//		 no+=5;
//		 System.out.println(); 
//		 } 
		 
	
// P4 :
//			 int row=5;
//			 int col=5;
//			 
//			 for(int i=1;i<=row; i++) {
//				 int no=i;
//			 for(int j=1;j<=col; j++) {
//		
//			 System.out.print(no+"\t");
//               no++;
//			 } 
//			 System.out.println();	 
//			 } 
	  
	  
//P5 :
	  
//	  int row=5;
//	  int col=5;
//		 
//	      int no=5;
//		 for(int i=1;i<=row; i++) {
//		 for(int j=1;j<=col; j++) {
//	
//			 if(i+j<6)
//		 System.out.print(i+j-1+"\t");
//		 
//		 else 
//			 System.out.print(5+"\t");
//		 }
//		 System.out.println(); 
//		 } 	
	  
	  
//P6 :
	  
//	  char row='E';
//	  char col='E';
//		 
//	      char ch='E';
//		 for(char i='A';i<=row; i++) {
//		 for(char j='A';j<=col; j++) {
//	
//			 if(i+j<'F')
//		 System.out.print(i+j-'A'+"\t");
//		 
//		 else 
//			 System.out.print('E'+"\t");
//		 }
//		 System.out.println(); 
//		 }
	  
//P7 :
	  
//	  int row=5;
//	  int col=5;
//		 
//		 for(int i=1;i<=row; i++) {
//		 for(int j=1;j<=col; j++) {
//	
//		 System.out.print(Math.abs(i-j)+"\t");
//		 }
//		 System.out.println(); 
//		 } 	
		 
		
//P8 :
	  
//	  int row=5;
//	  int col=5;
//		 
//	        int no=5;
//		 for(int i=1;i<=row; i++) {
//		 for(int j=1;j<=col; j++) {
//	
//		 System.out.print(Math.abs(no-j)+"\t");
//		 }
//		 System.out.println();
//		 no--;
//	   } 
	  
	  
// P9 :
	  
	  int row=5;
	  int col=5;
		 
	        int no=1;
		 for(int i=1;i<=row; i++) {
		 for(int j=1;j<=col; j++) {
	     
		 System.out.print(no+"\t");
		 no++;
		 if(no==9) {
			 no=1;
		 }
		 }
		 System.out.println();
		 no--;
		 }
  }
}

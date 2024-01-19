package PatternProgramming;

public class day4 {
 public static void main(String[]args) {
	
	 
//P1 :
	
//	 int row=5;
//	 int col=5;
//	 
//	 for(int i=1;i<=row*col; i++) {
//	 
//		 System.out.print("*"+"\t"); 
//		 if(i%row==0) {
//			 System.out.println();
//	  }
//	 }
	 
	 
//P2 :
	 
//	 int row=5;
//	 int col=5;
//	 int space=4;
//	 
//	 for(int i=1;i<=row; i++) {
//	 for(int j=1;j<=space; j++) {
//		 System.out.print(" "); 
//	 }
//		 for(int k=1;k<=col;k++) {
//			 System.out.print("* ");
//	 }
//		 System.out.println();
//		 space --;
//	 }
	 
	 
//P3 :
	 
	 
//	 int a=5;
//	 int b=15;
//	 int temp=0;
//	 
//	 temp=a; 
//	 a=b;    
//	 b=temp;
//	 System.out.println();
	 
	 
//P4 :
	 
//	 int num1=0;
//	 int num2=1;
//	 System.out.print(num1+"\t"+num2+"\t");
//	 for(int i=2;i<=16;i++) {
//		 int temp=num1+num2;
//		 System.out.print(temp+"\t");
//		 num1=num2;
//		 num2=temp; 
//	 }	
	 
// P5 :
	 
	 int  num1 =0,row=4;
	 int  num2=1,col=4;
	 int temp=num1+num2;
	 for(int i=1;i<=row;i++) {
	 for(int j=1;j<=col;j++) {
		 System.out.print(temp+"\t");
		 temp=num1+num2;
		 num1=num2;
		 num2=temp;
	 }
	 System.out.println();
	}
	 
	 
//P6 :
	 
//	 int row=5;
//	 int col=5;
//	 for( int i=1;i<=row;i++){
//	for (int j=1;j<=col;j++){ 
//		
//	}
//	 }
 }
}

package PatternProgramming;

public class day13 {

	public static void main(String[] args) {
		
//Pro 89:
 
//		int row =5;
//		int space =4;
//		int star=1;
//		int num=5;
//		for(int i=1;i<=row;i++ ) {
//			  int temp=num;
//				for(int j=1;j<=space;j++) {
//	            	 System.out.print("\t");
//					 }
//				for(int k=1;k<=star;k++) {
//				if(k<i){
//						 System.out.print(temp+"\t"); 
//						 temp++;
//					 }else {
//						 System.out.print(temp--+"\t");
//					 }
//		        }
//			     System.out.println();
//			     num--;
//			     space--;
//			     star+=2;     
//		}


//Pro 90:
		
//		int row =5;
//		int space =4;
//		int star=1;
//		
//		for(int i=1;i<=row;i++ ) {
//			  int temp=2;
//				for(int j=1;j<=space;j++) {
//	            	 System.out.print(" \t");
//					 }
//				for(int k=1;k<=star;k++) {
//				if(k==1 || k==star)
//						 System.out.print("1\t"); 
//					else { 
//						 System.out.print(temp+"\t");
//				if(k<i)
//		         temp+=2;
//				else
//					temp-=2;
//				}
//			}
//			System.out.println();
//			     space--;
//			     star+=2;
//				}
		
//Pro 91:
	
//		int row =5;
//		int space =4;
//		int star=2;
//		int diff=1;
//		
//		for(int i=1;i<=row;i++ ) {
//				for(int k=1;k<=space;k++) {
//	            	 System.out.print("  ");
//					 }
//				for(int j=1;j<=star;j++) {
//						 System.out.print("* ");
//					 }
//			     System.out.println();
//			     star+=2;
//			    space--;	   
//		}
		
//Pro 92:
	
	int row =5;
    int space =4;
    int star=2;
    int num=1;
    char ch='A';

    for(int i=1;i<=row;i++ ) {
	int temp=num;
	char c=ch;

		for(int j=1;j<=space;j++) {
        	 System.out.print("  ");
			 }
		for(int k=1;k<=star;k++) {
			if(k<=(star/2))
		 System.out.print(temp+++" ");
			else
				System.out.print(ch+++" ");
			 }
	     System.out.println();
	     num++;
	     ch++;
	     star+=2;
	    space--;	   
     }

//Pro 93:
	
//	int row =5;
//	int space =4;
//	int star=1;
//	int diff=1;
//	
//	for(int i=1;i<=row;i++ ) {
//			for(int k=1;k<=space;k++) {
//            	 System.out.print("  ");
//				 }
//			for(int j=1;j<=star;j++) {
//					 System.out.print("* ");
//				 }
//		     System.out.println();
//		     star+=2;
//		    space--;	   
//	}
  }
}

package PatternProgramming;

public class day12 {

	public static void main(String[] args) {
		
		
//pro 82 : 
		
//		int row =5;
//		int space =4;
//		int star=1;
//		
//		for(int i=1;i<=row;i++ ) {
//			for(int j=1;j<=row;j++) {
//	            if(j<=space){
//	            	 System.out.print(" ");
//					 }
//					 else {
//						 System.out.print("*");
//					 }
//			}
//			     System.out.println();
//			     star++;
//			    space--;
//		}
		
		
//Pro 82 :(OR)
		
//		int row =5;
//	
//		for(int i=1;i<=row;i++ ) {
//			for(int j=1;j<=row;j++) {
//	            if(j<=row-i){
//	            	 System.out.print(" ");
//					 }
//					 else {
//						 System.out.print("*");
//					 }
//			}
//			     System.out.println();
//		}
		

//pro 83 :
		
//		int row =5;
//		int space =0;
//		int star=5;
//		
//		for(int i=1;i<=row;i++ ) {
//			for(int j=1;j<=row;j++) {
//	            if(j<=space){
//	            	 System.out.print("  ");
//					 }
//					 else
//						 System.out.print("* ");
//					 }
//			     System.out.println();
//			    space++;
//		}
		
		
//Pro 84 :
	
//		int row =5;
//		int space =4;
//		int star=1;
//		
//		for(int i=1;i<=row;i++ ) {
//			for(int j=1;j<=row;j++) {
//	            if(j<=space){
//	            	 System.out.print(" ");
//					 }
//					 else {
//						 System.out.print("* ");
//					 }
//			}
//			     System.out.println();
//			    space--;
//		}
		
		
//Pro 85 :
		
//		int row =5;
//		int no=1;
//	    int diff=2;
//	    
//		for(int i=1;i<=row;i++ ) {
//			int temp=no;
//			for(int j=1;j<=row;j++) {
//	            if(j<=row-i){
//	            	 System.out.print("  ");
//					 }
//					 else {
//						 System.out.print(temp+"  " );
//						 temp++;
//					 }
//			}
//			     System.out.println();
//			     no+=diff;
//			     diff++;
//		}
	
//pro 86 :
		
//		int row =5;
//		int space =4;
//		int star=1;
//		int diff=1;
//		
//		for(int i=1;i<=row;i++ ) {
//				for(int k=1;k<=space;k++) {
//	            	 System.out.print(" ");
//					 }
//				for(int j=1;j<=star;j++) {
//						 System.out.print("*");
//					 }
//			     System.out.println();
//			     star+=2;
//			    space--;	   
//		}
			
//Pro 87 :
		
//		int row =5;
//		int space =4;
//		int star=1;
//		
//		for(int i=1;i<=row;i++ ) {
//			int temp=star;
//				for(int j=1;j<=space;j++) {
//	            	 System.out.print(" ");
//					 }
//				for(int j=1;j<=star;j++) {
//						 System.out.print(temp+" ");
//						 temp--;
//					 }
//			     System.out.println();
//			     space--;
//			     star+=2;    	   
//		}
		
		
//pro 88 :
		
		int row =5;
		int space =4;
		int star=1;
		int no=0;
		for(int i=1;i<=row;i++ ) {
			  int temp=no;
				for(int j=1;j<=space;j++) {
	            	 System.out.print(" ");
					 }
				for(int j=1;j<=star;j++) {
						 System.out.print(Math.abs(temp)+"");
						 temp--;
	
				
				}
			     System.out.println();
			     space--;
			     star+=2;
			     no--;
		}
	}
}

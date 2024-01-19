package Test;
import java.util.Scanner;
public class Test1 {
	public static void main(String[]args) {

       Scanner sc=new Scanner(System.in);
       System.out.print("ROWS: ");
       int rows=sc.nextInt();
       System.out.print("COL: ");
       int col=sc.nextInt();
       
       if(rows<=0||col<=0) {
    	   
       }else {
    	   for(int i=1;i<=rows;i++) {
    		   for(int j=1;j<=col;j++) {
    			   System.out.print("B");
    			   
    		   }
    	   }
    	   System.out.println();
       }
	}
	
	}


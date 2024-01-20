package Array;

public class date10Imp {

	public static void main(String[] args) {

// pro 1 : (combine 2 array)
		int first[]= {1,2,3,4};
		int second[]= {4,5,6,7,8};
	 
		   int j=0;
		int[]output=new int[first.length + second.length];
		for(int i=0;i<output.length;i++) {
			if(i<(first.length*2)) {
			if(i%2==0) {
				output[i]=first[i/2];
			}else {
				output[i]=second[i/2];
				j++;
			}
		}else {	
			output[i]=second[j];
			j++;
		}
		}		
        for(int data:output) {
        	System.out.print("|"+data+"|");
        }
	}

}

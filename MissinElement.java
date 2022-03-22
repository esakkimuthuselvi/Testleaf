package week1.day2;
import java.util.Arrays;

public class MissinElement {
   public static void main(String args[]) {
	   int[] arr= {1,2,3,4,6,7,8,10};
	   int  j=0;
	   Arrays.sort(arr);
	   for(int i=0; i<arr.length;i++) {
		    j=i+1;
		    if(j!= arr[i]) {
		    	System.out.println("Missing Number is  : " +j);
		    	break;
		    }
	   }
   
}
}
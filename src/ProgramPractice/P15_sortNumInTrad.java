package ProgramPractice;

public class P15_sortNumInTrad {

	public static void main(String[] args) {

		 int[] num = {2,5,4,1,7,9,8};
	       
		// Sort the array in descending order using a traditional method
	       for(int i=0;i<num.length;i++)
	       {
	    	   //Compares the current element (arr[i]) with the rest of the elements (arr[j]).
	           for(int j=i+1;j<num.length;j++)
	           {
	               if(num[i] < num[j])	//If arr[i] < arr[j], their values are swapped
	               {
	            	   //Uses a temporary variable temp to swap arr[i] and arr[j]
	                   int temp = num[i];
	                   num[i] = num[j];
	                   num[j] = temp;
	               }
	           }
	       }
	       for(int nList : num){
	        System.out.println(nList);
	       }
	}

}

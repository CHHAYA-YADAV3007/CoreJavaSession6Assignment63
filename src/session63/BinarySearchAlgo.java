/**
 * BinarySearchAlgo.java
 * version 1.1
 * Compiled on 16th Aug 2017  
 */
//package declaration
package session63;
/**
 * This class illustrate the binary search algorithm for to find an element in sorted array.
 * It will display the index position of element , if it is found as an array element.
 * It will display the appropriate message if element is missing in sorted array
 * 
 * @author chhaya yadav
 *
 */
//class declaration
public class BinarySearchAlgo {
	

//parameterized constructor declaration and definition	
public void BinarySearchAlgorithm(int array[], int lb , int ub , int var){
		
//processing if element lies within the array elements
	
if ( (var>=array[ lb]) && var<= array[ub]){
			
		
//if array has only one element where array size is 1
	
		if(ub== 0 && array[ub]==var ){
		
			System.out.println( var + " element found at "+(ub+1)+ " position itself in Sorted Array ");		
			
		}
		
//if element is equal to the first element of array itself
		
		else if(array[lb] == var){
			
		
			System.out.println( var + " element found at "+(lb+1)+ " position itself in Sorted Array ");		
			
		}
//if array size is more than one element
		
		else if (ub >= 1)
			
		{
			
//check the mid of lower and upper bound 
			
			int m = lb + (ub-1)/2 ;
			
	
//if element found at mid position of sorted array
			
			    if( var == array[m]) {
			
				    System.out.println( var + " element found at "+(m+1)+ " position itself in Sorted Array ");
				
			    }
//if element  is lesser than the element at mid position and greater than the element at lower bound
			    
			    else if (var <  array[m]){
			    	
//recursion to find the element			    	
					
				    BinarySearchAlgorithm(array,lb,m-1,var);
				
			     }
			    
//if element  is greater than the element at mid position and lesser than element at upper bound			    
			    
			    else if (var >  array[m]){
			    	
//recursion to find the element			    	
				
							BinarySearchAlgorithm(array,m+1,ub,var);
				
			    }
			
			
		}
		
		
		}
//processing if element does not lie within the array elements		
else{
			
	System.out.println(var + " Element not found in Sorted Array");
	
	}
		

	}

}

/**
 * SortedArray.java
 * version 1.1
 * Compiled on 16th Aug 2017  
 */
//package declaration
package session63;
/**
 * This class illustrate sorted array in ascending order which will invoke the BinarySearchAlgo class to utiliza binary Search algorithm 
 * in order to find an element within an array. 
 * 
 * @author chhaya yadav
 *
 */
//class declaration
public class SortedArray {
	
//Main method declaration	
	
	public static void main(String[] args){
		
//Sorted Integer Array declaration, instantiation and initialization		
		
		int a[] = new int[]{10,20,35,40,50,60};
		
//BinarySearchAlgo object instantiation and initialization
		
		BinarySearchAlgo sa = new BinarySearchAlgo();
	
//determining the upper bound of integer array declared above		
		int ub = a.length-1 ;
		
//BinarySearchAlgo parameterized constructor invocation
		
	sa.BinarySearchAlgorithm(a,0,ub,10) ;
	
	sa.BinarySearchAlgorithm(a,0,ub,20) ;
		
	sa.BinarySearchAlgorithm(a,0,ub,35) ;
	
	sa.BinarySearchAlgorithm(a,0,ub,40) ;
	
	sa.BinarySearchAlgorithm(a,0,ub,50) ;
	
	sa.BinarySearchAlgorithm(a,0,ub,60) ;
	
	sa.BinarySearchAlgorithm(a,0,ub,70) ;
	
	sa.BinarySearchAlgorithm(a,0,ub,9) ;
		
		
	}
	

}

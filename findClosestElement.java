/*
Find the closest element 

At first, find the average value and take it as target.
Find the closest element to the target.

Example 1:-

I/p: arr={7,12,4,18,27,37}

O/p: 18

Example 2:-

I/p: arr={2,6,1,5,12}

O/p: 7
*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=in.nextInt();
	    }
	    int tar=in.nextInt();
// 		int arr[]={7,12,4,18,27,37};
// 		int tar=19;
		int min=Integer.MAX_VALUE,res=0;
		for(int i: arr){
		    if((tar-i)<min && (tar-i)>0){
		        min=tar-i;
		        res=i;
		    }
		}
		System.out.println(res);
	}
}

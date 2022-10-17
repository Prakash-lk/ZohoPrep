# ZohoPrep

/*
Example 1:-

input :  str = "prakash"

output: p     p
         r   r 
          a a  
           k   
          a a  
         s   s 
        h     h
        
Example 2:-

input : "zoho"

output: z  z
         oo 
         hh 
        o  o
*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    String str=in.nextLine();
		//String str="prakash";
		for(int i=0;i<str.length();i++){
		    for(int j=0;j<str.length();j++){
		        if(i==j || i+j+1==str.length()){
		            System.out.print(str.charAt(i));
		        }
		        else{
		            System.out.print("  ");
		        }
		    }
		    System.out.println();
		}
	}
}

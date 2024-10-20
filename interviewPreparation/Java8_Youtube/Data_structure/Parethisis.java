package Data_structure;

import java.util.Scanner;
import java.util.Stack;

public class Parethisis {

	 

	// create method balancedParenthesis() to check whether the input string is balanced or not   
	    @SuppressWarnings({ "rawtypes", "unchecked" })   
	    public static  boolean balancedParenthesis(String inputStr) {   
	          
	        // create an empty stack   
	        Stack stack = new Stack();   
	          
	        // convert inputStr to char array   
	        char[] charArray = inputStr.toCharArray();   
	          
	        // iterate charArray   
	        for (int i = 0; i < charArray.length; i++) {   
	              
	            // get char   
	            char current = charArray[i];  
	            
	            System.out.println("current character: "+current+'\n');
	              
	            //check whether current is '(', '[' or '{'   
	            if (current == '{' || current == '[' || current == '(') {   
	                // push current to stack   
	                stack.push(current); 
	                System.out.println("Pushed to stack: "+stack+'\n');
	                continue;   
	            }   
	            // if stack is empty, return false   
	            if (stack.isEmpty()) {    
	                return false;   
	            }   
	              
	            // use switch statement to pop element from stack and if it is '(', '[' or '{', return false   
	            char popChar;   
	            switch (current) {   
	                case ')':   
	                popChar = (char) stack.pop();   
	                if (popChar == '{' || popChar == '[')   
	                    return false;   
	                break;   
	                case '}':   
	                popChar = (char) stack.pop();   
	                if (popChar == '(' || popChar == '[')   
	                    return false;   
	                break;   
	                case ']':   
	                popChar = (char) stack.pop();   
	                if (popChar == '(' || popChar == '{')   
	                    return false;   
	                break;   
	            }   
	            
	            System.out.println("after pop: "+stack+'\n');
	        }   
	        return (stack.isEmpty());   
	    }   
	    // main() method start   
	    public static void main(String[] args) {   
     
	        System.out.println("Enter input string to check: ");  
	        
	        // create an instance of Scanner class   
	        Scanner sc = new Scanner(System.in); 
	        // take input sring from user   
	        String inputStr = sc.nextLine();   
	     
	        System.out.println("input String: "+inputStr);
	          
	        // call balancedParenthesis() method to check whether input string is balanced of not   
	        if (balancedParenthesis(inputStr))   
	            System.out.println("Input string "+inputStr+" is balanced.");   
	        else   
	            System.out.println("Input string "+inputStr+" is not balanced.");   
	    }   
	

}

package org.example.string;

import java.util.Stack;

public class Rough {
	// 8
	 public static void main(String[] args) {
         String s1 = "()";
         String s2 = "()[]{}";
         String s3 = "(]";
         String s4 = "([)]";
         String s5 = "{[]}";

         System.out.println(s1 + " is valid: " + isValid(s1));
         System.out.println(s2 + " is valid: " + isValid(s2));
         System.out.println(s3 + " is valid: " + isValid(s3));
         System.out.println(s4 + " is valid: " + isValid(s4));
         System.out.println(s5 + " is valid: " + isValid(s5));
     }
 

	public static boolean isValid(String str) {
		Stack<Character>stk=new Stack<>();
		for(char s:str.toCharArray())
		if(s=='(' || s=='{' || s=='[')stk.push(s);
		else if(s==')' && !stk.isEmpty() && stk.peek()=='(')stk.pop();
		else if(s=='}' && !stk.isEmpty() && stk.peek()=='{')stk.pop();
		else if(s==']' && !stk.isEmpty() && stk.peek()=='[')stk.pop();
		else return false;
		return stk.isEmpty();
		

	}

}

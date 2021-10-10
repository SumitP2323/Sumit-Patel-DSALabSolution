package balancingBrackets;

import java.util.Scanner;
import java.util.Stack;

public class DriverClass {
	static Boolean checkBalanced(String br)

	{ 
		Stack<Character>st=new Stack<Character>();
		for(int i=0; i<br.length(); i++)
		{
			char ch=br.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[' )
				st.push(ch);
			else 
			{
				if (!st.isEmpty())
				{
					char popch= st.pop();
				}
				switch (ch)
				{
				case ')':
				ch=st.pop();
			if(ch=='{' || ch=='[')
	return false;
			break;
				case '}':
					ch=st.pop();
				if(ch=='(' || ch=='[')
		return false;
				break;
				case ']':
					ch=st.pop();
				if(ch=='(' || ch=='{')
		return false;
				break;
				}
			}
			
				
				
				if(st.empty())
					return true;
				
			
				
				
				
				}
		return null;
				
			}
		
	
	
  public static void main(String[] args)
  { 
	 Scanner sc= new Scanner (System.in);
	 System.out.println("Enter brackets string");
	 String br=sc.next();
	 checkBalanced(br);
	 
	 if (checkBalanced(br))
		 System.out.println("The entered String has Balanced Brackets");
	 else
		 System.out.println("The entered Strings do not contain Balanced Brackets");
	 
	 
	  
  }
}

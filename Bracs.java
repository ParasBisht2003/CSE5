import java.util.*;
class Bracs
{
	public static void main(String args[])
	{
		Scanner I = new Scanner(System.in);
		Stack <Character> st = new Stack <>();
		System.out.println("Enter a String");
		String s = I.nextLine();
		char ch;
		int i;
		for ( i =0 ;i < s.length();i++)
		{
		 ch=s.charAt(i);
		if (ch==')')
		{
			if ( st.peek()=='(')
			{
			System.out.println(true);
			break;
			}
			else
			{
			while (st.peek() != '(')
			{  st.pop();  }
			st.pop();
			}
		}
		else
		st.push(ch);
		}
		if ( st.size()==0 )
		System.out.print(false);
	}
}					

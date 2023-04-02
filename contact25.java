package String;

public class contact25 
{

	public static void main(String[] args) {
String s="ababbsse";
char ch='b';
String s1="";
for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!=ch)
		{
			//s1=s1.concat(s.charAt(i)+"");by contact
			s1+=(s.charAt(i)+"");//by +
		}
	}
	System.out.println(s1);

}

}

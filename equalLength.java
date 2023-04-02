package String;

public class equalLength {

	public static void main(String[] args) {
String s1="abcd";
String s2="abcd";
boolean my=Myequal(s1,s2);
System.out.println(my);
	}
	public static boolean Myequal(String s1,String s2)
	{
		if(s1.length()==s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)==s2.charAt(i))
					return true;
			}
				return false;
			}
			else
				return false;	
	}

}

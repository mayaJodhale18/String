package String;

public class endwith {

	public static void main(String[] args) {
String s1="abdcef";
String s2="cef";

boolean my=EndWith(s1,s2);
System.out.println(my);
	}
private static boolean EndWith(String s1,String s2)
{
	if(s2.length()<=s1.length())
		{
		int s1Index=s1.length()-1;
		int s2Index=s2.length()-1;
		while(s2Index>=0)
			{
			if(s1.charAt(s1Index)!=s2.charAt(s2Index))
				{
				return false;
				}
			s1Index--;
			s2Index--;		
			}
		return true;
		}
	
	else
		return false;

}

}

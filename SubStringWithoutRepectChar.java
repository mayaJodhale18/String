package String;

public class SubStringWithoutRepectChar {

	public static void main(String[] args)
	{
String s="abcdaabbbertd";
String max="";
for(int i=0;i<s.length();i++)
	{
		String s1="";
		for(int j=i;j<s.length();j++)
		{
			char ch=s.charAt(j);
			if(isCharPresent(s1,ch))
			{
				if(s1.length()>max.length())
				max=s1;
				s1="";
				break;
			}	
			else
				{
					s1=s1+ch;
				}
			}
		}
		System.out.println(max);
	}
	private static boolean isCharPresent(String s1, char ch) {

   for(int i=0;i<s1.length();i++)
	if(s1.charAt(i)==ch)
          return true;
	return false;
	}
}
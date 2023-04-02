package String;

public class uppertolower {

	public static void main(String[] args) {
		String s="MAYA";
		 
		
		String ans=MyUpper(s);
		System.out.println(ans);

	}

	private static String MyUpper(String s) 
	{
		String  s2="";
		for(int i=0;i<s.length();i++)
			{
			char ch=s.charAt(i);
			if(ch>='A' && ch<'Z')
				{
				char temp=(char)(ch+32);
				s2=s2+temp;
				}
			else
				s2=s2+ch;
			}
		return s2;
		
	}

}

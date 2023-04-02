package String;

public class FindIntegerOnly {

	public static void main(String[] args) {
String  s="12kk48";
boolean result=onlyDigits(s);
if(result)
	System.out.println("only digit");
else
	System.out.println("not only digtit");		
}
	private static boolean onlyDigits(String s)
	{
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch<'0' || ch>'9')
				return false;
		}
		return true;
	}

}

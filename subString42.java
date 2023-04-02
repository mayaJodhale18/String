package String;

public class subString42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Maya suresh jondhale";

String Myans=mySubString(0,6,s1);
System.out.println(Myans);

	}

	private static String mySubString(int start, int end, String s1) {
	String s="";
	for(int i=start;i<end;i++)
	{
		s=s+s1.charAt(i);
	
	}
		return s;
	}

}

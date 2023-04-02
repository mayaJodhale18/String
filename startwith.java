package String;

public class startwith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="abcd2";
String s2="ac";
//boolean Starwith=s1.startsWith(s2);
//System.out.println(Starwith);

boolean myAns=myStarWith(s1,s2);
System.out.println(myAns);
}

	private static boolean myStarWith(String s1, String s2) {
		if(s2.length()<=s1.length())
		{
			int cnt=0;
			for(int i=0;i<s2.length();i++)
			{
				if(s2.charAt(i)!=s1.charAt(i))
				{
				cnt++;
				break;
				}
				
				}
			if(cnt==0)
				return true;
			else
				return false;
		
			}
		else
			return false;
	}

}

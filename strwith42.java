package String;

public class strwith42 {

	public static void main(String[] args) {
		String s1="hefshine";
		String s2="hef";

		boolean ans=myStartwith(s1,s2);
		System.out.println(ans);
	}

	private static boolean myStartwith(String s1, String s2)
	{
		if(s2.length()>s1.length())
			return false;
		for(int i=0;i<s2.length();i++)
			if(s1.charAt(i)!=s2.charAt(i))
				return false;
		        return true;


	}

	}	

package String;

public class FrequencyOfUniqueChar {

	public static void main(String[] args) {
		String s="aabbfserjdff";
		String s1=givinUqinicString(s);
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			int cnt=givencnt(s,ch);
			System.out.println(ch + " "+cnt);
		}

	}

	private static int givencnt(String s, char ch) {
		int cnt=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
				cnt++;
		}                                                                                            
		return cnt;
	}
		private static String givinUqinicString(String s) {
		String s1="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s.charAt(i);
			boolean result=ischarpresent(s1,ch);
			if(result==false)
				s1=s1+ch;
		}
		return s1;
	}
	private static boolean ischarpresent(String s1,char ch)
	{
		for(int i=0;i<s1.length();i++)
			if(s1.charAt(i)==ch)
				return true;
		return false;
	}

}

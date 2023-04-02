package String;

public class findmultistringindex {

	public static void main(String[] args) {
		          // i
		String s1="x a b d a b c a b";
		String s2=" a      b    c";
		          //s2(0)
		int my=myindex(s1,s2);
				System.out.println(my);

	}

	private static int myindex(String s1, String s2) {
		
		for(int i =0;i<s1.length()-s2.length();i++)
			{
				if(s2.charAt(0)==s1.charAt(i))
				{
					int s1index=i;
					int s2index=0;
					int cnt=0;
					while(s2index < s2.length())
					{	
					   if(s1.charAt(s1index)==s2.charAt(s2index))
					   {
						   s1index++;
						   s2index++;
						   cnt++;
					   }
					else
						break;
					}
				if(cnt== s2.length())
				{
					return i;
			    }
		      }
	}
	return -1;
}
}

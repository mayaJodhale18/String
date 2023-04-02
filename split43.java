package String;

public class split43 {

	public static void main(String[] args) {

	String s1="you all are Student";
	String []sa=split(s1);
	for(String str :sa)
		System.out.println(str);
	
	
	
	}

	private static String[] split(String s1) {
		int space=0;
		for(int i=0;i<s1.length();i++)
			if(s1.charAt(i)==' ')
				space++;
		
		String[] sa=new String [space+1];
		int i=0;
		int j=0;
		String temp="";
		for(; i<s1.length();i++)
		{
			
			char ch=s1.charAt(i);
			if(ch==' ')
			{
				
				sa[j]=temp;
				j++;
				temp="";
				
			}
			else
			{
				temp+=ch;
			}
		}
		sa[sa.length-1]=temp;
		return sa;
	}

}

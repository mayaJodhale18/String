package String;

public class lastindex42 {

	public static void main(String[] args) {
String s1="mayasssade";
//         i
         //j

String s2="maya";
        // 0
//         k
int ans=Mycontain(s1,s2);
System.out.println(ans);
	}

	private static int Mycontain(String s1, String s2) {
	for(int i=0;i<s1.length();i++)
	{
		
		if(s1.charAt(i)==s2.charAt(0))
		{
			int j=i;
			int k=0;
			int cnt=0;
			while(k<s2.length() && j<s2.length())
			{
				if(s1.charAt(j)==s2.charAt(k))
					cnt++;
				j++;k++;
			}
			if(cnt==s2.length())
				return i;
		}
			
	}
		
		
		return -1;
	}

}

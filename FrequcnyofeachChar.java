package String;

public class FrequcnyofeachChar {

	public static void main(String[] args) {
String s1="aabbcc";
String s2="";
for(int i=0;i<s1.length();i++)
		{
			int cnt=0;
		for(int j=0;j<i;j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					cnt++;
				}
			}
		if(cnt==0)
			s2=s2+s1.charAt(i);
		}
for(int i=0;i<s2.length();i++)
{
	int count=0;
for(int j=0;j<s1.length();j++)
{
if(s2.charAt(i)==s1.charAt(j))
{
count++;	
}
}
System.out.println(s2.charAt(i)+" "+count);
}
	}

}

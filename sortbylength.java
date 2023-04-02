package String;

  import java.util.Arrays;

public class sortbylength {

	public static void main(String[] args) {
String []s= {"i","can","do","it"};
for(int i=0;i<s.length;i++)
	{ 
	for(int j=0;j<s.length;j++)
		{
		if(s[i].length()<s[j].length())
			{
				String temp=s[i];
				s[i]=s[j];
				s[j]=temp;
			}
		}
	}
System.out.println(Arrays.toString(s));
	}

}

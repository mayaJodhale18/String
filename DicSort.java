package String;

public class DicSort {

	public static void main(String[] args) {	
String s1="you can do";
String []sa=s1.split(" ");
for(int i=0;i<sa.length;i++)
		{
		for(int j=i+1;j<sa.length;j++)
			{
			if(mycampare(sa[i],sa[j])>0)
			{
				String temp=sa[i];
				sa[i]=sa[j];
				sa[j]=temp;
			}
				
		}
	
		}
for(int i=0;i<sa.length;i++)
	System.out.print(sa[i]+" ");
	}

	private static int mycampare(String s1, String s2) {
	
for(int i=0;i<s1.length() && i<s2.length();i++)
	if(s1.charAt(i)!=s2.charAt(i))
		return s1.charAt(i)-s2.charAt(i);
	
		
		return s2.length()-s1.length();
	}

}

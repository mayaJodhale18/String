package String;

public class dicnary28 {

	public static void main(String[] args) {
String s="yes you can do it";
String [] sa =s.split(" ");
for(int i=0;i<sa.length;i++)
	{int j=i+1;
		for(;j<sa.length;j++);
			{
				
				if(sa[i].compareToIgnoreCase(sa[j])>0)
				{
					String temp=sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
			}
	}
for(int i=0;i<s.length();i++)
	System.out.print(sa[i]+" ");


	}

}


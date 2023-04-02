package String;

public class sortString26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="4321";
char[] ca=s.toCharArray();
for(int i=0;i<ca.length;i++)
		{
	for(int j=i+1;j<ca.length;j++)
			{
			if(ca[i]>ca[j])
			{
				char temp=ca[i];
				ca[i]=ca[j];
				ca[j]=temp;
				
			}
			}
		}
String s1=new String(ca);
s=s1;
System.out.println(s);
	}

}

package String;

public class digit {

	public static void main(String[] args) {
String s ="2j3532";
char[] a=s.toCharArray();
int cnt=0;
loopi(0,a,cnt);
if(cnt==s.length())
	System.out.println("digit");
else
	System.out.println("not difgit");
	}

	private static void loopi(int i, char[] a, int cnt) {
		if(a[i]>='0' &&  a[i]<='9')
		 {
			cnt++;
		 }		
	}

}

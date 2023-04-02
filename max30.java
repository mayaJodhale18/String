package String;

public class max30 {

	public static void main(String[] args) {
String s="aassddfffff";
for(int i=0;i<s.length();i++)
		if(isOriginalchar(s,i))
				System.out.println(s.charAt(i)+" "+givnFreq(s,s.charAt(i)));
	}

	private static int givnFreq(String s,char ch) {
		int count=0;
		for(int i=0;i<s.length();i++)
			
			if(s.charAt(i)==ch)
				
				count++;	
		return count;
	}

	private static boolean isOriginalchar(String s, int i) {
	for(int j=0;j<i;j++)
			
				if(s.charAt(j)==s.charAt(i))
					return false;
			
		return true;
	}

}

package String;

public class minString31 {

	public static void main(String[] args) {
		int min=Integer.MAX_VALUE;
		char ch='a';
		String s="aassddfffff";
		for(int i=0;i<s.length();i++)
	
			if(isOriginalchar(s,i))
				{
					int count=givnFreq(s,s.charAt(i));
							if(count<min)
							{
								min=count;
								ch=s.charAt(i);
							}
				}
					System.out.println(ch+" "+min);	//System.out.println(s.charAt(i)+" "+givnFreq(s,s.charAt(i)));
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

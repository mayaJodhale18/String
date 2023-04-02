package String;

public class removeoriginal40 {

	public static void main(String[] args) {
			int count=0;		
			String s="aassddfffff";
		for(int i=0;i<s.length();i++)
				if(isOriginalchar(s,i)==false) 
				{
					count++;
					System.out.print(s.charAt(i));
				}
		System.out.println();
		System.out.println(count);
						//System.out.println(s.charAt(i)+" "+givnFreq(s,s.charAt(i)));
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

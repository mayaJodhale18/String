package String;

public class Triammethod23 {

	public static void main(String[] args) 
	{
		String s1="   you    are   strong   ";
	
		int i=0;
		i=loopi(i,s1);
		int j=s1.length()-1;
		j=loopj(j,s1);
		System.out.println("start "+i);
		System.out.println("end "+j);
		String s="";
		int k=i;
		s=loopk(i,j,k,s1,s);
		System.out.print(s);


	}

	private static String loopk(int i, int j, int k, String s1,String s) {
		if(k<=j)
		{
			System.out.print(s1.charAt(k));
			k++;
			return loopk(i,j,k,s1,s);
		}
		return s;
	}

	private static int loopj(int j, String s1) {
		if(true)
		{
			if(s1.charAt(j)==' ')
				j--;
			else
				return j;
			return loopj(j,s1);
		}
		return j;
	}

	private static int loopi(int i, String s1) {
		if(true)
		{
			if(s1.charAt(i)==' ')
				i++;
			else
				return i;
			return loopi(i,s1);
		}return i;


	}
}

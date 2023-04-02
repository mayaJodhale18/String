package String;

public class Paiindrone {

	public static void main(String[] args) {
		
		String s="maya";
		String s2="";
		for(int i=s.length()-1;i>0;i--)
			s2=s2+s.charAt(i);
		if(s.equals(s2))
			System.out.println("palindrone");
		else
			System.out.println("not palindrone");
		
	}

}

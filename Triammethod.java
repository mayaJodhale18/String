package String;

public class Triammethod {

	public static void main(String[] args) {
		String s="  maya ";
		int i=0;
		int startcnt=0;
		while(s.charAt(i)==' ');{
			i++;}
		int j=s.length()-1;
		int endcnt=0;
		while(s.charAt(j)==' ');{
			j--;}
		String s2="";
		for(int k=i;k<=j;k++) {
			s2+=s.charAt(k);}

		System.out.println("start : "+i);
		System.out.println("end : "+j);
		System.out.println(s2);

	}

}

package String;

public class method {
static int i=0;
	public static void main(String[] args) {
System.out.println("in main");
m1();
System.out.println("out main");
	}

	private static void m1()
	{
		System.out.println("in main");
		i++;
		if(i<5)
			m1();
		System.out.println("out m1");
	}

}

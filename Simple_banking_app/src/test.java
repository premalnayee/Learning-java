
public class test {
	
	String firstname;
	
	test(String firstname) {
		this.firstname = firstname;
	}
	
	public static void  main(String[] args) {
		test a = new test("abc");
		System.out.println(a.firstname);
		
	}

}

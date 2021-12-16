public class Application {

	public static void main(String[] args) {
	Singleton s1 = Singleton.getobject();
	System.out.println(s1);
	
	Singleton s2 = Singleton.getobject();
	System.out.println(s2);
	
	}

}

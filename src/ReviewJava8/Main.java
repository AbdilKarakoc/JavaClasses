package ReviewJava8;

public class Main {
	
	  
	final void name(boolean a) {
		  System.out.println("Final method with boolean parameter");
		}

		final void name(String str) {
		  System.out.println("Final method with String parameter");
		}
		public static void main(String[] args) {
		  Main obj=new Main();
		  obj.name(true);
		  obj.name("String str");
		}
		}
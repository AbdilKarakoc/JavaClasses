package ReviewJava8;

	public class Baby {
		String firstName;
		String lastName;
		char gender;
		int weight;
		String hairColor;
		
		void talk() {
			System.out.println("Bla bla bla");
	}
		
		void walk(int times) {
			for(int i=0; i<times;i++);
			System.out.println("Crawl");
			}
		void cry() {
			System.out.println("Cry every minites");
			}
		
		public static void main(String[] args) {
			
			Baby baby1=new Baby();
			baby1.firstName="Esra";
			baby1.lastName="Karakoc";
			baby1.hairColor="balck";
			baby1.gender='f';
			baby1.weight=23;
			baby1.talk();
			//baby1.walk(int times);
			baby1.cry();
		
			
			Baby baby2=new Baby();
			baby2.firstName="Cemal";
			baby2.lastName="Karakoc";
			baby2.hairColor="yellow";
			baby2.gender='m';
			baby2.weight=35;
			baby2.talk();
			//baby1.walk(int times);
			baby1.cry();
			
			System.out.println(baby1.firstName+" "+baby1.lastName);
		
			System.out.println(baby2.firstName+" "+baby2.lastName);
			
			
			
			
		}
}

package strategypattern;

public class Dog extends Animal {

	public Dog(){
		super();
		
		setName("Mr Dog");
		setFlys(new CantFly());
		
	}
	
}

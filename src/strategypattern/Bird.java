package strategypattern;

public class Bird extends Animal {

	public Bird(){
		super();
		
		setName("MR Bird");
		setFlys(new CanFly());
	}
	
}

package strategypattern;

public class CantFly implements Flys {

	@Override
	public String fly() {
		
		return "does not fly";
	}

}

package strategypattern;

public class Animal {

	private String name;
	private int height;
	private int weight;
	private Flys flys;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void setFlys(Flys flys){
		this.flys = flys;
	}
	
	public String tryToFly(){
		
		return this.flys.fly();
	}

}

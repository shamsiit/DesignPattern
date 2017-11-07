package strategypattern;

public class Main {

	public static void main(String args[]){
		
		Animal dog = new Dog();
		Animal bird = new Bird();
		
		System.out.println(dog.getName()+"  "+dog.tryToFly());
		System.out.println(bird.getName()+"  "+bird.tryToFly());
		
		dog.setFlys(new CanFly());
		
		System.out.println(dog.getName()+"  "+dog.tryToFly());
		System.out.println(bird.getName()+"  "+bird.tryToFly());
		
	}
	
}

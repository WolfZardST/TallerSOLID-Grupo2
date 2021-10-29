package OCP_GoodUse;

public class Apple extends Fruit{

    @Override
    void get() {
       System.out.println("Get apple's seed from inside of an apple.");
    }

    @Override
    void cultivate() {
         System.out.println("First, put the seed into a flower pot, "
         		+ "one week later, move it to the ground");        
    }

	@Override
	void comer() {
		System.out.println("Eat apple");		
	}
    
}


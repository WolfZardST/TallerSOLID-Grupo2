package OCP_GoodUse;

public class Banana extends Fruit{

    @Override
    void get() {
        System.out.println("Get Bananas from planta de Banana");
    }

    @Override
    void cultivate() {
        System.out.println("Get the seed from the middle of the Banana, "
        		+ "then cultivate them into fertile ground");
    }

	@Override
	void comer() {
		System.out.println("Eat Banana");	
	}
    
}


package ISP;

public class BadUseSwordsman implements Fighter{

	@Override
	public void meleeAttack() {
		// Sword Attack
		
	}

	@Override
	public void rangeAttack() {
		throw new UnsupportedOperationException("Not Supported");
		
	}

}

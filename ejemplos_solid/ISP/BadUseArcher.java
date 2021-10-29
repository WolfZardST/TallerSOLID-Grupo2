package ISP;

public class BadUseArcher implements Fighter{

	@Override
	public void meleeAttack() {
		throw new UnsupportedOperationException("Not Supported");
		
	}

	@Override
	public void rangeAttack() {
		// Archer Fires
		
	}
	
}

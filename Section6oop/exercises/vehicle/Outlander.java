package Section6oop.exercises.vehicle;

public class Outlander extends Car{
	private int roadSerivceMonths;

	public Outlander(int roadSerivceMonths) {
		super("Outlander", "4WD", 5, 5, 6, false);
		this.roadSerivceMonths = roadSerivceMonths;
	}
	
	public void accelerate(int rate) {
		int newVeocity = getCurrentVelocity() + rate;
		if( newVeocity == 0) {
			stop();
			changeGear(1);
		} 
		else if(newVeocity > 0 && newVeocity <= 10) {
			changeGear(1);
		}
		else if(newVeocity > 10 && newVeocity <= 20) {
			changeGear(2);
		}
		else if(newVeocity > 20 && newVeocity <= 30) {
			changeGear(3);
		}
		else {
			changeGear(4);
		}
		
		if(newVeocity > 0) {
			changeVelocity(newVeocity, getCurrentDirection());
		}
	}
	
}
 
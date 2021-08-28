package oop2.composition;

public class PC {
	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;
	
	public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
	
	public void powerUp() {
		theCase.pressPowerButton();
		drawLogo();
	}
	
	public void drawLogo() {
		// Fancy graphics
		monitor.drawPixelAt(1200, 50, "yellow");
	}
	

	
	
}

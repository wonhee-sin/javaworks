package abstractex.car;

public abstract class Car {
	public Car () {}
	
	public abstract void run ();
	
	public abstract void refuel ();
	
	public void stop () {
		System.out.println("========== STOP ==========");
	}
}

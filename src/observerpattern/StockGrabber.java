package observerpattern;

import java.util.ArrayList;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;

	public StockGrabber() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer o) {

		observers.add(o);

	}

	@Override
	public void unregister(Observer o) {

		int idx = observers.indexOf(o);

		System.out.println("Observer " + (idx) + " deleted.");

		observers.remove(idx);
	}

	@Override
	public void notifyObserver() {

		for (Observer o : observers) {
			o.update(ibmPrice, aaplPrice, googPrice);
		}

	}

	public ArrayList<Observer> getObservers() {
		return observers;
	}

	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}

	public double getIbmPrice() {
		return ibmPrice;
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	public double getAaplPrice() {
		return aaplPrice;
	}

	public void setAaplPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		notifyObserver();
	}

	public double getGoogPrice() {
		return googPrice;
	}

	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		notifyObserver();
	}

}

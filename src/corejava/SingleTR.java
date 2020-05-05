package corejava;
import corejava.*;

public class SingleTR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleThreadRunnable s = new SingleThreadRunnable();
		Thread t = new Thread(s);
		t.start();

	}

}

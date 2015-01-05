package test.com.example.B;

/**
 * Created by felinus on 1/1/15.
 */
public class B {

	int n=0;
	public EventListener mEventListener;

	public void run() {
		System.out.println("B Running");
		while(n< 5) {
			try{
				n++;
				Thread.sleep(1000);
			} catch(InterruptedException e) {

			}
		}
		mEventListener.Event(this);
	}

	public interface EventListener {
		void Event( B test);
	}

	public void setEventListener(EventListener l) {
		System.out.println("Called SetEventListener");
		mEventListener = l;
	}

}


package com.example.event;

public class Event {

	int n = 0;
	public IEventListener mEventListener = null;

	public void run() {
		System.out.println("B Running");
		while(n < 5) {
			try{
				n++;
				Thread.sleep(1000);
			} catch(InterruptedException e) {

			}
		}
        if (mEventListener != null)
            mEventListener.event();
	}

	public interface IEventListener {
		void event();
	}

	public void setEventListener(IEventListener l) {
		System.out.println("Called SetEventListener");
		mEventListener = l;
	}
}

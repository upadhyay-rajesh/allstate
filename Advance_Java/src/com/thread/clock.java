package com.thread;

import java.util.*;
import java.applet.*;
import java.awt.*;

public class clock extends Applet implements Runnable {
	Thread T;

	public void init() {
		if (T == null) {
			T = new Thread(this);
			T.start();
		}
	}

	public void run() {
		while (T != null) {
			repaint();
			try {
				T.sleep(1000);
			} catch (Exception e) {
			}
		}
	}

	public void paint(Graphics g) {
		String str;
		Date time = new Date();
		str = time.toString();
		g.drawString(str, 100, 100);
	}
}

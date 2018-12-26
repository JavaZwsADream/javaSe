package com.day03;

import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.Timer;
public class TimerTest {

	public static void main(String[] args) {
		ActionListener listener=new Timeprinter();
		Timer t=new Timer(10000,listener);
		t.start();
		JOptionPane.showMessageDialog(null,"quit program?");
		System.exit(0);
	}
}

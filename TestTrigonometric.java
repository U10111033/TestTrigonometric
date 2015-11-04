/**U10111033, Computer science 4, Hsueh_Hsin Lu*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.text.*;

public class TestTrigonometric extends JFrame {
	// set Trigonometric into TestTrigonometric
	public TestTrigonometric(){
		Trigonometric myTrigonometric = new Trigonometric();
		add(myTrigonometric);
	}
	
	// main here
	public static void main(String[] args) {
		TestTrigonometric frame = new TestTrigonometric();
		frame.setTitle("Test Trigonometric");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 500);
		frame.setVisible(true);
	}
}

class Trigonometric extends JPanel {
	
	
	@Override /** Draw the Fig. */
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// DrawLine
		Polygon p = new Polygon();
		Polygon p1 = new Polygon();
		Polygon p2 = new Polygon();
		int[] xcoorxarr = {100, 900, 880, 900, 880};
		int[] xcooryarr = {250, 250, 230, 250, 270};
		int[] ycoorxarr = {500, 500, 480, 500, 520};
		int[] ycooryarr = {450, 50, 70, 50, 70};
		
		// Draw x-coordinate
		g.setColor(Color.black);
		g.drawPolyline(xcoorxarr, xcooryarr, 5);
		g.drawPolygon(p);
		
		// Draw y-coordinate
		g.setColor(Color.black);
		g.drawPolyline(ycoorxarr, ycooryarr, 5);
		g.drawPolygon(p);
		
		// Draw sin-function
		g.setColor(Color.red);
		for(int x = -400; x <= 400; x++){
			p1.addPoint(x + 500, 250 - (int) (50 * Math.sin((x / 100.0) * 2 * Math.PI)));
		}
		g.drawPolyline(p1.xpoints, p1.ypoints, p1.npoints);
		
		// Draw cos-function
		g.setColor(Color.blue);
		for(int x = -400; x <= 400; x++){
			p2.addPoint(x + 500, 250 - (int) (50 * Math.cos((x / 100.0) * 2 * Math.PI)));
		}
		g.drawPolyline(p2.xpoints, p2.ypoints, p2.npoints);
		
		// Draw the sign
		g.drawString("X", 910, 255);
		g.drawString("Y", 495, 40);
		g.drawString("0", 490, 260);
		g.drawString("-\u03c0", 460, 260);
		g.drawString("\u03c0", 510, 260);
		g.drawString("-2\u03c0", 355, 260);
		g.drawString("2\u03c0", 605, 260);
	}
}
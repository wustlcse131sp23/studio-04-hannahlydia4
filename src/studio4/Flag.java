package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(188, 229, 170);
		StdDraw.filledRectangle(0.5, 0.5, 0.3, 0.2);
		StdDraw.setPenColor(170, 209, 229);
		StdDraw.filledRectangle(0.32, 0.5, 0.03, 0.1);
		StdDraw.filledRectangle(0.4, 0.43, 0.05, 0.03);	
		StdDraw.setPenColor(229, 170, 217);
		StdDraw.filledRectangle(0.55, 0.5, 0.03, 0.1);
		StdDraw.filledRectangle(0.67, 0.5, 0.03, 0.1);
		StdDraw.filledRectangle(0.61, 0.5, 0.05, 0.03);
	}
}
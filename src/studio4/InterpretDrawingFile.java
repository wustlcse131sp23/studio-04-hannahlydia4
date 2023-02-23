package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		if (shape.equals("ellipse"))
		{int r=in.nextInt();
		int g=in.nextInt();
		int b=in.nextInt();
		boolean isFilled = in.nextBoolean();
		double xCenter= in.nextDouble();
		double yCenter= in.nextDouble();
		double semiMajor= in.nextDouble();
		double semiMinor= in.nextDouble();
		StdDraw.setPenColor(r, g, b);
			if (isFilled)
			{StdDraw.filledEllipse(xCenter, yCenter, semiMajor, semiMinor);}
			else
			{StdDraw.ellipse(xCenter, yCenter, semiMajor, semiMinor);}

		}
		
		else if (shape.equals("rectangle"))
		{int r=in.nextInt();
		int g=in.nextInt();
		int b=in.nextInt();
		boolean isFilled = in.nextBoolean();
		double xCenter= in.nextDouble();
		double yCenter= in.nextDouble();
		double halfWidth= in.nextDouble();
		double halfHeight= in.nextDouble();
		StdDraw.setPenColor(r, g, b);
			if (isFilled)
			{StdDraw.filledRectangle(xCenter, yCenter, halfWidth, halfHeight);}
			else
			{StdDraw.rectangle(xCenter, yCenter, halfWidth, halfHeight);}
		}
		
		else if (shape.equals("triangle"))
		{int r=in.nextInt();
		int g=in.nextInt();
		int b=in.nextInt();
		boolean isFilled = in.nextBoolean();
		double xOne= in.nextDouble();
		double yOne= in.nextDouble();
		double xTwo= in.nextDouble();
		double yTwo= in.nextDouble();
		double xThree= in.nextDouble();
		double yThree= in.nextDouble();
		
		double[]x= {xOne, xTwo, xThree};
		double[]y= {yOne, yTwo, yThree};
		
		
		StdDraw.setPenColor(r, g, b);
			if (isFilled)
			{StdDraw.filledPolygon(x, y);}
			else
			{StdDraw.polygon(x,y);}
		}


		
	}
}

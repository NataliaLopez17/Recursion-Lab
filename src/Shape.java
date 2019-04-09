import java.awt.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;

public class Shape extends JComponent {

	private static ArrayList<Rectangle2D.Double> rectangles = new ArrayList<Rectangle2D.Double>();

	private static int count = 0;

	private static final long serialVersionUID = -8623858390198173330L;

	public void paintComponent(Graphics g) {

		g.setColor(Color.RED);

		Graphics2D g2 = (Graphics2D) g;

		g2.setStroke(new BasicStroke(2));

		for (int i = 0; i < count; i++) {

			g2.draw(rectangles.get(i));

		}

		if (count < rectangles.size()) {

			count++;

		}

	}

	public static void main(String[] args) {

		JFrame mainFrame = new JFrame("Recursion");

		mainFrame.setSize(800, 800);

		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mainFrame.getContentPane().add(new Shape());

		mainFrame.setVisible(true);

		// This is the starting point of the recursion.

		// The first parameter n is to indicate the level of the fractal.

		// The other 4 is the position and size of the first rectangle.

		shape(4, 300, 300, 200, 200);

		while (count < rectangles.size()) {

			try {

				Thread.sleep(1000 / 30);

			} catch (Exception e) {

				// DO Nothing

			}

			mainFrame.getContentPane().getComponent(0).repaint();

		}

	}

	/*
	 * EXERCICE This is the recursive method that you will submit. follow the sample
	 * given in the line 96.
	 */

	public static void shape(int n, double x, double y, double width, double height) {

		// This is used to later animate the recursion. DO NOT REMOVE!

		rectangles.add(new Rectangle2D.Double(x, y, width, height));

		if (n == 0)
			return;

		double newWidth = width * 0.5;

		double newHeight = height * 0.5;

		shape(n - 1, x - (newWidth / 2), y - (newHeight / 2), newWidth, newHeight);

		// Add your code here.

	}

}
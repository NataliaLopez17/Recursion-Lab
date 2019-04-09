import java.awt.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;

public class Tree extends JComponent {

	private static ArrayList<Line2D.Double> lines = new ArrayList<Line2D.Double>();
	private static int count = 0;
	private static final long serialVersionUID = -8623858390198173330L;

	public void paintComponent(Graphics g) {

		g.setColor(Color.RED);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(2));

		for (int i = 0; i < count; i++) {

			g2.draw(lines.get(i));

		}

		if (count < lines.size() - 1)
			count++;
	}

	public static void main(String[] args) {

		JFrame mainFrame = new JFrame("Recursion");

		mainFrame.setSize(800, 800);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().add(new Tree());
		mainFrame.setVisible(true);

		// This is the starting point of the recursion.
		// The first parameter n is to indicate the level of the fractal.
		// The second and third parameters (x,y) are the starting point.
		// The forth parameter is the angle that the next line will bend.
		// The final parameter is the direction and size that the line will have.

		tree(6, 400, 700, Math.PI / 2, -240);

		while (count < lines.size() - 1) {

			try { // You can change the denominator to change the animation speed.

				Thread.sleep(1000 / 120);

			} catch (Exception e) {

				// DO Nothing

			}

			mainFrame.getContentPane().getComponent(0).repaint();

		}

	}

	/*
	 * This is the recursive function
	 */
	// .

	public static void tree(int n, double x, double y, double a, double branchRadius) {

		double bendAngle = Math.toRadians(15);
		double branchAngle = Math.toRadians(37);
		double branchRatio = 0.65;
		double cx = x + Math.cos(a) * branchRadius;
		double cy = y + Math.sin(a) * branchRadius;

		// This is used to later animate the recursion. DO NOT REMOVE!

		lines.add(new Line2D.Double(x, y, cx, cy));

		if (n == 0)
			return;

		tree(n - 1, cx, cy, a + bendAngle - branchAngle, branchRadius * branchRatio);
		tree(n - 1, cx, cy, a + bendAngle + branchAngle, branchRadius * branchRatio);
		tree(n - 1, cx, cy, a + bendAngle, branchRadius * (1 - branchRatio));

	}

}
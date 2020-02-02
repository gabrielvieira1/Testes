package imagensGraficas;

import java.awt.color.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSmiley extends JPanel {

	Color cor1 = new Color(255, 45, 35);
	Color cor2 = new Color(85, 15, 20);

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (int i = 0; i < 10; i++) {
			g.setColor(cor1);
			g.fillOval(10, 10, 200, 200);

			for (int j = 0; j < 10; j++) {
				g.setColor(cor2);
				g.fillOval(35, 35, 150, 150);

				for (int l = 0; l < 10; l++) {
					g.setColor(cor1);
					g.fillOval(60, 60, 100, 100);

					for (int m = 0; m < 10; m++) {
						g.setColor(cor2);
						g.fillOval(85, 85, 50, 50);

					}

				}
			}

		}

		/*
		 * g.setColor(Color.YELLOW); g.fillOval(10, 10, 200, 200);
		 * 
		 * g.setColor(Color.PINK); g.fillOval(7, 7, 150, 150);
		 */

		/*
		 * g.setColor(Color.BLACK); g.fillOval(55, 65, 30, 30); g.fillOval(135, 65, 30,
		 * 30);
		 */

		// g.fillOval(50, 110, 120, 60);

		/*
		 * g.setColor(Color.YELLOW); g.fillRect(50, 110, 120, 30); g.fillOval(50, 110,
		 * 120, 40);
		 */
	}

}

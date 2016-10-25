

import java.awt.Frame;
import java.awt.Graphics;

public class NewFrame extends Frame {

	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		g.drawLine(0, 0, 300, 300);
	}

}

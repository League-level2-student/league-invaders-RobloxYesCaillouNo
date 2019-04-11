
import java.awt.Graphics;

public class Crystal extends Objects {
	int toGround;

	public Crystal(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
		toGround = 100;
	}

	public void update() {
		super.update();
		if (y > 777) {
			y = y + toGround;
		}

	}

	public void draw(Graphics g) {
		g.drawImage(GamePanel.crystalImg, x, y, width, height, null);
	}
}

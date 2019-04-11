
import java.awt.Graphics;

public class Bombs extends Objects {
	int toGround;

	public Bombs(int x, int y, int width, int height) {
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
		g.drawImage(GamePanel.bombImg, x, y, width, height, null);
	}

}

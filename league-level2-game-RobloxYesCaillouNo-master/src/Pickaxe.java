import java.awt.Graphics;

public class Pickaxe extends Objects {

	int miningInProgress;
	// int x = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	// int y = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

	public Pickaxe(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
		miningInProgress = 50;

	}

	public void update() {
		super.update();
		if (x <= x + miningInProgress) {
			try {
				wait(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			x = x - miningInProgress;
		}
	}

	public void draw(Graphics g) {
		g.drawImage(GamePanel.pickImg, x, y, 260, 260, null);
	}

}

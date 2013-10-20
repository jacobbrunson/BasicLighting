import org.lwjgl.util.vector.Vector2f;

public class Block {
	public int x, y, width, height;

	public Block(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public Vector2f[] getVertices() {
		return new Vector2f[] {
				new Vector2f(x, y),
				new Vector2f(x, y + height),
				new Vector2f(x + width, y + height),
				new Vector2f(x + width, y)
		};
	}
}

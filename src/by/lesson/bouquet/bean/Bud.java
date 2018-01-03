package by.lesson.bouquet.bean;

public class Bud {

	private String color;
	private int size;
	private Leaf[] leaves;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	void addFreshLeaves(int leafNubmer, String leafColor, String leafShape) {
		if (leaves == null) {
			leaves = new Leaf[leafNubmer];
			for (int i = 0; i < leafNubmer; i++) {
				leaves[i] = new Leaf(leafColor, leafShape);
			}
		}
	}

	public Leaf[] getLeaves() {
		return leaves;
	}

}

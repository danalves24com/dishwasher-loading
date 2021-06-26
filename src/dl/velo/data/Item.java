package dl.velo.data;

// TODO: Auto-generated Javadoc
/**
 * The Class Item.
 */
public class Item {

	/** The height. */
	private double depth, rad, width, height;
	
	/** The shape. */
	private ItemShape shape;

	/**
	 * Instantiates a new item with shape Round.
	 *
	 * @param depth the depth
	 * @param radious the radious
	 */
	public Item(double depth, double radious) {
		this.depth = depth;
		this.rad = radious;
		this.shape = ItemShape.Round;
	}

	/**
	 * Instantiates a new item with shape Rectangle.
	 *
	 * @param depth the depth
	 * @param width the width
	 * @param height the height
	 */
	public Item(double depth, double width, double height) {
		this.depth = depth;
		this.width = width;
		this.height = height;
		this.shape = ItemShape.Rectangle;
	}

	/**
	 * Gets the approximate volume.
	 *
	 * @return the volume of the item
	 */
	public double getVolume() {
		double rVal = 0.0;
		switch (this.shape) {
		case Rectangle:
			rVal = (width * height) * depth;
			break;
		case Round:
			rVal = (Math.PI * Math.pow(rad, 2)) * depth;
			break;
		}
		return 0.0;
	}

}

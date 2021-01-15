package jabberpoint.core;

/**
 * The abstract class for items on a slide.
 *
 * @author Sydney Minnaar
 * @version 1.7
*/
public abstract class Item
{
	private final int level;

	public Item(int level)
	{
		this.level = level;
	}

	public int level()
	{
		return level;
	}
}
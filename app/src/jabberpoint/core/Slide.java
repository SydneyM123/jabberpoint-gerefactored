package jabberpoint.core;

import java.util.ArrayList;

/**
 * Represents a slide for a presentation.
 *
 * @author Sydney Minnaar
 * @version 1.7
 */
public class Slide
{
	private String title;
	private final ArrayList<Item> items;

	public Slide(String title, ArrayList<Item> items)
	{
		this.title = title;
		this.items = items;
	}

	public Slide()
	{
		items = new ArrayList<>();
	}

	public ArrayList<Item> getItems()
	{
		return items;
	}

	public String title()
	{
		return title;
	}

	public void title(String title)
	{
		this.title = title;
	}

	public void append(Item item)
	{
		items.add(item);
	}

	public void append(int level, String text)
	{
		items.add(new Text(level, text));
	}
}
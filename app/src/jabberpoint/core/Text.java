package jabberpoint.core;

/**
 * A text item that can be used by a slide.
 *
 * @author Sydney Minnaar
 * @version 1.7
 */
public class Text extends Item
{
	protected final String text;

	public Text(int level, String text)
	{
		super(level);
		this.text = text;
	}

	public String text()
	{
		return text;
	}

	public String toString()
	{
		return "jabberpoint.core.TextItem["+level()+","+text()+"]";
	}
}
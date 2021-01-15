package jabberpoint.swing.styles;

import java.awt.Color;
import java.awt.Font;

/**
 * jabberpoint.Swing.Style stands for Indent, Color, Font and Leading.
 * The link between a style number and a item level is hard-linked:
 * in Jabberpoint.Core.SlideDrawer the style is grabbed for an item
 * with a style number the same as the item level.
 *
 * @author Sydney Minnaar
 * @version 1.7
 */
public abstract class Style
{
	public final int indent;
	public final Color color;
	public final Font font;
	public final int fontSize;
	public final int leading;

	private static final String FONT_NAME = "Helvetica";

	public Style(int indent, Color color, int points, int leading)
	{
		this.indent = indent;
		this.color = color;
		this.font = new Font(FONT_NAME, Font.BOLD, fontSize=points);
		this.leading = leading;
	}

	public String toString()
	{
		return "["+ indent + "," + color + "; " + fontSize + " on " + leading +"]";
	}
}
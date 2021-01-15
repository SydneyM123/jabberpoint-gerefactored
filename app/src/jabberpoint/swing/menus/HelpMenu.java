package jabberpoint.swing.menus;

import jabberpoint.swing.MainFrame;
import jabberpoint.swing.menus.items.About;

import java.awt.*;

public class HelpMenu extends Menu
{
    protected static final String HELP = "Help";

    public HelpMenu(MainFrame parent)
    {
        super(HELP);
        add(new About(parent));
    }
}
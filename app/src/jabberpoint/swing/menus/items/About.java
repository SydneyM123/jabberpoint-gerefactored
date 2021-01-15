package jabberpoint.swing.menus.items;

import jabberpoint.swing.AboutBox;
import jabberpoint.swing.MainFrame;

import java.awt.*;

public class About extends MenuItem
{
    protected static final String ABOUT = "About";

    public About(MainFrame parent)
    {
        super(ABOUT, new MenuShortcut(ABOUT.charAt(0)));
        addActionListener(actionEvent -> AboutBox.show(parent));
    }
}
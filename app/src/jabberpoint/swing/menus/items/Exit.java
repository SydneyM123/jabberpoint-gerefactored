package jabberpoint.swing.menus.items;

import java.awt.*;

public class Exit extends MenuItem
{
    protected static final String EXIT = "Exit";

    public Exit() throws HeadlessException
    {
        super(EXIT, new MenuShortcut(EXIT.charAt(0)));
        addActionListener(actionEvent -> System.exit(0));
    }
}
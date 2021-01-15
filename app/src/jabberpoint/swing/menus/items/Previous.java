package jabberpoint.swing.menus.items;

import jabberpoint.swing.SlideViewer;

import java.awt.*;

public class Previous extends MenuItem
{
    protected static final String PREV = "Prev";

    public Previous(SlideViewer slideViewer) throws HeadlessException
    {
        super(PREV);
        addActionListener(listener ->
        {
            slideViewer.presentation().previousSlide();
            slideViewer.repaint();
        });
    }
}
package jabberpoint.swing.menus.items;

import jabberpoint.swing.SlideViewer;

import java.awt.*;

public class Next extends MenuItem
{
    protected static final String NEXT = "Next";

    public Next(SlideViewer slideViewer) throws HeadlessException
    {
        super(NEXT);
        addActionListener(actionEvent ->
        {
            slideViewer.presentation().nextSlide();
            slideViewer.repaint();
        });
    }
}
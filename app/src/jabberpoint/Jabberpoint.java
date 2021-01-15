package jabberpoint;

import jabberpoint.demo.DemoPresentation;
import jabberpoint.core.Presentation;
import jabberpoint.io.xml.readers.ItemReader;
import jabberpoint.io.xml.readers.PresentationReader;
import jabberpoint.io.xml.readers.SlideReader;
import jabberpoint.swing.MainFrame;
import jabberpoint.swing.SlideViewer;

import javax.swing.*;

/**
 * This program is distributed under the terms of the accompanying
 * COPYRIGHT.txt file (which is NOT the GNU General Public License).
 * Please read it. Your use of the software constitutes acceptance
 * of the terms in the COPYRIGHT.txt file.
 *
 * @author Sydney Minnaar
 * @version 1.7
 */
public class Jabberpoint
{
	protected static final String APP_TITLE = "Jabberpoint 1.6 - OU version";
	protected static final SlideViewer SLIDE_VIEWER = new SlideViewer();
	protected static final JFrame FRAME = new MainFrame(SLIDE_VIEWER);

	public static void main(String[] args)
	{
		loadPresentation(args);
		FRAME.setTitle(APP_TITLE);
	}

	private static void loadPresentation(String[] args)
	{
		Presentation presentation = null;
		if (args.length > 0)
			presentation = tryToLoadPresentation(args[0]);
		if (presentation == null)
			presentation = new DemoPresentation();
		SLIDE_VIEWER.presentation(presentation);
	}

	private static Presentation tryToLoadPresentation(String path)
	{
		try
		{
			return new PresentationReader(new SlideReader(new ItemReader())).read(path);
		}
		catch (PresentationReader.LoadingFailed e)
		{
			JOptionPane.showMessageDialog(null, "IO Error: " + e.getMessage(), "Jabberpoint Error", JOptionPane.ERROR_MESSAGE);
			return null;
		}
	}
}
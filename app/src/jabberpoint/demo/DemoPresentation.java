package jabberpoint.demo;

import jabberpoint.core.Presentation;

/**
 * A built-in demo presentation.
 *
 * @author Sydney Minnaar
 * @version 1.7
 */
public class DemoPresentation extends Presentation
{
	public DemoPresentation()
	{
		super("Demo Presentation", 0);
		append(new FirstDemoSlide());
		append(new SecondDemoSlide());
		append(new ThirdDemoSlide());
	}
}
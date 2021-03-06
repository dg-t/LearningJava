import java.awt.event.*;
import javax.swing.*;

/**
 * 
 * @author kakashi
 * 
 * We create our class with the name of our choice. In this case, we called our class MouseWhisperer, and we extended the JFrame class and implemented the MouseListener interface.
 * We also need to make sure to import java.awt.event.* for our mouse listeners events to works, and the javax.swing.* for the JFrame class to be extended.
 * As we are extending the JFrame superclass, our MouseWhisperer class will become a subclass. Therefore, we do not need to create a new JFrame() object, as it will be already included in our MouseWhisperer class.
 */
public class MouseWhisperer extends JFrame implements MouseListener {
	
	/**
	 * Below, the first thing we do into our MouseWhisperer class, is to create its constructor with the values and information we need.
	 * The first line we add in the constructor its the title of the window. It can be set with the super() keyword, that will accept only one single argument, the title. Or, it can also be set with the setTitle() method.
	 * In the example below we use the super() keyword, which will refer to the JFrame superclass, and it will configure the title of the window.
	 * We also add some general information relevant to the JFrame we are creating. 
	 * Below we add the setSize() method where we specified the size of the window that will be displayed.
	 * We set the visibility to true with the setVisibility() method.
	 * We specify that when the window is closed, we can exit from the JFrame library.
	 * Finally we also add the Mouse Listener event to this constructor, so that the mouse events will work on this JFrame we are creating.
	 * 
	 */
	// Constructor
    MouseWhisperer() {
        super("COME CLOSER");
        setSize(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);
        setVisible(true);
    }
    
    /**
     * We have implemented the MouseListener interface, as for any interface in Java, we must add all the abstract methods that are defined in the interface.
     * Even though is not mandatory, I believe is a good practice to add the @override to avoid confusion between the methods from the interface and possible methods that we will add to our class. Anyway, the @override keyword is not implemented in the given code, I just thought that it was good to mention it.
     * All the 5 methods below, are the abstract methods that are defined in the MouseListener interface. 
     * The methods name are self-explanatory. The first method is for when we click anywhere in the JFrame window, at least for this particular example. The second method is for when we keep the mouse pressed. The third method is for when we release the mouse. The fourth method is for when we enter the area. Finally, the fifth method is for when we leave the JFrame area.
     * For each of the below method, we are changing the window title, depending on the mouse action the user performs. 
     */
    // Mouse methods
    @Override
    public void mouseClicked(MouseEvent e) { setTitle("OUCH"); }
    @Override
    public void mousePressed(MouseEvent e) { setTitle("LET GO"); }
    @Override
    public void mouseReleased(MouseEvent e) { setTitle("WHEW"); }
    @Override
    public void mouseEntered(MouseEvent e) { setTitle("I SEE YOU"); }
    @Override
    public void mouseExited(MouseEvent e) { setTitle("COME CLOSER"); }
}
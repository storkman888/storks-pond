/*
 * Simple GUI
 * Nathaniel Smith
 * GUIHelloWorld
 * 
 * Honor Code:
 * “I pledge that this program represents my own program code. 
 * I received help from no one in designing and debugging my program.”
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GUIHelloWorld {
	
	  JButton hbutton;
	  JFrame frame;
	  JPanel panel;
	  JTextField display;
	  JLabel greetingLabel, fahrenheitLabel;

	  public  void helloWorldGUI() {
	    frame = new JFrame("Greetings!");
	    frame.setSize(800, 800);
	    panel = new JPanel();
	    panel.setLayout(new GridLayout(2, 2));
	    // Add the widgets.
	    addWidgets();
	    // Add the panel to the frame.
	    frame.getContentPane().add(panel, BorderLayout.CENTER);
	    // Exit when the window is closed.
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    // Show the converter.
	    frame.pack();
	    frame.setVisible(true);
	  }

	  private void addWidgets() {
	    // Create widgets.
	    greetingLabel = new JLabel("Greeting...", SwingConstants.CENTER);
	    hbutton = new JButton("Click Me");
	    // Listen to events from Convert button.
	    hbutton.addActionListener(this);
	    // Add widgets to container.
	    panel.add(greetingLabel);
	    panel.add(hbutton);
	    greetingLabel.setBorder(BorderFactory.createEmptyBorder(500, 500, 500, 500));
	  }

	  public void actionPerformed(ActionEvent event) {
	    //Displays Hello World
	    String tempFahr = "Hello World";
	    greetingLabel.setText(tempFahr);
	  }

	  public static void main(String[] args){
	    // Set the look and feel.
	    try {
	    UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
	    } 
	    catch (Exception e) {
	    }
	    GUIHelloWorld obj = new GUIHelloWorld();
	    obj.helloWorldGUI();
	    obj.addWidgets();
	  }


}

/*
 * Simple GUI
 * Nathaniel Smith
 * GUIAreaOfRectangle
 * 
 * Honor Code:
 * “I pledge that this program represents my own program code. 
 * I received help from no one in designing and debugging my program.”
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GUIAreaOfRectangle {


	  JButton hbutton;
	  JFrame converterFrame;
	  JPanel converterPanel;
	  JTextField tempCelsius;
	  JLabel celsiusLabel, fahrenheitLabel;
	  private double width;
	  private double height;
	  
		  public void Rectangle() {
			  
		  }

		  public void Rectangle(double width, double height) {
		    this.width = width;
		    this.height = height;
		  }

		  /** Return width */
		  public double getWidth() {
		    return width;
		  }

		  /** Set a new width */
		  public void setWidth(double width) {
		    this.width = width;
		  }

		  /** Return height */
		  public double getHeight() {
		    return height;
		  }

		  /** Set a new height */
		  public void setHeight(double height) {
		    this.height = height;
		  }

		  public double getArea() {
		    return width * height;
		  }

		  public double getPerimeter() {
		    return 2 * (width + height);
		  }
		  
		  public static void main (String[] args) {
			  GUIAreaOfRectangle obj = new GUIAreaOfRectangle();
				obj.Rectangle();
		  }
}



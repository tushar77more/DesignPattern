package com.dailycoder.structural;

import com.dailycoder.structural.bridge.Color;
import com.dailycoder.structural.bridge.Shape;
import com.dailycoder.structural.bridge.impl.Blue;
import com.dailycoder.structural.bridge.impl.Circle;
import com.dailycoder.structural.bridge.impl.Rectangle;
import com.dailycoder.structural.bridge.impl.Red;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Shape circle = new Circle(new Red());
    	String redCircle = circle.draw();
    	
    	System.out.println("-------> "+redCircle);
    	
    	Color blue = new Blue();
    	Shape rectangle = new Rectangle(blue);
    	String blueRectangle = rectangle.draw();
    	System.out.println("-------> "+blueRectangle);
    
    }
}

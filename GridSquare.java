import java.awt.Color;

import javax.swing.*;

/*
 *  a simple extension of JButton which allows the background colour to be set and switched back and forth with ease
 *
 *  there are other ways of doing this, but it's a neat way to demonstrate how to create your own gui components
 *  (as well as how to use ternary operators)
 */
public class GridSquare extends JButton
{
	private int xcoord, ycoord;			// not used in this demo, but might be helpful in future...
	private static final Color brown = new Color(79, 37, 30);
	private static final Color soap = Color.pink;
	// constructor takes the x and y coordinates of this square
	public GridSquare( int xcoord, int ycoord)
	{
		super();
		this.xcoord = xcoord;
		this.ycoord = ycoord;
	}

	// if the decider is even, it chooses black, otherwise white (for 'column+row' will allow a chequerboard effect)
	public void setColor(/*int decider*/)
	{
		//Color brown = new Color(79, 37, 30);
		this.setBackground(brown);
		this.setBackground(GridSquare(0,0)soap);
		//Color colour = (int) (decider/2.0) == (decider/2.0) ? Color.cyan : Color.orange;
		//this.setBackground( colour);
	}

	// if the square is black it becomes white, and vice-versa
	public void switchColor()
	{
		if (getBackground() == brown){
			setVisible(false);
		}
		//Color colour = (getBackground() == Color.cyan) ? Color.orange: Color.orange;
		//this.setBackground( colour);
	}
}

//public void setColor(){
//	Color brown = new Color(150, 75, 0);
//	this.setBackground(brown);
//}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class YuckyGUI extends JFrame implements ActionListener{
  private JPanel topPanel, bottomPanel;
  private JLabel topLabel;
  private GridSquare [][] gridSquares;
  private int x,y;

  public YuckyGUI(int x, int y){
    this.x = x;
    this.y = y;

    // panels
    topPanel = new JPanel();
    topPanel.setLayout(new FlowLayout());

    bottomPanel = new JPanel();
    bottomPanel.setLayout(new GridLayout(x, y));

    // top panel
    topLabel = new JLabel("Yucky Chocky!");
    topPanel.add(topLabel);

    //bottom panel
    // grid
    gridSquares = new GridSquare [x][y];
    for (int column = 0; column < x; column ++){
      for (int row = 0; row < y; row ++){
        gridSquares [column][row] = new GridSquare(x,y);
				gridSquares [column][row].setSize(20, 120); //?
				gridSquares [column][row].setColor(column + row);
				gridSquares [column][row].setOpaque(true);
				gridSquares [column][row].setBorderPainted(false);

        gridSquares [column][row].addActionListener(this);

        bottomPanel.add( gridSquares [column][row]);
      }
    }

    // now add the top and bottom panels to the main frame
    getContentPane().setLayout( new BorderLayout());
    getContentPane().add( topPanel, BorderLayout.NORTH);
    getContentPane().add( bottomPanel, BorderLayout.SOUTH);
    pack();

    // housekeeping : behaviour
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
    setResizable( false);
    setVisible( true);
  }

  public void actionPerformed (ActionEvent aevt){
    Object selected = aevt.getSource();

    if (selected instanceof GridSquare){
      ((GridSquare) selected).switchColor();
    }
  }
}

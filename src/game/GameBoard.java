package game;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

//Ролева дъска с размери 500х500 пиксела и 5х5 колони и редове

public class GameBoard extends JFrame{

    public GameBoard() {

        this.setSize(500,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public void paint(Graphics g){

        super.paint(g);

        for(int row = 0; row < 5; row++){
            for(int col = 0; col < 5; col++){

                BoardTile tile = new BoardTile(row, col);
                tile.setTiles(g);
            }
        }
        turtle(g);
    }
    /**
     *  Задаване на костенурките по случайни места на третия ред (без да се зачита центъра)
     */
    public void turtle (Graphics g){

        Random rand = new Random();
        int firstTurtlePlace = rand.nextInt(2);
        int secondTurtlePlace = rand.nextInt(2) + 3;

        g.setColor(Color.red);
        g.fillOval(28+(100*firstTurtlePlace) , 226, 50, 50);
        g.setColor(Color.white);
        g.fillOval(35+(100*firstTurtlePlace) , 233, 35, 35);

        g.setColor(Color.red);
        g.fillOval(28+(100*secondTurtlePlace) , 226, 50, 50);
        g.setColor(Color.white);
        g.fillOval(35+(100*secondTurtlePlace) , 233, 35, 35);

    }


}


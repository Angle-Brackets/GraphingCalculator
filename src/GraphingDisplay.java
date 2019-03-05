import GraphTypes.*;

import javax.swing.*;

public class GraphingDisplay {
    public static JFrame fr = new JFrame("Graphing Window");
    public static int canvasWidth = 700;
    public static int canvasHeight = 700;
    public static Graph line, line2, line3;

    public static void main(String[] args){
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(canvasWidth,canvasHeight);
        GraphDraw background = new GraphDraw();
        fr.add(background);
        fr.setVisible(true);
        fr.setResizable(false);

        line = new Line("Y = 5X+2");
//        line2 = new Line("Y = X+2", 10,20);
//        line3 = new Line("Y = X^2+2");
//
//        System.out.println(line);
//        System.out.println(line2);
//
//        line.setDomain(134,12.5);
        //line = new Line(-100,-100,100,100);
    }

}

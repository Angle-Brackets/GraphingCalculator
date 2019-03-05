import GraphTypes.Graph;

import java.awt.*;
import javax.swing.*;

public class GraphDraw extends JPanel{
    public static int index = 0;
    private static int xCoordGrid, yCoordGrid = 0;
    public static Graph[] graphs = new Graph[BaseGraph.MAX_GRAPHS];

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for(int i = 0; i < (GraphingDisplay.canvasHeight/10)*(GraphingDisplay.canvasWidth/10); i++) {
            g.setColor(Color.BLACK);
            g.drawRect(xCoordGrid, yCoordGrid, 10, 10);
            xCoordGrid+=10;
            if(xCoordGrid == GraphingDisplay.canvasWidth) {
                xCoordGrid = 0;
                yCoordGrid+=10;
            }
            //Intialize axies
            for(int j = 0; j < 3; j++) {

                g.setColor(Color.RED);
                g.drawLine(0, GraphingDisplay.canvasHeight/2-(47+j), GraphingDisplay.canvasWidth, GraphingDisplay.canvasHeight/2-(47+j));
                g.setColor(Color.BLUE);
                g.drawLine(GraphingDisplay.canvasWidth/2-j, 0, GraphingDisplay.canvasWidth/2-j, GraphingDisplay.canvasHeight);
            }
        }
        graphs[0].evaluateExpression();
    }

}
/*
What does Every Graph Need?
Domain, Range
Equation
Type
*/

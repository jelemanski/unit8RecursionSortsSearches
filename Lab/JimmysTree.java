import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
public class JimmysTree extends JFrame
{

    public JimmysTree()
    {
        super("Fractal Tree");
        setBounds(100,100,800,800);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void drawTree(Graphics g, int x1, int y1, double angle, int depth)
    {
        if (depth == 0 )
            return;
        int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * 5.0);
        int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * 10.0);
        g.drawLine(x1, y1, x2, y2);
        drawTree(g, x2, y2, angle - 20, depth - 1);
        drawTree(g, x2, y2, angle + 20, depth - 1);

    }
     public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        drawTree(g, 600, 500, -90, 9);
    }
 
    public static void main(String[] args) {
        new JimmysTree().setVisible(true);
    }
}

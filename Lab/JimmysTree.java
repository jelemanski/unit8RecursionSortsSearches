import java.awt.Graphics;
import java.awt.Colorl
import javax.swing.JFrame;
public class JimmysTree extends JFrame
{

    Public FractalTree()
    {
        super("Fractal Tree");
        setBounds(100,100,800,800);
        setResize(false);
        setDefaultCloseOperation(EXITONCLOSE);
    }

    private void drawTree(Graphics g, int x1, int y1, double angle, int depth)
    {
        if (depth == 0 )
            return;

    }

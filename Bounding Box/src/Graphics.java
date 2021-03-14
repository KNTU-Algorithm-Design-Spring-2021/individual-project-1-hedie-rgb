import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Graphics implements ActionListener {
    private JFrame frame;
    private JLabel numberOfP;
    private JTextField num;
    private JButton calculate;
    private Main main = new Main();
    private JButton next;
    private JButton get;
    private JTextField xt;
    private JTextField yt;
    private JTextField zt;
    private ArrayList<Integer> x = new ArrayList<>();
    private ArrayList<Integer> y = new ArrayList<>();
    private ArrayList<Integer> z = new ArrayList<>();
    private int counter;
    private int n;


    public void start() {
        this.frame = new JFrame("Bounding Box");
        this.frame.setSize(600,600);
        this.numberOfP = new JLabel("Please enter number of points: ");
        this.numberOfP.setBounds(10,10, 190,30);
        this.num = new JTextField();
        this.num.setBounds(200, 10, 100, 30);
        this.calculate = new JButton("Go!");
        this.calculate.setBounds(180, 100, 200, 50);
        this.calculate.addActionListener(this);
        this.frame.add(this.numberOfP);
        this.frame.add(this.num);
        this.frame.add(this.calculate);
        this.frame.setLayout(null);
        this.frame.setVisible(true);
    }

    private void getXYZ() {
        JLabel xl = new JLabel("X");
        this.xt = new JTextField();
        xl.setBounds(50, 50, 50, 50);
        this.xt.setBounds(100, 50, 50, 50);
        this.frame.add(xl);
        this.frame.add(xt);
        JLabel yl = new JLabel("Y");
        this.yt = new JTextField();
        yl.setBounds(50, 100, 50, 50);
        this.yt.setBounds(100, 100, 50, 50);
        this.frame.add(yl);
        this.frame.add(yt);
        JLabel zl = new JLabel("Z");
        this.zt = new JTextField();
        zl.setBounds(50, 150, 50, 50);
        this.zt.setBounds(100, 150, 50, 50);
        this.frame.add(zl);
        this.frame.add(zt);
        if(counter == this.n - 1) {
            this.get = new JButton("Get");
            get.addActionListener(this);
            this.get.setBounds(200, 250, 100, 100);
            this.frame.add(this.get);
        } else {
            this.next = new JButton("Next");
            next.addActionListener(this);
            this.next.setBounds(200, 250, 100, 100);
            this.frame.add(this.next);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.calculate) {
            this.n = Integer.parseInt(this.num.getText());
            this.main.setN(n);
            this.frame.getContentPane().removeAll();
            this.frame.repaint();
            counter = 0;
            getXYZ();
        }
        if (e.getSource() == this.next) {
            this.x.add(Integer.parseInt(this.xt.getText()));
            this.y.add(Integer.parseInt(this.yt.getText()));
            this.z.add(Integer.parseInt(this.zt.getText()));
            counter++;
            this.frame.getContentPane().removeAll();
            this.frame.repaint();
            getXYZ();
        }
        if (e.getSource() == this.get) {
            this.x.add(Integer.parseInt(this.xt.getText()));
            this.y.add(Integer.parseInt(this.yt.getText()));
            this.z.add(Integer.parseInt(this.zt.getText()));
            this.frame.getContentPane().removeAll();
            this.frame.repaint();
            main.setX(x);
            main.setY(y);
            main.setZ(z);
            JLabel des = new JLabel("Two points representing the rectangle");
            des.setBounds(175, 50, 250, 30);
            this.frame.add(des);
            JLabel first = new JLabel("(" + main.getMinX() + ", " + main.getMinY() + ", " + main.getMinZ() + ")");
            first.setBounds(250, 100, 200, 30);
            JLabel second = new JLabel("(" + main.getMaxX() + ", " + main.getMaxY() + ", " + main.getMaxZ() + ")");
            second.setBounds(250, 150, 200, 30);
            this.frame.add(first);
            this.frame.add(second);
        }
    }
}

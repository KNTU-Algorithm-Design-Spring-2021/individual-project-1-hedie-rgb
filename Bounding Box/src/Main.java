import java.util.ArrayList;

public class Main {
    private int n = 0;
    private ArrayList<Integer> x = new ArrayList<>();
    private ArrayList<Integer> y = new ArrayList<>();
    private ArrayList<Integer> z = new ArrayList<>();

    public void setN(int n) {
        this.n = n;
    }

    public void setX(ArrayList<Integer> x) {
        this.x = x;
    }

    public void setY(ArrayList<Integer> y) {
        this.y = y;
    }

    public void setZ(ArrayList<Integer> z) {
        this.z = z;
    }

    public int getMinX() {
        return DivideAndConquer.findMin(x, 0, n);
    }

    public int getMaxX() {
        return DivideAndConquer.findMax(x, 0, n);
    }

    public int getMinY() {
        return DivideAndConquer.findMin(y, 0, n);
    }

    public int getMaxY(){
        return DivideAndConquer.findMax(y, 0, n);
    }

    public int getMinZ() {
        return DivideAndConquer.findMin(z, 0, n);
    }

    public int getMaxZ() {
        return DivideAndConquer.findMax(z, 0, n);
    }
}

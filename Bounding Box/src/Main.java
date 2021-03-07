import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number of points: ");
        int n = sc.nextInt();
        ArrayList<Integer> x = new ArrayList<>(n);
        ArrayList<Integer> y = new ArrayList<>(n);
        ArrayList<Integer> z = new ArrayList<>(n);
        for (int i = 0 ; i < n ; i++) {
            System.out.println("Point " + i);
            System.out.print("x = ");
            int xOfPoint = sc.nextInt();
            x.add(xOfPoint);
            System.out.print("y = ");
            int yOfPoint = sc.nextInt();
            y.add(yOfPoint);
            System.out.print("z = ");
            int zOfPoint = sc.nextInt();
            z.add(zOfPoint);
        }
        int xMin = DivideAndConquer.findMin(x, 0, n);
        int yMin = DivideAndConquer.findMin(y, 0, n);
        int zMin = DivideAndConquer.findMin(z, 0, n);
        int xMax = DivideAndConquer.findMax(x, 0, n);
        int yMax = DivideAndConquer.findMax(y, 0, n);
        int zMax = DivideAndConquer.findMax(z, 0, n);
        System.out.println("(" + xMin + ", " + yMin + ", " + zMin + ")");
        System.out.print("(" + xMax + ", " + yMax + ", " + zMax + ")");
    }
}

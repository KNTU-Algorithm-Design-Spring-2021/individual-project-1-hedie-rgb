import java.util.ArrayList;

public class DivideAndConquer {

    public static int findMax(ArrayList<Integer> a, int index, int l) {
        int max;

        if (index >= l - 2)
        {
            if (a.get(index) > a.get(index + 1))
                return a.get(index);
            else
                return a.get(index + 1);
        }

        max = findMax(a, index + 1, l);

        if (a.get(index) > max)
            return a.get(index);
        else
            return max;
    }

    public static int findMin(ArrayList<Integer> a, int index, int l) {
        int min;
        if (index >= l - 2)
        {
            if (a.get(index) < a.get(index + 1))
                return a.get(index);
            else
                return a.get(index + 1);
        }

        min = findMin(a, index + 1, l);

        if (a.get(index) < min)
            return a.get(index);
        else
            return min;
    }
}

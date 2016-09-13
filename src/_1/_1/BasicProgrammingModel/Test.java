package _1._1.BasicProgrammingModel;

/**
 * Created by irving.lopez on 05/09/16.
 *
 */
public class Test {

    public static void main(String[] args) {

        System.out.println('b' + 'c');
        int xC = 3;
        int [] arrayC = {1,2,3};
        System.out.println("xC before: " + xC);
        System.out.print("arrayC before: ");
        printIntArray(arrayC);
        passedByValue(xC, arrayC);
        System.out.println("xC after: " + xC);
        System.out.print("arrayC after: ");
        printIntArray(arrayC);
    }

    private static void passedByValue(int x, int[] array) {
        x = -3;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i]*array[i];
        }
        for (int e : array) {
            e = e*e;
        }
        System.out.println("xC in: " + x);
        System.out.print("arrayC in: ");
        printIntArray(array);
    }

    private static void printIntArray(int[] array) {
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();

    }

}

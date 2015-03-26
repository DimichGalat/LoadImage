/**
 * Created by DIMA on 26.03.2015.
 * in project LoadImage
 */
public class LoadImageTest {
    private static int[][] testData = {
        {0, 0},
    };

    public static void main(String[] args) {
        for (int[] val : testData ) {
            test(val[0], val[1]);
        }
    }

    public static void test(int a, int b) {
        System.out.println("a=" + a + "\nb=" + b);
        System.out.println( assertEquals(0, LoadImg.calcLogic(a, b)) );
    }

    public static String assertEquals(int expect, int have) {
        return expect == have ? "passed" : "failed";
    }
}

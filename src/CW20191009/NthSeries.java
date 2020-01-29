package CW20191009;

import java.util.Locale;

public class NthSeries {
    public static String seriesSum(int n) {
        double sum =1;
        int div =1;
        for (int i = 1; i < n; i++) {
            div=div+3;
            sum=sum+1.0/div;
        }
        return String.format( "%.2f", sum);
    }

    public static void main(String[] args) {
        System.out.println(seriesSum(3));
    }

}

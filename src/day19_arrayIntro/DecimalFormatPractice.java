package day19_arrayIntro;

import java.text.DecimalFormat;

public class DecimalFormatPractice {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.000");

        double n1 = 10.587543;

        System.out.println(  df.format(n1)  );

    }
}

package week09Office;

import java.util.Arrays;

public class ThreeWaysToWin {



        public static void main(String[] args) {

            // assume the number can only go to 9

            String request = "img2;div2;button3;ul1";
            String[] eachPart = request.split(";");
            System.out.println(Arrays.toString(eachPart));
            String html = "";

            for(String each : eachPart){

                String tag = each.substring(0, each.length() - 1);
                int num = Integer.parseInt(each.replace(tag, "")); // each.substring(each.length()-1)
                String fullTag = "<" + tag + "> </" + tag + ">\n";

                html += fullTag.repeat(num);
            /*
                instead of repeat method
                for(int i = 0; i < num; i++){
                    html += fullTag;
                }
             */

            }

            System.out.println(html);

        }

}
/*
            3 ways to win
            same characters (x or o)
                in a row
                in a colm
                in a diagonal
             for - each 1d array
              row: check each array board[i]
              colm:
                    [0][0] [1][0] [2][0]
                    [0][1] [1][1] [2][1]
              dig : hard code maybe
         */
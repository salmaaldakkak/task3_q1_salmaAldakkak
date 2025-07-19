import java.util.Arrays;
import java.util.Scanner;

public class q1 {
    public  static void main (String[]args){

        int[] scores = {85, 92, 78, 96, 88};

        // 1. Find the max score:

        // I found a direct way to determine the max element, reference:https://stackoverflow.com/questions/45410849/min-value-array-of-int-with-streams

        int maxValue = Arrays.stream(scores).max().getAsInt();
        System.out.println("max score = "+ maxValue);

        // another way using for loop

       int InitMax= scores[0]; // نفترض ان اول عنصر هو الاكبر

        for (int i =0; i < scores.length; i++){

            if (scores[i] > InitMax){ // لو العنصر الي index i طلع اكبر من قيمة العنصر الي افترضنا انه الاكبر
                InitMax = scores[i]; // نخليه قيمته هي الاكبر وهكذا لحد ما نوصل لاكبر عنصر
            }

        }
        System.out.println("max score = "+InitMax);


        // 2. Calculate and print the SUM and the AVG of all scores

       int sum =0;
         for (int i =1; i< scores.length; i++){ // 85+92, 117 -- 117+78 =195/// 195+96=291//291+88=379
             sum = sum + scores[i];

         }
        System.out.println("SUM of all scores= "+sum);
        System.out.println("AVG of all scores= "+(sum/ scores.length));



        // 3. Search fo a spc value (e.g.92) and display its index:
        // 4.display message if value is not found

        Scanner searchValue = new Scanner(System.in);
        System.out.print("Enter the value you want to find: ");
        int value = searchValue.nextInt();
        boolean existed = false;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == value) {
                System.out.println("Value " + value+ " is existed at index: " + i + " :)");
                existed = true;
                break; // ashan lmma nla2eeh
            }
        }
        if (!existed) {
            System.out.println("Value " + value+ " is not found :( ");
        }




        }
    }


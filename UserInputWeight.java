//package RachitSirCoding;
//
//import java.util.Scanner;
//
//public class UserInputWeight {
//    public static void main(String[] args) {
//        int[] weightsArray={1, 2, 5, 10, 20, 50, 100, 500, 1000};
//        Scanner kb=new Scanner(System.in);
//        System.out.println("Enter wight ");
//        int weight=kb.nextInt();
//        int count=0;
//        while (weight>0) {
//            if (weight >= weightsArray[0] && weight <= weightsArray[1]) {
//                weight = weight % weightsArray[0];
//                count++;
//            } else if (weight >= weightsArray[1] && weight <= weightsArray[2]) {
//                weight = weight % weightsArray[1];
//                count++;
//            } else if (weight >= weightsArray[2] && weight <= weightsArray[3]) {
//                weight = weight % weightsArray[2];
//                count++;
//            } else if (weight >= weightsArray[3] && weight <= weightsArray[4]) {
//                weight = weight % weightsArray[3];
//                count++;
//            } else if (weight >= weightsArray[4] && weight <= weightsArray[5]) {
//                weight = weight % weightsArray[4];
//                count++;
//            } else if (weight >= weightsArray[5] && weight <= weightsArray[6]) {
//                weight = weight % weightsArray[5];
//                count++;
//            } else if (weight >= weightsArray[6] && weight <= weightsArray[7]) {
//                weight = weight % weightsArray[6];
//                count++;
//            } else if (weight >= weightsArray[7] && weight <= weightsArray[8]) {
//                weight = weight % weightsArray[7];
//                count++;
//            } else if (weight >= weightsArray[8]) {
//                weight = weight % weightsArray[8];
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}

package RachitSirCoding;

import java.util.Scanner;

public class UserInputWeight {
    public static void main(String[] args) {
        int[] weightsArray = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter weight: ");
        int weight = kb.nextInt();
        int count = 0;

        // Iterate through the weightsArray in reverse order
        for (int i = weightsArray.length - 1; i >= 0; i--) {
            // Calculate how many weights of the current denomination are needed
            int weightsNeeded = weight / weightsArray[i];
            // Add the count of weights needed to the total count
            count += weightsNeeded;
            // Reduce the weight by subtracting the total weight of the weights used
            weight -= weightsNeeded * weightsArray[i];
        }

        System.out.println("Minimum number of weights required: " + count);
    }
}


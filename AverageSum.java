import java.util.Arrays;
import java.util.Scanner;


public class AverageSum
{
        public static void main(String[] args) {
                String numb1, numb2, numb3, numb4,numb5;
                int med, middle;
                Double num1, num2, num3, num4, num5, sum, average, max1, min;
                int int1, int2, int3, int4, int5;


                System.out.println("Welcome!");
                System.out.println("Please input five numbers "); //prompt user to input number
                Scanner keyboard = new Scanner(System.in);
                numb1 = keyboard.next();//input1
                numb2 = keyboard.next();//input2
                numb3 = keyboard.next();//input3
                numb4 = keyboard.next();//input4
                numb5 = keyboard.next();//input5

                num1 = Double.parseDouble(numb1); //double value
                int1 = num1.intValue(); //change from double to integer for sorting
                num2 = Double.parseDouble(numb2);
                int2 = num2.intValue();
                num3 = Double.parseDouble(numb3);
                int3 = num3.intValue();
                num4 = Double.parseDouble(numb4);
                int4 = num4.intValue();
                num5 = Double.parseDouble(numb5);
                int5 = num5.intValue(); //

                sum = num1+num2+num3+num4+num5; //find the sum
                System.out.println("The sum of the five numbers is " + sum); //display the sum

                average = (num1+num2+num3+num4+num5)/5; //find the average
                System.out.println("The average of the five number is " + average); // display the avarage

                max1 = Math.max(Math.max(num3, Math.max(num1, num4)), Math.max(num2, num5)); //find the max
                System.out.println("The maximum of the five number is " + max1); //display the max

                min = Math.min(Math.min(num1, Math.min(num2, num3)), Math.min(num4, num5)); //find the min
                System.out.println("The minimum of the five number is " + min); //Display the min

                int set[] = {int1, int2, int3, int4, int5};//setup the set
                Arrays.sort(set); //reorder it
                middle = set.length/2;//find the middle number
                med = set[middle + 0];//find the median
                System.out.println("The median of the five number is " + med); //diplay the median




        }

}
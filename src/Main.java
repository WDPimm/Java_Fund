import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Account bobsAccount = new Account("123", 1, "Bob", "bob.gov");
        bobsAccount.deposit(35000.0);
        bobsAccount.withdrawal(5);
        Account billsAccount = new Account("124", 2000, "bill", "william@yahoo.com");

        Vip bill = new Vip("bill", 15000, "bill@yahoo");

        Vip ben = new Vip("Ben", "ben@gmail");

        ShareHolder don = new ShareHolder("don", 1, "don");

        ShareHolder.ViewHoldings("bob2"); // static method must instantiate class first

        int[] myArray = new int[10];
        int[] otherArray = {1, 7, 3, 4, 5}; //five indexes with the value placed in index
        int[] forArray = new int[10];
        int[] userDigits = getDigits(10);
        myArray[5] = 10;
        myArray[6] = 11;
        System.out.println(myArray[5] * myArray[6]);
        //why not a few loops?
        for (int i = 0; i < 10; i++) {  //potential array index OB error
            forArray[i] = i * 10;
        }
        for (int i = 0; i < forArray.length; i++) { // better format with no hard coded value
            System.out.println("index: " + i + ". The value it holds is: " + forArray[i]);
        }
        for (int i = 0; i < userDigits.length; i++) { // better format with no hard coded value
            System.out.println("index: " + i + ". The value it holds is: " + userDigits[i]);
        }
        System.out.println("Complete array: " + Arrays.toString(userDigits)); // neatly print the array as a string
        scanner.close();


        // Auto unboxing/boxing
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        //for fizzbuzz pushed to an array
        ArrayList<String> strArrayList = new ArrayList<String>();
        for (int i=0; i<30; i++){
            if (i % 3 == 0 && i % 5 == 0){
                strArrayList.add("Fizzbuzz");
            } else if (i % 3 == 0) {
                strArrayList.add("Fizz");
            } else if (i % 5 == 0) {
                strArrayList.add("Buzz");
            } else{
                strArrayList.add(String.valueOf(i));
            }
            System.out.println( i + ": " + strArrayList.get(i));
        }


        //Integer integer = new Integer(1);

        for(int i =0; i< 10; i++){
            intArrayList.add(Integer.valueOf(i));
        }

        for(int i =0; i< 10; i++){
            System.out.println(i + "holds the value: " + intArrayList.get(i).intValue());
        }

        Integer myValue = 5;
        int myInt = myValue;

       // intArrayList.add(new IntClass(54).getMyValue()); // could create class instead use autoboxing


    }

    private static int[] getDigits(int num) { // user input array is to be populated!
        System.out.println("Enter " + num + " digits.\r");
        int values[] = new int[num];

        for (int i=0; i< values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;

    }

}

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
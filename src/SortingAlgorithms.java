import java.util.Scanner;
public class SortingAlgorithms {
    int[] intArray;
    Scanner scoon = new Scanner(System.in);

    public SortingAlgorithms(){
        System.out.println("How long is your random array?");
        int arrayLength = scoon.nextInt();
        System.out.println("Manuel(1) entry or random(2) entry?");
        int manOrRan = scoon.nextInt();
        if (manOrRan == 1){
            this.intArray = manuelInput(arrayLength);
        } else if (manOrRan == 2) {
            this.intArray = randomInput(arrayLength);
        }else {
            System.out.println("Incorrect input.");
            System.exit(0);
        }
        System.out.println("Your Array:");
        printArray(intArray);
        System.out.println("--------------------------------");
        int[] sortedArray = selectionSort(intArray);
        System.out.println("Sorted Array:");
        printArray(sortedArray);
    }

    public int[] manuelInput(int L){
        int[] manIn = new int[L];
        for(int i = 0; i < L; i++){
            manIn[i] = scoon.nextInt();
        }

        return manIn;
    }

    public int[] randomInput(int L){
        int[] ranIn = new int[L];
        for(int i = 0; i < L; i++){
            ranIn[i] =  (int)(Math.random()*(101-0+1)+0);
        }

        return ranIn;
    }
    public int[] selectionSort(int[] array){
        int[] sortedArray = new int[array.length];
        int low;


        for(int i = 0; i < array.length; i++){

            low = array[0];
            int d = 0;
            for(int a = 0; a < array.length; a++){

                if(low > array[a]){
                    low = array[a];
                    d = a;
                }
            }

                sortedArray[i] = low;
            array[d] = 102;
        }


        return sortedArray;
    }

    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }


    public static void main(String[] args) {
        new SortingAlgorithms();



    }


}

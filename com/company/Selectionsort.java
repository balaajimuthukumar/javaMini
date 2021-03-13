package com.company;

public class Selectionsort {
    private Selectionsort(){
    }
    public static void Sort(int[] myArray){
        int n = myArray.length;
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(myArray[minIndex]>myArray[j])
                    minIndex = j;
            }
            int temp = myArray[minIndex];
            myArray[minIndex] = myArray[i];
            myArray[i] = temp;
        }
    }
    public static void printArray(int[] myArray){
        for(int a:myArray){
            System.out.print(a+" ");
        }
    }
}

package ru.geekbrains.homework2;

public class Arrays {

    public static void moveArray(int[] arr, int value) {

        int[] temp = arr;
        int j = 0;

        while(value >= arr.length)
        {
            value = value - arr.length;
        }
        for(int i = 0; i < arr.length; i++)
        {
            if(arr.length - value + i >= arr.length)
            {
                temp[i] = arr[j];
                j = j + 1;
            }
            else
            {
                temp[i] = arr[arr.length - value + i];
            }
        }
        System.out.print("The shifted array is: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(temp[i]+" ");
        }
        System.out.println();

        }


    public static void main(String[] args) {

    }
}

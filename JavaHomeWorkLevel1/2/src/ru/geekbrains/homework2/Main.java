package ru.geekbrains.homework2;

public class Main {
    //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
    public static void change01()
    {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = arr[i] == 1 ? 0 : 1;
            System.out.print(arr[i] + " ");
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
   // 2 Задать пустой целочисленный массив размером 8. Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
   static void createArray() {
       int[] arr = new int[8];
       int step =3;
       int move=1;
       for (int i = 0; i<arr.length; i++) {
           arr[i] = move + i*step;
           System.out.print(arr[i] + " ");
       }
   }
   //3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
   public static void modifyArray(int[] array){
       for(int i = 0; i < array.length; i++){
           if(array[i] < 6){
               System.out.println(array[i] *= 2);//array[i] *= 2;
           }
       }

   }

   //4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
   public static int minElArray(int[] array){
       int min = array[0];
       for(int i = 0; i < array.length; i++){
           if (min > array[i])
               min = array[i];
       }
       return min;
   }
    public static int maxElArray(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if (max < array[i])
                max = array[i];
        }
        return max;
    }
    //5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое), заполнить его диагональные элементы единицами, используя цикл(ы);
    public static void squareArray(int size){
        int[][] sqrArray = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                sqrArray[i][j] = (i == j || j == (size - i - 1))? 1 : (int)(Math.random()*100);
                System.out.printf("%4d", sqrArray[i][j]);
            }
            System.out.println();
        }
    }
   // 6 ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 1, 2, 3, 4]) → true. Абстрактная граница показана символами ||, эти символы в массив не входят.
   public static boolean checkbalance(int[] array){
       int leftSum = 0;
       for(int i = 0; i < array.length; i++){
           leftSum += array[i];
           int rightSum = 0;
           for (int j = 0; j < array.length; j++){
               rightSum += (j > i)? array[j] : 0;
           }
           if(leftSum == rightSum){
               return true;
           }
       }
       return false;
   }
   //7  Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен циклически сместить все элементы массива на n позиций.
   static void moveElOfArray(int[] arr, int n){
       for (int i : arr) {
           System.out.print(i + "\n ");
       }
       if (n > 0) {
           for (int i = 0; i < n; i++) {
               // сдвиг вправо
               int tmp = arr[arr.length - 1];
               for (int j = arr.length - 1; j > 0; j--) {
                   arr[j] = arr[j - 1];
               }
               arr[0] = tmp;
           }
       } else if (n < 0) {
           for (int i = 0; i < n * (-1); i++) {
               // сдвиг влево
               int tmp = arr[0];
               for (int j = 0; j < arr.length - 1; j++) {
                   arr[j] = arr[j + 1];
               }
               arr[arr.length - 1] = tmp;
           }
       }
       for (int i : arr) {
           System.out.print(i + " ");
       }
   }
    public static void main(String[] args)
    {
        //1
      // change01();
      //2
       // createArray();
      //3
       // int[] arrayNumbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
      //  modifyArray(arrayNumbers);
      //4
        int[] minMaxArray = {1590, 6, 8, 13, 80, 74, 21, 22, 7, 0, 59, 1, 2524};
        System.out.println(minElArray(minMaxArray));
        System.out.println(maxElArray(minMaxArray));
      //5
        squareArray(5);

       //6
        int[] array = {1,2,2,2,2,1};
        System.out.println(checkbalance(array));

        //7
        int[]arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        moveElOfArray(arr,3);
    }








}

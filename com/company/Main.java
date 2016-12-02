package com.company;

public class Main {

    public static void main(String[] args) {
       //1 задание
        int[] arr = {203,3,50,19,39,45,10,10};
        System.out.println(withdrawTheArithmeticMeanOfTheArray(arr, 10));
        System.out.println(withdrawTheArithmeticMeanOfTheArray2(arr, 10));
        //2 задание
        int m=8;
        System.out.println(withdrawTheArithmeticMeanOfTheArray(arr,m));
        System.out.println(withdrawTheArithmeticMeanOfTheArray2(arr,m));
        //Задание 3
        int[] arrNums = {1,1,2,2,2,3,3,3,3,5,5,9,9,9,10,16,16,18,18,20};
        thirdTask(arrNums);

        //Задание 4
        int[] arrSpeeds = {110,120,130,140,90,220,245,165};
        fourthTask(arrSpeeds);

        //Задание 5
        int[] number = {3, 1, 6, 4, 8, 3, 5, 1, 9, 4, 0, 2, 4, 1, 3, 2, 1, 100, 400};
       fiftyTask(number);

        //Задание 6
        double[] dl = {3.2,-9.6,-8.7,};
        System.out.println("Количество первых отрицательных чисел в массиве - " + returnNumOfNegativeNumsInArray(dl));

        //Задание 7
        sevenTask(1234355);


        //Задание 9
        System.out.println(returnStringValueofNumber(45));



    }

    private static double   withdrawTheArithmeticMeanOfTheArray(int[] arr, int chislo) {
        int i = 0;
        int j = 0;
        int sum = 0;
        while (i < arr.length) {
            if (arr[i] > chislo) {
                sum += arr[i];
                j++;
            }
            i++;
        }
        return (double) sum / j;
    }

    private static double  withdrawTheArithmeticMeanOfTheArray2(int[] arr, int chislo) {
        int sum = 0;
        int j = 0;
        for (int a : arr) {
            if (a > chislo) {
                sum += a;
                j++;
            }
        }
        return (double) sum / j;
    }
    // 2 задание
    private static double   withdrawTheArithmeticMeanOfTheArraySecondTask(int[] arr, int lessthanthenumberm) {
        int i = 0;
        int j = 0;
        int sum = 0;
        while (i < arr.length) {
            if (arr[i] <lessthanthenumberm) {
                sum += arr[i];
                j++;
            }
            i++;
        }
        return (double) sum / j;
    }

    private static double  withdrawTheArithmeticMeanOfTheArraySecondTask2(int[] arr, int lessthanthenumberm ) {
        int sum = 0;
        int j = 0;
        for (int a : arr) {
            if (a <lessthanthenumberm) {
                sum += a;
                j++;
            }
        }
        return (double) sum / j;
    }
    //3 задание
    public static void thirdTask(int[] arr) {
        int i = 0;
        int j = 0;
        if (arr.length > 0) {
            i = arr[0];
        }
        for (int a : arr) {
            if (i == a) {
                j++;
            } else if (j > 1) {
                System.out.printf(" %d в массиве - %d шт", i,j);
                System.out.println();
                j = 1;
                i = a;
            } else {
                i = a;
                j = 1;
            }
        }
        if (j > 1) {
            System.out.printf(" %d в массиве - %d шт", i, j);

        }
    }

    //4 задание
    public static void fourthTask(int[] arr) {
        int max1 = 0;
        int max2 = 0;
        for (int a : arr) {
            if (max1 < a) {
                max2 = max1;
                max1 = a;
            } else if (max2 < a) {
                max2 = a;
            }
        }
        System.out.println("1 место - " + max1);
        System.out.println("2 место -" +max2);
    }

    //5 задание
    public static void fiftyTask(int[] arr) {
        int sum = 0;
        int k = 0;
        for (int a : arr) {
            if (a == 0) {
                break;
            }
            sum += a;
            k++;
        }
        System.out.println("Сумма  последовательности: " + sum);
        System.out.println("Количество чисел : " + k);
    }

    //6. задание
    public static int returnNumOfNegativeNumsInArray(double[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            k = (arr[i] >= 0) ? k : ++k;
            i = (arr[i] >= 0) ? arr.length : i;
        }
        return k;
    }

    //7 задание
    public static void sevenTask(int num) {
        boolean fl = true;
        int k = 0;
        int i = 0;
        while (fl) {
            if(k<num%10){
                k=num%10;
                i=1;
            }else if(k==num%10){
                i++;
            }
            num = (int) num / 10;
            if (num==0) {fl=false;}
        }
        System.out.printf("Цифра %d встречается в заданном числе %d раз",k,i);
        System.out.println();
    }



    //9 задание
    public static String returnStringValueofNumber(int num){
        String result="";
        int k=num%10;
        switch (k){
            case 1: result="one";break;
            case 2: result="two";break;
            case 3: result="three";break;
            case 4: result="four";break;
            case 5: result="five";break;
            case 6: result="six";break;
            case 7: result="seven";break;
            case 8: result="eight";break;
            case 9: result="nine";break;
        }
        k=(int)num/10;
        switch (k){
            case 2: result="twenty "+result;break;
            case 3: result="thirty "+result;break;
            case 4: result="forty "+result;break;
            case 5: result="fifty "+result;break;
            case 6: result="sisty "+result;break;
            case 7: result="seventy "+result;break;
            case 8: result="eighty "+result;break;
            case 9: result="ninety "+result;break;
        }
        if (num>10 && num<20){
            switch (num){
                case 11:result="eleven";break;
                case 12:result="twelve";break;
                case 13:result="thirteen";break;
                case 14:result="fourteen";break;
                case 15:result="fifteen";break;
                case 16:result="sixteen";break;
                case 17:result="seventeen";break;
                case 18:result="eighteen";break;
                case 19:result="nineteen";break;
            }
        }

        return result;
    }



}
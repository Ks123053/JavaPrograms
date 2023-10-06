package org.example;

public class Main {
    public static void main(String[] args)
    {
        int arr[] = {10,4,6,43,32,452,4};
        int temp=0;
        for(int i =0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }

            }
        }
        System.out.println("sorted array");
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        }
    }

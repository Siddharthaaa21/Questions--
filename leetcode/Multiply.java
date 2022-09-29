// to multiply the array 'rest' array and print the result in an array

import java.util.Arrays;
import java.util.Scanner;

import static java.sql.Types.NULL;

public class Multiply {
    public static void main (String args[]){

        int arr[]={1,2,3,4};
        Multiply ob=new Multiply();
        ob.multi(arr);



    }
    void multi(int arr[]){
        int mid =arr.length/2;
        int mix[]=new int [arr.length];
        int left[]=Arrays.copyOfRange(arr,0,mid);

        int right[]=Arrays.copyOfRange(arr,mid+1,arr.length);
        int i;
        for (i=0;i<arr.length;i++){
            if (left[i]!=NULL){
            mix[i] = left[i - 1] * arr[i-1];
        }}
            for ( i=0;i<arr.length;i++){
                if (right[i]!=NULL){
                    mix[i] = right[i - 1] * arr[i-1];

    }}int j=0;
                for ( i=0,j=arr.length;i<arr.length;i++,j--) {
                    mix[i]=left[i] * right[j];
                }
                System.out.println(Arrays.toString(mix));


}}

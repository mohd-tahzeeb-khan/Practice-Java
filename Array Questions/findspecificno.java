//Write a Java program to check if an array of integers contains two specified elements 65 and 77. w3resouce.com
public class findspecificno {
    public static void main(String args[]){
    int value1, value2;
    value1=65; value2=77;
    int arr[]={66,45,90,77,45,65,56,77,47,34};
    for(int i=0; i<10; i++)
    {
     if(arr[i]==value1){
        System.out.println("Found no 65 at position: "+i);
     }  
     if(arr[i]==value2){
        System.out.println("Found no 77 at position: "+i);
     } 
    }
}}

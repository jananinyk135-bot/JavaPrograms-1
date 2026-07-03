import java.util.*;
class arr{
public static void main(String[] args){
int arr1[] ={1,2,3,4,5};
int arr2[] = new int[5];
System.out.println(Arrays.toString(arr1));
System.out.println(Arrays.toString(arr2));
System.out.println(arr1[0]+" "+arr1[arr1.length-1]+" "+arr1[arr1.length/2]);
for(int i:arr1){
System.out.print(i);
}
System.out.println();
for(int i=0;i<arr1.length;i++){
System.out.print(arr1[i]);
}
arr1[3]=15;
for(int j:arr1){
System.out.print(j);
}
Arrays.sort(arr1);
//Arrays.copyOf(arr,new arr length);
//Arrays.CopyOfRange(arr,start,end);
//Arrays.fill(arr,whole array fill this value);
//Arrays.equals(to check arrays values not address);
//Arrays.binarySearch(arr,value to be searched and index will be returned);
}}

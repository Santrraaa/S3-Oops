import java.util.Scanner;
class UnsortedArray{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("enter the size of array: ");
int n=sc.nextInt();
int arr[]= new int[n]; 
System.out.println("enter elements of array:");
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
for(int i=0;i<n-1;i++){
for(int j=0;j<n-i-1;j++){
if(arr[j]>=arr[j+1]){
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;}}}
System.out.println("the sorted Array is:");
for(int i=0;i<n;i++){
System.out.println(arr[i]);}
System.out.println("the smallest element ="+arr[0]);
System.out.println("the largest element ="+arr[n-1]);
}}
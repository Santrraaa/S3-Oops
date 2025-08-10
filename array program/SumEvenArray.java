import java.util.Scanner;
class SumEvenArray{
public static void main(String args[]){
Scanner sc= new Scanner (System.in);
System.out.println("enter the size of array: ");
int n=sc.nextInt();
int arr[]= new int[n];
int even=0;
System.out.println("enter the elements of array: ");
for (int i=0;i<n;i++)
arr[i]=sc.nextInt();
for (int i=0;i<n;i++){
if(arr[i]%2==0)
even+=arr[i];}
System.out.println("sum of all even numbers in the array ="+even);
}}

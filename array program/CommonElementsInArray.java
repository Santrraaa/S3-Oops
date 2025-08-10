import java.util.Scanner;
class CommonElementsInArray{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int i,j;
System.out.println("enter the size of 1st array: ");
int num1=sc.nextInt();
int arr_1[]= new int[num1];
System.out.println("enter elements of 1st array:");
for(i=0;i<num1;i++)
arr_1[i]=sc.nextInt();
System.out.println("enter the size of 2nd array: ");
int num2=sc.nextInt();
int arr_2[]= new int[num2];
System.out.println("enter elements of 2nd array:");
for(i=0;i<num1;i++)
arr_2[i]=sc.nextInt();
System.out.println("the common elements in the array are:");
for(i=0;i<num1;i++){
for(j=0;j<num2;j++){
if(arr_1[i]==arr_2[j])
System.out.println(arr_1[i]);}}
}}

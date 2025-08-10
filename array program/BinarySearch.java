import java.util.Scanner;
class BinarySearch{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int i,j,flag=0;
System.out.println("enter the size of array: ");
int n=sc.nextInt();
int arr[]= new int[n];
System.out.println("enter elements of array:");
for(i=0;i<n;i++)
arr[i]=sc.nextInt();
for(i=0;i<n-1;i++){
for(j=0;j<n-i-1;j++){
if(arr[j]>=arr[j+1]){
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;}}}
System.out.println("the sorted Array is:");
for(i=0;i<n;i++){
System.out.println(arr[i]);}
int mid,l=0,u= n-1;
System.out.println("enter the element to be searched :");
int key= sc.nextInt();
while(l<=u){
	mid=(l+u)/2;
	if(key==arr[mid]){
		System.out.println("element found at position "+mid);
		flag=1;
	}
	if(key<=arr[mid]){
		u=mid-1;
	}
	else{
		l=mid+1;
	}
}
if(flag==0)
	System.out.println("element not found- Unsuccessful");
}}


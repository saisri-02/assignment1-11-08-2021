import java.util.*;
class Selectionsortdes
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size : ");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter array elements : ");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Before sorting : ");
show(a);
selection(a,n);
System.out.println();
System.out.println("After sorting : ");
show(a);
}
static void selection(int a[],int n)
{
int min;
for(int i=0;i<n-1;i++)
{
min=i;
for(int j=i+1;j<n;j++)
{
if(a[j]>a[min])
{
min=j;
}
}
if(min!=i)
{
int t=a[i];
a[i]=a[min];
a[min]=t;
}
}
}
static void show(int a[])
{
for(int i:a)
System.out.print(i+" ");
}
}

output:

Enter array size : 
8
Enter array elements : 
45 8 14 1 52 16 2 10
Before sorting : 
45 8 14 1 52 16 2 10 
After sorting : 
52 45 16 14 10 8 2 1 

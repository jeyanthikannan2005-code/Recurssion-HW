import java.util.Scanner;
class Binary1
{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		Binary1 n=new Binary1();
		n.input();
	}
	void input()
	{
		System.out.print("Enter the size of an array :");
		int size=sc.nextInt();
		int ar[]=new int[size];
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("Enter the "+(i+1)+" element :");
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length-i-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		System.out.println("Array after Sorted");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		int left=0;
		int right=ar.length-1;
		System.out.print("Enter the key value of an array :");
		int key=sc.nextInt();
		int a=binary(ar,left,right,key);
		System.out.println("The index value for "+key+" is "+a);
	}
	int binary(int arr[],int left,int right,int key)
	{
		if(left>right)
		{
			return -1;
		}
		int mid=(left+right)/2;
		if(arr[mid]==key)
		{
			return mid;
		}
		if(arr[mid]>key)
		{
			return binary(arr,left,mid-1,key);
		}
		
		return binary(arr,mid+1,right,key);
	}
}
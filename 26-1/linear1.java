import java.util.Scanner;
class linear1
{
	Scanner sc=new Scanner(System.in);
	public static void main()
	{
		linear1 n=new linear1();
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
		System.out.print("Enter the key in an array :");
		int key=sc.nextInt();
		int index=0;
		int a=linear(ar,index,key);
		System.out.println("The index value for "+key+" is "+a);
	}
	int linear(int arr[],int index,int key)
	{
		if(index>=arr.length)
		{
			return -1;
		}
		if(arr[index]==key)
		{
			return index;
		}
		return linear(arr,index+1,key);
	}
}
package ArrayConcepts;

public class ArrayCopyElements {

	public static void main(String[] args) {
		
		int a[]= {3,45,12,67};
		
		System.out.println("Elements of Original Array are");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)//i=0,0<4
		{
			b[i]=a[i];///b[0]=a[0]
			System.out.print(a[i]+" ");
			
		}
		
		System.out.println();
		
		
System.out.println("Elements of New  Array are");
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		
		
		
		

	}

}

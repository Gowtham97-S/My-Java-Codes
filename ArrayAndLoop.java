package Array;

public class ArrayAndLoop {
	
	public static void main (String []args) {
		int array[]= {5,8,7,6};
		 array[2]=10;
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	
	/*int a[]= {10, 12, 15,25,40 };
	
	//System.out.println(a[0]);
	
	//System.out.println(a[1]);
	
	for(int i=0; i<a.length;i++) {
		
	
						
			System.out.println(a[i]);
		
	}

  }*/System.out.println("-------");
	int arys[] = new int [3];
	arys[0]=20;
	arys[1]=30;
	arys[2]= 40;
	for (int j=0; j< arys.length ; j++ ) {//Array looping concepts
		
		  System.out.println(arys[j]);
	}
	
	}
}
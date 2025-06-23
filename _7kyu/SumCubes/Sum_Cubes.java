package _7kyu.SumCubes;

public class Sum_Cubes {

	public static void main(String[] args) {
		
		System.out.println(sumCubes(4L));
		System.out.println(sumCubes(7L));
		System.out.println(sumCubes(3L));
	}
	

	public static long sumCubes(long n)
	  {
	    //put your code her.
	    //Creation and initialization of variables.
	    long sumCubes = 0;
	    long i = 1;
	    
	    while( i <= n){
	      
	      sumCubes += i* i * i;
	      
	      i++;

	        }
	   return sumCubes; 
	  } 
}

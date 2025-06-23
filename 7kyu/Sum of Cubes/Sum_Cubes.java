//This is my first exercise in codewars.
//I change the name the class for that you can to compiler this code.
public class Sum_Cubes{
  public static void main(String[] args) {
        System.out.println(sumCubes(2L));//9
        System.out.println(sumCubes(3L));//36
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

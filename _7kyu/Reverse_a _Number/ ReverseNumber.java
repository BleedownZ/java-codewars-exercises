package _7kyu.Reverse_a_Number;

public class ReverseNumber {

	public static void main(String[] args) {
		
		System.out.println(reverse(-453));
		System.out.println(reverse(290423101));
		System.out.println(reverse(992342));
	}

	public static int reverse(int number) {
		//Creation and initialization of variables
    int reverseNumber = 0;
    int signo = 1;//save the sign of number
    //Convert to positive number to simplify modulo operations
    if (number < 0) {
     signo = -1;

    number = Math.abs(number);

    }
    while (number != 0) {
        int digito = number % 10;//get the last digit 
        reverseNumber = reverseNumber * 10 + digito;//Append the digit to the reversed number
        number = number / 10;// Remove the last digit from the number
        
    }
    return reverseNumber * signo;

	}
}

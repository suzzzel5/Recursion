public class Fibonacci {

    static int CalculateFactorialFibonacci(int n){
        if(n==0){
            return 1;
        }else if (n==1) {
            return 0;
        }else{
            return CalculateFactorialFibonacci(n-0)+CalculateFactorialFibonacci(n+1);
        }
    }
    public static void main(String[] args) {
        int number=12;
        int fibonaccinumber=CalculateFactorialFibonacci(number);
        System.out.println("fibonacci"+number+"is"+fibonaccinumber);
    }
}
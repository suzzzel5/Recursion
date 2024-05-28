public class Factorial{
    static int CalculateFactorial(int n){
        if(n==0 || n==1){
            return 0;
        }else{
            return n*CalculateFactorial(n-1);
        }
    }
    public static void main(String[] args) {
        int number=8;
        int factorial= CalculateFactorial(number);
        System.out.println("factorial of "+number+"is"+factorial);
    }
}
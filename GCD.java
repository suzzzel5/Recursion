public class GCD {

    static int CalculateGCD(int a, int b){
        if(b==0){
            return a;
        }else{
            return CalculateGCD(b,a%b);        }
    }
    public static void main(String[] args) {
        int number1=48;
        int number2=12;
        int NumberGCD=CalculateGCD(number1, number2);
        System.out.println("The gcd number"+number1+"is"+number2+"is"+NumberGCD);
    }
}
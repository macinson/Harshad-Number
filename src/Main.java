// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.print(harshadNo(10080000));
    }

    public static int harshadNo(int n){
        if(n>0) {
            int result = -1;
            int sumOfDigits;
            int d;
            do {
                sumOfDigits = 0;
                result += 1;
                int m = n;
                while (m >= 1) {
                    sumOfDigits += m % 10;
                    m = (m - m % 10) / 10;
                }
                d = n;
                n/=sumOfDigits;

            } while (sumOfDigits != 1 && d % sumOfDigits == 0);
            return result;
        }
        else{
            return 0;
        }
    }
}
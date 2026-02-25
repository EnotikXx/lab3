public class Main {
    public static void main (String[] args){
        int n = 456;

        int a = n / 100;
        int b = n / 10 % 10;
        int c = n % 10;

        int max = a;
        if (b>max){
            max=b;
        }
        if (c>max){
            max=c;
        }
        System.out.println(max);
    }
}
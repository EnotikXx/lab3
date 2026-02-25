public class Main {
    public static void main(String[] args){
        int a = 5;
        int b = 2;
        int c = 4;
        int temp;
        if (a>b){
            temp=a;
            a=b;
            b=temp;
        }
        if (b>c){
            temp=b;
            b=c;
            c=temp;
        }
        if (a>b){
            temp=a;
            a=b;
            b=temp;

        }
        System.out.println(a+","+b+","+c);
    }
}
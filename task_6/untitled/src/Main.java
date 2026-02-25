public class Main {
    public static void main(String[] args){
        int n = 9000; // max 28800

        int hours = n / 3600;

        if (hours>1){
            System.out.println(n+" секунда");
            System.out.println("До кінця робочого дня залишилося: "+hours+" години");
        }else {
            System.out.println(n+" секунда");
            System.out.println("До кінця робочого дня залишилося менше 1 години");
        }
    }
}
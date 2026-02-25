public class Main {
    public static void main(String[] args){
        int floor = 3;
        int new_floor = 3;
        if (floor < 1 || floor > 9 || new_floor < 1 || new_floor > 9) {
            System.out.println("Такого поверха не існує");
        }else{
            if (new_floor == 2) {
                System.out.println("Кнопка на 2 поверх тимчасово не справна");
                if (floor<2){
                    new_floor=3;
                }else if(floor>2){
                    new_floor=1;
                }
            }
            if (floor > new_floor) {
                System.out.println("Ви спустились на " + new_floor + " поверх");
            } else if (floor < new_floor) {
                System.out.println("Ви піднялись на " + new_floor + " поверх");
            } else {
                System.out.println("Ви вже на цьому поверсі");
            }
        }
    }
}
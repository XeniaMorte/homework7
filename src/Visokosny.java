public class Visokosny {
    public static void main(String[] args) {
        int year=100;
        if (year%100==0){
            System.out.println(" Год не високосный");
        }
        else if (year%4==0){
            System.out.println(" Год високосный");
        }
        else if (year%400==0){
            System.out.println(" Год високосный");
        }
        else {
            System.out.println("Не високосный");
        }
    }
}

public class Delivery {
    public static void main(String[] args) {
       int deliveryDistanse=9;
       int day=0;
       if (deliveryDistanse<=20){
           System.out.println(" Доставка займет "+" "+ (day+1)+" "+"день");
       }
       else if (deliveryDistanse>20&&deliveryDistanse<60){
           System.out.println(" Доставка займет "+" "+ (day+2)+" "+"дня");
       }
       else {
           System.out.println(" Доставка займет "+" "+ (day+3)+" "+"дня");
       }

       }
    }



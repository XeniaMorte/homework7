public class Bank {
    public static void main(String[] args) {
        int age = 22;
        float sallary = 100000;
        int creditLimit;

        if (age >= 23){
            if (sallary >= 800000) {
                System.out.println(sallary * 3 * 1.2);
            } else if (sallary >= 50000) {
                System.out.println(sallary * 3 * 1.5);
            } else {
                System.out.println(sallary * 3);
            }
        } else {
            if (sallary > 80000) {
                System.out.println(sallary * 2 * 1.2);
            } else if (sallary >= 50000) {
                System.out.println(sallary * 2 * 1.5);
            } else {
                System.out.println(sallary * 2);
            }
        }
    }


}

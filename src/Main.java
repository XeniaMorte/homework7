public class Main {
    public static void main(String[] args) {
        short clientOS;
        clientOS = 1;
        int clientDeviceYear = 2014;
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите  облегченную версию приложения для iOS по ссылке»");
        }
         else if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке»");
            } else {
                if (clientDeviceYear >= 2015 && clientOS == 0) {

                    System.out.println("Установите версию приложения для Android по ссылке");
                } else if (clientDeviceYear < 2015) {
                    System.out.println("Установите  облегченную версию приложения для Android по ссылке");
                }
            }
        }
    }


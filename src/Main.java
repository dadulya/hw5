//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//Задача 1
        int clientOS = 1; // 0 - IOS, 1 - Android
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }




//Задача 2
        int clientOS2 = 0; // 0 - IOS, 1 - Android
        int clientDeviceYear = 2015;
        if (clientOS2 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS2 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS2 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

//Задача 3
        int year = 1600;
            if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }

//Задача 4
        int deliveryDistance = 21;
            if (deliveryDistance >= 60 && deliveryDistance <= 100) {
                System.out.println("Потребуется дней: 3");
            } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
                System.out.println("Потребуется дней: 2");
            } else if (deliveryDistance < 20 ){
                System.out.println("Потребуется дней: 1");
            }
            else {
        System.out.println("Доставка не осуществляется");
    }

//Задача 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }



    }
}
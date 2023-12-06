import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        int year = 1987;
        int deliveryDistance = 105;
        String delivAnswer = task3(deliveryDistance);
        task1(year);
        task2(clientOS,year);
        System.out.println(delivAnswer);
    }

    public static void task1(int year){
        int startYear = 1584;

        if (year%400 == 0||(year%100 != 0&&(year-startYear)%4==0))
            System.out.println(year+"год - високосный");
        else if (year<startYear)
            System.out.println("Високосный год еще не ввели");
        else
            System.out.println(year+"год - не високосный");
    }

    public static void task2(int clientOS,int year){
        String strOut="Установите";
        if (year<= LocalDate.now().getYear())
            strOut+=" облегченную";

        String version;

        if(clientOS == 0)version = "iOS";
        else if (clientOS == 1) version ="Android";
        else return;

        System.out.println(strOut+" версию приложения для "+version+" по ссылке");
    }

    public static String task3(int deliveryDistance){
        int d;
        String res;
        if (deliveryDistance <= 0 ) {
            res="Некорректное расстояние";
        }
        else if (deliveryDistance<=20) {
            d=1;
            res = "Потребуется дней: "+d;
        }
        else if (deliveryDistance<=60) {
            d=2;
            res = "Потребуется дней: "+d;
        }
        else if (deliveryDistance<=100) {
            d=3;
            res = "Потребуется дней: "+d;
        }
        else {
            res = "Свыше 100 км доставки нет";
        }
        return res;
    }
}
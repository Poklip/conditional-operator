public class Main {

    public static void main(String[] args) {
        //Задача №1
        byte clientOS = 0; // 0 - йось, 1 - андроид для задачи 1 и 2
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.\n");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.\n");
        }

        //Задача №2.
        String OS;
        String version;
        short dateOfProduction = 2013; // год производства
        if (clientOS == 0) {
            OS = "iOS";
        } else {
            OS = "Android";
        }
        if (dateOfProduction < 2015) {
            version = "облегченную";
        } else {
            version = "обычную";
        }
        System.out.println("Установите " + version + " версию приложения для " + OS + " по ссылке.\n");

        //Задача №3.
        int year = 3100; // подвергающийся анализу год
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год является високосным.\n");
        } else {
            System.out.println(year + " год не является високосным.\n");
        }

        //Задача №4.
        short deliveryDistance = 45; // расстояние до адресата
        byte days = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            days += 1;
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            days += 2;
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставка невозможна.");
        }

        //Задача №5.
        System.out.println();
        byte monthNumber = 9; // номер месяца
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Зимний месяц.");
                break;
            case 3, 4, 5:
                System.out.println("Весенний месяц.");
                break;
            case 6, 7, 8:
                System.out.println("Летний месяц.");
                break;
            case 9, 10, 11:
                System.out.println("Осенний месяц.");
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }

        //Задача №6.
        System.out.println();
        byte age = 60; // возраст клиента для задачи 6 и 7
        float salary = 90000f; // з/п клиента для задачи 6 и 7
        float limit = 0f;
        if (age < 23) {
            if (salary >= 80000) {
                limit = salary * 2 * 1.5f;
            } else if (salary >= 50000) {
                limit = salary * 2 * 1.2f;
            } else {
                limit = salary * 2;
            }
        } else {
            if (salary >= 80000) {
                limit = salary * 3 * 1.5f;
            } else if (salary >= 50000) {
                limit = salary * 3 * 1.2f;
            } else {
                limit = salary * 3;
            }
        }
        System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + (int) (limit) + " рублей. \n");

        //Задача №7.
        int wantedSum = 240000;
        float loanRate = 0.1f;
        float maxMonthlyPayment = salary/2f;
        String creditApproval;
        if (age < 23) {
            loanRate += 0.01f;
        } else if (age < 30) {
            loanRate += 0.005f;
        }
        if (salary > 80000) {
            loanRate -= 0.007f;
        }
        if (maxMonthlyPayment > wantedSum * (loanRate + 1) / 12) {
            creditApproval = "Одобрено.";
        } else {
            creditApproval = "Отказано.";
        }
        float monthlyPayment = wantedSum * (1 + loanRate)/12;
        System.out.println("Максимальный платёж при ЗП " + (int) (salary) + " равен " + (int) (maxMonthlyPayment) + " рублей.\nЕжемесячный платёж по кредиту " + (int) (monthlyPayment) + " рублей. " + creditApproval);


    }
}
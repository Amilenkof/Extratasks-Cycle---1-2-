public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1.");
        /*Используя вложенные циклы while (цикл в цикле) выведи на экран прямоугольник размером 5 (высота) на 10
      (ширина), заполненный буквой 'Q'./*/
        int wight = 0;
        int lenght = 0;
        while (wight < 10 * 5) {
            System.out.print("Q");
            wight++;
            if (wight % 10 == 0) {
                System.out.println();
            }
        }
    }


    private static void task2() {
        /* /Используя вложенные циклы while (цикл в цикле) выведи на экран незаполненный прямоугольник (его контур)
      размером 10 (высота) на 20 (ширина) из букв 'Б'. Незаполненная часть состоит из пробелов./*/
        System.out.println("Задача 2.");
        int wight = 0;
        int lenght = 0;
        while (wight < 20 && lenght < 1) {
            System.out.print("Б");
            wight++;
            if (wight == 20) {
                System.out.println();
                lenght++;
                wight = 0;

            }
            while (lenght >= 1 && lenght < 9) {
                wight++;
                if (wight == 1) {
                    System.out.print("Б");
                } else if (wight > 1 && wight <= 19) {
                    System.out.print(" ");
                }
                if (wight == 20) {
                    System.out.println("Б");
                    lenght++;
                    wight = 0;
                }
            }
        }
        while (wight < 20) {
            System.out.print("Б");
            wight++;
            if (wight == 20) {
                System.out.println();
            }
        }
    }
}

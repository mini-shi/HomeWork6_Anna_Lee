import java.util.Random;
import java.util.Scanner;

public class Computer {
    String CPU;
    int RAM;
    int HDD;
    int resource;

    public Computer(String CPU, int RAM, int HDD, int resource) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
        this.resource = resource;
    }
            public boolean turnOn () {
                boolean b = false;
                Random random = new Random();
                System.out.println("Введите 1 или 0 ");
                Scanner scanner = new Scanner(System.in);
                int n = random.nextInt(2);
                System.out.println(n);
                int a = scanner.nextInt();

                while (a == 0 || a == 1) {
                    if (a == n) {
                        System.out.println("Включен");
                        b = true;
                        break;
                    }

                    if (a != n) {
                        System.out.println("Иди покупай новый");
                        b = false;
                        break;
                    }
                }

                return b;
            }

            public boolean turnOff () {
                boolean c = true;
                Random random = new Random();
                System.out.println("Введите 1 или 0 ");
                Scanner scanner = new Scanner(System.in);
                int n1 = random.nextInt(2);
                System.out.println(n1);
                int b = scanner.nextInt();

                while (b == 0 || b == 1) {
                    if (b == n1) {
                        System.out.println("Выключен");
                        c = true;
                        break;
                    }

                    if (b != n1) {
                        System.out.println("Иди покупай новый");
                        c = false;
                        break;
                    }
                }

                return c;
            }
        }
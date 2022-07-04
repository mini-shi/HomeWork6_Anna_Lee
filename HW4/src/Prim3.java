import java.util.Random;
import java.util.Scanner;

public class Prim3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение:");
        int a = scanner.nextInt();
        int s = 1;
        int s1 = 1;
        int[][] massive = new int[a][a];
        Random random = new Random();
        for (int i = 0; i < a; i++) {//строки
            for (int j = 0; j < a; j++) { //столбцы
                massive[i][j] = random.nextInt(0, 50);
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == j) {
                    s *= massive[i][j];
                }
            }
        }
        System.out.println(s);
        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++){
                if (i+j ==(a-1)){
                    s1*=massive[i][j];
                }
            }
        }
        System.out.println(s1);
        if (s > s1){
            System.out.println("Произведение главной диагонали больше");
        } else if (s < s1){
            System.out.println("Произведение побочной диагонали больше");
        } else {
            System.out.println("Произведения двух диагоналей равны");
        }
    }
}
import java.util.Random;
import java.util.Scanner;

public class Prim1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение:");
        int a = scanner.nextInt();
        int sum = 0;
            int [][] massive = new int [a][a];
            Random random = new Random();
            for (int i = 0 ; i < a; i++){//строки
                for (int j = 0; j < a; j++){ //столбцы
                    massive[i][j] = random.nextInt(0,50);
                    System.out.print(massive[i][j]+ " ");
                }
                System.out.println();
            } for (int i = 0 ; i < a; i++){
                for (int j = 0; j < a; j++){
                    if (i == j){
                        if (massive[i][j]%2==0){
                            sum+=massive[i][j];
                        }
                    }
            }
        }
        System.out.println(sum);

        }

    }

import java.io.*;
import java.util.Scanner;
/** клас Lab1VoitovychKI306, виконує програму згідно варіанту */
public class Lab1VoitovychKI306{
    /** метод мейн - виконавчий метод */
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);

            /** Запитуємо розмір квадратної матриці */
            System.out.print("Введіть розмір квадратної матриці: ");
            int size = in.nextInt();
            in.nextLine();

            /** Ініціалізуємо масив */
            char[][] arr = new char[size][];

            /** Запитуємо символ-заповнювач */
            System.out.print("\nВведіть символ-заповнювач: ");
            String filler = in.nextLine();

            if (filler.length() != 1) {
                System.out.println("Неправильний символ-заповнювач. Він має бути одинарним символом.");
                in.close();
                return;
            }


            for(int i = 0; i < size; i++){
                arr[i]= new char[i+1];
            }

            /** Заповнюємо матрицю і виводимо її в консоль та файл */
            char fillChar = filler.charAt(0);
            try (PrintWriter fout = new PrintWriter(new File("MyFile.txt"))) {
                for (int i = 0; i < size; i++) {
                    arr[i] = new char[i + 1]; // Кожен рядок матиме різну довжину
                    for (int j = 0; j <= i; j++) {
                        if (i + j >= size - 1) { // Умови заштрихованої області під другою діагоналлю
                            arr[i][j] = fillChar;
                        }
                    }
                }

                /** Виводимо масив на екран та у файл */
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        System.out.print(arr[i][j] + " ");
                        fout.print(arr[i][j] + " ");
                    }
                    System.out.println();
                    fout.println();
                }
            }

            System.out.println("Зубчатий масив записаний у файл MyFile.txt");
            in.close();

        } catch (FileNotFoundException e) {
            System.out.println("Помилка: не вдалося створити файл.");
        }
    }
}

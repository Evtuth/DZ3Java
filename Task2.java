// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        operationNumbers();
    }

    static void operationNumbers(){
        
        System.out.println("Список из какого количества элементов вы хотите создать?: ");
        Scanner scanner = new Scanner(System.in);
        Integer col = scanner.nextInt();
        
        List<Integer> arr = new ArrayList<>(col);
        Random rnd = new Random();

        for (int i = 0; i < col; i++) {
            arr.add(rnd.nextInt(10));
        }
        System.out.println(arr);
        
        int max = Collections.max(arr);
        int min = Collections.min(arr);

        double sum = 0;

        for(int g = 0; g < col; g++){
            sum = sum + arr.get(g);
        }

        double average = sum/col;
        
        System.out.println("Максимальное число в списке равно " + max);
        System.out.println("Минимальное число в списке равно " + min);
        System.out.println("Среднее арифметическое списка равно " + average);
    }
}

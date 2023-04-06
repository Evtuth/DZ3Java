// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        deleteEvenNumbers();
    }

    static void deleteEvenNumbers(){
        
        System.out.println("Список из какого количества элементов вы хотите создать: ");
        Scanner scanner = new Scanner(System.in);
        Integer col = scanner.nextInt();

        List<Integer> arr = new ArrayList<>(col);
        Random rnd = new Random();

        for (int i = 0; i < col; i++) {
            arr.add(rnd.nextInt(10));
        }
        System.out.println(arr);
        
        for(int g = 0; g < arr.size(); g++){  
            if( arr.get(g)%2 == 0 & arr.get(g) != 0){
                arr.remove(arr.get(g));
                g--;
            }
        
        }
        System.out.println(arr);
    }

    

}
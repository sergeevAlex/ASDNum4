package com.lehich;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
/* * @author SergeevAlex. The module shows binary search tree, which include FileReader and Timer
*   Tree isn't balanced.
* */
import java.util.Scanner;
public class Main extends BStree {
    public static void main(String[] args) throws IOException {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of words: ");
        n = sc.nextInt();
        BStree<String> tree = new BStree<String>();
        BufferedReader br = new BufferedReader(new FileReader("/Users/alexey/IdeaProjects/ASDNum4/src/com/lehich/Words.txt"));
        Path path = Paths.get("/Users/alexey/IdeaProjects/ASDNum4/src/com/lehich/Words.txt");
        long staddtime = System.currentTimeMillis();
        for(int i = 0;i<n;i++){
            String k = br.readLine();
            tree.insert(k);
        }
        long endadtime = System.currentTimeMillis() - staddtime;
        String average = "Sheffield";
        String worst = "taunting";
        long maxtime = System.currentTimeMillis();
        System.out.println("Max: " + tree.max().key);
        long endmaxtime = System.currentTimeMillis()- maxtime;
        long mintime = System.currentTimeMillis();
        System.out.println("Min: " + tree.min().key);
        long endmintime = System.currentTimeMillis()- mintime;
        long startimesearch = System.currentTimeMillis();
        System.out.println("Search in average: "+ tree.find(average));
        long searchtime = System.currentTimeMillis() - startimesearch;
        long worststartimesearch = System.currentTimeMillis();
        System.out.println("Search in average: "+ tree.find(worst));
        long worstsearchtime = System.currentTimeMillis() - worststartimesearch;
        System.out.println("Эксперименты для " + n + " слов" );
        System.out.println("1. Время поиска в среднем случае: " + searchtime);
        System.out.println("2. Время добавления: " + endadtime);
        System.out.println("3. Время поиска в худшем случае:" + worstsearchtime);
        System.out.println("4. Максимальный элемент: " +  endmaxtime);
        System.out.println("5. Минимальный элемент: " +  endmintime);
    }
}
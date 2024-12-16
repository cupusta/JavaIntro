package org.example;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println(fizzBuzz (500));
        System.out.println(RowSum());
    }
    //1 задание
    public static ArrayList<String> fizzBuzz (int n){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i<= n; i++){
            if (i % 7 == 0 && i % 5 == 0){
                list.add("fizzBuzz");
            }else if (i % 5 == 0){
                list.add("fizz");
            }else if (i % 7 == 0){
                list.add("buzz");
            }else{
                list.add(Integer.toString(i));
            }
        }
        return list;
    }
    //2 задание
    public static String reverse (String line) {
        int a = line.length();
        StringBuilder editedLine = new StringBuilder();
        for (int i = a - 1; i >= 0; i--) {
            editedLine.append(line.charAt(i));
        }
        return editedLine.toString();
    }
    //3 задание
    public static ArrayList<String> discriminant( int a, int b, int c){
        ArrayList<String>list = new ArrayList<>();
        int D = b* b- 4 * a * c;

        if(D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);

            list.add(String.valueOf(x1));
            list.add(String.valueOf(x2));
        }else if (D == 0) {
            double x = (-b) / (2.0 * a);
            list.add(String.valueOf(x));
        }else{
            list.add("Нет корней");
        }
        return list;
    }
    //4 задание
    public static double RowSum(){
        ArrayList<String> list = new ArrayList<>();

        int n = 2;
        double sum = 0;
        double i = 0;

        do{
            i = 2.0/(n * n + n - 2);
            sum +=i;
            n++;
        }while (i> Math.pow (10, -6));
        return sum;
    }
    // 5 задание
    public static boolean palindrom(String line) {

        char[] chars = line.toCharArray();
        String rev = "";

        for (int i = line.length() - 1; i >= 0; i--) {
            rev += chars[i];
        }
        return line.equals(rev);
    }

}
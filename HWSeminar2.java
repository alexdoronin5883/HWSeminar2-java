//Task 1 ////////////////
// Напишите программу, чтобы проверить, 
// содержит ли данная строка только цифры.
// (с возможностью ввода или нет решайте сами)

// public class HWSeminar2 {
//         public static void main(String[] args){
//             String input = "12343454556";
//             boolean result = input.matches("(\\+*)\\d{11}");
//             if(result){
//                 System.out.println("Строка содержит только цифры.");
//             }
//             else{
//                 System.out.println("В строке присутствуют не только цифры!");    
//             }
                
//         }
//     }    

// Task2 //////////////////////////

// Напишитепрограмму для объединения данной строки 
// с самим собой заданное 
// количество раз(количество и строку мы вводим)


// import java.util.Scanner;
// import java.util.regex.Matcher;
    
//     public class HWSeminar2 {
//         public static void main(String args[]) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Задайте кол-во повторений:");
//            int a = scanner.nextInt();
//            String s = "Я стану QA Инженером!";
//            s = s.concat(" Очень хорошим QA Инженером!");
//            for (int i = 0; i < a; i++) {
//                 System.out.println(s);
//             }
//         }
//     }    
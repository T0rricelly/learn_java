import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        // -128 hasta 127
//        byte byte_number = 127;
//        // -32768 hasta 32767
//        short short_number = 32654;
//        // -2,147,483,648 hasta 2,147,483,647
//        int number = 5;
//        long long_number = 123456789;
//        // float = 6 decimales
//        float float_number = 3.1488465f;
//        // double default
//        double decimal = 5.4348461651561;
//        System.out.println(decimal);
//        // Char
//        char letter = 'S';
//        // Boolean
//        boolean b = true;
//        boolean c = false;
//
//        // String
//        String text = "Hola Mundo!";
//
//        int l = text.length();
//        System.out.println(l);
//        char character = text.charAt(10);
//        System.out.println(character);
//
//        String substring = text.substring(2, 9);
//        System.out.println(substring);
//
//        String upperText = text.toUpperCase();
//        System.out.println(upperText);
//
//        String lowerText = text.toLowerCase();
//        System.out.println(lowerText);
//
//        int index = text.indexOf("Mundo");
//        System.out.println(index);
//
//        String replaceText = text.replace("Hola", "Chao");
//        System.out.println(replaceText);
//
//        boolean textContain = text.contains("Hola");
//        System.out.println(textContain);
//        int i;
//        int j;
//        for(i = 1 ; i <= 5; i++) {
//            for (j = 1; j <= 5; j++) {
//                System.out.print("i:");
//                System.out.print(i);
//                System.out.print(" j:");
//                System.out.println(j);
//            }
//            System.out.println(j);
//        }
//        System.out.println(i);

        // while
//        int i;
//        while (i <= 5){
//            System.out.println(i);
//            i++;
//        }


//        do{
//            System.out.println(i);
//            i++;
//        }while (i == 2);

//        for (i = 1; i <=10; i++){
//            System.out.println(i);
//            if (i == 5){
//                break;
//                return;
//            }
//            System.out.println(i);
//        }
//        int[] numbers = new int[5];
//        numbers[0] = 10;
//        numbers[1] = 20;
//        numbers[2] = 30;
//        numbers[3] = 40;
//        numbers[4] = 50;
//        int[] numbers = {10,20,30,40,50};
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);
//        System.out.println(numbers[4]);
//        System.out.println(numbers.length);

//        for (int i = 0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }
//        for (int number : numbers){
//            System.out.println(number);
//        }
        // Juego ahorcado en java


        // Variables necesarias
        Scanner scanner = new Scanner(System.in);
        String word = "heisenberg";
        int attempt = 0;
        int maxAttempts = 5;
        boolean isGuess = false;
        char[]  wordSecret = new char[word.length()];

        // Recorrer la lista para ocultar la palabra
        for (int i = 0; i < wordSecret.length; i++){
            wordSecret[i] = '*';
        }
        // Bucle principal del juego
        while (!isGuess && attempt < maxAttempts){
            boolean correctLetter = false;
            System.out.println("La palabra para adivinar es: " + String.valueOf(wordSecret));
            System.out.println("Escribe una letra:");
            // Guardar la letra que el usuario ingresa
            char letter = scanner.next().toLowerCase().charAt(0);
            // Mostrar las letras que ya adivino
            for (int j = 0; j < word.length(); j++) {
                // Si adivina una letra recorrera la lista y le mostrara la palabra oculta con la letra que adivino
                if (letter == word.charAt(j)){
                    wordSecret[j] = letter;
                    System.out.println(wordSecret[j]);
                    correctLetter = true;
                }
            }
            // Verificar si no adivino ninguna letra y se muestran los intentos
            if (!correctLetter){
                attempt++;
                System.out.println("Tiene " + (maxAttempts - attempt) + " intentos");
            }
            // Se verificara si la palabra es igual a las letras que el usuario a adivinado
            if (String.valueOf(wordSecret).equals(word)) {
                System.out.println("Haz adivinado la palabra, Muy bien!");
                break;
            }
        }
        // Mensaje de que el juego termino
        System.out.println("El juego ha terminado!");
        scanner.close();


    }

}
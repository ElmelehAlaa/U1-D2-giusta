

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);


//       ESERCIZIO 1


        System.out.println("Inserisci un numero intero");
      int num1 = input.nextInt();
        stringaPariDispari(num1);


        System.out.println("Inserisci un anno");
        int num2 = input.nextInt();
        annoBisestile(num2);

        System.out.println("Inserisci un numero intero");
        int num3 = input.nextInt();
        switchNumero(num3);

        System.out.println("Inserisci una stringa");
        String stringa = input.nextLine();
        whileString(stringa);

        System.out.println("Inserisci un numero intero");
        int num4 = input.nextInt();
        forNumb(num4);



        input.close();

    }

    public  static void stringaPariDispari (int num1){
        System.out.println(num1%2 == 0? "true! Numero è pari": "False! Numero è dispari!");
    }
 public static void annoBisestile(int num2){
      System.out.println(num2%4 == 0 | num2%100==0 & num2%400 ==0? "true! Anno bisestile!" :"False! non é bisestile");
 }
    public  static void switchNumero (int num3){
        switch(num3){
            case  0:{
                System.out.println("zero");
                break;
            }
            case  1:{
                System.out.println("uno");
                break;
            }
            case  2:{
                System.out.println("due");
                break;
            }
            case  3:{
                System.out.println("tre");
                break;
            }
            default:System.out.println("Errore! il numero deve essere compreso tra 0 e 3 ");
        }
    }

//   public  static void whileString (String stringa){
//       while (true){
//
//           if (stringa.equals(":q")){
//               break;
//           }
//           else {
//               String[] strChar = stringa.split(",");
//               System.out.println(Arrays.toString(strChar));
//               Scanner input = new Scanner(System.in);
//               System.out.println("Inserisci un'altra stringa");
//                  stringa = input.nextLine();
//               input.close();
//           }
//
//
//       }
//   }

    public  static void whileString (String stringa){
        Scanner inputStringa = new Scanner(System.in);
        while (true){
            System.out.println("Inserisci una stringa");
            stringa = inputStringa.nextLine();
            System.out.println(stringa);
            if(stringa.equals(":q")) {
                System.out.println("While Terminato!");
                break;
            }
            else {
                String[] stringChars = new String[]{stringa};
                System.out.println(Arrays.toString(Arrays.toString(stringChars).split(",")).trim());

            }

            }
        }



    public  static void forNumb(int num4){

        for( int i=num4; ;i--){
            if (i==-1) break;
            System.out.println(i);
        }
    }
}
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

        System.out.println("Inserisci un numero intero");
      int num1 = input.nextInt();
        stringaPariDispari(num1);


        System.out.println("Inserisci un anno");
        int num2 = input.nextInt();
        annoBisestile(num2);

        System.out.println("Inserisci un numero intero");
        int num3 = input.nextInt();
        switchNumero(num3);

//        System.out.println("Inserisci una stringa");
//        String str = input.next();
//        whileString(str);



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

//    public  static void whileString (String str){
//        while (Objects.equals(str,  ":q")){
//            System.out.println(str.toCharArray());
//            Scanner input = new Scanner(System.in);
//            System.out.println("Inserisci un'altra stringa");
//            str = input.nextLine();
//
//        }
//    }

}
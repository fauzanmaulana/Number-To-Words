package com.tugas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        boolean loop = true;
        String confirm = "";
        System.out.println("Numbers to words (1 - 50)");
        while (loop){
            try {
                System.out.print("masukan angka : ");
                number = input.nextInt();
                if (number <= 11){
                    onedigit(number);
                }else if (number > 11 && number < 20){
                    teendigit(number);
                }else if (number >= 20 && number <= 50){
                    twodigit(number);
                }else if(number <= 0){
                    System.err.println("masukan angka diatas 0");
                }else{
                    System.err.println("batas sampai 50 angka");
                }
                System.out.print("\ningin ulang? (y/n)");
                confirm = input.next();
                if (confirm.contains("n")){
                    loop = false;
                }
            }catch (Exception e){
                System.err.println("yang anda masukan bukan angka");
                return;
            }
        }
        System.out.println("program selesai");
    }

    private static void onedigit(int number){
        switch (number){
            case 1:
                System.out.print("satu");
                break;
            case 2:
                System.out.print("dua");
                break;
            case 3:
                System.out.print("tiga");
                break;
            case 4:
                System.out.print("empat");
                break;
            case 5:
                System.out.print("lima");
                break;
            case 6:
                System.out.print("enam");
                break;
            case 7:
                System.out.print("tujuh");
                break;
            case 8:
                System.out.print("delapan");
                break;
            case 9:
                System.out.print("sembilan");
                break;
            case 10:
                System.out.print("sepuluh");
                break;
            case 11:
                System.out.print("sebelas");
                break;
        }
    }

    private static void teendigit(int angka){
        int number = angka % 10;
        onedigit(number);
        System.out.print(" belas");
    }

    private static void twodigit(int number){
        int frontnumber = Integer.parseInt(Integer.toString(number).substring(0, 1));
        int backnumber = number % 10;
        if (backnumber == 0){
            onedigit(frontnumber);
            System.out.print(" puluh");
            return;
        }
        onedigit(frontnumber);
        System.out.print(" puluh ");
        onedigit(backnumber);
    }
}

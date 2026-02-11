package Tugas;
import java.util.Scanner;
public class DataTypes {
    public static void main(String args[]){
        Scanner inputUser = new Scanner(System.in);
        int index = inputUser.nextInt();
        String[] input = new String[index];
        for(int i = 0; i<index;i++){
            input[i] = inputUser.next();
        }   
        for(int j = 0 ;j<index;j++){
            String angka = input[j];
            try{
                long nilaiAsli = Long.parseLong(angka);
                System.out.println(angka + "\ncan be fitted in:" );
                if(nilaiAsli>=-32768 && nilaiAsli<=32767){
                    System.out.println("* short");
                }                
                if(nilaiAsli>=-2147483648 && nilaiAsli<=2147483647){
                    System.out.println("* int");
                }
                if(nilaiAsli>=-128 && nilaiAsli<= 127){
                    System.out.println("* byte");
                }
                System.out.println("* long");

            } catch(Exception e){
                System.out.println(angka +"cant be fitted anywhere");
            }
        } 
            
        }
    }


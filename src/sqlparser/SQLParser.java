/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlparser;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Anvaqta Tangguh
 */
public class SQLParser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Parser data = new Parser();
        String query = "SELECT * FROM Lagu JOIN Memutar using (idLagu);";
//        Scanner input = new Scanner(System.in);
//        System.out.print("SQLParser>");
//        String query = input.nextLine();
        if(data.parse(query)){
            System.out.println("\nSuccess exit code 0");
        }else{
            System.out.println("SQL ERROR.");
        }
        
        System.out.println("========= Nomor 1 =========");
        nomor1 no1 = new nomor1();
        no1.menu1();
        System.out.println("");
        
        System.out.println("========= Nomor 2 =========");
        nomor2 no2 = new nomor2();
        no2.menu2();
        System.out.println("");
        
        System.out.println("========= Nomor 3 =========");
        nomor3 no3 = new nomor3();
        no3.menu3();
        
        System.out.println("");
        System.out.println("========= Nomor 4 =========");
        System.out.println("MENU 4 : QEP and Cost");
        System.out.println("");
        nomor4 no4 = new nomor4();
        no4.printQEP(data.primaryKey, query, data.joinExist);
        
        System.out.println("");
        System.out.println("========= Nomor 5 =========");
        nomor5 no5 = new nomor5(data.primaryKey, query, data.joinExist);
    }
    
}

package org.example;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        kopia2("/Users/stanislawsikora/IdeaProjects/cwiczenia_11/src/main/java/org/example/marek.txt","/Users/stanislawsikora/IdeaProjects/cwiczenia_11/src/main/java/org/example/kopia.txt");
    }

    static void kopia(String src, String dest) {

        try(BufferedReader br = new BufferedReader(new FileReader(src));
            BufferedWriter bw = new BufferedWriter(new FileWriter(dest))){

            String line;
            int wiersze = 0; int wyrazy = 0;


            while ((line = br.readLine()) != null) {
                bw.write(line);
                wiersze++;
                String [] line_wyrazy = line.split("\\s+");
                wyrazy += line_wyrazy.length;
            }
            System.out.println(wiersze);
            System.out.println(wyrazy);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    static void kopia2(String src, String dest) {

        try(Scanner scanner = new Scanner(new FileReader(src));
            PrintWriter pw = new PrintWriter(new FileWriter(dest))){

            String line;
            String token;
            int wiersze = 0; int wyrazy = 0;


            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                pw.write(line);
                pw.write("\n");
                Scanner scanner2 = new Scanner(line);
                while (scanner2.hasNext()) {
                    token = scanner2.next();
                    wyrazy ++;
                }
                wiersze ++;
            }

            System.out.println(wiersze);
            System.out.println(wyrazy);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
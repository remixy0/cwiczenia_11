package org.example;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        kopia("/Users/stanislawsikora/IdeaProjects/cwiczenia_11/src/main/java/org/example/marek.txt","/Users/stanislawsikora/IdeaProjects/cwiczenia_11/src/main/java/org/example/kopia.txt");
    }

    static void kopia(String src, String dest) {

        try(BufferedReader br = new BufferedReader(new FileReader(src));
            BufferedWriter bw = new BufferedWriter(new FileWriter(dest))){

            String line;
            int wiersze = 0; int wyrazy = 0;

            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
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
}
package java_classes_objects_Pe4;


import java.io.*;

public class Pe4 {
    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("/home/manda/Desktop/intext");

        int i;
        int length = 0;
        while ((i = fr.read()) != -1) {

            char c = (char) i;
            char x = Character.toUpperCase(c);
            System.out.print(x);
            length++;

        }
        System.out.println("");
        System.out.print("The file contains " + length + " characters.");
    }
}
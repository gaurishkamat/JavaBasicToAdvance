package org.example.challenge88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter filename to read contents from: ");
        String filename = input.next();

        try(FileWriter writer = new FileWriter(filename)){
            System.out.println("Writing!!");
            writer.write("This is my first file write!!");
        }catch (IOException exception){
            System.out.printf("File not found, %s", exception.getMessage());
        }

        try(FileReader reader = new FileReader(filename)){
            int block;
            do{
                block = reader.read();
                System.out.print((char) block);
            }while (block !=-1);
        }catch (FileNotFoundException exception){
            System.out.printf("%s not found exception", filename);
        }catch (IOException exception){
            System.out.printf("Exception occurred, %s", exception.getMessage());
        }
    }
}

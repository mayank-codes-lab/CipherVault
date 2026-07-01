package com.mayank.service;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileService {
    private final Scanner scanner = new Scanner(System.in);
// try{
    public void fileEncryption() {
        System.out.println("Enter File Path ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);
        String filename = file.getName();
        if (filePath.trim().isEmpty()) {
            System.out.println("Path Should Not be Empty!");
            System.out.println("Enter Valid File Path!");

        } 
        else {
            if (file.exists()) {
                System.out.println("File Foundat: " + filePath);
                if (file.isFile()) {
                    System.out.println("Its an File");
                    if (file.canRead()) {
                        System.out.println("File is Readable");
                        if (filename.endsWith(".txt")){
                            System.out.println("its an Text file");
                        }
                        else if(filename.endsWith(".docx")){
                            System.out.println("Its an Document file");
                        }
                        else{
                            System.out.println("The file format is not supported");
                            System.out.println("Only .txt and .docx files are supported");
                        }
                    } else {
                        System.out.println("File is not Readable");
                    }

                } else {
                    System.out.println("Is not an file!");

                }

            } else {
                System.out.println("File not Found!");
            }
        }
        try{
       FileReader fileReader = new FileReader(file);
      
       fileReader.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}





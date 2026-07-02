package com.mayank.service;

import java.io.File;
import java.util.Date;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class FileService {
    private final Scanner scanner = new Scanner(System.in);
// try{
    public void processFile() {
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
       FileReader reader = new FileReader(file);
       SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
       String formattedDate = sdf.format(new Date(file.lastModified()));
       StringBuilder content = new StringBuilder();
       
            int ch;
            while((ch = reader.read()) !=-1){
                // System.out.println((char) ch);
                content.append((char) ch);
                String fileData = content.toString();
                
            }
            System.out.println(content);
       reader.close();
           
       System.out.println("========================================================================");
       System.out.println("                            File Details                               ");
       System.out.println("File Name: " + filename);
       System.out.println("Path: " + file.getAbsolutePath());
       System.out.println("Size: " + file.length() + "Bytes");
       System.out.println("Readable: " + (file.canRead() ? "Yes" : "No"));
       System.out.println("Writeable: " +(file.canWrite()? "Yes" : "NO"));
       System.out.println("Last Modified: " + formattedDate);
       System.out.println("=========================================================================");

            




        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}





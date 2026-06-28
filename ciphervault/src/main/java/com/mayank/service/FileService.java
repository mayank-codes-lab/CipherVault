package com.mayank.service;
import java.io.File;
import java.util.Scanner;

public class FileService {
    private final Scanner scanner = new Scanner(System.in);
    public void fileEncryption(){
        System.out.println("Enter File Path ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);
        if(filePath.isEmpty()){
            System.out.println("Path Should Not be Empty!");
            System.out.println("Enter Valid File Path!");
        
        }
        else if(file.exists()){
            System.out.println("File Foundat: " + filePath);
            if(file.isFile()){
                    System.out.println("Its an File");
                    if(file.canRead()){
                        System.out.println("File is Readable");
                        
                    }
                    else{
                        System.out.println("File is not Readable");
                    }
                   
          }else{
            System.out.println("Is not an file!");
            
          }
           
        }
        else{
            System.out.println("File not Found!");
        }
        // else if(file.isFile()){
        //     System.out.println("its an File");
          
        // }
        // else if(file.canRead()){
        //     System.out.println("Files are Readable!");
        // }
        // else{
        //     System.out.println("Files Not Found!");
        // }

        // File file = new File(filePath);
        // if(filePath.isEmpty()){
        //     System.out.println("Path should not be Empty! ");
        //     System.out.println("Plz Enter the File Path");
        //     return;
        // }
        // else if(file.exists()){
        //     System.out.println("File Found!");
            
        // }
        // else if(file.isFile()){

        // }
        // else{
        //     System.out.println("File Not Found");
        // }

        


    }
}

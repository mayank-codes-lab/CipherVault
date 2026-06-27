package com.mayank.controller;

import java.util.Scanner;

public class MenuController {
    Scanner sc = new Scanner(System.in);
    public void MainMenu(){
         System.out.println("=====================================================================================================================================================");
        System.out.println("                                                       CipherVault Professional File Encryption System                                               ");
        System.out.println("                                                                      Version : 1.0.0                                                                ");
        System.out.println("=====================================================================================================================================================");
        System.out.println("                                                                    Initializing Application...                                                      ");
        System.out.println("                                                                    Loading Modules...                                                               ");
        System.out.println("                                                                    Starting CipherVault...                                                          ");
        System.out.println("=====================================================================================================================================================");
        System.out.println();

       while(true){
        System.out.println();
        System.out.println("1. Encrypt Files");
        System.out.println("2. Decrypt Files");
        System.out.println("3. View Logs ");
        System.out.println("4. About us");
        System.out.println("5. Exit!");
        System.out.println("======================================================================================================================================================");
        System.out.println("Enter Choice! ");

        int choice=sc.nextInt();

      
            switch (choice) {
                case 1:
                    System.out.println("Encryption of Documnet is under Process you will see it Soon!");
                    break;
                case 2:
                    System.out.println("Decryption of Documents is Under Process you will see is Soon!");
                    break;
                
                    case 3:
                        System.out.println("View Logs List are under process you will see them soon");
                        break;
                        case 4:
                            System.out.println("About Section is Under process you will see it soon");
                            break;
                            case 5:
                                System.out.println("Exiting......");
                                System.exit(0);
                                break;

                        default:
                        System.out.println("Invalid Input! try Agin later");
                    break;
            }
        }
        
    }
    }
    


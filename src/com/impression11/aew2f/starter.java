package com.impression11.aew2f;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Ethan on 12/10/15.
 */
public class starter {


    static List<person> storage = new ArrayList<person>();

    public static void main(String args[]){

        runner();

    }

    public static void runner(){

        int check = 0;
        int q1 = 0;
        String q2;
        String q3;
        String q4;
        Scanner sc = new Scanner(System.in);
        while(check < 1){
            person tempPerson = new person();

            System.out.println("Press 1 to continue and add a new record, or 2 to exit.");
            q1 = sc.nextInt();
            if(q1 == 1){

                System.out.println("Please enter a first name:");
                q2 = sc.nextLine();
                q2 = sc.nextLine();
                tempPerson.setFirstName(q2);

                System.out.println("Please enter a surname:");
                q3 = sc.nextLine();
                tempPerson.setSurname(q3);

                System.out.println("Please enter a favorite color:");
                q4 = sc.nextLine();
                tempPerson.setFavoriteColor(q4);

                storage.add(tempPerson);

            }
            else{

                check = 1;
                if (storage.size() > 0){

                    try {
                        System.out.println("Writing records to file...");
                        PrintWriter writer = new PrintWriter("savefile.txt", "UTF-8");
                        for(person newPerson: storage) {
                            writer.println("First Name: " + newPerson.getFirstName() + " Surname: "+newPerson.getSurname() + " Colour: "+newPerson.getFavoriteColor());

                        }
                        writer.close();
                        System.out.println("Written "+storage.size()+" records to file.");

                    }
                    catch (IOException e) {
                        System.out.println("Error writing to file:  " +  e.getMessage());
                    }
                }

            }



        }

    }

}

package com.company;

import java.util.Scanner;

public class Main {

    public static DLL L = new DLL();

    public static int menu() {
        System.out.println("Menu");
        int v;
        System.out.println("1- add");
        System.out.println("2- Delete");
        System.out.println("3- Update ");
        System.out.println("4- Search ");
        System.out.println("5- Print List");
        System.out.println("6- Exit");

        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();

        return v;
    }


    public static void Add() {
        Contact c = new Contact();
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String phone = sc.nextLine();

        c.setName(name);
        c.setPhone(phone);

       // L.Add(c); /// Unsorted
        L.AddSorted(c); /// Sorted

    }

    public static void Delete() {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        L.DeleteItem(name);

    }

    public static void Update() {
        Contact c = new Contact();
        Scanner sc = new Scanner(System.in);

        System.out.println("Old Name");
        String OldName = sc.nextLine();


        System.out.println("New Name");
        String Nname = sc.nextLine();
        System.out.println("New Phone");
        String Nphone = sc.nextLine();


        c.setName(Nname);
        c.setPhone(Nphone);


        L.UpdateContactByName(OldName, c);
        //L.UpdateContactByPhone(OldName,c);
    }


    public static void Search() {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        Contact c = L.SearchByName(name);

        System.out.println(c);

    }

    public static void PrintList() {
        L.PrintList();
    }


    public static void main(String[] args) {


        while (true) {
            int x = menu();

            if (x == 6) {
                break;
                //  return;
            }
            if (x == 1) {
                Add();
            } else if (x == 2) {
                Delete();
            } else if (x == 3) {
                Update();
            } else if (x == 4) {
                Search();
            } else if (x == 5) {
                PrintList();
            }


        }

    }
}

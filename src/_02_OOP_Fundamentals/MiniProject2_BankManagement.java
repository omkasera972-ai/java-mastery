package _02_OOP_Fundamentals;

import java.util.Scanner;

/*
Mini Project 2 — Simple Bank System

Concepts:
Class
Constructor
Static
Final
Inner Class
Recursion
Menu
*/

public class MiniProject2_BankManagement {

    // ACCOUNT CLASS
    static class Account {

        int id;
        String name;
        double balance;

        static int totalAccounts = 0;

        Account(int id, String name, double balance) {

            this.id = id;
            this.name = name;
            this.balance = balance;

            totalAccounts++;
        }
    }


    // BANK CLASS
    static class Bank {

        final String bankName;

        Account accounts[] = new Account[10];

        int count = 0;

        static int totalTransactions = 0;


        // INNER CLASS
        class Record {

            int id;
            String type;

            Record(int id, String type) {

                this.id = id;
                this.type = type;
            }

            void show() {

                System.out.println("Account " + id + " -> " + type);
            }
        }


        Record records[] = new Record[20];

        int rc = 0;


        Bank(String name) {

            bankName = name;
        }


        void createAccount(int id, String name, double balance) {

            accounts[count++] = new Account(id, name, balance);

            System.out.println("Account created!");
        }


        // RECURSION SEARCH
        Account findAccount(int id, int index) {

            if (index >= count)
                return null;

            if (accounts[index].id == id)
                return accounts[index];

            return findAccount(id, index + 1);
        }


        void deposit(Account a, double amount) {

            a.balance += amount;

            records[rc++] = new Record(a.id, "Deposit");

            totalTransactions++;

            System.out.println("Money deposited!");
        }


        void withdraw(Account a, double amount) {

            if (a.balance < amount) {

                System.out.println("Low balance!");
                return;
            }

            a.balance -= amount;

            records[rc++] = new Record(a.id, "Withdraw");

            totalTransactions++;

            System.out.println("Money withdrawn!");
        }


        void showAccounts() {

            System.out.println("\nAccounts:");

            for (int i = 0; i < count; i++) {

                System.out.println(accounts[i].id + " "
                        + accounts[i].name + " Rs "
                        + accounts[i].balance);
            }
        }
    }


    // RULE CLASS (FINAL + RECURSION)
    static class Rules {

        final static int MIN_BALANCE = 500;

        static int fine(int balance) {

            if (balance >= MIN_BALANCE)
                return 0;

            return 50 + fine(balance + 100);
        }
    }


    // MAIN METHOD
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bank Name: ");

        Bank bank = new Bank(sc.nextLine());

        int choice;

        do {

            System.out.println("\n1 Create Account");
            System.out.println("2 Deposit");
            System.out.println("3 Withdraw");
            System.out.println("4 Show Accounts");
            System.out.println("5 Stats");
            System.out.println("0 Exit");

            System.out.print("Choice: ");

            choice = sc.nextInt();


            if (choice == 1) {

                System.out.print("ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Balance: ");
                double balance = sc.nextDouble();

                bank.createAccount(id, name, balance);
            }


            else if (choice == 2) {

                System.out.print("Account ID: ");

                Account a = bank.findAccount(sc.nextInt(), 0);

                if (a == null) {

                    System.out.println("Account not found!");
                    continue;
                }

                System.out.print("Amount: ");

                bank.deposit(a, sc.nextDouble());
            }


            else if (choice == 3) {

                System.out.print("Account ID: ");

                Account a = bank.findAccount(sc.nextInt(), 0);

                if (a == null) {

                    System.out.println("Account not found!");
                    continue;
                }

                System.out.print("Amount: ");

                bank.withdraw(a, sc.nextDouble());
            }


            else if (choice == 4) {

                bank.showAccounts();
            }


            else if (choice == 5) {

                System.out.println("Total Accounts: "
                        + Account.totalAccounts);

                System.out.println("Total Transactions: "
                        + Bank.totalTransactions);
            }

        }

        while (choice != 0);

        sc.close();
    }
}
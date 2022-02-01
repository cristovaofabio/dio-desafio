package com.desafio.dio;

public class Main {
    public static void main(String[] args){
        try{
            Bank bank = new Bank("Banco do Brasil");
            Account account = new Account(new Client("João"),"corrente");
            Account account2 = new Account(new Client("Maria"),"poupança");

            bank.setAccount(account);
            bank.setAccount(account2);

            account.deposit(100);
            account.transfer(35,account2);

            bank.showAccounts();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

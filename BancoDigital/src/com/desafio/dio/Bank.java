package com.desafio.dio;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Account> accounts;

    public Bank(String name) {
        if(name.length()!=0){
            this.name = name;
            accounts = new ArrayList<>();
        }else {
            throw new RuntimeException("Informe o nome do banco!");
        }
    }

    public void setAccount(Account account) {
        this.accounts.add(account);
    }

    public void showAccounts(){
        String messagem="##############################\n";
        messagem+=this.name+"\n";
        messagem+="##############################\n";
        for(int position =0 ; position<this.accounts.size();position++){
            messagem+=this.accounts.get(position).getStatement();
        }
        System.out.println(messagem);
    }
}

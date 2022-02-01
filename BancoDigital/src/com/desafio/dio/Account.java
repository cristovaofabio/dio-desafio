package com.desafio.dio;

public class Account {
    private enum KindAccount {CORRENTE,POUPANCA};
    private static final int BRANCH_PATTERN =1;
    private static int SEQUENTIAL =1;

    private int branch = BRANCH_PATTERN;
    private int number = SEQUENTIAL++;
    private double balance=0.0;
    private KindAccount kind;
    private Client client;

    public Account(Client client, String kindAccount) {
        String upperNameKindAccount = kindAccount.toUpperCase();

        switch (upperNameKindAccount){
            case "CORRENTE":
                this.kind = KindAccount.CORRENTE;
                break;
            case "POUPANÇA":
            case "POUPANCA":
                this.kind = KindAccount.POUPANCA;
                break;
            default:
                throw new RuntimeException("Tipo de conta não identificada!");
        }
        if(client!=null){
            this.client=client;
        }else {
            throw new RuntimeException("A conta precisa de um titular");
        }
    }

    private boolean isPossibleReduceBalance(double value){
        return value<=this.balance;
    }

    public void withdraw(double value){
        if(isPossibleReduceBalance(value)){
            this.balance = this.balance - value;
        }else{
            throw new RuntimeException("A conta não permite reduzir o valor informado");
        }
    }

    public void deposit(double value){
        this.balance = this.balance+value;
    }

    public void transfer(double value, Account accountToDestination){
        this.withdraw(value);
        accountToDestination.deposit(value);
    }

    public void showStatement(){
        System.out.println(this.getStatement());
    }

    public String getStatement(){
        String mensage="Conta: "+this.number+"\n";
        mensage+="Titular: "+this.client.getName()+"\n";
        mensage+="Tipo: "+this.kind+"\n";
        mensage+="Agência: "+this.branch+"\n";
        mensage+="Saldo: "+this.balance+"\n";
        mensage+="---------------------------\n";

        return mensage;
    }

}

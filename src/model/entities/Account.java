package model.entities;

public class Account {


    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, Double withdrawLimit, Double balance, String holder) {
        this.number = number;
        this.withdrawLimit = withdrawLimit;
        this.balance = balance;
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }


    public String getHolder() {
        return holder;
    }


    public Double getBalance() {
        return balance;
    }


    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount){
        this.balance += amount;
    }

    public void withdraw(Double amount){
        if (balance == 0.0 ){
            throw new IllegalArgumentException("Not enough balance");
        }
        if (amount > withdrawLimit){
            throw new IllegalArgumentException("The amount exceeds withdraw limit");
        }
        if (amount>balance){
            throw new IllegalArgumentException("Not enough balance");
        }


    }

}

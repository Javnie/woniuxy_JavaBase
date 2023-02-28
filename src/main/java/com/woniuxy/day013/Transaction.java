package com.woniuxy.day013;

/**
 * 交易
 */
public class Transaction implements Comparable<Transaction> {
    private Trader trader;
    private int year;
    private int money;

    public Transaction(Trader trader, int year, int money) {
        this.trader = trader;
        this.year = year;
        this.money = money;
    }

    public Trader getTrader() {
        return trader;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return this.getTrader().getName() + "-->" + this.getYear() + "-->" + this.getMoney();
    }

    @Override
    public int compareTo(Transaction o) {
        return this.getMoney() - o.getMoney();
    }
}

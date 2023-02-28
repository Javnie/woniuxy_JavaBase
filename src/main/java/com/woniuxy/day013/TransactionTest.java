package com.woniuxy.day013;
/**
 * 使用Stream API完成以下功能：
 *
 *
 *
 *
 *
 *
 * 所有交易中，最高的交易额是多少
 * 找到交易额最小的交易
 */

import java.util.*;
import java.util.stream.Collectors;

public class TransactionTest {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));

        //找出2011年发生的所有交易，并按交易额排序
        System.out.println(transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted()
                .collect(Collectors.toList()));

        //交易员在哪些不同的城市工作过
        System.out.println(transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList()));

        //查找所有来自剑桥的交易员，并按姓名排序
        System.out.println(transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .sorted((o1, o2) -> {
                    return o1.getTrader().getName().charAt(0) - o2.getTrader().getName().charAt(0);
                })
                .collect(Collectors.toList()));

        //返回所有交易员的姓名字符串，并按字母顺序排序
        System.out.println(transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted((o1, o2) -> {
                    return o1.charAt(0) - o2.charAt(0);
                })
                .collect(Collectors.toList()));

        //有没有交易员在米兰工作的？
        System.out.println(transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .filter(transaction -> transaction.equals("Milan"))
                .anyMatch(t -> true));

        //打印生活在剑桥的交易员的所有交易额

    }
}

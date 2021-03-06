package ru.otus.atm;

import java.util.Map;
import java.util.TreeMap;

public class BalanceListener {

    private Map<String, Long> atmBalances = new TreeMap<>();

    public void addAtmBalance(String atmID, long balance) {
        atmBalances.put(atmID, balance);
    }

    public void printAll() {
        atmBalances.entrySet().forEach(System.out::println);
        System.out.println("Summary: " + balanceSummary());
    }

    public long balanceSummary() {
        long result = 0;
        for (Map.Entry<String, Long> oneBalance: atmBalances.entrySet()) {
            result += oneBalance.getValue();
        }
        return result;
    }
}

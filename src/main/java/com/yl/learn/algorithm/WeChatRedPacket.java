package com.yl.learn.algorithm;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class WeChatRedPacket {

    public static double[] red(int count, double money) {

        if(count <= 0 || money <= 0) {
            return null;
        }

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        double[] rs = new double[count];

        for(int i = 1; i <= count; i++) {
            rs[i - 1] = Double.parseDouble(decimalFormat.format(get(count, i, money)));
            money -= rs[i - 1];
        }

        return rs;
    }

    private static double get(int allCnt, int count, double remain) {


        if(allCnt == count) {
            return remain;
        }

        double rate;


        return remain * random();
    }

    private static double random() {
        Random random = new Random();
        double ranm = random.nextDouble();

        if(ranm == 0.00) {
            return random();
        }
        return ranm;
    }

public static void main(String[] args) {
    // Arrays.stream(red(4, 4)).forEach(dd -> System.out.println(dd));

    Arrays.stream(redPacket(4, 0.02)).forEach(dd -> System.out.println(dd));
}

public static double[] redPacket(int count, double money) {
    if(count <= 0 || money <= 0.00) {
        return null;
    }

    double[] rs = new double[count];

    for(int i = 1; i <= count; i++) {
        rs[i - 1] = randomPacket(count - i + 1, money);

        money -= rs[i - 1];
    }

    return rs;
}

private static double randomPacket(int remainCount, double remainMoney) {

    if(remainCount == 1) {
        return remainMoney;
    }

    double money = remainMoney / remainCount * 2 * Math.random();

    return Math.floor(money * 1000) / 1000;
}
}

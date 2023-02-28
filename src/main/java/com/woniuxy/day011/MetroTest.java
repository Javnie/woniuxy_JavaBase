package com.woniuxy.day011;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MetroTest {
    static Map<Integer, String> stations = new HashMap<>();

    public static void main(String[] args) {
        stations.put(1, "天府广场");
        stations.put(2, "省体育馆");
        stations.put(3, "倪家桥");
        stations.put(4, "火车南站");
        stations.put(5, "孵化园");
        stations.put(6, "世纪城");
        stations.put(7, "天府三街");
        stations.put(8, "天府五街");

//        for (Map.Entry<Integer, String> temp : stations.entrySet()) {
//            System.out.println(temp);
//        }

        Scanner scanner = new Scanner(System.in);
        String startName;
        String endName;
        int startNo;
        int endNo;

        System.out.println("请输入上车站：");
        while (true) {
            startName = scanner.next();
            try {
                if (searchStation(startName) != -1) {
                    startNo = searchStation(startName);
                    break;
                } else System.out.println("您的输入有误，请重新输入");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("请输入下车站：");
        while (true) {
            endName = scanner.next();
            try {
                if (searchStation(endName) != -1) {
                    endNo = searchStation(endName);
                    break;
                } else System.out.println("您的输入有误，请重新输入");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        BigDecimal price = null;
        try {
            price = toll(startNo, endNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            System.out.printf("从%s到%s共经过%s站收费%s元，大约需要%s分钟。", startName, endName, Math.abs(startNo - endNo), price, time(startNo, endNo));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 总行程 3站内（包含3站）收费3元，
     * 3站以上但不超过5站（包含5站）的收费4元，
     * 5站以上的，在4元的基础上，每多1站增加2元，
     * 10元封顶；
     *
     * @return 地铁车费
     */
    static BigDecimal toll(int start, int end) throws Exception {
        //数据有效性分析
        if (start <= 0 || end <= 0) throw new Exception("the input must be a correct station number");

        if (Math.abs(start - end) <= 3) return new BigDecimal(3);
        else if (Math.abs(start - end) <= 5) return new BigDecimal(4);
        else if (Math.abs(start - end) <= 8) return new BigDecimal(4 + (Math.abs(start - end) - 5) * 2);
        else return new BigDecimal(10);
    }

    /**
     * 对上车站和到达站进行判断
     *
     * @param name 车站名
     * @return 找到时返回车站编号，若未找到返回-1
     */
    static int searchStation(String name) throws Exception {
        //数据有效性分析
        if (name == null) throw new Exception("the input cannot be null");

        for (Map.Entry<Integer, String> temp : stations.entrySet()) {
            if (name.equals(temp.getValue())) return temp.getKey();
        }
        return -1;
    }

    static int time(int start, int end) throws Exception {
        //数据有效性分析
        if (start <= 0 || end <= 0) throw new Exception("the input must be a correct station number");

        return Math.abs((start - end) * 2);
    }
}

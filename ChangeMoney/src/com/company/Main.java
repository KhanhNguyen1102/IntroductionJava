package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int VND_USD = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số USD : ");
        int usd = scanner.nextInt();
        int vnd = usd*VND_USD;
        System.out.println("Số tiền VND tương ứng là : " + vnd);
    }
}

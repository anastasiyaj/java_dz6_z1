package ru.netology.sqr;

public class SQRService {
    public int calcSQR(int min, int max) {
        int sum = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min && i * i <= max) {
                sum++;
            }
        }
        return sum;
    }
}
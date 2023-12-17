package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long resultSale = 0;
        for (long sale : sales) {
            resultSale += sale;
        }
        return resultSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public  int calcMonthMaxSale(long[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMax] <= sales[i]) {
                monthMax = i;
            }
        }
        return monthMax + 1;
    }

    public  int calcMonthMinSale(long[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMin] >= sales[i]) {
                monthMin = i;
            }
        }
        return monthMin + 1;
    }

    public int calcMonthsBelowAverage(long[] sales) {
        int count = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                count++;
            }

        }
        return count;
    }

    public int calcMonthsAboveAverage(long[] sales) {
        int count = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                count++;
            }

        }
        return count;
    }
}

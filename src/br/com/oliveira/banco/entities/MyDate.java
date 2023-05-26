/*
 */
package br.com.oliveira.banco.entities;

/**
 *
 * @author jonathan_oliveira
 */
public class MyDate {
    private int day;
    private int month;
    private int year;
    
    public MyDate(int day, int month, int year){
        this.day = day;
        this.year = year;
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}

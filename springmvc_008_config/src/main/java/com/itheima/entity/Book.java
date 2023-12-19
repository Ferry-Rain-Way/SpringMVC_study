package com.itheima.entity;

/**
 * @Version 1.0
 * @Date: 2023/11/27 0:42
 * @ClassName : Book
 * @Author : GUO_HONG_YU
 * @Description: TODO
 */

public class Book {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "书名='" + name + '\'' +
                ", 价格=" + price +
                '}';
    }
}

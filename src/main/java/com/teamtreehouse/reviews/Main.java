package com.teamtreehouse.reviews;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            CSVPrinter printer = new CSVPrinter(System.out, CSVFormat.EXCEL);
            printer.printRecord("John", "Doe", 5, "Excellent!");
            printer.printRecord("Satoshi", "San", 4, "Good!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

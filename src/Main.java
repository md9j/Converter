/*
title: Converter
author: mJohnston
date: 09DEC2022
intent: application that will perform unit conversions for common digital units
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("  Unit Converter\n------------------\n");
        topMenu();
    }  // end main()

    /*************** methods ***************/

    public static void topMenu() {
        System.out.println("Options:\n-------\n");
        System.out.println("1. Convert\n2. Unit Chart, Basic\n3. Information\n4. About\n5. Exit");

        Scanner userInput = new Scanner(System.in);

        System.out.println("Menu Selection: ");
        int input = userInput.nextInt();

        if ((input <= 0) || (input >= 6)) {

            System.out.println("INPUT ERROR: selection must be a number between 1 and 5");
            topMenu();
        }  // end if

        switch (input) {
            case 1:
                convert();
                break;
            case 2:
                unitChartBasic();
                break;
            case 3:
                information();
                break;
            case 4:
                about();
                break;
            case 5:
                break;
        }  // end switch

        userInput.close();
    }  // end topMenu()

    public static void convert() {
        System.out.println("convert selected\n");
        topMenu();
    }  // end convert()

    public static void unitChartBasic() {

        System.out.printf("-----------------------------------------------------------------%n");
        System.out.printf("                 Common Digital Units of Measure%n");
        System.out.printf("                  (decimal and binary prefixes)%n");

        System.out.printf("-----------------------------------------------------------------%n");
        System.out.printf("| %-16s | %-10s | %-16s | %-10s |%n", "D-Components", "Decimal", "B-Components", "Binary");
        System.out.printf("-----------------------------------------------------------------%n");

        System.out.printf("| %-16s | %-10s | %-16s | %-10s |%n", "1 Bit", "Bit", "1 Bit", "Bit");
        System.out.printf("| %-16s | %-10s | %-16s | %-10s |%n", "4 Bits", "Nibble", "4 Bits", "Nibble");
        System.out.printf("| %-16s | %-10s | %-16s | %-10s |%n", "2 Nibbles", "Byte", "2 Nibbles", "Byte");
        System.out.printf("| %-16s | %-10s | %-16s | %-10s |%n", "1000 Bytes", "Kilobyte", "1024 Bytes", "Kibibyte");
        System.out.printf("| %-16s | %-10s | %-16s | %-10s |%n", "1000 Kilobytes", "Megabyte", "1024 Kibibytes", "Mebibyte");
        System.out.printf("| %-16s | %-10s | %-16s | %-10s |%n", "1000 Megabytes", "Gigabyte", "1024 Mebibytes", "Gibibyte");
        System.out.printf("| %-16s | %-10s | %-16s | %-10s |%n", "1000 Gigabytes", "Terabyte", "1024 Gibibytes", "Tebibyte");
        System.out.printf("| %-16s | %-10s | %-16s | %-10s |%n", "1000 Terabytes", "Petabyte", "1024 Tebibytes", "Pebibyte");
        System.out.printf("| %-16s | %-10s | %-16s | %-10s |%n", "1000 Petabytes", "Exabyte", "1024 Pebibytes", "Exbibyte");
        System.out.printf("| %-16s | %-10s | %-16s | %-10s |%n", "1000 Exabytes", "Zettabyte", "1042 Exbibytes", "Zebibyte");
        System.out.printf("| %-16s | %-10s | %-16s | %-10s |%n", "1000 Zettabytes", "Yottabyte", "1042 Zebibytes", "Yobibyte");

        System.out.printf("-----------------------------------------------------------------%n");

        System.out.println("\n");
        topMenu();

    }  // end displayAvailableUnits()

    public static void information() {
        System.out.println("Units Information\n");
        System.out.println("When is it a kilobyte instead of a kibibyte? And a MB instead a MiB?\n" +
                "Quite often is the short answer.\n" +
                "\n" +
                "Have you ever wondered why your 500 GB hard drive only has about 488 gigabytes once it has been formatted? While most operating systems utilize the binary number system to express file data size, the prefixes for the multiples are based on the metric system. So even though a metric \"kilo\" equals 1000, a binary \"kilo\" equals 1024. Are you confused yet? Don't be surprised, because even the most tech-savvy people often mistake the two. Plainly put, the kilobyte is often intended as 1000 bytes, but it is really 1024 bytes.\n" +
                "\n" +
                "\n" +
                "Essentially it boils down to differences between binary and decimal units and the two should be carefully separated. For example, the difference between the transfer time of a 1 gigabyte (1000 Megabytes) file is going to be significantly better than a true binary gigabyte (referred to as a gibibyte) that contains 1024 megabytes. The larger the file used for data transfer, the bigger the difference will be.\n");
        System.out.println("International Electrotechmical Commision\nhttps://www.iec.ch/prefixes-binary-multiples\n\n");
        topMenu();
    }  // end information)

    public static void about() {
        System.out.println("About\n");
        System.out.println("This is part one of a three part project.\nPart:\n\t1. Terminal based\n\t2. Graphical User Interface (GUI) based\n\t3. Web-based Application");
        System.out.println("\n\n");
        topMenu();
    }  // end about()
}  // end Main{}
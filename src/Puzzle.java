
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Puzzle extends JFrame implements ActionListener {

    boolean yes = false;
    JLabel timeLabel;
    String[] array = {" ", "1", "2", "3", "4", "5", "6", "7", "8"};
    Color[] colors = {Color.white, Color.CYAN, Color.GREEN, Color.MAGENTA, Color.PINK, Color.RED, Color.YELLOW, Color.BLUE, Color.lightGray};

    public static String[] removeTheElement(String[] arr, int index) {

        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }

        // Create another array of size one less
        String[] anotherArray = new String[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }

    public static Color[] removeElement(Color[] arr, int index) {

        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }

        // Create another array of size one less
        Color[] anotherArray = new Color[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }

    int min = 0;
    int max = 8;
    int maxc = 8;
    int minc = 0;


    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, next, start, exit;
    Color c1, c2, c3, c4, c5, c6, c7, c8, c9;

    Puzzle() {
        timeLabel = new JLabel();
        timeLabel.setPreferredSize(new Dimension(400, 100));
        add(timeLabel);
        timeLabel.setVisible(false);
        timeLabel.setBounds(210, 20, 50, 50);
        int val = (int) Math.floor(Math.random() * (max - min + 1) + min);
        b1 = new JButton(array[val]);
        int vc1 = (int) Math.floor(Math.random() * (maxc - minc + 1) + minc);
        c1 = colors[vc1];
        b1.setBackground(c1);
        colors = removeElement(colors, vc1);
        maxc--;
        array = removeTheElement(array, val);
        max--;

        int val1 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int vc2 = (int) Math.floor(Math.random() * (maxc - minc + 1) + minc);
        b2 = new JButton(array[val1]);
        c2 = colors[vc2];
        b2.setBackground(c2);
        colors = removeElement(colors, vc2);
        maxc--;
        array = removeTheElement(array, val1);
        max--;
        int val3 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int vc3 = (int) Math.floor(Math.random() * (maxc - minc + 1) + minc);
        b3 = new JButton(array[val3]);
        c3 = colors[vc3];
        b3.setBackground(c3);
        colors = removeElement(colors, vc3);
        maxc--;

        array = removeTheElement(array, val3);
        max--;
        int val4 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int vc4 = (int) Math.floor(Math.random() * (maxc - minc + 1) + minc);
        b4 = new JButton(array[val4]);
        c4 = colors[vc4];
        b4.setBackground(c4);
        colors = removeElement(colors, vc4);
        maxc--;

        array = removeTheElement(array, val4);
        max--;
        int val5 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int vc5 = (int) Math.floor(Math.random() * (maxc - minc + 1) + minc);
        b5 = new JButton(array[val5]);
        c5 = colors[vc5];
        b5.setBackground(c5);
        colors = removeElement(colors, vc5);
        maxc--;

        array = removeTheElement(array, val5);
        max--;
        int val6 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        b6 = new JButton(array[val6]);
        int vc6 = (int) Math.floor(Math.random() * (maxc - minc + 1) + minc);
        c6 = colors[vc6];
        b6.setBackground(c6);
        colors = removeElement(colors, vc6);
        array = removeTheElement(array, val6);
        max--;
        maxc--;
        int val7 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        b7 = new JButton(array[val7]);
        int vc7 = (int) Math.floor(Math.random() * (maxc - minc + 1) + minc);
        c7 = colors[vc7];
        b7.setBackground(c7);
        colors = removeElement(colors, vc7);
        array = removeTheElement(array, val7);
        max--;
        maxc--;
        int val8 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        b8 = new JButton(array[val8]);
        int vc8 = (int) Math.floor(Math.random() * (maxc - minc + 1) + minc);
        c8 = colors[vc8];
        b8.setBackground(c8);
        colors = removeElement(colors, vc8);
        array = removeTheElement(array, val8);
        max--;
        maxc--;
        int val9 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        b9 = new JButton(array[val9]);
        int vc9 = (int) Math.floor(Math.random() * (maxc - minc + 1) + minc);
        c9 = colors[vc9];
        b9.setBackground(c9);
        colors = removeElement(colors, vc9);
        array = removeTheElement(array, val9);
        max--;
        maxc--;
        next = new JButton("NEXT");
        start = new JButton("START");
        exit = new JButton("EXIT");

        b1.setBounds(10, 30, 60, 50);
        b2.setBounds(70, 30, 60, 50);
        b3.setBounds(130, 30, 55, 50);
        b4.setBounds(10, 80, 60, 50);
        b5.setBounds(70, 80, 60, 50);
        b6.setBounds(130, 80, 55, 50);
        b7.setBounds(10, 130, 60, 50);
        b8.setBounds(70, 130, 60, 50);
        b9.setBounds(130, 130, 55, 50);
        next.setBounds(10, 200, 100, 40);
        start.setBounds(80, 100, 100, 40);
        exit.setBounds(130, 200, 100, 40);
        start.setForeground(Color.WHITE);
        start.setBackground(Color.RED);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(next);
        add(start);
        add(exit);


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        next.addActionListener(this);
        start.addActionListener(this);
        exit.addActionListener(this);
        next.setBackground(Color.WHITE);
        next.setForeground(Color.black);
        exit.setBackground(Color.WHITE);
        exit.setForeground(Color.RED);

        setSize(280, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        b1.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
        b4.setVisible(false);
        b5.setVisible(false);
        b6.setVisible(false);
        b7.setVisible(false);
        b8.setVisible(false);
        b9.setVisible(false);
        next.setVisible(false);
        exit.setVisible(false);


    }//end of constructor

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit) {
            dispose();

        }
        if (e.getSource() == next) {
            max = 8;
            maxc = 8;
            String[] array1 = {" ", "1", "2", "3", "4", "5", "6", "7", "8"};
            Color[] colors1 = {Color.white, Color.CYAN, Color.GREEN, Color.MAGENTA, Color.PINK, Color.RED, Color.YELLOW, Color.BLUE, Color.lightGray};

            int v1 = (int) Math.floor(Math.random() * (max - min + 1) + min);
            b1.setLabel(array1[v1]);
            int vc11 = (int) Math.floor(Math.random() * (maxc - minc + 1) + minc);
            c1 = colors1[vc11];
            b1.setBackground(c1);
            colors1 = removeElement(colors1, vc11);
            maxc--;
            array1 = removeTheElement(array1, v1);
            max--;
            int v2 = (int) Math.floor(Math.random() * (max - min + 1) + min);
            b2.setLabel(array1[v2]);
            int vc12 = (int) Math.floor(Math.random() * (maxc - minc + 1) + minc);
            c2 = colors1[vc12];
            b2.setBackground(c2);
            colors1 = removeElement(colors1, vc12);
            maxc--;
            array1 = removeTheElement(array1, v2);
            max--;
            int v3 = (int) Math.floor(Math.random() * (max - min + 1) + min);
            b3.setLabel(array1[v3]);
            int vc13 = (int) Math.floor(Math.random() * (maxc - minc + 1) + minc);
            c3 = colors1[vc13];
            b3.setBackground(c3);
            colors1 = removeElement(colors1, vc13);
            maxc--;
            array1 = removeTheElement(array1, v3);
            max--;
            int v4 = (int) Math.floor(Math.random() * (max - min + 1) + min);
            b4.setLabel(array1[v4]);
            int vc14 = (int) Math.floor(Math.random() * (maxc - minc + 1) + minc);
            c4 = colors1[vc14];
            b4.setBackground(c4);
            colors1 = removeElement(colors1, vc14);
            maxc--;
            array1 = removeTheElement(array1, v4);
            max--;
            int v5 = (int) Math.floor(Math.random() * (max - min + 1) + min);
            b5.setLabel(array1[v5]);
            int vc15 = (int) Math.floor(Math.random() * (maxc - minc + 1) + minc);
            c5 = colors1[vc15];
            b5.setBackground(c5);
            colors1 = removeElement(colors1, vc15);
            maxc--;
            array1 = removeTheElement(array1, v5);
            max--;
            int v6 = (int) Math.floor(Math.random() * (max - min + 1) + min);
            b6.setLabel(array1[v6]);
            int vc16 = (int) Math.floor(Math.random() * (maxc - minc + 1) + minc);
            c6 = colors1[vc16];
            b6.setBackground(c6);
            colors1 = removeElement(colors1, vc16);
            maxc--;
            array1 = removeTheElement(array1, v6);
            max--;
            int v7 = (int) Math.floor(Math.random() * (max - min + 1) + min);
            b7.setLabel(array1[v7]);
            int vc17 = (int) Math.floor(Math.random() * (maxc - minc + 1) + minc);
            c7 = colors1[vc17];
            b7.setBackground(c7);
            colors1 = removeElement(colors1, vc17);
            maxc--;
            array1 = removeTheElement(array1, v7);
            max--;
            int v8 = (int) Math.floor(Math.random() * (max - min + 1) + min);
            b8.setLabel(array1[v8]);
            int vc18 = (int) Math.floor(Math.random() * (maxc - minc + 1) + minc);
            c8 = colors1[vc18];
            b8.setBackground(c8);
            colors1 = removeElement(colors1, vc18);
            maxc--;
            array1 = removeTheElement(array1, v8);
            max--;
            int v9 = (int) Math.floor(Math.random() * (max - min + 1) + min);
            b9.setLabel(array1[v9]);
            int vc19 = (int) Math.floor(Math.random() * (maxc - minc + 1) + minc);
            c9 = colors1[vc19];
            b9.setBackground(c9);
            colors1 = removeElement(colors1, vc19);
            maxc--;
            array1 = removeTheElement(array1, v9);
            max--;
        }
        if (e.getSource() == start) {
            yes = true;
        }
        if (e.getSource() == b1) {
            String s = b1.getLabel();
            if (b2.getLabel().equals(" ")) {
                b2.setLabel(s);
                b1.setLabel(" ");
                b1.setBackground(c2);
                b2.setBackground(c1);
                Color a = c1;
                c1 = c2;
                c2 = a;


            } else if (b4.getLabel().equals(" ")) {
                b4.setLabel(s);
                b1.setLabel(" ");
                b1.setBackground(c4);
                b4.setBackground(c1);
                Color a = c1;
                c1 = c4;
                c4 = a;
            }
        }//end of if

        if (e.getSource() == b3) {
            String s = b3.getLabel();
            if (b2.getLabel().equals(" ")) {
                b2.setLabel(s);
                b3.setLabel(" ");
                b3.setBackground(c2);
                b2.setBackground(c3);
                Color a = c3;
                c3 = c2;
                c2 = a;
            } else if (b6.getLabel().equals(" ")) {
                b6.setLabel(s);
                b3.setLabel(" ");
                b3.setBackground(c6);
                b6.setBackground(c3);
                Color a = c3;
                c3 = c6;
                c6 = a;
            }
        }//end of if

        if (e.getSource() == b2) {
            String s = b2.getLabel();
            if (b1.getLabel().equals(" ")) {
                b1.setLabel(s);
                b2.setLabel(" ");
                b1.setBackground(c2);
                b2.setBackground(c1);
                Color a = c1;
                c1 = c2;
                c2 = a;
            } else if (b3.getLabel().equals(" ")) {
                b3.setLabel(s);
                b2.setLabel(" ");
                b3.setBackground(c2);
                b2.setBackground(c3);
                Color a = c3;
                c3 = c2;
                c2 = a;
            } else if (b5.getLabel().equals(" ")) {
                b5.setLabel(s);
                b2.setLabel(" ");
                b5.setBackground(c2);
                b2.setBackground(c5);
                Color a = c5;
                c5 = c2;
                c2 = a;
            }
        }//end of if

        if (e.getSource() == b4) {
            String s = b4.getLabel();
            if (b1.getLabel().equals(" ")) {
                b1.setLabel(s);
                b4.setLabel(" ");
                b4.setBackground(c1);
                b1.setBackground(c4);
                Color a = c4;
                c4 = c1;
                c1 = a;
            } else if (b7.getLabel().equals(" ")) {
                b7.setLabel(s);
                b4.setLabel(" ");
                b4.setBackground(c7);
                b7.setBackground(c4);
                Color a = c4;
                c4 = c7;
                c7 = a;
            } else if (b5.getLabel().equals(" ")) {
                b5.setLabel(s);
                b4.setLabel(" ");
                b4.setBackground(c5);
                b5.setBackground(c4);
                Color a = c4;
                c4 = c5;
                c5 = a;
            }
        }//end of if

        if (e.getSource() == b5) {
            String s = b5.getLabel();
            if (b2.getLabel().equals(" ")) {
                b2.setLabel(s);
                b5.setLabel(" ");
                b2.setBackground(c5);
                b5.setBackground(c2);
                Color a = c2;
                c2 = c5;
                c5 = a;
            } else if (b4.getLabel().equals(" ")) {
                b4.setLabel(s);
                b5.setLabel(" ");
                b4.setBackground(c5);
                b5.setBackground(c4);
                Color a = c4;
                c4 = c5;
                c5 = a;
            } else if (b6.getLabel().equals(" ")) {
                b6.setLabel(s);
                b5.setLabel(" ");
                b6.setBackground(c5);
                b5.setBackground(c6);
                Color a = c6;
                c6 = c5;
                c5 = a;
            } else if (b8.getLabel().equals(" ")) {
                b8.setLabel(s);
                b5.setLabel(" ");
                b8.setBackground(c5);
                b5.setBackground(c8);
                Color a = c8;
                c8 = c5;
                c5 = a;
            }
        }//end of if

        if (e.getSource() == b6) {

            String s = b6.getLabel();
            if (b9.getLabel().equals(" ")) {
                b9.setLabel(s);
                b6.setLabel(" ");
                b6.setBackground(c9);
                b9.setBackground(c6);
                Color a = c6;
                c6 = c9;
                c9 = a;
            } else if (b3.getLabel().equals(" ")) {
                b3.setLabel(s);
                b6.setLabel(" ");
                b6.setBackground(c3);
                b3.setBackground(c6);
                Color a = c6;
                c6 = c3;
                c3 = a;
            } else if (b5.getLabel().equals(" ")) {
                b5.setLabel(s);
                b6.setLabel(" ");
                b6.setBackground(c5);
                b5.setBackground(c6);
                Color a = c6;
                c6 = c5;
                c5 = a;
            }

        }//end of if

        if (e.getSource() == b7) {
            String s = b7.getLabel();
            if (b4.getLabel().equals(" ")) {
                b4.setLabel(s);
                b7.setLabel(" ");
                b4.setBackground(c7);
                b7.setBackground(c4);
                Color a = c4;
                c4 = c7;
                c7 = a;
            } else if (b8.getLabel().equals(" ")) {
                b8.setLabel(s);
                b7.setLabel(" ");
                b8.setBackground(c7);
                b7.setBackground(c8);
                Color a = c8;
                c8 = c7;
                c7 = a;
            }

        }//end of if

        if (e.getSource() == b8) {
            String s = b8.getLabel();
            if (b7.getLabel().equals(" ")) {
                b7.setLabel(s);
                b8.setLabel(" ");
                b8.setBackground(c7);
                b7.setBackground(c8);
                Color a = c8;
                c8 = c7;
                c7 = a;
            } else if (b9.getLabel().equals(" ")) {
                b9.setLabel(s);
                b8.setLabel(" ");
                b8.setBackground(c9);
                b9.setBackground(c8);
                Color a = c8;
                c8 = c9;
                c9 = a;
            } else if (b5.getLabel().equals(" ")) {
                b5.setLabel(s);
                b8.setLabel(" ");
                b8.setBackground(c5);
                b5.setBackground(c8);
                Color a = c8;
                c8 = c5;
                c5 = a;
            }

        }//end of if

        if (e.getSource() == b9) {
            String s = b9.getLabel();
            if (b6.getLabel().equals(" ")) {
                b6.setLabel(s);
                b9.setLabel(" ");
                b6.setBackground(c9);
                b9.setBackground(c6);
                Color a = c6;
                c6 = c9;
                c9 = a;
            } else if (b8.getLabel().equals(" ")) {
                b8.setLabel(s);
                b9.setLabel(" ");
                b8.setBackground(c9);
                b9.setBackground(c8);
                Color a = c8;
                c8 = c9;
                c9 = a;
            }

            if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel()
                    .equals("3") && b4.getLabel().equals("4") && b5.getLabel().equals("5")
                    && b6.getLabel().equals("6") && b7.getLabel().equals("7") && b8.getLabel()
                    .equals("8") && b9.getLabel().equals(" ")) {
                new Frame2();
            }
        }//end of if
        if (yes == true) {
            b1.setVisible(true);
            b2.setVisible(true);
            b3.setVisible(true);
            b4.setVisible(true);
            b5.setVisible(true);
            b6.setVisible(true);
            b7.setVisible(true);
            b8.setVisible(true);
            b9.setVisible(true);
            next.setVisible(true);
            start.setVisible(false);
            exit.setVisible(true);
            timeLabel.setVisible(true);


        }
    }//end of actionPerformed


    public static void main(String[] args) {
        new Puzzle();
    }//end of main


}//end of class
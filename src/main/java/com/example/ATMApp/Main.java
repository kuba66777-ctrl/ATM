package com.example.ATMApp;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import com.example.ATMApp.model.Account;
import com.example.ATMApp.service.ATMService;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main extends JFrame {
    private JPanel MainPanel;
    private JButton wyplataButton;
    private JButton saldoButton;
    private JButton wplataButton;

    public Main() {
        setContentPane(MainPanel);
        setTitle("Bankomat");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
        saldoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            //logika
            }
        });
        wplataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            //logika
            }
        });
        wyplataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            //logika
            }
        });
    }
    public static void main(String[] args) {
        new Main();
        Scanner scanner = new Scanner(System.in);

        boolean started = true;

        while (started) {
        showMenu();
        String sprawdz = scanner.nextLine();

        try {
        switch(sprawdz)
        {
            case "1" -> System.out.println("Saldo: " + "tu zmienna" + "PLN")
            case "2" ->
            case "3" ->
            case "4" ->

        }
          catch (NumberFormatExpection ex) {
            System.out.println("Błąd: możesz wpisać tylko kwote");
          catch (IllegalArgumentExpection ex) {
            System.out.println("Operacja odrzucona: " + ex.getMessage());
        }

        scanner.close();

    }

        void showMenu() {
            System.out.println();
            System.out.println("BANKOMAT");
            System.out.println("1. Saldo");
            System.out.println("2. Wpłata");
            System.out.println("3. Wypłata");
            System.out.println("4. Wyjście");
        }

    }



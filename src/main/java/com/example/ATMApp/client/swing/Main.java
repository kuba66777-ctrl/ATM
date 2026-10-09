package com.example.ATMApp;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import com.example.ATMApp.model.Account;
import com.example.ATMApp.service.ATMService;




public class Main extends JFrame {
    private JPanel MainPanel;
    private JButton wyplataButton;
    private JButton saldoButton;
    private JButton wplataButton;

        Account loggedAccount = new Account(666, 0);

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

            JOptionPane.showMessageDialog(Main.this, "Twoje saldo:  " + loggedAccount.balance + "PLN");

                         }
            });

        wplataButton.addActionListener(new ActionListener() {
                                           @Override
                                           public void actionPerformed(ActionEvent e) {

                                              String input = JOptionPane.showInputDialog(Main.this, "Podaj kwotę do wypłaty:");



                                               try {
                                                   double amount = Double.parseDouble(
                                                           input.trim().replace(',', '.')
                                                   );

                                                   if (amount <= 0) {
                                                       throw new IllegalArgumentException("Kwota musi być większa niż 0");


                                                   }

                                                       loggedAccount.deposit(amount);
                                                       JOptionPane.showMessageDialog(Main.this, "Wpłacono: " + amount + "PLN" + "Nowy stan konta: " + loggedAccount.balance + "PLN");


                                               } //catch (NumberFormatException ex) {

                                                  // JOptionPane.showMessageDialog(Main.this, "Błąd: musisz podać liczbę");
                                         //  }
                                                catch (IllegalArgumentException ex) {

                                                   JOptionPane.showMessageDialog(Main.this, "Operacja odrzucona: " + ex.getMessage());

                                               }
                                           }
                                       });
        wyplataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String input = JOptionPane.showInputDialog(this, "Podaj kwotę do wypłaty: ");

                try {
                    double amount = Double.parseDouble(input.replace(',', '.'));
                    if (amount <= 0) {
                        throw new IllegalArgumentException("Kwota musi być większa od 0");

                    } else if (amount > loggedAccount.balance) {
                        throw new IllegalArgumentException("Brak wystarczających środków");
                    }
                    loggedAccount.withdraw(amount);
                    JOptionPane.showMessageDialog(
                            Main.this,
                            "Wypłacono: " + amount + " PLN\n"
                                    + "Nowy stan konta: "
                                    + loggedAccount.balance + " PLN"
                    );

                } //catch (NumberFormatException ex) {
                    //JOptionPane.showMessageDialog(Main.this, "Musisz podać liczbę");
           // }
                 catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(Main.this, "Operacja odrzucona: " + ex.getMessage());

                }

            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main());
    }

}
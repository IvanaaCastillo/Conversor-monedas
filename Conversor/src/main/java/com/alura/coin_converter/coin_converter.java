package com.alura.coin_converter;
import com.alura.coin_converter.windows.ConverterWindow;

public class coin_converter {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
        ConverterWindow converter=new ConverterWindow();
        converter.setVisible(true);
        converter.setTitle("Conversor");
        converter.setLocationRelativeTo(null);
        });
    }
}
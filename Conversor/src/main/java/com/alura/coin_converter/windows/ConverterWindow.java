package com.alura.coin_converter.windows;
import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
/**
 *
 *
 */
public class ConverterWindow extends javax.swing.JFrame {
    private int xMouse,yMouse;
    private javax.swing.JPanel bodyConversorPanel;
    private javax.swing.JPanel containerConvPanel;
    private javax.swing.JPanel headerConversorPanel;
    private javax.swing.JLabel labelTextOption;
    private javax.swing.JLabel minLabel;
    private javax.swing.JLabel nextLabel;
    private javax.swing.JComboBox<String> optionsOfConversor;
    private javax.swing.JLabel salirLabel;
    private javax.swing.JLabel titleCoin;
    public ConverterWindow() {
        initComponents();
    }
    private void initComponents() {
        containerConvPanel = new javax.swing.JPanel();
        headerConversorPanel = new javax.swing.JPanel();
        minLabel = new javax.swing.JLabel();
        salirLabel = new javax.swing.JLabel();
        bodyConversorPanel = new javax.swing.JPanel();
        titleCoin = new javax.swing.JLabel();
        labelTextOption = new javax.swing.JLabel();
        optionsOfConversor = new javax.swing.JComboBox<>();
        nextLabel = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        containerConvPanel.setBackground(new java.awt.Color(57, 105, 138));
        headerConversorPanel.setBackground(new java.awt.Color(57, 105, 138));
        headerConversorPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerConversorPanelMouseDragged(evt);
            }
        });
        headerConversorPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerConversorPanelMousePressed(evt);
            }
        });
        minLabel.setFont(new java.awt.Font("Russo One", 1, 50));
        minLabel.setForeground(new java.awt.Color(153, 153, 153));
        minLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minLabel.setText("_");
        minLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        minLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minLabelMouseClicked(evt);
            }
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minLabelMouseEntered(evt);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minLabelMouseExited(evt);
            }
        });
        salirLabel.setFont(new java.awt.Font("Russo One", 0, 36));
        salirLabel.setForeground(new java.awt.Color(153, 153, 153));
        salirLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salirLabel.setText("X");
        salirLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirLabelMouseClicked(evt);
            }
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirLabelMouseEntered(evt);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirLabelMouseExited(evt);
            }
        });
        javax.swing.GroupLayout headerConversorPanelLayout = new javax.swing.GroupLayout(headerConversorPanel);
        headerConversorPanel.setLayout(headerConversorPanelLayout);
        headerConversorPanelLayout.setHorizontalGroup(
            headerConversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerConversorPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salirLabel)
                .addContainerGap())
        );
        headerConversorPanelLayout.setVerticalGroup(
            headerConversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerConversorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(minLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE))
            .addComponent(salirLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        bodyConversorPanel.setBackground(new java.awt.Color(57, 105, 138));
        titleCoin.setFont(new java.awt.Font("Russo One", 3, 48));
        titleCoin.setForeground(new java.awt.Color(204, 153, 0));
        titleCoin.setText("Conversor");
        labelTextOption.setFont(new java.awt.Font("Russo One", 2, 18));
        labelTextOption.setForeground(new java.awt.Color(204, 204, 204));
        labelTextOption.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTextOption.setText("Por favor seleccione el tipo de conversor que desea ejecutar.");
        optionsOfConversor.setBackground(new java.awt.Color(57, 105, 138));
        optionsOfConversor.setFont(new java.awt.Font("Russo One", 2, 16));
        optionsOfConversor.setForeground(new java.awt.Color(255, 255, 255));
        optionsOfConversor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Moneda" }));
        optionsOfConversor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 105, 138)));
        optionsOfConversor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextLabel.setBackground(new java.awt.Color(153, 153, 153));
        nextLabel.setFont(new java.awt.Font("Russo One", 1, 50));
        nextLabel.setForeground(new java.awt.Color(204, 153, 0));
        nextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nextLabel.setText(">");
        nextLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        nextLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nextLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextLabelMouseClicked(evt);
            }
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nextLabelMouseEntered(evt);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nextLabelMouseExited(evt);
            }
        });
        javax.swing.GroupLayout bodyConversorPanelLayout = new javax.swing.GroupLayout(bodyConversorPanel);
        bodyConversorPanel.setLayout(bodyConversorPanelLayout);
        bodyConversorPanelLayout.setHorizontalGroup(
            bodyConversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyConversorPanelLayout.createSequentialGroup()
                .addComponent(labelTextOption, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyConversorPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(bodyConversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyConversorPanelLayout.createSequentialGroup()
                        .addComponent(titleCoin, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyConversorPanelLayout.createSequentialGroup()
                        .addComponent(nextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(bodyConversorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(optionsOfConversor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodyConversorPanelLayout.setVerticalGroup(
            bodyConversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyConversorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleCoin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(labelTextOption)
                .addGap(18, 18, 18)
                .addComponent(optionsOfConversor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        javax.swing.GroupLayout containerConvPanelLayout = new javax.swing.GroupLayout(containerConvPanel);
        containerConvPanel.setLayout(containerConvPanelLayout);
        containerConvPanelLayout.setHorizontalGroup(
            containerConvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerConversorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bodyConversorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        containerConvPanelLayout.setVerticalGroup(
            containerConvPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerConvPanelLayout.createSequentialGroup()
                .addComponent(headerConversorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyConversorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(containerConvPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerConvPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pack();
    }
    private void salirLabelMouseClicked(java.awt.event.MouseEvent evt) {                                        
        var buttonMouse=evt.getButton();
        switch(buttonMouse){
            case 1 -> System.exit(0);
        }
    }
    private void salirLabelMouseEntered(java.awt.event.MouseEvent evt) {                                        
        salirLabel.setForeground(new Color(204,0,0));
    }
    private void salirLabelMouseExited(java.awt.event.MouseEvent evt) {                                       
        salirLabel.setForeground(new Color(153,153,153));
    }
    private void nextLabelMouseClicked(java.awt.event.MouseEvent evt) {                                       
        var selected=optionsOfConversor.getSelectedItem().toString();
        var buttonMouse=evt.getButton();
        switch (selected) {
            case "Moneda" -> {
                if (buttonMouse == 1) {
                    this.dispose();
                    java.awt.EventQueue.invokeLater(() -> {
                        Coin c = new Coin();
                        c.setVisible(true);
                        c.setTitle("Conversor: Moneda");
                        c.setLocationRelativeTo(null);
                    });
                }
            }
        }
    }
    private void nextLabelMouseEntered(java.awt.event.MouseEvent evt) {                                       
        nextLabel.setForeground(new Color(153,153,153));
    }
    private void nextLabelMouseExited(java.awt.event.MouseEvent evt) {                                      
        nextLabel.setForeground(new Color(204,153,0));
    }
    private void minLabelMouseClicked(java.awt.event.MouseEvent evt) {                                      
        if (evt.getButton() == MouseEvent.BUTTON1) {
            this.setExtendedState(JFrame.ICONIFIED);
        }
    }
    private void minLabelMouseEntered(java.awt.event.MouseEvent evt) {                                      
        minLabel.setForeground(Color.WHITE);
    }
    private void minLabelMouseExited(java.awt.event.MouseEvent evt) {                                     
        minLabel.setForeground(new Color(153,153,153));
    }
    private void headerConversorPanelMousePressed(java.awt.event.MouseEvent evt) {                                                  
        xMouse=evt.getX();
        yMouse=evt.getY();
    }
    private void headerConversorPanelMouseDragged(java.awt.event.MouseEvent evt) {                                                  
        var x=evt.getXOnScreen();
        var y=evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }
}
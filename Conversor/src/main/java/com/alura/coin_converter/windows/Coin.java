package com.alura.coin_converter.windows;
import com.alura.coin_converter.logic.Converter;
import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;
/**
 *
 *
 */
public class Coin extends javax.swing.JFrame{
    private int xMouse,yMouse;
    private final String error="Ingresó un valor no numérico. Inténtelo nuevamente.";
    private javax.swing.JLabel backLabel;
    private javax.swing.JPanel bodyCoinPanel;
    private javax.swing.JRadioButton btnCLP_EURO5;
    private javax.swing.JRadioButton btnCLP_LIBRA5;
    private javax.swing.JRadioButton btnCLP_USD5;
    private javax.swing.JRadioButton btnCLP_YEN5;
    private javax.swing.JRadioButton btnEURO_CLP5;
    private javax.swing.JRadioButton btnLibra_CLP5;
    private javax.swing.ButtonGroup btnRadioCoin;
    private javax.swing.JRadioButton btnUSD_CLP5;
    private javax.swing.JRadioButton btnYEN_CLP5;
    private javax.swing.JPanel containerCoinPanel;
    private javax.swing.JPanel headerCoinPanel;
    private javax.swing.JLabel instructionLabel1;
    private javax.swing.JLabel labelOptionCoin5;
    private javax.swing.JLabel labelResultCoin5;
    private javax.swing.JLabel labelTitleResultCoin5;
    private javax.swing.JLabel salirLabel;
    private javax.swing.JSeparator separatorResult5;
    private javax.swing.JSeparator separatorTitle;
    private javax.swing.JSeparator sepatatorText1;
    private javax.swing.JLabel titleCoin;
    private javax.swing.JTextField txtFieldCoin1;
    public Coin(){
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
        btnRadioCoin = new javax.swing.ButtonGroup();
        containerCoinPanel = new javax.swing.JPanel();
        headerCoinPanel = new javax.swing.JPanel();
        salirLabel = new javax.swing.JLabel();
        titleCoin = new javax.swing.JLabel();
        separatorTitle = new javax.swing.JSeparator();
        backLabel = new javax.swing.JLabel();
        bodyCoinPanel = new javax.swing.JPanel();
        labelOptionCoin5 = new javax.swing.JLabel();
        btnCLP_USD5 = new javax.swing.JRadioButton();
        btnCLP_EURO5 = new javax.swing.JRadioButton();
        btnCLP_LIBRA5 = new javax.swing.JRadioButton();
        btnCLP_YEN5 = new javax.swing.JRadioButton();
        btnUSD_CLP5 = new javax.swing.JRadioButton();
        btnYEN_CLP5 = new javax.swing.JRadioButton();
        labelTitleResultCoin5 = new javax.swing.JLabel();
        labelResultCoin5 = new javax.swing.JLabel();
        separatorResult5 = new javax.swing.JSeparator();
        btnEURO_CLP5 = new javax.swing.JRadioButton();
        btnLibra_CLP5 = new javax.swing.JRadioButton();
        sepatatorText1 = new javax.swing.JSeparator();
        txtFieldCoin1 = new javax.swing.JTextField(){
            int maxLength=12;
            @Override
            protected Document createDefaultModel() {
                return new PlainDocument() {
                    @Override
                    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                        if (str == null) {
                            return;
                        }
                        if ((getLength() + str.length()) <= maxLength) {
                            super.insertString(offs, str, a);
                        }
                    }
                };
            }
        };
        instructionLabel1 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(57, 105, 138));
        setUndecorated(true);
        containerCoinPanel.setBackground(new java.awt.Color(57, 105, 138));
        headerCoinPanel.setBackground(new java.awt.Color(57, 105, 138));
        headerCoinPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerCoinPanelMouseDragged(evt);
            }
        });
        headerCoinPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerCoinPanelMousePressed(evt);
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
        titleCoin.setFont(new java.awt.Font("Russo One", 3, 48));
        titleCoin.setForeground(new java.awt.Color(204, 153, 0));
        titleCoin.setText("Moneda");
        separatorTitle.setBackground(new java.awt.Color(153, 153, 153));
        separatorTitle.setForeground(new java.awt.Color(153, 153, 153));
        backLabel.setFont(new java.awt.Font("Russo One", 0, 48));
        backLabel.setForeground(new java.awt.Color(153, 153, 153));
        backLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backLabel.setText("<");
        backLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backLabelMouseEntered(evt);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backLabelMouseExited(evt);
            }
        });
        javax.swing.GroupLayout headerCoinPanelLayout = new javax.swing.GroupLayout(headerCoinPanel);
        headerCoinPanel.setLayout(headerCoinPanelLayout);
        headerCoinPanelLayout.setHorizontalGroup(
            headerCoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerCoinPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(headerCoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separatorTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(headerCoinPanelLayout.createSequentialGroup()
                        .addComponent(titleCoin, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salirLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        headerCoinPanelLayout.setVerticalGroup(
            headerCoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerCoinPanelLayout.createSequentialGroup()
                .addGroup(headerCoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salirLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(headerCoinPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleCoin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(backLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bodyCoinPanel.setBackground(new java.awt.Color(57, 105, 138));
        labelOptionCoin5.setFont(new java.awt.Font("Russo One", 2, 24));
        labelOptionCoin5.setForeground(new java.awt.Color(204, 153, 0));
        labelOptionCoin5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelOptionCoin5.setText("Tipo de cambio:");
        btnCLP_USD5.setBackground(new java.awt.Color(57, 105, 138));
        btnRadioCoin.add(btnCLP_USD5);
        btnCLP_USD5.setFont(new java.awt.Font("Russo One", 3, 16));
        btnCLP_USD5.setForeground(new java.awt.Color(204, 204, 204));
        btnCLP_USD5.setText("CLP$ - U$D");
        btnCLP_USD5.setBorder(null);
        btnCLP_USD5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCLP_USD5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCLP_USD5.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnCLP_USD5ActionPerformed(evt);
        });
        btnCLP_EURO5.setBackground(new java.awt.Color(57, 105, 138));
        btnRadioCoin.add(btnCLP_EURO5);
        btnCLP_EURO5.setFont(new java.awt.Font("Russo One", 3, 16));
        btnCLP_EURO5.setForeground(new java.awt.Color(204, 204, 204));
        btnCLP_EURO5.setText("CLP$ - €uro");
        btnCLP_EURO5.setBorder(null);
        btnCLP_EURO5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCLP_EURO5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCLP_EURO5.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnCLP_EURO4ActionPerformed(evt);
        });
        btnCLP_LIBRA5.setBackground(new java.awt.Color(57, 105, 138));
        btnRadioCoin.add(btnCLP_LIBRA5);
        btnCLP_LIBRA5.setFont(new java.awt.Font("Russo One", 3, 16));
        btnCLP_LIBRA5.setForeground(new java.awt.Color(204, 204, 204));
        btnCLP_LIBRA5.setText("CLP$ - £ibra");
        btnCLP_LIBRA5.setBorder(null);
        btnCLP_LIBRA5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCLP_LIBRA5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCLP_LIBRA5.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnCLP_LIBRA5ActionPerformed(evt);
        });
        btnCLP_YEN5.setBackground(new java.awt.Color(57, 105, 138));
        btnRadioCoin.add(btnCLP_YEN5);
        btnCLP_YEN5.setFont(new java.awt.Font("Russo One", 3, 16));
        btnCLP_YEN5.setForeground(new java.awt.Color(204, 204, 204));
        btnCLP_YEN5.setText("CLP$ - ¥en");
        btnCLP_YEN5.setBorder(null);
        btnCLP_YEN5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCLP_YEN5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCLP_YEN5.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnCLP_YEN4ActionPerformed(evt);
        });
        btnUSD_CLP5.setBackground(new java.awt.Color(57, 105, 138));
        btnRadioCoin.add(btnUSD_CLP5);
        btnUSD_CLP5.setFont(new java.awt.Font("Russo One", 3, 16));
        btnUSD_CLP5.setForeground(new java.awt.Color(204, 204, 204));
        btnUSD_CLP5.setText("U$D - CLP$");
        btnUSD_CLP5.setBorder(null);
        btnUSD_CLP5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUSD_CLP5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUSD_CLP5.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnUSD_CLP5ActionPerformed(evt);
        });
        btnYEN_CLP5.setBackground(new java.awt.Color(57, 105, 138));
        btnRadioCoin.add(btnYEN_CLP5);
        btnYEN_CLP5.setFont(new java.awt.Font("Russo One", 3, 16));
        btnYEN_CLP5.setForeground(new java.awt.Color(204, 204, 204));
        btnYEN_CLP5.setText("¥en - CLP$");
        btnYEN_CLP5.setBorder(null);
        btnYEN_CLP5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnYEN_CLP5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnYEN_CLP5.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnYEN_CLPActionPerformed(evt);
        });
        labelTitleResultCoin5.setFont(new java.awt.Font("Russo One", 2, 18));
        labelTitleResultCoin5.setForeground(new java.awt.Color(204, 153, 0));
        labelTitleResultCoin5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelTitleResultCoin5.setText("Respuesta:");
        labelResultCoin5.setFont(new java.awt.Font("Russo One", 0, 18));
        labelResultCoin5.setForeground(new java.awt.Color(40, 82, 113));
        labelResultCoin5.setText("");
        labelResultCoin5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        separatorResult5.setBackground(new java.awt.Color(204, 153, 0));
        separatorResult5.setForeground(new java.awt.Color(204, 153, 0));
        btnEURO_CLP5.setBackground(new java.awt.Color(57, 105, 138));
        btnRadioCoin.add(btnEURO_CLP5);
        btnEURO_CLP5.setFont(new java.awt.Font("Russo One", 3, 16));
        btnEURO_CLP5.setForeground(new java.awt.Color(204, 204, 204));
        btnEURO_CLP5.setText("€uro - CLP$");
        btnEURO_CLP5.setBorder(null);
        btnEURO_CLP5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEURO_CLP5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEURO_CLP5.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnEURO_CLP5ActionPerformed(evt);
        });
        btnLibra_CLP5.setBackground(new java.awt.Color(57, 105, 138));
        btnRadioCoin.add(btnLibra_CLP5);
        btnLibra_CLP5.setFont(new java.awt.Font("Russo One", 3, 16));
        btnLibra_CLP5.setForeground(new java.awt.Color(204, 204, 204));
        btnLibra_CLP5.setText("£ibra - CLP$");
        btnLibra_CLP5.setBorder(null);
        btnLibra_CLP5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLibra_CLP5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLibra_CLP5.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnLibra_CLP5ActionPerformed(evt);
        });
        sepatatorText1.setBackground(new java.awt.Color(204, 153, 0));
        sepatatorText1.setForeground(new java.awt.Color(204, 153, 0));
        txtFieldCoin1.setBackground(new java.awt.Color(57, 105, 138));
        txtFieldCoin1.setFont(new java.awt.Font("Russo One", 0, 14));
        txtFieldCoin1.setForeground(new java.awt.Color(40, 82, 113));
        txtFieldCoin1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFieldCoin1.setText("MONTO");
        txtFieldCoin1.setBorder(null);
        txtFieldCoin1.setCaretColor(new java.awt.Color(57, 105, 138));
        txtFieldCoin1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFieldCoin1MousePressed(evt);
            }
        });
        instructionLabel1.setFont(new java.awt.Font("Russo One", 2, 18));
        instructionLabel1.setForeground(new java.awt.Color(204, 153, 0));
        instructionLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instructionLabel1.setText("Coloque el monto y luego seleccione el tipo de cambio. ");
        javax.swing.GroupLayout bodyCoinPanelLayout = new javax.swing.GroupLayout(bodyCoinPanel);
        bodyCoinPanel.setLayout(bodyCoinPanelLayout);
        bodyCoinPanelLayout.setHorizontalGroup(
            bodyCoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyCoinPanelLayout.createSequentialGroup()
                .addGroup(bodyCoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyCoinPanelLayout.createSequentialGroup()
                        .addGroup(bodyCoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bodyCoinPanelLayout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(labelTitleResultCoin5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bodyCoinPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelResultCoin5)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyCoinPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(separatorResult5, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodyCoinPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(bodyCoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyCoinPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(sepatatorText1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bodyCoinPanelLayout.createSequentialGroup()
                                .addGroup(bodyCoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelOptionCoin5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(instructionLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFieldCoin1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(bodyCoinPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(bodyCoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnEURO_CLP5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnUSD_CLP5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnLibra_CLP5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnYEN_CLP5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnCLP_USD5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnCLP_EURO5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnCLP_LIBRA5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnCLP_YEN5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        bodyCoinPanelLayout.setVerticalGroup(
            bodyCoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyCoinPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(instructionLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldCoin1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sepatatorText1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelOptionCoin5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUSD_CLP5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEURO_CLP5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLibra_CLP5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnYEN_CLP5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCLP_USD5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCLP_EURO5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCLP_LIBRA5)
                .addGap(12, 12, 12)
                .addComponent(btnCLP_YEN5)
                .addGap(9, 9, 9)
                .addComponent(labelTitleResultCoin5)
                .addGap(18, 18, 18)
                .addComponent(labelResultCoin5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorResult5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        javax.swing.GroupLayout containerCoinPanelLayout = new javax.swing.GroupLayout(containerCoinPanel);
        containerCoinPanel.setLayout(containerCoinPanelLayout);
        containerCoinPanelLayout.setHorizontalGroup(
            containerCoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyCoinPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(headerCoinPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        containerCoinPanelLayout.setVerticalGroup(
            containerCoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerCoinPanelLayout.createSequentialGroup()
                .addComponent(headerCoinPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyCoinPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerCoinPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(containerCoinPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pack();
    }
    //YEN_CLP
    private void btnYEN_CLPActionPerformed(java.awt.event.ActionEvent evt) {                                           
        var flot=Converter.yenToClp(getCoin());
        var bd=BigDecimal.valueOf(flot).setScale(3,RoundingMode.HALF_UP);
        labelResultCoin5.setText(bd.toString());
        labelResultCoin5.setForeground(new Color(204,153,0));
    }
    //CLP-YEN
    private void btnCLP_YEN4ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        var flot=Converter.clpToYen(getCoin());
        var bd=BigDecimal.valueOf(flot).setScale(3,RoundingMode.HALF_UP);
        labelResultCoin5.setText(bd.toString());
        labelResultCoin5.setForeground(new Color(204,153,0));
    }
    //CLP-EURO
    private void btnCLP_EURO4ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        var flot=Converter.clpToEuro(getCoin());
        var bd=BigDecimal.valueOf(flot).setScale(3,RoundingMode.HALF_UP);
        labelResultCoin5.setText(bd.toString());
        labelResultCoin5.setForeground(new Color(204,153,0));
    }
    private void headerCoinPanelMousePressed(java.awt.event.MouseEvent evt) {                                             
        xMouse=evt.getX();
        yMouse=evt.getY();
    }
    private void headerCoinPanelMouseDragged(java.awt.event.MouseEvent evt) {                                             
        var x=evt.getXOnScreen();
        var y=evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
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
    public void backLabelMouseClicked(java.awt.event.MouseEvent evt) {                                       
        var buttonMouse=evt.getButton();
        switch(buttonMouse){
            case 1 -> {
                this.dispose();
                java.awt.EventQueue.invokeLater(() -> {
                    ConverterWindow conv=new ConverterWindow();
                    conv.setVisible(true);
                    conv.setTitle("Conversor");
                    conv.setLocationRelativeTo(null);
                });
                break;
            }
        }
    }
    private void backLabelMouseEntered(java.awt.event.MouseEvent evt) {                                       
        backLabel.setForeground(new Color(204,153,0));
    }
    private void backLabelMouseExited(java.awt.event.MouseEvent evt) {                                      
        backLabel.setForeground(new Color(153,153,153));
    }
    //LIBRA-CLP
    private void btnLibra_CLP5ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        var flot=Converter.libraToClp(getCoin());
        var bd=BigDecimal.valueOf(flot).setScale(3,RoundingMode.HALF_UP);
        labelResultCoin5.setText(bd.toString());
        labelResultCoin5.setForeground(new Color(204,153,0));
    }
    //CLP-LIBRA
    private void btnCLP_LIBRA5ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        var flot=Converter.clpToLibra(getCoin());
        var bd=BigDecimal.valueOf(flot).setScale(3,RoundingMode.HALF_UP);
        labelResultCoin5.setText(bd.toString());
        labelResultCoin5.setForeground(new Color(204,153,0));
    }
    private void txtFieldCoin1MousePressed(java.awt.event.MouseEvent evt) {                                           
        txtFieldCoin1.setText("");
        txtFieldCoin1.setForeground(new Color(204,204,204));
    }
    //USD-CLP
    private void btnUSD_CLP5ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        var flot=Converter.usdToClp(getCoin());
        var bd=BigDecimal.valueOf(flot).setScale(3,RoundingMode.HALF_UP);
        labelResultCoin5.setText(bd.toString());
        labelResultCoin5.setForeground(new Color(204,153,0));
    }
    //EURO-CLP
    private void btnEURO_CLP5ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        var flot=Converter.euroToClp(getCoin());
        var bd=BigDecimal.valueOf(flot).setScale(3,RoundingMode.HALF_UP);
        labelResultCoin5.setText(bd.toString());
        labelResultCoin5.setForeground(new Color(204,153,0));
    }
    //CLP-USD
    private void btnCLP_USD5ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        var flot=Converter.clpToUSD(getCoin());
        var bd=BigDecimal.valueOf(flot).setScale(3,RoundingMode.HALF_UP);
        labelResultCoin5.setText(bd.toString());
        labelResultCoin5.setForeground(new Color(204,153,0));
    }
    private float getCoin() throws NumberFormatException{
        try{
            var inputValue = txtFieldCoin1.getText().replace(",", ".");
            labelTitleResultCoin5.setText("Respuesta:");
            labelTitleResultCoin5.setForeground(new Color(204,153,0));
            return Float.parseFloat(inputValue);
        }
        catch(NumberFormatException e){
            labelTitleResultCoin5.setText("Error:");
            labelTitleResultCoin5.setForeground(new Color(204,0,0));
            labelResultCoin5.setText(error);
            labelResultCoin5.setForeground(new Color(204,0,0));
            throw new NumberFormatException("Valor no numerico");
        }
    }
}
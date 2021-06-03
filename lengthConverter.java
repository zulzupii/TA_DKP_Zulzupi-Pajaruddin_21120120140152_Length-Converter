package com.company;

public class lengthConverter extends javax.swing.JFrame {

    public lengthConverter() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Length Converter");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(11, 102, 35));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Length Converter");
        jLabel1.setName("judul"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(146, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(139, 139, 139))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1)
                                .addContainerGap(23, Short.MAX_VALUE))
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometer", "Hektometer", "Dekameter", "Meter", "Desimeter", "Centimeter", "Milimeter", "Mile", "Feet", "Inch" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometer", "Hektometer", "Dekameter", "Meter", "Desimeter", "Centimeter", "Milimeter", "Mile", "Feet", "Inch" }));

        jButton1.setText("Konversi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Hapus");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(202, 202, 202)
                                                .addComponent(jButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton2))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jComboBox1, 0, 100, Short.MAX_VALUE)
                                                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(62, 62, 62)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(106, 106, 106))
        );

        pack();
    }// <ini settingan umum gui netBeans>

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText("");
        jTextField2.setText("");
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String box1 = (String)jComboBox1.getSelectedItem();
        String box2 = (String)jComboBox2.getSelectedItem();

//konversi 1 kilometer
        if(box1.equals("Kilometer") && box2.equals("Kilometer"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            jTextField2.setText(String.valueOf(ambil));
        }

        else if(box1.equals("Kilometer") && box2.equals("Hektometer"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 10);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Kilometer") && box2.equals("Dekameter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 100);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Kilometer") && box2.equals("Meter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 1000);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Kilometer") && box2.equals("Desimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 10000);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Kilometer") && box2.equals("Centimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 100000 );

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Kilometer") && box2.equals("Milimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double) (ambil * 1000000);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Kilometer") && box2.equals("Mile"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double) (ambil * 0.6213711922);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Kilometer") && box2.equals("Feet"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double) (ambil * 3280.839895);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Kilometer") && box2.equals("Inch"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double) (ambil * 39370.07874);

            jTextField2.setText(String.valueOf(hasil));
        }

        //konversi 2 hektometer
        if(box1.equals("Hektometer") && box2.equals("Kilometer"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.1);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Hektometer") && box2.equals("Hektometer"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            jTextField2.setText(String.valueOf(ambil));
        }
        else if(box1.equals("Hektometer") && box2.equals("Dekameter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 10);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Hektometer") && box2.equals("Meter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 100);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Hektometer") && box2.equals("Desimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 1000);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Hektometer") && box2.equals("Centimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 10000);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Hektometer") && box2.equals("Milimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double) (ambil * 100000);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Hektometer") && box2.equals("Mile"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.06213711922);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Hektometer") && box2.equals("Feet"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 328.0839895);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Hektometer") && box2.equals("Inch"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double) (ambil * 3937.007874);

            jTextField2.setText(String.valueOf(hasil));
        }
        //konversi 3 dekameter
        if(box1.equals("Dekameter") && box2.equals("Kilometer"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.01);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Dekameter") && box2.equals("Hektometer"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.1);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Dekameter") && box2.equals("Dekameter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            jTextField2.setText(String.valueOf(ambil));
        }
        else if(box1.equals("Dekameter") && box2.equals("Meter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 10);

            jTextField2.setText(String.valueOf(ambil));
        }
        else if(box1.equals("Dekameter") && box2.equals("Desimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 100);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Dekameter") && box2.equals("Centimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 1000);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Dekameter") && box2.equals("Milimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double) (ambil * 10000);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Dekameter") && box2.equals("Mile"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.006213711922);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Dekameter") && box2.equals("Feet"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 32.80839895);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Dekameter") && box2.equals("Inch"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double) (ambil * 393.7007874);

            jTextField2.setText(String.valueOf(hasil));
        }
        //konversi 4 meter
        if(box1.equals("Meter") && box2.equals("Kilometer"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.001);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Meter") && box2.equals("Hektometer"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.01);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Meter") && box2.equals("Dekameter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.1);

            jTextField2.setText(String.valueOf(ambil));
        }
        else if(box1.equals("Meter") && box2.equals("Meter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            jTextField2.setText(String.valueOf(ambil));
        }
        else if(box1.equals("Meter") && box2.equals("Desimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 10);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Meter") && box2.equals("Centimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 100);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Meter") && box2.equals("Milimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double) (ambil * 1000);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Meter") && box2.equals("Mile"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.0006213711922);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Meter") && box2.equals("Feet"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 3.280839895);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Meter") && box2.equals("Inch"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double) (ambil * 39.37007874);

            jTextField2.setText(String.valueOf(hasil));
        }
        //konversi 5 desimeter
        if(box1.equals("Desimeter") && box2.equals("Kilometer"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.0001);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Desimeter") && box2.equals("Hektometer"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.001);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Desimeter") && box2.equals("Dekameter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.01);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Desimeter") && box2.equals("Meter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.1);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Desimeter") && box2.equals("Desimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            jTextField2.setText(String.valueOf(ambil));
        }
        else if(box1.equals("Desimeter") && box2.equals("Centimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 10);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Desimeter") && box2.equals("Milimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double) (ambil * 100);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Desimeter") && box2.equals("Mile"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.0000621371);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Desimeter") && box2.equals("Feet"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.3280839895);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Desimeter") && box2.equals("Inch"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double) (ambil * 3.937007874);

            jTextField2.setText(String.valueOf(hasil));
        }
        //konversi 6 centimeter
        if(box1.equals("Centimeter") && box2.equals("Kilometer"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.00001);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Centimeter") && box2.equals("Hektometer"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.0001);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Centimeter") && box2.equals("Dekameter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.001);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Centimeter") && box2.equals("Meter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.01);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Centimeter") && box2.equals("Desimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.1);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Centimeter") && box2.equals("Centimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            jTextField2.setText(String.valueOf(ambil));
        }
        else if(box1.equals("Centimeter") && box2.equals("Milimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double) (ambil * 10);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Centimeter") && box2.equals("Mile"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.0000062137);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Centimeter") && box2.equals("Feet"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.032808399);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Centimeter") && box2.equals("Inch"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.3937007874);

            jTextField2.setText(String.valueOf(hasil));
        }
        //konversi 7 milimeter
        if(box1.equals("Milimeter") && box2.equals("Kilometer"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.000001);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Milimeter") && box2.equals("Hektometer"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.00001);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Milimeter") && box2.equals("Dekameter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.0001);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Milimeter") && box2.equals("Meter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.001);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Milimeter") && box2.equals("Desimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.01);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Milimeter") && box2.equals("Centimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double) (ambil * 0.1);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Milimeter") && box2.equals("Milimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            jTextField2.setText(String.valueOf(ambil));
        }
        else if(box1.equals("Milimeter") && box2.equals("Mile"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 6.213711922);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Milimeter") && box2.equals("Feet"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.0032808399);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Milimeter") && box2.equals("Inch"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.0393700787);

            jTextField2.setText(String.valueOf(hasil));
        }
        //konversi 8 mile
        if(box1.equals("Mile") && box2.equals("Kilometer"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 1.609344 );

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Mile") && box2.equals("Hektometer"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 16.09344);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Mile") && box2.equals("Dekameter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 160.9344);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Mile") && box2.equals("Meter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 1609.344);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Mile") && box2.equals("Desimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 16093.44);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Mile") && box2.equals("Centimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 160934.4 );

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Mile") && box2.equals("Milimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double) (ambil * 1609344);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Mile") && box2.equals("Mile"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            jTextField2.setText(String.valueOf(ambil));
        }

        else if(box1.equals("Mile") && box2.equals("Feet"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double) (ambil * 5280);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Mile") && box2.equals("Inch"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double) (ambil * 63360);

            jTextField2.setText(String.valueOf(hasil));
        }

        //konversi 10 feet
        if(box1.equals("Feet") && box2.equals("Kilometer"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.0003048);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Feet") && box2.equals("Hektometer"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.003048);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Feet") && box2.equals("Dekameter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.03048);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Feet") && box2.equals("Meter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.3048);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Feet") && box2.equals("Desimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 3.048);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Feet") && box2.equals("Centimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 30.48);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Feet") && box2.equals("Milimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double) (ambil * 304.8);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Feet") && box2.equals("Mile"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double) (ambil * 0.0001893939);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Feet") && box2.equals("Feet"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            jTextField2.setText(String.valueOf(ambil));
        }
        else if(box1.equals("Feet") && box2.equals("Inch"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double) (ambil * 12);

            jTextField2.setText(String.valueOf(hasil));
        }
        //konversi 11 inch
        if(box1.equals("Inch") && box2.equals("Kilometer"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.0000254);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Inch") && box2.equals("Hektometer"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.000254);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Inch") && box2.equals("Dekameter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.00254);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Inch") && box2.equals("Meter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.0254);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Inch") && box2.equals("Desimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 0.254);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Inch") && box2.equals("Centimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double)(ambil * 2.54);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Inch") && box2.equals("Milimeter"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double) (ambil * 25.4);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Inch") && box2.equals("Mile"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double) (ambil * 0.0000157828);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Inch") && box2.equals("Feet"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            double hasil = (double) (ambil * 0.0833333333);

            jTextField2.setText(String.valueOf(hasil));
        }
        else if(box1.equals("Inch") && box2.equals("Inch"))
        {
            double ambil = Double.parseDouble(jTextField1.getText());

            jTextField2.setText(String.valueOf(ambil));
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lengthConverter().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;

}

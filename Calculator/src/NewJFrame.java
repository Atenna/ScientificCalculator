
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @version 2.0
 * @date 13.5.2013
 * @author Akvi
 */
public class NewJFrame extends javax.swing.JFrame {

    private String expression = "";
    private ArrayList<String> formuly;

    /**
     * Creates new form NewJFrame - constructor
     */
    public NewJFrame() {
        initComponents();
        String kruh = "Obvod kruhu: 2*PI*r";
        String kruh2 = "Obsah kruhu: PI*r^2";
        String mila = "1 míľa = 1,609344 kilometrov";
        formuly = new ArrayList<>();
        formuly.add(mila);
        formuly.add(kruh);
        formuly.add(kruh2);
        readObject();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton26 = new javax.swing.JButton();
        rovna_sa = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        three = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        strieska = new javax.swing.JButton();
        vykricnik = new javax.swing.JButton();
        lomka = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        four = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        krat = new javax.swing.JButton();
        atomova_konst = new javax.swing.JButton();
        boltzmanova_konst = new javax.swing.JButton();
        plynova_konst = new javax.swing.JButton();
        sinus = new javax.swing.JButton();
        planck_konst = new javax.swing.JButton();
        kombinacne_cislo = new javax.swing.JButton();
        pi = new javax.swing.JButton();
        cosinus = new javax.swing.JButton();
        arc_cosinus = new javax.swing.JButton();
        tangens = new javax.swing.JButton();
        atangens = new javax.swing.JButton();
        log_prirodzeny = new javax.swing.JButton();
        log_dekadicky = new javax.swing.JButton();
        arc_sinus = new javax.swing.JButton();
        euler_const = new javax.swing.JButton();
        zatvorka_lava = new javax.swing.JButton();
        zatvorka_prava = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ShowFormula = new javax.swing.JButton();
        SaveFormula = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextField1 = new javax.swing.JTextArea();
        delete = new javax.swing.JButton();

        jButton26.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        jButton26.setLabel("asin");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        rovna_sa.setBackground(new java.awt.Color(0, 102, 153));
        rovna_sa.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        rovna_sa.setText("=");
        rovna_sa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rovna_saActionPerformed(evt);
            }
        });

        one.setBackground(new java.awt.Color(204, 153, 0));
        one.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        one.setLabel("1");
        one.setPreferredSize(null);
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setBackground(new java.awt.Color(204, 153, 0));
        two.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        two.setLabel("2");
        two.setPreferredSize(null);
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        seven.setBackground(new java.awt.Color(204, 153, 0));
        seven.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        seven.setLabel("7");
        seven.setPreferredSize(null);
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        three.setBackground(new java.awt.Color(204, 153, 0));
        three.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        three.setLabel("3");
        three.setPreferredSize(null);
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        five.setBackground(new java.awt.Color(204, 153, 0));
        five.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        five.setLabel("5");
        five.setPreferredSize(null);
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setBackground(new java.awt.Color(204, 153, 0));
        six.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        six.setLabel("6");
        six.setPreferredSize(null);
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        minus.setBackground(new java.awt.Color(153, 0, 0));
        minus.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        minus.setLabel("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        zero.setBackground(new java.awt.Color(204, 153, 0));
        zero.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        zero.setLabel("0");
        zero.setPreferredSize(null);
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        plus.setBackground(new java.awt.Color(153, 0, 0));
        plus.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        plus.setLabel("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        strieska.setBackground(new java.awt.Color(153, 0, 0));
        strieska.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        strieska.setLabel("^");
        strieska.setMaximumSize(new java.awt.Dimension(41, 27));
        strieska.setMinimumSize(new java.awt.Dimension(41, 27));
        strieska.setPreferredSize(null);
        strieska.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strieskaActionPerformed(evt);
            }
        });

        vykricnik.setBackground(new java.awt.Color(153, 0, 0));
        vykricnik.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        vykricnik.setLabel("!");
        vykricnik.setMaximumSize(new java.awt.Dimension(41, 27));
        vykricnik.setMinimumSize(new java.awt.Dimension(41, 27));
        vykricnik.setPreferredSize(null);
        vykricnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vykricnikActionPerformed(evt);
            }
        });

        lomka.setBackground(new java.awt.Color(153, 0, 0));
        lomka.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        lomka.setLabel("/");
        lomka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lomkaActionPerformed(evt);
            }
        });

        eight.setBackground(new java.awt.Color(204, 153, 0));
        eight.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        eight.setLabel("8");
        eight.setPreferredSize(null);
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        four.setBackground(new java.awt.Color(204, 153, 0));
        four.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        four.setLabel("4");
        four.setPreferredSize(null);
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        nine.setBackground(new java.awt.Color(204, 153, 0));
        nine.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        nine.setLabel("9");
        nine.setPreferredSize(null);
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        krat.setBackground(new java.awt.Color(153, 0, 0));
        krat.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        krat.setLabel("*");
        krat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kratActionPerformed(evt);
            }
        });

        atomova_konst.setBackground(new java.awt.Color(51, 51, 51));
        atomova_konst.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        atomova_konst.setLabel("Na");
        atomova_konst.setMaximumSize(new java.awt.Dimension(41, 27));
        atomova_konst.setMinimumSize(new java.awt.Dimension(41, 27));
        atomova_konst.setPreferredSize(null);
        atomova_konst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atomova_konstActionPerformed(evt);
            }
        });

        boltzmanova_konst.setBackground(new java.awt.Color(51, 51, 51));
        boltzmanova_konst.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        boltzmanova_konst.setLabel("k");
        boltzmanova_konst.setMaximumSize(new java.awt.Dimension(41, 27));
        boltzmanova_konst.setMinimumSize(new java.awt.Dimension(41, 27));
        boltzmanova_konst.setPreferredSize(null);
        boltzmanova_konst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boltzmanova_konstActionPerformed(evt);
            }
        });

        plynova_konst.setBackground(new java.awt.Color(51, 51, 51));
        plynova_konst.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        plynova_konst.setLabel("R");
        plynova_konst.setPreferredSize(null);
        plynova_konst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plynova_konstActionPerformed(evt);
            }
        });

        sinus.setBackground(new java.awt.Color(51, 102, 0));
        sinus.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        sinus.setLabel("sin");
        sinus.setMaximumSize(new java.awt.Dimension(41, 27));
        sinus.setMinimumSize(new java.awt.Dimension(41, 27));
        sinus.setPreferredSize(null);
        sinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinusActionPerformed(evt);
            }
        });

        planck_konst.setBackground(new java.awt.Color(51, 51, 51));
        planck_konst.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        planck_konst.setLabel("h");
        planck_konst.setPreferredSize(null);
        planck_konst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planck_konstActionPerformed(evt);
            }
        });

        kombinacne_cislo.setBackground(new java.awt.Color(51, 51, 51));
        kombinacne_cislo.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        kombinacne_cislo.setText("C");
        kombinacne_cislo.setMaximumSize(new java.awt.Dimension(41, 27));
        kombinacne_cislo.setMinimumSize(new java.awt.Dimension(41, 27));
        kombinacne_cislo.setPreferredSize(null);
        kombinacne_cislo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kombinacne_cisloActionPerformed(evt);
            }
        });

        pi.setBackground(new java.awt.Color(51, 51, 51));
        pi.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        pi.setLabel("π");
        pi.setPreferredSize(null);
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });

        cosinus.setBackground(new java.awt.Color(51, 102, 0));
        cosinus.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        cosinus.setLabel("cos");
        cosinus.setMaximumSize(new java.awt.Dimension(41, 27));
        cosinus.setMinimumSize(new java.awt.Dimension(41, 27));
        cosinus.setPreferredSize(null);
        cosinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosinusActionPerformed(evt);
            }
        });

        arc_cosinus.setBackground(new java.awt.Color(51, 102, 0));
        arc_cosinus.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        arc_cosinus.setLabel("acos");
        arc_cosinus.setMaximumSize(null);
        arc_cosinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arc_cosinusActionPerformed(evt);
            }
        });

        tangens.setBackground(new java.awt.Color(51, 102, 0));
        tangens.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        tangens.setText("tan");
        tangens.setMaximumSize(new java.awt.Dimension(41, 27));
        tangens.setMinimumSize(new java.awt.Dimension(41, 27));
        tangens.setPreferredSize(null);
        tangens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tangensActionPerformed(evt);
            }
        });

        atangens.setBackground(new java.awt.Color(51, 102, 0));
        atangens.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        atangens.setText("atan");
        atangens.setMaximumSize(null);
        atangens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atangensActionPerformed(evt);
            }
        });

        log_prirodzeny.setBackground(new java.awt.Color(51, 102, 0));
        log_prirodzeny.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        log_prirodzeny.setText("ln");
        log_prirodzeny.setMaximumSize(new java.awt.Dimension(41, 27));
        log_prirodzeny.setMinimumSize(new java.awt.Dimension(41, 27));
        log_prirodzeny.setPreferredSize(null);
        log_prirodzeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_prirodzenyActionPerformed(evt);
            }
        });

        log_dekadicky.setBackground(new java.awt.Color(51, 102, 0));
        log_dekadicky.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        log_dekadicky.setText("log");
        log_dekadicky.setMaximumSize(new java.awt.Dimension(41, 27));
        log_dekadicky.setMinimumSize(new java.awt.Dimension(41, 27));
        log_dekadicky.setPreferredSize(null);
        log_dekadicky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_dekadickyActionPerformed(evt);
            }
        });

        arc_sinus.setBackground(new java.awt.Color(51, 102, 0));
        arc_sinus.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        arc_sinus.setText("asin");
        arc_sinus.setMaximumSize(new java.awt.Dimension(41, 27));
        arc_sinus.setMinimumSize(new java.awt.Dimension(41, 27));
        arc_sinus.setPreferredSize(null);
        arc_sinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arc_sinusActionPerformed(evt);
            }
        });

        euler_const.setBackground(new java.awt.Color(51, 51, 51));
        euler_const.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        euler_const.setText("e");
        euler_const.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euler_constActionPerformed(evt);
            }
        });

        zatvorka_lava.setBackground(new java.awt.Color(51, 51, 51));
        zatvorka_lava.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        zatvorka_lava.setText("(");
        zatvorka_lava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zatvorka_lavaActionPerformed(evt);
            }
        });

        zatvorka_prava.setBackground(new java.awt.Color(51, 51, 51));
        zatvorka_prava.setFont(new java.awt.Font("Folio Bk BT", 0, 14)); // NOI18N
        zatvorka_prava.setText(")");
        zatvorka_prava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zatvorka_pravaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setText("x");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ShowFormula.setBackground(new java.awt.Color(153, 0, 0));
        ShowFormula.setText("Show Formulas");
        ShowFormula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowFormulaMouseClicked(evt);
            }
        });

        SaveFormula.setBackground(new java.awt.Color(153, 0, 0));
        SaveFormula.setText("Save Formula");
        SaveFormula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveFormulaMouseClicked(evt);
            }
        });

        jTextField1.setColumns(20);
        jTextField1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jTextField1.setLineWrap(true);
        jTextField1.setRows(5);
        jScrollPane1.setViewportView(jTextField1);

        delete.setBackground(new java.awt.Color(153, 0, 0));
        delete.setText("Delete");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(planck_konst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boltzmanova_konst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plynova_konst, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kombinacne_cislo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(euler_const, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atomova_konst, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cosinus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(atangens, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sinus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(log_dekadicky, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(eight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(arc_sinus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(arc_cosinus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(tangens, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(zatvorka_lava, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(zatvorka_prava, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rovna_sa)
                                .addGap(2, 2, 2)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(vykricnik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(strieska, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(krat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lomka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(log_prirodzeny, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(four, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(7, 7, 7)
                                .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(six, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(one, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(minus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(SaveFormula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ShowFormula, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowFormula)
                    .addComponent(SaveFormula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(one, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(two, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(three, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minus)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(atangens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arc_sinus, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lomka))
                            .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(krat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vykricnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addComponent(rovna_sa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cosinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tangens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(log_prirodzeny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(strieska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(log_dekadicky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arc_cosinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zatvorka_lava)
                    .addComponent(zatvorka_prava)
                    .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(planck_konst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boltzmanova_konst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(plynova_konst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kombinacne_cislo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(euler_const))
                    .addComponent(atomova_konst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This methos is responsible for Calling the main method of Calculator
     * class. After calling the Calculator.main method the result of expression
     * is handled.
     *
     * @param evt
     */
    private void rovna_saActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rovna_saActionPerformed
        expression += Calculator.main(expression);
        jTextField1.setText(expression);
    }//GEN-LAST:event_rovna_saActionPerformed
    /**
     * Shows number "1" on the display
     *
     * @param evt
     */
    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        expression = expression.concat("1");
        jTextField1.setText(expression);
    }//GEN-LAST:event_oneActionPerformed
    /**
     * Shows "e" on the display for Euler's number
     *
     * @param evt
     */
    private void euler_constActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euler_constActionPerformed
        expression = expression.concat("e");
        jTextField1.setText(expression);
    }//GEN-LAST:event_euler_constActionPerformed
    /**
     * Shows number "6" on the display
     *
     * @param evt
     */
    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        expression = expression.concat("6");
        jTextField1.setText(expression);
    }//GEN-LAST:event_sixActionPerformed
    /**
     * Shows number "2" on the display
     *
     * @param evt
     */
    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        expression = expression.concat("2");
        jTextField1.setText(expression);
    }//GEN-LAST:event_twoActionPerformed
    /**
     * Shows number "3" on the display
     *
     * @param evt
     */
    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        expression = expression.concat("3");
        jTextField1.setText(expression);
    }//GEN-LAST:event_threeActionPerformed
    /**
     * Shows number "4" on the display
     *
     * @param evt
     */
    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        expression = expression.concat("4");
        jTextField1.setText(expression);
    }//GEN-LAST:event_fourActionPerformed
    /**
     * Shows number "5" on the display
     *
     * @param evt
     */
    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        expression = expression.concat("5");
        jTextField1.setText(expression);
    }//GEN-LAST:event_fiveActionPerformed
    /**
     * Shows number "7" on the display
     *
     * @param evt
     */
    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        expression = expression.concat("7");
        jTextField1.setText(expression);
    }//GEN-LAST:event_sevenActionPerformed
    /**
     * Shows number "8" on the display
     *
     * @param evt
     */
    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        expression = expression.concat("8");
        jTextField1.setText(expression);
    }//GEN-LAST:event_eightActionPerformed
    /**
     * Shows number "9" on the display
     *
     * @param evt
     */
    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        expression = expression.concat("9");
        jTextField1.setText(expression);
    }//GEN-LAST:event_nineActionPerformed
    /**
     * Shows "!" on the display for factorial
     *
     * @param evt
     */
    private void vykricnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vykricnikActionPerformed
        expression = expression.concat("!");
        jTextField1.setText(expression);
    }//GEN-LAST:event_vykricnikActionPerformed
    /**
     * Shows number "0" on the display
     *
     * @param evt
     */
    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        expression = expression.concat("0");
        jTextField1.setText(expression);
    }//GEN-LAST:event_zeroActionPerformed
    /**
     * Shows sign for power on the display
     *
     * @param evt
     */
    private void strieskaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strieskaActionPerformed
        expression = expression.concat("^");
        jTextField1.setText(expression);
    }//GEN-LAST:event_strieskaActionPerformed
    /**
     * Shows "C" on the display
     *
     * @param evt
     */
    private void kombinacne_cisloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kombinacne_cisloActionPerformed
        expression = expression.concat("C");
        jTextField1.setText(expression);
    }//GEN-LAST:event_kombinacne_cisloActionPerformed
    /**
     * Shows "PI" on the display
     *
     * @param evt
     */
    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
        expression = expression.concat("pi");
        jTextField1.setText(expression);
    }//GEN-LAST:event_piActionPerformed
    /**
     * Shows constatnt "R" on the display
     *
     * @param evt
     */
    private void plynova_konstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plynova_konstActionPerformed
        expression = expression.concat("R");
        jTextField1.setText(expression);
    }//GEN-LAST:event_plynova_konstActionPerformed
    /**
     * Shows Boltzmann constant on the display
     *
     * @param evt
     */
    private void boltzmanova_konstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boltzmanova_konstActionPerformed
        expression = expression.concat("k");
        jTextField1.setText(expression);
    }//GEN-LAST:event_boltzmanova_konstActionPerformed
    /**
     * Shows Planck's constant on the display
     *
     * @param evt
     */
    private void planck_konstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planck_konstActionPerformed
        expression = expression.concat("h");
        jTextField1.setText(expression);
    }//GEN-LAST:event_planck_konstActionPerformed
    /**
     * Shows atomic mass constant on the display
     *
     * @param evt
     */
    private void atomova_konstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atomova_konstActionPerformed
        expression = expression.concat("Na");
        jTextField1.setText(expression);
    }//GEN-LAST:event_atomova_konstActionPerformed
    /**
     * Shows "sin" on the display
     *
     * @param evt
     */
    private void sinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinusActionPerformed
        expression = expression.concat("sin");
        jTextField1.setText(expression);
    }//GEN-LAST:event_sinusActionPerformed
    /**
     * Shows "cos" on the display
     *
     * @param evt
     */
    private void cosinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosinusActionPerformed
        expression = expression.concat("cos");
        jTextField1.setText(expression);
    }//GEN-LAST:event_cosinusActionPerformed
    /**
     * Shows "asin" on the display
     *
     * @param evt
     */
    private void arc_sinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arc_sinusActionPerformed
        expression = expression.concat("asin");
        jTextField1.setText(expression);
    }//GEN-LAST:event_arc_sinusActionPerformed
    /**
     * Shows "acos" on the display
     *
     * @param evt
     */
    private void arc_cosinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arc_cosinusActionPerformed
        expression = expression.concat("acos");
        jTextField1.setText(expression);
    }//GEN-LAST:event_arc_cosinusActionPerformed
    /**
     * Shows "ln" on the display
     *
     * @param evt
     */
    private void log_prirodzenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_prirodzenyActionPerformed
        expression = expression.concat("ln");
        jTextField1.setText(expression);
    }//GEN-LAST:event_log_prirodzenyActionPerformed
    /**
     * Shows "log" on the display
     *
     * @param evt
     */
    private void log_dekadickyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_dekadickyActionPerformed
        expression = expression.concat("log");
        jTextField1.setText(expression);
    }//GEN-LAST:event_log_dekadickyActionPerformed
    /**
     * Shows "tan" on the display
     *
     * @param evt
     */
    private void tangensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tangensActionPerformed
        expression = expression.concat("tan");
        jTextField1.setText(expression);
    }//GEN-LAST:event_tangensActionPerformed
    /**
     * Shows "atan" on the display
     *
     * @param evt
     */
    private void atangensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atangensActionPerformed
        expression = expression.concat("atan");
        jTextField1.setText(expression);
    }//GEN-LAST:event_atangensActionPerformed
    /**
     * Shows "(" on the display
     *
     * @param evt
     */
    private void zatvorka_lavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zatvorka_lavaActionPerformed
        expression = expression.concat("(");
        jTextField1.setText(expression);
    }//GEN-LAST:event_zatvorka_lavaActionPerformed
    /**
     * Shows ")" on the display
     *
     * @param evt
     */
    private void zatvorka_pravaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zatvorka_pravaActionPerformed
        expression = expression.concat(")");
        jTextField1.setText(expression);
    }//GEN-LAST:event_zatvorka_pravaActionPerformed
    /**
     * Shows "+" on the display
     *
     * @param evt
     */
    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        expression = expression.concat("+");
        jTextField1.setText(expression);
    }//GEN-LAST:event_plusActionPerformed
    /**
     * Shows "-" on the display
     *
     * @param evt
     */
    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        expression = expression.concat("-");
        jTextField1.setText(expression);
    }//GEN-LAST:event_minusActionPerformed
    /**
     * Shows "*" on the display
     *
     * @param evt
     */
    private void kratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kratActionPerformed
        expression = expression.concat("*");
        jTextField1.setText(expression);
    }//GEN-LAST:event_kratActionPerformed
    /**
     * Shows "/" on the display
     *
     * @param evt
     */
    private void lomkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lomkaActionPerformed
        expression = expression.concat("/");
        jTextField1.setText(expression);
    }//GEN-LAST:event_lomkaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        expression = expression.substring(0, expression.length() - 1);
        jTextField1.setText(expression);
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * Save the expression
     *
     * @param evt
     */
    private void SaveFormulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveFormulaMouseClicked
        /*expression = jTextField1.getText();
         formuly.add(expression);
         writeObject();
         expression = "";
         jTextField1.setText(expression);*/

        String allFormulas = jTextField1.getText();

        String[] splitFormulas = allFormulas.split("\n");
        formuly.clear();
        formuly.addAll(Arrays.asList(splitFormulas));
        
        /**
         * for (String f : splitFormulas) {
            formuly.add(f);
        }
         */

        writeObject();
    }//GEN-LAST:event_SaveFormulaMouseClicked
    /**
     * Shows saved formulas
     *
     * @param evt
     */
    private void ShowFormulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowFormulaMouseClicked
        String formulky = "";
        for (String f : formuly) {
            formulky += f + "\n";
        }
        jTextField1.setText(formulky.substring(0, formulky.length() - 1));
    }//GEN-LAST:event_ShowFormulaMouseClicked
    /**
     * Shows empty display and set the expression to empty String
     *
     * @param evt
     */
    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        expression = "";
        jTextField1.setText("");
    }//GEN-LAST:event_deleteMouseClicked
    /**
     * Serialize the object
     *
     * @param evt
     */
    public final void writeObject() {

        ObjectOutputStream out = null;
        try {
            File subor = new File("maliny.txt");
            if (!subor.exists()) {
                subor.createNewFile();
            }

            FileOutputStream f = new FileOutputStream(subor);
            out = new ObjectOutputStream(f);
            out.writeObject(formuly);
            out.close();
        } catch (IOException ex) {
            //ex.printStackTrace();
        }
    }

    /**
     * Deserialize the object
     *
     * @param evt
     */
    public final void readObject() {
        FileInputStream in;
        ObjectInputStream ois;

        try {
            in = new FileInputStream("maliny.txt");
            ois = new ObjectInputStream(in);
            formuly = (ArrayList<String>) ois.readObject();
            ois.close();
        } catch (ClassNotFoundException | IOException ex) {
            //ex.printStackTrace();
        }
    }

    /**
     * Main method
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SaveFormula;
    private javax.swing.JButton ShowFormula;
    private javax.swing.JButton arc_cosinus;
    private javax.swing.JButton arc_sinus;
    private javax.swing.JButton atangens;
    private javax.swing.JButton atomova_konst;
    private javax.swing.JButton boltzmanova_konst;
    private javax.swing.JButton cosinus;
    private javax.swing.JButton delete;
    private javax.swing.JButton eight;
    private javax.swing.JButton euler_const;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton26;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextField1;
    private javax.swing.JButton kombinacne_cislo;
    private javax.swing.JButton krat;
    private javax.swing.JButton log_dekadicky;
    private javax.swing.JButton log_prirodzeny;
    private javax.swing.JButton lomka;
    private javax.swing.JButton minus;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton pi;
    private javax.swing.JButton planck_konst;
    private javax.swing.JButton plus;
    private javax.swing.JButton plynova_konst;
    private javax.swing.JButton rovna_sa;
    private javax.swing.JButton seven;
    private javax.swing.JButton sinus;
    private javax.swing.JButton six;
    private javax.swing.JButton strieska;
    private javax.swing.JButton tangens;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton vykricnik;
    private javax.swing.JButton zatvorka_lava;
    private javax.swing.JButton zatvorka_prava;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}

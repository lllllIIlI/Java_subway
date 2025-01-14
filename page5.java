package package1;


import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class page5 extends javax.swing.JFrame {
    DB_MAN DBM = new DB_MAN();
    
    public page5() {
        initComponents();
        Dimension frameSize = getSize();
        
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public final void getDBData(String inputid) {
        String strOutput = "";
        String strSQL = "select * from recipe, menu "
                + "where recipe.no = menu.no and recipe.id = " + inputid;
        try {
            DBM.dbOpen();
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);
            
            DBM.DB_rs.next();
            strOutput += DBM.DB_rs.getString("name") + "\n";
            
            if (DBM.DB_rs.getInt("bread") == 1) {
                strOutput += "#화이트 ";
            } else if (DBM.DB_rs.getInt("bread") == 2) {
                strOutput += "#화이트오레가노 ";
            } else if (DBM.DB_rs.getInt("bread") == 3) {
                strOutput += "#위트 ";
            } else if (DBM.DB_rs.getInt("bread") == 4) {
                strOutput += "#허니오트 ";
            } else if (DBM.DB_rs.getInt("bread") == 5) {
                strOutput += "#하티 ";
            } else if (DBM.DB_rs.getInt("bread") == 6) {
                strOutput += "#플랫브래드 ";
            }
            
            if (DBM.DB_rs.getInt("cheese") == 1) {
                strOutput += "#아메리칸 치즈 ";
            } else if (DBM.DB_rs.getInt("cheese") == 2) {
                strOutput += "#슈레드 치즈 ";
            } else if (DBM.DB_rs.getInt("cheese") == 3) {
                strOutput += "#모차렐라 치즈 ";
            } else if (DBM.DB_rs.getInt("cheese") == 4) {
                strOutput += "#치즈 제외 ";
            } 
            
            strOutput += "\n#제외 채소 : ";  

            if (DBM.DB_rs.getInt("lettuce") == 1) {
                strOutput += "양상추 ";
            } 
            if (DBM.DB_rs.getInt("tomato") == 1) {
                strOutput += "토마토 ";
            }
            if (DBM.DB_rs.getInt("cucumber") == 1) {
                strOutput += "오이 ";
            }
            if (DBM.DB_rs.getInt("pimento") == 1) {
                strOutput += "피망 ";
            }
            if (DBM.DB_rs.getInt("onion") == 1) {
                strOutput += "양파 ";
            }
            if (DBM.DB_rs.getInt("pickle") == 1) {
                strOutput += "피클 ";
            }
            if (DBM.DB_rs.getInt("olive") == 1) {
                strOutput += "올리브 ";
            }
            if (DBM.DB_rs.getInt("jalapeno") == 1) {
                strOutput += "할라피뇨 ";
            }
            
            strOutput += "\n";
            
            if (DBM.DB_rs.getInt("sauce1") == 1) {
                strOutput += "#추천소스 ";
            } else if (DBM.DB_rs.getInt("sauce1") == 2) {
                strOutput += "#소스 없음 ";
            } else if (DBM.DB_rs.getInt("sauce1") == 3) {
                strOutput += "#머스타드 ";
            } else if (DBM.DB_rs.getInt("sauce1") == 4) {
                strOutput += "#레드와인식초 ";
            } else if (DBM.DB_rs.getInt("sauce1") == 5) {
                strOutput += "#스윗 어니언 ";
            } else if (DBM.DB_rs.getInt("sauce1") == 6) {
                strOutput += "#스윗 칠리 ";
            } else if (DBM.DB_rs.getInt("sauce1") == 7) {
                strOutput += "#스모크 바베큐 ";
            } else if (DBM.DB_rs.getInt("sauce1") == 8) {
                strOutput += "#랜치 드레싱 ";
            } else if (DBM.DB_rs.getInt("sauce1") == 9) {
                strOutput += "#마요네즈 ";
            } else if (DBM.DB_rs.getInt("sauce1") == 10) {
                strOutput += "#핫칠리 ";
            } else if (DBM.DB_rs.getInt("sauce1") == 11) {
                strOutput += "#사우스웨스트치폴레 ";
            } else if (DBM.DB_rs.getInt("sauce1") == 12) {
                strOutput += "#홀스레디쉬 ";
            } else if (DBM.DB_rs.getInt("sauce1") == 13) {
                strOutput += "#올리브오일 ";
            } else if (DBM.DB_rs.getInt("sauce1") == 14) {
                strOutput += "#소금 ";
            } else if (DBM.DB_rs.getInt("sauce1") == 15) {
                strOutput += "#후추 ";
            }
            
            if (DBM.DB_rs.getInt("sauce2") == 1) {
                strOutput += "#추천소스 ";
            } else if (DBM.DB_rs.getInt("sauce2") == 2) {
                strOutput += "#소스 없음 ";
            } else if (DBM.DB_rs.getInt("sauce2") == 3) {
                strOutput += "#머스타드 ";
            } else if (DBM.DB_rs.getInt("sauce2") == 4) {
                strOutput += "#레드와인식초 ";
            } else if (DBM.DB_rs.getInt("sauce2") == 5) {
                strOutput += "#스윗 어니언 ";
            } else if (DBM.DB_rs.getInt("sauce2") == 6) {
                strOutput += "#스윗 칠리 ";
            } else if (DBM.DB_rs.getInt("sauce2") == 7) {
                strOutput += "#스모크 바베큐 ";
            } else if (DBM.DB_rs.getInt("sauce2") == 8) {
                strOutput += "#랜치 드레싱 ";
            } else if (DBM.DB_rs.getInt("sauce2") == 9) {
                strOutput += "#마요네즈 ";
            } else if (DBM.DB_rs.getInt("sauce2") == 10) {
                strOutput += "#핫칠리 ";
            } else if (DBM.DB_rs.getInt("sauce2") == 11) {
                strOutput += "#사우스웨스트치폴레 ";
            } else if (DBM.DB_rs.getInt("sauce2") == 12) {
                strOutput += "#홀스레디쉬 ";
            } else if (DBM.DB_rs.getInt("sauce2") == 13) {
                strOutput += "#올리브오일 ";
            } else if (DBM.DB_rs.getInt("sauce2") == 14) {
                strOutput += "#소금 ";
            } else if (DBM.DB_rs.getInt("sauce2") == 15) {
                strOutput += "#후추 ";
            }
            
            strOutput += "\n#" + DBM.DB_rs.getInt("price") + "원";
            if (DBM.DB_rs.equals("")) {
                JOptionPane.showMessageDialog(null,"해당 ID는 존재하지 않습니다");
                new page5();
                setVisible(false);
            } else {
            jTextArea1.setText(strOutput);
            }
            DBM.dbClose();
        } catch (Exception e) {
            System.out.println("SQLException : " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("검색");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        jLabel1.setText("레시피 검색");

        jButton2.setText("돌아가기");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(72, 72, 72)))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(32, 32, 32))
        );

        jButton1.getAccessibleContext().setAccessibleName("btn_search");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        getDBData(jTextField1.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new page1();
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new page5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

package package1;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.WindowConstants;
import static package1.page4.list;
import static package1.page1.num;

public class page6 extends javax.swing.JFrame {
    DB_MAN DBM = new DB_MAN();
    
    public page6() {
        initComponents();
        Dimension frameSize = getSize();
        
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        printlist();
    }

    
    public final void printlist() {
        String strOutput = "";
        String strSQL = "select * from menu where no = " + num;
        
        try {
            DBM.dbOpen();
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);
            
            DBM.DB_rs.next();
            strOutput += DBM.DB_rs.getString("name") + "\n";
            
            if (list.get(0) == 1) {
                strOutput += "#화이트 ";
            } else if (list.get(0) == 2) {
                strOutput += "#화이트오레가노 ";
            } else if (list.get(0) == 3) {
                strOutput += "#위트 ";
            } else if (list.get(0) == 4) {
                strOutput += "#허니오트 ";
            } else if (list.get(0) == 5) {
                strOutput += "#하티 ";
            } else if (list.get(0) == 6) {
                strOutput += "#플랫브래드 ";
            }
            
            if (list.get(1) == 1) {
                strOutput += "#아메리칸 치즈 ";
            } else if (list.get(1) == 2) {
                strOutput += "#슈레드 치즈 ";
            } else if (list.get(1) == 3) {
                strOutput += "#모차렐라 치즈 ";
            } else if (list.get(1) == 4) {
                strOutput += "#치즈 제외 ";
            } 
            
            strOutput += "\n#제외 채소 : ";  

            if (list.get(2) == 1) {
                strOutput += "양상추 ";
            } 
            if (list.get(3) == 1) {
                strOutput += "토마토 ";
            }
            if (list.get(4) == 1) {
                strOutput += "오이 ";
            }
            if (list.get(5) == 1) {
                strOutput += "피망 ";
            }
            if (list.get(6) == 1) {
                strOutput += "양파 ";
            }
            if (list.get(7) == 1) {
                strOutput += "피클 ";
            }
            if (list.get(8) == 1) {
                strOutput += "올리브 ";
            }
            if (list.get(9) == 1) {
                strOutput += "할라피뇨 ";
            }
            
            strOutput += "\n";
            
            if (list.get(10) == 1) {
                strOutput += "#추천소스 ";
            } else if (list.get(10) == 2) {
                strOutput += "#소스 없음 ";
            } else if (list.get(10) == 3) {
                strOutput += "#머스타드 ";
            } else if (list.get(10) == 4) {
                strOutput += "#레드와인식초 ";
            } else if (list.get(10) == 5) {
                strOutput += "#스윗 어니언 ";
            } else if (list.get(10) == 6) {
                strOutput += "#스윗 칠리 ";
            } else if (list.get(10) == 7) {
                strOutput += "#스모크 바베큐 ";
            } else if (list.get(10) == 8) {
                strOutput += "#랜치 드레싱 ";
            } else if (list.get(10) == 9) {
                strOutput += "#마요네즈 ";
            } else if (list.get(10) == 10) {
                strOutput += "#핫칠리 ";
            } else if (list.get(10) == 11) {
                strOutput += "#사우스웨스트치폴레 ";
            } else if (list.get(10) == 12) {
                strOutput += "#홀스레디쉬 ";
            } else if (list.get(10) == 13) {
                strOutput += "#올리브오일 ";
            } else if (list.get(10) == 14) {
                strOutput += "#소금 ";
            } else if (list.get(10) == 15) {
                strOutput += "#후추 ";
            }
            
            if (list.get(11) == 1) {
                strOutput += "#추천소스 ";
            } else if (list.get(11) == 2) {
                strOutput += "#소스 없음 ";
            } else if (list.get(11) == 3) {
                strOutput += "#머스타드 ";
            } else if (list.get(11) == 4) {
                strOutput += "#레드와인식초 ";
            } else if (list.get(11) == 5) {
                strOutput += "#스윗 어니언 ";
            } else if (list.get(11) == 6) {
                strOutput += "#스윗 칠리 ";
            } else if (list.get(11) == 7) {
                strOutput += "#스모크 바베큐 ";
            } else if (list.get(11) == 8) {
                strOutput += "#랜치 드레싱 ";
            } else if (list.get(11) == 9) {
                strOutput += "#마요네즈 ";
            } else if (list.get(11) == 10) {
                strOutput += "#핫칠리 ";
            } else if (list.get(11) == 11) {
                strOutput += "#사우스웨스트치폴레 ";
            } else if (list.get(11) == 12) {
                strOutput += "#홀스레디쉬 ";
            } else if (list.get(11) == 13) {
                strOutput += "#올리브오일 ";
            } else if (list.get(11) == 14) {
                strOutput += "#소금 ";
            } else if (list.get(11) == 15) {
                strOutput += "#후추 ";
            }
            
            strOutput += "\n#" + DBM.DB_rs.getInt("price") + "원";
            jTextArea1.setText(strOutput);
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        jLabel1.setText("선택 레시피");

        jButton1.setText("종료");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(62, 62, 62)
                .addComponent(jButton1)
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("선택 레시피");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new page1();
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new page6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

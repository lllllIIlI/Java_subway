package package1;


import package1.page1;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import static package1.page1.num;

public class page2 extends javax.swing.JFrame {
    String[] menu1 = {"이탈리안 비엠티","비엘티","로스트치킨","로티세리 바비큐 치킨","서브웨이 클럽","터키","스파이시 이탈리안","치킨데리야끼"};
    String[] menu2 = {"k바비큐","풀드포크 바비큐","스테이크&치즈","치킨베이컨아보카도"};
    String[] menu3 = {"스파이시 쉬림프","스파이시 쉬림프 아보카도"};
    String[] menu4 = {"에그마요","베지"}; 

    public page2() {
        
        initComponents();
        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        recommand();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        jButton1.setText("이 제품으로 결정");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        jButton2.setText("다른제품으로 ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        jLabel3.setText("추천메뉴:");

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SUBWAY 메뉴 추천");

        lbResult.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(lbResult, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel2)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbResult, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public final void recommand() {
        if(num.equals("11")){
            num+="1";
            lbResult.setText("햄 샌드위치");
        }else if(num.equals("12")){
            int no = (int)(Math.random()*7);
            lbResult.setText(menu1[no]+" 샌드위치");
            no+=1;
            num+= Integer.toString(no);
        }else if(num.equals("13")){
            int no = (int)(Math.random()*3);
            lbResult.setText(menu2[no]+" 샌드위치");
            no+=1;
            num+= Integer.toString(no);
        }else if(num.equals("21")){
            num+="1";
            lbResult.setText("참치 샌드위치");
        }else if(num.equals("22")){
            num+="2";
            lbResult.setText("쉬림프 샌드위치");
        }else if(num.equals("23")){
            int no = (int)(Math.random()*1);
            lbResult.setText(menu3[no]+" 샌드위치");
            no+=1;
            num+= Integer.toString(no);
        }else if(num.equals("31")){
             int no = (int)(Math.random()*1);
            lbResult.setText(menu4[no]+" 샌드위치");
            no+=1;
            num+= Integer.toString(no);
        }else if(num.equals("32")){
            JOptionPane.showMessageDialog(null,"죄송합니다 가격에 맞는 제품이 없습니다.");
            new page1();
            setVisible(false);
        }else if(num.equals("33")){
            JOptionPane.showMessageDialog(null,"죄송합니다 가격에 맞는 제품이 없습니다.");
            new page1();
            setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null,"오류 첫번째 페이지로 돌아갑니다");
            new page1();
            setVisible(false);
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new page4();
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        num = "";
        new page3();
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new page2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbResult;
    // End of variables declaration//GEN-END:variables
}

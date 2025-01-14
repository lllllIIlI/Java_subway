package package1;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import static package1.page1.num;

public class page3 extends javax.swing.JFrame {
    public page3() {
        initComponents();
        Dimension frameSize = getSize();
        
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rd1 = new javax.swing.JRadioButton();
        rd2 = new javax.swing.JRadioButton();
        rd8 = new javax.swing.JRadioButton();
        rd12 = new javax.swing.JRadioButton();
        rd3 = new javax.swing.JRadioButton();
        rd7 = new javax.swing.JRadioButton();
        rd11 = new javax.swing.JRadioButton();
        rd4 = new javax.swing.JRadioButton();
        rd5 = new javax.swing.JRadioButton();
        rd9 = new javax.swing.JRadioButton();
        rd6 = new javax.swing.JRadioButton();
        rd10 = new javax.swing.JRadioButton();
        rd14 = new javax.swing.JRadioButton();
        rd13 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        rd15 = new javax.swing.JRadioButton();
        rd16 = new javax.swing.JRadioButton();
        rd18 = new javax.swing.JRadioButton();
        rd19 = new javax.swing.JRadioButton();
        rd17 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        jLabel4.setText("샌드위치 종류");

        buttonGroup1.add(rd1);
        rd1.setText("햄 샌드위치(4800)");

        buttonGroup1.add(rd2);
        rd2.setText("이탈리안 비엠티 샌드위치(5400)");

        buttonGroup1.add(rd8);
        rd8.setText("스파이시 이탈리안 샌드위치(5700)");

        buttonGroup1.add(rd12);
        rd12.setText("스파이시 쉬림프 샌드위치(6100)");

        buttonGroup1.add(rd3);
        rd3.setText("비엘티 샌드위치(5400)");

        buttonGroup1.add(rd7);
        rd7.setText("터키 샌드위치(5300)");

        buttonGroup1.add(rd11);
        rd11.setText("쉬림프 샌드위치(5900)");

        buttonGroup1.add(rd4);
        rd4.setText("로스트치킨 샌드위치(6100)");

        buttonGroup1.add(rd5);
        rd5.setText("로티세리 바비큐치킨 샌드위치(6100)");

        buttonGroup1.add(rd9);
        rd9.setText("치킨 데리야끼 샌드위치(5700)");

        buttonGroup1.add(rd6);
        rd6.setText("서브웨이 클럽 샌드위치(5900)");

        buttonGroup1.add(rd10);
        rd10.setText("참치 샌드위치(4800)");

        buttonGroup1.add(rd14);
        rd14.setText("에그마요 샌드위치(4300)");

        buttonGroup1.add(rd13);
        rd13.setText("스파이시 쉬림프 아보카도 샌드위치(6700)");

        jButton1.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        jButton1.setText("선택");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rd15);
        rd15.setText("베지 샌드위치(3900)");

        buttonGroup1.add(rd16);
        rd16.setText(" k바비큐 샌드위치(6000)");

        buttonGroup1.add(rd18);
        rd18.setText("스테이크&치즈 샌드위치(6500)");

        buttonGroup1.add(rd19);
        rd19.setText("터키베이컨아보카도 샌드위치(6500)");

        buttonGroup1.add(rd17);
        rd17.setText("풀드포크 바비큐 샌드위치(6000)");

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SUBWAY 메뉴 추천");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rd3)
                            .addComponent(rd1)
                            .addComponent(rd5)
                            .addComponent(rd7)
                            .addComponent(rd9)
                            .addComponent(rd11)
                            .addComponent(rd13)
                            .addComponent(rd15)
                            .addComponent(rd17)
                            .addComponent(rd19))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rd4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rd6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rd8, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rd10, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rd12, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rd14, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rd16, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rd18, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rd2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addContainerGap(60, Short.MAX_VALUE))))
                    .addComponent(jLabel4)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addComponent(jLabel2)
                .addGap(147, 147, 147))
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rd1)
                    .addComponent(rd2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rd3)
                    .addComponent(rd4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rd5)
                    .addComponent(rd6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rd7)
                    .addComponent(rd8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rd9)
                    .addComponent(rd10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rd11)
                    .addComponent(rd12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rd13)
                    .addComponent(rd14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rd15)
                    .addComponent(rd16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd17)
                    .addComponent(rd18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rd19)
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(rd1.isSelected()){
            num = "111";
            new page4();
            setVisible(false);
        }else if(rd2.isSelected()){
            num = "121";
            new page4();
            setVisible(false);
        }else if(rd3.isSelected()){
            num = "122";
            new page4();
            setVisible(false);
        }else if(rd4.isSelected()){
            num = "123";
            new page4();
            setVisible(false);
        }else if(rd5.isSelected()){
            num = "124";
            new page4();
            setVisible(false);
        }else if(rd6.isSelected()){
            num = "125";
            new page4();
            setVisible(false);
        }else if(rd7.isSelected()){
            num = "126";
            new page4();
            setVisible(false);
        }else if(rd8.isSelected()){
            num = "127";
            new page4();
            setVisible(false);
        }else if(rd9.isSelected()){
            num = "128";
            new page4();
            setVisible(false);
        }else if(rd10.isSelected()){
            num = "211";
            new page4();
            setVisible(false);
        }else if(rd11.isSelected()){
            num = "221";
            new page4();
            setVisible(false);
        }else if(rd12.isSelected()){
            num = "231";
            new page4();
            setVisible(false);
        }else if(rd13.isSelected()){
            num = "232";
            new page4();
            setVisible(false);
        }else if(rd14.isSelected()){
            num = "311";
            new page4();
            setVisible(false);
        }else if(rd15.isSelected()){
            num = "312";
            new page4();
            setVisible(false);
        }else if(rd16.isSelected()){
            num = "131";
            new page4();
            setVisible(false);
        }else if(rd17.isSelected()){
            num = "132";
            new page4();
            setVisible(false);
        }else if(rd18.isSelected()){
            num = "133";
            new page4();
            setVisible(false);
        }else if(rd19.isSelected()){
            num = "134";
            new page4();
            setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null,"오류 첫번째 페이지로 돌아갑니다");
            new page1();
            setVisible(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new page3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton rd1;
    private javax.swing.JRadioButton rd10;
    private javax.swing.JRadioButton rd11;
    private javax.swing.JRadioButton rd12;
    private javax.swing.JRadioButton rd13;
    private javax.swing.JRadioButton rd14;
    private javax.swing.JRadioButton rd15;
    private javax.swing.JRadioButton rd16;
    private javax.swing.JRadioButton rd17;
    private javax.swing.JRadioButton rd18;
    private javax.swing.JRadioButton rd19;
    private javax.swing.JRadioButton rd2;
    private javax.swing.JRadioButton rd3;
    private javax.swing.JRadioButton rd4;
    private javax.swing.JRadioButton rd5;
    private javax.swing.JRadioButton rd6;
    private javax.swing.JRadioButton rd7;
    private javax.swing.JRadioButton rd8;
    private javax.swing.JRadioButton rd9;
    // End of variables declaration//GEN-END:variables
}

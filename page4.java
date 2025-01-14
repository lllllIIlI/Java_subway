package package1;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.WindowConstants;
import javax.swing.JOptionPane;
import static package1.page1.num;
import java.util.ArrayList;

public class page4 extends javax.swing.JFrame {
    DB_MAN DBM = new DB_MAN();
    
    public page4() {
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        br1 = new javax.swing.JRadioButton();
        br2 = new javax.swing.JRadioButton();
        br3 = new javax.swing.JRadioButton();
        br4 = new javax.swing.JRadioButton();
        br5 = new javax.swing.JRadioButton();
        br6 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        c1 = new javax.swing.JRadioButton();
        c2 = new javax.swing.JRadioButton();
        c3 = new javax.swing.JRadioButton();
        c4 = new javax.swing.JRadioButton();
        b1 = new javax.swing.JRadioButton();
        b6 = new javax.swing.JRadioButton();
        b4 = new javax.swing.JRadioButton();
        b2 = new javax.swing.JRadioButton();
        b3 = new javax.swing.JRadioButton();
        b5 = new javax.swing.JRadioButton();
        b8 = new javax.swing.JRadioButton();
        b7 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        s1 = new javax.swing.JRadioButton();
        s2 = new javax.swing.JRadioButton();
        s3 = new javax.swing.JRadioButton();
        s4 = new javax.swing.JRadioButton();
        s5 = new javax.swing.JRadioButton();
        s6 = new javax.swing.JRadioButton();
        s7 = new javax.swing.JRadioButton();
        s8 = new javax.swing.JRadioButton();
        s9 = new javax.swing.JRadioButton();
        s10 = new javax.swing.JRadioButton();
        s11 = new javax.swing.JRadioButton();
        s12 = new javax.swing.JRadioButton();
        s13 = new javax.swing.JRadioButton();
        s14 = new javax.swing.JRadioButton();
        s15 = new javax.swing.JRadioButton();
        ss8 = new javax.swing.JRadioButton();
        ss9 = new javax.swing.JRadioButton();
        ss10 = new javax.swing.JRadioButton();
        ss11 = new javax.swing.JRadioButton();
        ss12 = new javax.swing.JRadioButton();
        ss13 = new javax.swing.JRadioButton();
        ss14 = new javax.swing.JRadioButton();
        ss15 = new javax.swing.JRadioButton();
        ss2 = new javax.swing.JRadioButton();
        ss3 = new javax.swing.JRadioButton();
        ss4 = new javax.swing.JRadioButton();
        ss5 = new javax.swing.JRadioButton();
        ss6 = new javax.swing.JRadioButton();
        ss7 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        ss1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        jLabel3.setText("빵");

        buttonGroup1.add(br1);
        br1.setSelected(true);
        br1.setText("화이트");

        buttonGroup1.add(br2);
        br2.setText("화이트 오레가노");

        buttonGroup1.add(br3);
        br3.setText("위트");

        buttonGroup1.add(br4);
        br4.setText("허니오트");

        buttonGroup1.add(br5);
        br5.setText("하티");

        buttonGroup1.add(br6);
        br6.setText("플랫브래드");

        jLabel4.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        jLabel4.setText("제외할 채소");

        jLabel5.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        jLabel5.setText("치즈");

        buttonGroup2.add(c1);
        c1.setSelected(true);
        c1.setText("아메리칸 치즈");

        buttonGroup2.add(c2);
        c2.setText("슈레드 치즈");
        c2.setToolTipText("");

        buttonGroup2.add(c3);
        c3.setText("모차렐라 치즈");

        buttonGroup2.add(c4);
        c4.setText("치즈 제외");

        b1.setText("양상추");

        b6.setText("피클");

        b4.setText("피망");

        b2.setText("토마토");

        b3.setText("오이");

        b5.setText("양파");

        b8.setText("할라피뇨");

        b7.setText("올리브");

        jLabel6.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        jLabel6.setText("소스1");

        buttonGroup3.add(s1);
        s1.setSelected(true);
        s1.setText("추천소스");

        buttonGroup3.add(s2);
        s2.setText("소스 없음");

        buttonGroup3.add(s3);
        s3.setText("머스타드");

        buttonGroup3.add(s4);
        s4.setText("레드와인 식초");

        buttonGroup3.add(s5);
        s5.setText("스윗어니언");

        buttonGroup3.add(s6);
        s6.setText("스윗칠리");

        buttonGroup3.add(s7);
        s7.setText("스모크 바베큐");

        buttonGroup3.add(s8);
        s8.setText("랜치드레싱");

        buttonGroup3.add(s9);
        s9.setText("마요네즈");

        buttonGroup3.add(s10);
        s10.setText("핫칠리");

        buttonGroup3.add(s11);
        s11.setText("사우스웨스트치폴레");

        buttonGroup3.add(s12);
        s12.setText("홀스레디쉬");

        buttonGroup3.add(s13);
        s13.setText("올리브오일");

        buttonGroup3.add(s14);
        s14.setText("소금");

        buttonGroup3.add(s15);
        s15.setText("후추");

        buttonGroup4.add(ss8);
        ss8.setText("랜치드레싱");

        buttonGroup4.add(ss9);
        ss9.setText("마요네즈");

        buttonGroup4.add(ss10);
        ss10.setText("핫칠리");

        buttonGroup4.add(ss11);
        ss11.setText("사우스웨스트치폴레");

        buttonGroup4.add(ss12);
        ss12.setText("홀스레디쉬");

        buttonGroup4.add(ss13);
        ss13.setText("올리브오일");

        buttonGroup4.add(ss14);
        ss14.setText("소금");

        buttonGroup4.add(ss15);
        ss15.setText("후추");

        buttonGroup4.add(ss2);
        ss2.setText("소스 없음");

        buttonGroup4.add(ss3);
        ss3.setText("머스타드");

        buttonGroup4.add(ss4);
        ss4.setText("레드와인 식초");

        buttonGroup4.add(ss5);
        ss5.setText("스윗어니언");

        buttonGroup4.add(ss6);
        ss6.setText("스윗칠리");

        buttonGroup4.add(ss7);
        ss7.setText("스모크 바베큐");

        jLabel7.setFont(new java.awt.Font("맑은 고딕", 0, 24)); // NOI18N
        jLabel7.setText("소스2");

        buttonGroup4.add(ss1);
        ss1.setSelected(true);
        ss1.setText("추천소스");

        jButton1.setText("아이디로 저장");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("저장없이 완료");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SUBWAY 메뉴 추천");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1))
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(c1)
                        .addGap(18, 18, 18)
                        .addComponent(c2)
                        .addGap(18, 18, 18)
                        .addComponent(c3)
                        .addGap(18, 18, 18)
                        .addComponent(c4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b1)
                            .addComponent(b5))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b2)
                            .addComponent(b6))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b7)
                            .addComponent(b3))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b8)
                            .addComponent(b4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ss12)
                                .addGap(18, 18, 18)
                                .addComponent(ss13))
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ss1)
                                    .addComponent(ss6))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ss7)
                                    .addComponent(ss2))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ss3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ss8)
                                            .addComponent(ss14))
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ss9)
                                            .addComponent(ss15)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(s6)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(s1)))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(s7)
                                            .addComponent(s2)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(s12)
                                        .addGap(18, 18, 18)
                                        .addComponent(s13)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(s3)
                                            .addComponent(s8))
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(s4)
                                            .addComponent(s9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(s10)
                                            .addComponent(s5)
                                            .addComponent(s11)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(s14)
                                        .addGap(59, 59, 59)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(s15)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ss4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(ss10)
                                                    .addComponent(ss5)
                                                    .addComponent(ss11)))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(br1)
                                        .addGap(18, 18, 18)
                                        .addComponent(br2)
                                        .addGap(18, 18, 18)
                                        .addComponent(br3)))
                                .addGap(18, 18, 18)
                                .addComponent(br4)
                                .addGap(11, 11, 11)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(br5)
                                .addGap(18, 18, 18)
                                .addComponent(br6))))
                    .addComponent(jLabel6))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(br1)
                    .addComponent(br6)
                    .addComponent(br5)
                    .addComponent(br4)
                    .addComponent(br3)
                    .addComponent(br2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1)
                    .addComponent(c2)
                    .addComponent(c3)
                    .addComponent(c4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1)
                    .addComponent(b2)
                    .addComponent(b3)
                    .addComponent(b4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b5)
                    .addComponent(b6)
                    .addComponent(b7)
                    .addComponent(b8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s1)
                    .addComponent(s3)
                    .addComponent(s4)
                    .addComponent(s5)
                    .addComponent(s2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s7)
                    .addComponent(s8)
                    .addComponent(s9)
                    .addComponent(s10)
                    .addComponent(s6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s13)
                    .addComponent(s14)
                    .addComponent(s15)
                    .addComponent(s11)
                    .addComponent(s12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ss1)
                    .addComponent(ss3)
                    .addComponent(ss4)
                    .addComponent(ss5)
                    .addComponent(ss2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ss7)
                    .addComponent(ss8)
                    .addComponent(ss9)
                    .addComponent(ss10)
                    .addComponent(ss6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ss11)
                    .addComponent(ss12)
                    .addComponent(ss13)
                    .addComponent(ss14)
                    .addComponent(ss15))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static ArrayList<Integer> list = new ArrayList<>();
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        list.clear();
        int bread = 1;
        int cheese = 1;
        int lettuce=0;
        int tomato =0;
        int cucumber =0;
        int pimento=0;
        int onion =0;
        int pickle =0;
        int olive =0;
        int jalapeno =0;
        int sauce1 = 0;
        int sauce2 = 0;
        if(br1.isSelected()){
            bread = 1;
        }else if(br2.isSelected()){
            bread = 2;
        }else if(br3.isSelected()){
            bread = 3;
        }else if(br4.isSelected()){
            bread = 4;
        }else if(br5.isSelected()){
            bread = 5;
        }else{
            JOptionPane.showMessageDialog(null,"오류 1");
            new page4();
            setVisible(false);
        }
        
        if(c1.isSelected()){
            cheese =1;
        }else if(c2.isSelected()){
            cheese =2;
        }else if(c3.isSelected()){
            cheese =3;
        }else if(c4.isSelected()){
            cheese =4;
        }else{
            JOptionPane.showMessageDialog(null,"오류 2");
            new page4();
            setVisible(false);
        }
        
        if(b1.isSelected()){
            lettuce =1;
        }else if(b2.isSelected()){
            tomato =1;
        }else if(b2.isSelected()){
            cucumber =1;
        }else if(b2.isSelected()){
            pimento =1;
        }else if(b2.isSelected()){
            onion =1;
        }else if(b2.isSelected()){
            pickle =1;
        }else if(b2.isSelected()){
            olive =1;
        }else if(b2.isSelected()){
            jalapeno =1;
        }
        
        if(s1.isSelected()){
            sauce1 =1;
        }else if(s2.isSelected()){
            sauce1 =2;
        }else if(s3.isSelected()){
            sauce1 =3;
        }else if(s4.isSelected()){
            sauce1 =4;
        }else if(s5.isSelected()){
            sauce1 =5;
        }else if(s6.isSelected()){
            sauce1 =6;
        }else if(s7.isSelected()){
            sauce1 =7;
        }else if(s8.isSelected()){
            sauce1 =8;
        }else if(s9.isSelected()){
            sauce1 =9;
        }else if(s10.isSelected()){
            sauce1 =10;
        }else if(s11.isSelected()){
            sauce1 =11;
        }else if(s12.isSelected()){
            sauce1 =12;
        }else if(s13.isSelected()){
            sauce1 =13;
        }else if(s14.isSelected()){
            sauce1 =14;
        }else if(s15.isSelected()){
            sauce1 =15;
        }else{
            JOptionPane.showMessageDialog(null,"오류 3");
            new page4();
            setVisible(false);
        }
        
        if(ss1.isSelected()){
            sauce2 =1;
        }else if(ss2.isSelected()){
            sauce2 =2;
        }else if(ss3.isSelected()){
            sauce2 =3;
        }else if(ss4.isSelected()){
            sauce2 =4;
        }else if(ss5.isSelected()){
            sauce2 =5;
        }else if(ss6.isSelected()){
            sauce2 =6;
        }else if(ss7.isSelected()){
            sauce2 =7;
        }else if(ss8.isSelected()){
            sauce2 =8;
        }else if(ss9.isSelected()){
            sauce2 =9;
        }else if(ss10.isSelected()){
            sauce2 =10;
        }else if(ss11.isSelected()){
            sauce2 =11;
        }else if(ss12.isSelected()){
            sauce2 =12;
        }else if(ss13.isSelected()){
            sauce2 =13;
        }else if(ss14.isSelected()){
            sauce2 =14;
        }else if(ss15.isSelected()){
            sauce2 =15;
        }else{
            JOptionPane.showMessageDialog(null,"오류 4");
            new page4();
            setVisible(false);
        }
        
        list.add(bread);
        list.add(cheese);
        list.add(lettuce);
        list.add(tomato);
        list.add(cucumber);
        list.add(pimento);
        list.add(onion);
        list.add(pickle);
        list.add(olive);
        list.add(jalapeno);
        list.add(sauce1);
        list.add(sauce1);
        
        new page6();
        setVisible(false);                      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String[] BreadList = {"화이트","화이트오레가노","위트","허니오트","하티","플랫브래드"};
        String[] CheeseList = {"아메리칸 치즈","슈레드치즈","모차렐라치즈","치즈 제외"};
        String[] SauceList ={"추천소스","소스 제외","머스타드","레드와인식초","스윗 어니언","스윗 칠리",
                             "스모크 바베큐","랜치드레싱","마요네즈","핫칠리","사우스웨스트치폴레",
                             "홀스레디쉬","올리브오일","소금","후추"};
        String[] vegetable ={"양상추","토마토","오이","피망","양파","피클","올리브","할라피뇨"};
        
        int bread = 1;
        int cheese = 1;
        int lettuce=0;
        int tomato =0;
        int cucumber =0;
        int pimento=0;
        int onion =0;
        int pickle =0;
        int olive =0;
        int jalapeno =0;
        int sauce1 = 0;
        int sauce2 = 0;
        if(br1.isSelected()){
            bread = 1;
        }else if(br2.isSelected()){
            bread = 2;
        }else if(br3.isSelected()){
            bread = 3;
        }else if(br4.isSelected()){
            bread = 4;
        }else if(br5.isSelected()){
            bread = 5;
        }else{
            JOptionPane.showMessageDialog(null,"오류");
            new page4();
            setVisible(false);
        }
        
        if(c1.isSelected()){
            cheese =1;
        }else if(c2.isSelected()){
            cheese =2;
        }else if(c3.isSelected()){
            cheese =3;
        }else if(c4.isSelected()){
            cheese =4;
        }else{
            JOptionPane.showMessageDialog(null,"오류");
            new page4();
            setVisible(false);
        }
        
        if(b1.isSelected()){
            lettuce =1;
        }else if(b2.isSelected()){
            tomato =1;
        }else if(b2.isSelected()){
            cucumber =1;
        }else if(b2.isSelected()){
            pimento =1;
        }else if(b2.isSelected()){
            onion =1;
        }else if(b2.isSelected()){
            pickle =1;
        }else if(b2.isSelected()){
            olive =1;
        }else if(b2.isSelected()){
            jalapeno =1;
        }
        
        if(s1.isSelected()){
            sauce1 =1;
        }else if(s2.isSelected()){
            sauce1 =2;
        }else if(s3.isSelected()){
            sauce1 =3;
        }else if(s4.isSelected()){
            sauce1 =4;
        }else if(s5.isSelected()){
            sauce1 =5;
        }else if(s6.isSelected()){
            sauce1 =6;
        }else if(s7.isSelected()){
            sauce1 =7;
        }else if(s8.isSelected()){
            sauce1 =8;
        }else if(s9.isSelected()){
            sauce1 =9;
        }else if(s10.isSelected()){
            sauce1 =10;
        }else if(s11.isSelected()){
            sauce1 =11;
        }else if(s12.isSelected()){
            sauce1 =12;
        }else if(s13.isSelected()){
            sauce1 =13;
        }else if(s14.isSelected()){
            sauce1 =14;
        }else if(s15.isSelected()){
            sauce1 =15;
        }else{
            JOptionPane.showMessageDialog(null,"오류");
            new page4();
            setVisible(false);
        }
        
        if(ss1.isSelected()){
            sauce2 =1;
        }else if(ss2.isSelected()){
            sauce2 =2;
        }else if(ss3.isSelected()){
            sauce2 =3;
        }else if(ss4.isSelected()){
            sauce2 =4;
        }else if(ss5.isSelected()){
            sauce2 =5;
        }else if(ss6.isSelected()){
            sauce2 =6;
        }else if(ss7.isSelected()){
            sauce2 =7;
        }else if(ss8.isSelected()){
            sauce2 =8;
        }else if(ss9.isSelected()){
            sauce2 =9;
        }else if(ss10.isSelected()){
            sauce2 =10;
        }else if(ss11.isSelected()){
            sauce2 =11;
        }else if(ss12.isSelected()){
            sauce2 =12;
        }else if(ss13.isSelected()){
            sauce2 =13;
        }else if(ss14.isSelected()){
            sauce2 =14;
        }else if(ss15.isSelected()){
            sauce2 =15;
        }else{
            JOptionPane.showMessageDialog(null,"오류");
            new page1();
            setVisible(false);
        }
        
        String strSQL = "insert into recipe values(";
        strSQL += jTextField1.getText() + "," + num + ","                                  
               + bread + "," + cheese + "," 
               + lettuce + "," + tomato + "," 
               + cucumber + "," + pimento + ","
               + onion + "," + pickle + ","
               + olive + "," + jalapeno + ","
               + sauce1 + "," + sauce2 + ")";
        try {
            if(jTextField1.equals("")){
                JOptionPane.showMessageDialog(null,"id를 입력해주세요.");
                new page4();
                setVisible(false);
            } else{
                DBM.dbOpen();
                DBM.DB_stmt.executeUpdate(strSQL);
                DBM.dbClose();
            }
        } catch (Exception e) {
            System.out.println("이미 존재하는 ID 입니다");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new page4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton b1;
    private javax.swing.JRadioButton b2;
    private javax.swing.JRadioButton b3;
    private javax.swing.JRadioButton b4;
    private javax.swing.JRadioButton b5;
    private javax.swing.JRadioButton b6;
    private javax.swing.JRadioButton b7;
    private javax.swing.JRadioButton b8;
    private javax.swing.JRadioButton br1;
    private javax.swing.JRadioButton br2;
    private javax.swing.JRadioButton br3;
    private javax.swing.JRadioButton br4;
    private javax.swing.JRadioButton br5;
    private javax.swing.JRadioButton br6;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JRadioButton c1;
    private javax.swing.JRadioButton c2;
    private javax.swing.JRadioButton c3;
    private javax.swing.JRadioButton c4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton s1;
    private javax.swing.JRadioButton s10;
    private javax.swing.JRadioButton s11;
    private javax.swing.JRadioButton s12;
    private javax.swing.JRadioButton s13;
    private javax.swing.JRadioButton s14;
    private javax.swing.JRadioButton s15;
    private javax.swing.JRadioButton s2;
    private javax.swing.JRadioButton s3;
    private javax.swing.JRadioButton s4;
    private javax.swing.JRadioButton s5;
    private javax.swing.JRadioButton s6;
    private javax.swing.JRadioButton s7;
    private javax.swing.JRadioButton s8;
    private javax.swing.JRadioButton s9;
    private javax.swing.JRadioButton ss1;
    private javax.swing.JRadioButton ss10;
    private javax.swing.JRadioButton ss11;
    private javax.swing.JRadioButton ss12;
    private javax.swing.JRadioButton ss13;
    private javax.swing.JRadioButton ss14;
    private javax.swing.JRadioButton ss15;
    private javax.swing.JRadioButton ss2;
    private javax.swing.JRadioButton ss3;
    private javax.swing.JRadioButton ss4;
    private javax.swing.JRadioButton ss5;
    private javax.swing.JRadioButton ss6;
    private javax.swing.JRadioButton ss7;
    private javax.swing.JRadioButton ss8;
    private javax.swing.JRadioButton ss9;
    // End of variables declaration//GEN-END:variables
}

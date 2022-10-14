package View;

import static Controller.SqlServerConnect.connToSQL;
import Dao.ThucDonDAO;
import Model.ThucDon;
import java.awt.Color;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public final class ThemMoi extends javax.swing.JFrame {

    ArrayList<ThucDon> list = new ArrayList<ThucDon>();

    public ThemMoi() {
        initComponents();
        this.setLocationRelativeTo(null);
        mnThemmoi.setForeground(Color.red);
        mnThemmoi.setBackground(Color.yellow);
        LoadDataToArray();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        tabpnlQuanLy = new javax.swing.JTabbedPane();
        pnlNhanvien = new javax.swing.JPanel();
        pnlMonAn = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMaMonAn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTenMonAn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        btnLamMoi_MonAn = new javax.swing.JButton();
        btnThem_MonAn = new javax.swing.JButton();
        btnChinhSua_MonAn = new javax.swing.JButton();
        btnXoa_MonAn = new javax.swing.JButton();
        txtDonVi = new javax.swing.JTextField();
        txtMaLoaiMon = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnDanhmuc = new javax.swing.JMenu();
        mnThemmoi = new javax.swing.JMenu();
        mnThongke = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Nhà Hàng");
        setName(""); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(721, 406));

        tabpnlQuanLy.setBackground(new java.awt.Color(255, 220, 126));
        tabpnlQuanLy.setMaximumSize(new java.awt.Dimension(546, 332));
        tabpnlQuanLy.setMinimumSize(new java.awt.Dimension(546, 332));

        pnlNhanvien.setBackground(new java.awt.Color(255, 220, 126));

        javax.swing.GroupLayout pnlNhanvienLayout = new javax.swing.GroupLayout(pnlNhanvien);
        pnlNhanvien.setLayout(pnlNhanvienLayout);
        pnlNhanvienLayout.setHorizontalGroup(
            pnlNhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
        );
        pnlNhanvienLayout.setVerticalGroup(
            pnlNhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        tabpnlQuanLy.addTab("Nhân Viên", pnlNhanvien);

        pnlMonAn.setBackground(new java.awt.Color(255, 220, 126));

        jPanel1.setBackground(new java.awt.Color(255, 220, 126));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Mã Món Ăn:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Tên Món Ăn:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Đơn Giá:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Đơn Vị:");

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnLamMoi_MonAn.setText("Làm Mới");
        btnLamMoi_MonAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoi_MonAnActionPerformed(evt);
            }
        });

        btnThem_MonAn.setText("Thêm");
        btnThem_MonAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_MonAnActionPerformed(evt);
            }
        });

        btnChinhSua_MonAn.setText("Chỉnh sửa");
        btnChinhSua_MonAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChinhSua_MonAnActionPerformed(evt);
            }
        });

        btnXoa_MonAn.setText("Xóa");
        btnXoa_MonAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_MonAnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Mã Loại Món:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOK))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaLoaiMon, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(txtMaMonAn)
                            .addComponent(txtTenMonAn)
                            .addComponent(txtDonGia)
                            .addComponent(txtDonVi))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLamMoi_MonAn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnChinhSua_MonAn, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnThem_MonAn, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(btnXoa_MonAn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(163, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOK))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMaMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTenMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem_MonAn)
                            .addComponent(btnLamMoi_MonAn))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChinhSua_MonAn)
                            .addComponent(btnXoa_MonAn))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(txtMaLoaiMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(261, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMonAnLayout = new javax.swing.GroupLayout(pnlMonAn);
        pnlMonAn.setLayout(pnlMonAnLayout);
        pnlMonAnLayout.setHorizontalGroup(
            pnlMonAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMonAnLayout.setVerticalGroup(
            pnlMonAnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabpnlQuanLy.addTab("Món Ăn", pnlMonAn);

        jPanel4.setBackground(new java.awt.Color(255, 220, 126));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 837, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        tabpnlQuanLy.addTab("Công Thức", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 220, 126));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 837, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        tabpnlQuanLy.addTab("Nguyên Liệu", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 220, 126));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 837, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        tabpnlQuanLy.addTab("Phiếu Nhập", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 220, 126));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 837, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        tabpnlQuanLy.addTab("Ca Trực", jPanel7);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setMaximumSize(new java.awt.Dimension(710, 29));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(710, 29));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(710, 29));

        mnDanhmuc.setText("Danh Mục");
        jMenuBar1.add(mnDanhmuc);

        mnThemmoi.setBackground(new java.awt.Color(0, 102, 255));
        mnThemmoi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnThemmoi.setForeground(new java.awt.Color(255, 255, 255));
        mnThemmoi.setText("Thêm Mới");
        jMenuBar1.add(mnThemmoi);

        mnThongke.setText("Thống Kê");
        mnThongke.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.add(mnThongke);

        jMenu2.setText("Thoát");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabpnlQuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tabpnlQuanLy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tabpnlQuanLy.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLamMoi_MonAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoi_MonAnActionPerformed
        // TODO add your handling code here:
        txtMaMonAn.setText("");
        txtTenMonAn.setText("");
        txtDonGia.setText("");
        txtDonVi.setText("");
        txtMaLoaiMon.setText("");
        txtTimKiem.setText("");
        txtTimKiem.requestFocus();
    }//GEN-LAST:event_btnLamMoi_MonAnActionPerformed

    private void btnThem_MonAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_MonAnActionPerformed
        // TODO add your handling code here:
        String maMon2 = txtMaMonAn.getText();
        if (txtMaMonAn.getText().equals("") || txtTenMonAn.getText().equals("") || txtDonGia.getText().equals("") || txtDonVi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ các thông tin");
        } else {
            Connection con = connToSQL("sa", "123456", 1433, "QLNHAHANG_NHOM3");
            try {
                
                String sql = "insert into MonAn values(?,?,?,?,?)";
                PreparedStatement stm = con.prepareStatement(sql);

                stm.setString(1, txtMaMonAn.getText());
                stm.setString(2, txtTenMonAn.getText());
                stm.setString(3, txtDonGia.getText());
                stm.setString(4, txtDonVi.getText());
                stm.setString(5, txtMaLoaiMon.getText());
                
                int result = stm.executeUpdate();
                if (result > 0) {
                    JOptionPane.showMessageDialog(this, "Thêm Thành Công");
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm Thất Bại");
                }
                stm.close();
                con.close();

                LoadDataToArray();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Món này đã có trong thực đơn");
            }
        }
    }//GEN-LAST:event_btnThem_MonAnActionPerformed

    private void btnChinhSua_MonAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChinhSua_MonAnActionPerformed
        // TODO add your handling code here:
        try {
            Connection cnn = connToSQL("sa", "123456", 1433, "QLNHAHANG_NHOM3");
            PreparedStatement pre = cnn.prepareStatement("update MonAn set TenMon = ?, DonGia = ?, DonViHoaDon = ?, MaLoaiMon = ? where MaMon = ?");
            pre.setString(1, txtTenMonAn.getText());
            pre.setString(2, txtDonGia.getText());
            pre.setString(3, txtDonVi.getText());
            pre.setString(4, txtMaLoaiMon.getText());
            pre.setString(5, txtMaMonAn.getText());
            int kq = pre.executeUpdate();
            if (kq == 1) {
                JOptionPane.showMessageDialog(this, "Update Thành Công");
            } else {
                JOptionPane.showMessageDialog(this, "Thất Bại");
            }
            pre.close();
            cnn.close();
            LoadDataToArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnChinhSua_MonAnActionPerformed

    private void btnXoa_MonAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_MonAnActionPerformed
        // TODO add your handling code here:
        Connection conn = connToSQL("sa", "123456", 1433, "QLNHAHANG_NHOM3");
        try {
            String sql = "Delete from MonAn where MaMon = ?";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1, txtMaMonAn.getText());
            int kq = pre.executeUpdate();
            if (kq > 0) {
                JOptionPane.showMessageDialog(this, "Xóa Thành Công");
            } else {
                JOptionPane.showMessageDialog(this, "Xóa Thất Bại");
            }
            pre.close();
            conn.close();
            LoadDataToArray();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_btnXoa_MonAnActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:
        Connection conn = connToSQL("sa", "123456", 1433, "QLNHAHANG_NHOM3");
        if (txtTimKiem.getText().equals("")) {
            txtTimKiem.requestFocus();
            return;
        }
        int check = -1;
        for (int i = 0; i < list.size(); i++) {
            if (txtMaMonAn.getText().equalsIgnoreCase(list.get(i).maMon)) {
                JOptionPane.showMessageDialog(this,
                        "Mã món : " + list.get(i).maMon
                        + "\nTên món: " + list.get(i).tenMon
                        + "\nĐơn giá : " + list.get(i).gia
                        + "\nĐơn vị : " + list.get(i).donViHoaDon
                        + "\nMã Loại Món : " + list.get(i).maLoaiMon);
                check = i;
            }
        }
        if (check == -1) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy món ăn");
        }
    }//GEN-LAST:event_btnOKActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemMoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChinhSua_MonAn;
    private javax.swing.JButton btnLamMoi_MonAn;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnThem_MonAn;
    private javax.swing.JButton btnXoa_MonAn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JMenu mnDanhmuc;
    private javax.swing.JMenu mnThemmoi;
    private javax.swing.JMenu mnThongke;
    private javax.swing.JPanel pnlMonAn;
    private javax.swing.JPanel pnlNhanvien;
    private javax.swing.JTabbedPane tabpnlQuanLy;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtDonVi;
    private javax.swing.JTextField txtMaLoaiMon;
    private javax.swing.JTextField txtMaMonAn;
    private javax.swing.JTextField txtTenMonAn;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    public void LoadDataToArray() {
        try {
            String user = "sa";
            String password = "123456";
            String db_url = "jdbc:sqlserver://localhost:1433;databaseName=QLNHAHANG_NHOM3";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(db_url, user, password);
            PreparedStatement st = con.prepareStatement("SELECT * FROM MONAN");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                txtMaMonAn.setText(rs.getString(1));
                txtTenMonAn.setText(rs.getString(2));
                txtDonGia.setText(rs.getString(3));
                txtDonVi.setText(rs.getString(4));
                txtMaLoaiMon.setText(rs.getString(5));
                ThucDon td = new ThucDon();
                list.add(td);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
}

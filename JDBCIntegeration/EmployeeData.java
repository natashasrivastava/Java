import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class EmployeeData {
    private JPanel Main;
    private JTextField txtname;
    private JTextField txtsalary;
    private JTextField txtmobile;
    private JButton saveButton;
    private JButton updateButton;
    private JTable table1;
    private JButton deleteButton;
    private JButton searchButton;
    private JTextField txteid;
    Connection con;
    PreparedStatement pst;

    public static void main(String[] args) {
        JFrame frame = new JFrame("EmployeeData");
        frame.setContentPane(new EmployeeData().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/employee", "root", "");
            System.out.println("Success");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    void table_loading() {
        try {
            pst = con.prepareStatement("select * from employeedata");
            ResultSet rs = pst.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public EmployeeData() {
        connect();
        table_loading();
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String empName = txtname.getText();
                String empSalary = txtsalary.getText();
                String empMobile = txtmobile.getText();

                try {
                    pst = con.prepareStatement("insert into employeedata(EName, ESalary, EMobile) values(?,?,?)");
                    pst.setString(1, empName);
                    pst.setString(2, empSalary);
                    pst.setString(3, empMobile);
                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Record Added");
                    table_loading();
                    txtmobile.setText("");
                    txtsalary.setText("");
                    txtname.setText("");
                    txtname.requestFocus();

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String id = txteid.getText();
                    pst = con.prepareStatement("select EName, ESalary, EMobile from employeedata where EID = ?");
                    pst.setString(1, id);
                    ResultSet rs = pst.executeQuery();
                    if (rs.next() == true) {
                        String name = rs.getString(1);
                        String salary = rs.getString(2);
                        String mobile = rs.getString(3);

                        txtname.setText(name);
                        txtsalary.setText(salary);
                        txtmobile.setText(mobile);
                    } else {
                        txtname.setText("");
                        txtsalary.setText("");
                        txtmobile.setText("");
                        JOptionPane.showMessageDialog(null, "Invalid Employee ID");

                    }

                } catch (SQLException e1) {

                }
            }
        });
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id, empName, salary, mobile;
                empName = txtname.getText();
                salary = txtsalary.getText();
                mobile = txtmobile.getText();
                id = txteid.getText();
                try {
                    pst = con.prepareStatement("update employeedata set EName = ?, ESalary = ?, EMobile = ? where EId = ?");
                    pst.setString(1,empName);
                    pst.setString(2,salary);
                    pst.setString(3,mobile);
                    pst.setString(4,id);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Updated!!");
                    table_loading();
                    txtmobile.setText("");
                    txtsalary.setText("");
                    txtname.setText("");
                    txteid.setText("");
                    txtname.requestFocus();

                } catch (SQLException e1) {

                }
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = txteid.getText();
                try {
                    pst = con.prepareStatement("delete from employeedata where EId = ?");
                    pst.setString(1,id);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted!!");
                    table_loading();
                    txteid.setText("");
                    txtname.requestFocus();

                } catch (SQLException e1) {

                }
            }
        });
    }
}

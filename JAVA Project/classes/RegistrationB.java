package classes;

import javax.swing.*;
import javax.swing.table.*;
import classes.basic.LoginWin;
import interfaces.IBasic;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;

public class RegistrationB extends JFrame implements ActionListener, IBasic {

    private JLabel name, id, course, tl;
    private JTextField nameField;
    private JTextField idField;
    private JButton confirm, delete, reset, back, update;
    private JTable table;
    private JScrollPane scroll;
    private JComboBox<String> box;
    private DefaultTableModel model;

    private String[] rows = new String[3];
    private String[] column = { "Full Name", "ID", "Course" };

    public RegistrationB() {
        initcomponents();
    }

    public void initcomponents() {
        this.setTitle("HARVARD");
        this.setIconImage(new ImageIcon("images/logo.png").getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 563);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        JPanel panel = new JPanel();
        panel.setBackground(IBasic.c3);
        panel.setBounds(0, 0, 1000, 563);
        panel.setLayout(null);
        this.add(panel);
        Font rf = new Font("Segoe UI", Font.BOLD, 20);

        back = new JButton(new ImageIcon("images/back.png"));
        back.setBounds(20, 20, 35, 35);
        back.setFocusPainted(false);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.setContentAreaFilled(false);
        back.setBorderPainted(true);
        panel.add(back);
        back.addActionListener(this);

        confirm = new JButton("Confirm");
        confirm.setBounds(10, 360, 100, 30);
        confirm.setBackground(Color.RED);
        confirm.setForeground(Color.WHITE);
        panel.add(confirm);
        confirm.addActionListener(this);

        reset = new JButton("Reset");
        reset.setBounds(120, 360, 100, 30);
        reset.setBackground(Color.RED);
        reset.setForeground(Color.WHITE);
        panel.add(reset);
        reset.addActionListener(this);

        delete = new JButton("Delete");
        delete.setBounds(230, 360, 100, 30);
        delete.setBackground(Color.RED);
        delete.setForeground(Color.WHITE);
        panel.add(delete);
        delete.addActionListener(this);

        update = new JButton("Update");
        update.setBounds(340, 360, 100, 30);
        update.setBackground(Color.RED);
        update.setForeground(Color.WHITE);
        panel.add(update);
        update.addActionListener(this);

        tl = new JLabel();
        tl.setText("Registration Form");
        tl.setBounds(400, 20, 300, 30);
        tl.setForeground(Color.WHITE);
        tl.setFont(rf);
        panel.add(tl);
        Font courseFont = new Font("Segoe UI", Font.BOLD, 16);

        name = new JLabel("Name :");
        name.setBounds(70, 150, 100, 20);
        name.setFont(courseFont);
        name.setForeground(Color.white);
        panel.add(name);

        nameField = new JTextField();
        nameField.setBounds(180, 150, 200, 30);
        panel.add(nameField);

        id = new JLabel("Id :");
        id.setBounds(70, 220, 200, 30);
        id.setFont(courseFont);
        id.setForeground(Color.white);
        panel.add(id);

        idField = new JTextField();
        idField.setBounds(180, 220, 200, 30);
        Font idfieldFont = new Font("Times New Roman", Font.PLAIN, 14);
        idField.setFont(idfieldFont);
        panel.add(idField);

        course = new JLabel("Course :");
        course.setBounds(70, 290, 100, 20);
        course.setFont(courseFont);
        course.setForeground(Color.white);
        panel.add(course);

        String[] course = { "Choose a course...", "Java", "C#", "Data Structure", "Algorithm" };
        box = new JComboBox<>(course);
        box.setBounds(180, 290, 200, 30);
        box.setSelectedIndex(0);
        box.setBackground(Color.white);
        panel.add(box);

        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);
        table.setModel(model);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.getColumnModel().getColumn(0);
        table.getColumnModel().getColumn(1);
        table.getColumnModel().getColumn(2);

        scroll = new JScrollPane(table);
        scroll.setBounds(450, 80, 500, 340);
        scroll.setBackground(Color.WHITE);
        panel.add(scroll);

        String file = ".\\File\\" + LoginWin.userName + "_RegistrationB.txt";
        String temp = ".\\File\\temp.txt";
        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
            reader.close();

            for (int i = 0; i < totalLines; i++) {
                String line = Files.readAllLines(Paths.get(file)).get(i);
                String x = line.substring(0, 4);
                if (x.equals("Full")) {

                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(11);
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(5);
                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(8);
                    model.addRow(rows);
                }
            }

        } catch (Exception ex) {
            return;
        }

        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                int numberOfRow = table.getSelectedRow();
                String name = model.getValueAt(numberOfRow, 0).toString();
                String Id = model.getValueAt(numberOfRow, 1).toString();
                String course1 = model.getValueAt(numberOfRow, 2).toString();

                nameField.setText(name);
                idField.setText(Id);
                box.setSelectedItem(course1);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String id = idField.getText();
        String box1 = String.valueOf(box.getSelectedItem());
        boolean nameEmpty = name.isEmpty();
        boolean idEmpty = id.isEmpty();
        long idnumber = 0;
        int numcount = 0;
        String temp = ".\\File\\temp.txt";

        try {
            idnumber = Integer.parseInt(id);
            if (id.length() != 6)
                numcount++;
        } catch (Exception ex) {
            numcount = 1;
        }

        if (e.getSource() == confirm) {
            if (nameEmpty == true || idEmpty == true || ((box.getSelectedIndex()) == 0)) {
                showMessageDialog(null, "Please fill all of the fields.", "Error!", JOptionPane.WARNING_MESSAGE);
            } else if (numcount > 0) {
                showMessageDialog(null, "Invalid ID Number", " Error!", JOptionPane.WARNING_MESSAGE);
            }

            else {
                String file = ".\\File\\" + LoginWin.userName + "_RegistrationB.txt";
                try {
                    File file1 = new File(file);
                    if (!file1.exists()) {
                        file1.createNewFile();
                    }
                    FileWriter fileWriter = new FileWriter(file1, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    PrintWriter printWriter = new PrintWriter(bufferedWriter);
                    LocalDateTime myDateObj = LocalDateTime.now();
                    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");
                    String timeAndDate = myDateObj.format(myFormatObj);
                    {
                        printWriter.println("===============================================");
                        printWriter.println("Full Name : " + name);
                        printWriter.println("ID : " + id);
                        printWriter.println("Course : " + box1);

                    }
                    printWriter.close();

                    setVisible(false);
                    RegistrationB frame = new RegistrationB();
                    frame.setVisible(true);

                } catch (Exception ex) {
                    System.out.print(ex);
                }
            }
        }

        else if (e.getSource() == back) {
            this.setVisible(false);
            new Dashboard();
        }

        if (e.getSource() == reset) {
            setVisible(false);
            RegistrationB frame = new RegistrationB();
            frame.setVisible(true);
        }
        if (e.getSource() == delete) {
            if (table.getSelectionModel().isSelectionEmpty()) {
                showMessageDialog(null, "Please select a row to delete", "Warning!", JOptionPane.WARNING_MESSAGE);
            } else {
                int selectedRow = table.getSelectedRow();

                try {
                    String fileName = "File\\" + LoginWin.userName + "_RegistrationB.txt";
                    String tempFileName = "File\\temp.txt";

                    BufferedReader reader = new BufferedReader(new FileReader(fileName));
                    BufferedWriter writer = new BufferedWriter(new FileWriter(tempFileName));

                    String currentLine;
                    int currentRow = 0;

                    while ((currentLine = reader.readLine()) != null) {
                        if (currentRow != selectedRow) {
                            writer.write(currentLine + "\n");
                        }

                        currentRow++;
                    }

                    writer.close();
                    reader.close();

                    File file1 = new File(fileName);
                    File tempFile = new File(tempFileName);

                    if (file1.delete() && tempFile.renameTo(file1)) {
                        showMessageDialog(null, "Row deleted successfully!");
                        model.removeRow(selectedRow);
                    } else {
                        showMessageDialog(null, "Error deleting row!");
                    }
                } catch (Exception ex) {
                    System.out.print(ex);
                }
            }
        }

        else if (e.getSource() == update) {
            int selectedRow = table.getSelectedRow();
            if (selectedRow == -1) {
                showMessageDialog(null, "Please select a row to update", "Warning!", JOptionPane.WARNING_MESSAGE);
            } else {
                updateSelectedRow(selectedRow);
            }
        }
    }

    private void updateSelectedRow(int selectedRow) {
        String updatedName = nameField.getText();
        String updatedId = idField.getText();
        String updatedCourse = String.valueOf(box.getSelectedItem());

        if (updatedName.isEmpty() || updatedId.isEmpty() || box.getSelectedIndex() == 0) {
            showMessageDialog(null, "Please fill all of the fields.", "Error!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            long idNumber = Long.parseLong(updatedId);
            if (updatedId.length() != 6) {
                showMessageDialog(null, "Invalid ID Number", "Error!", JOptionPane.WARNING_MESSAGE);
                return;
            }
        } catch (NumberFormatException ex) {
            showMessageDialog(null, "Invalid ID Number", "Error!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        model.setValueAt(updatedName, selectedRow, 0);
        model.setValueAt(updatedId, selectedRow, 1);
        model.setValueAt(updatedCourse, selectedRow, 2);

        updateTextFile();
        clearFields();
    }

    private void updateTextFile() {
        String fileName = "File\\" + LoginWin.userName + "_RegistrationB.txt";

        try (PrintWriter writer = new PrintWriter(fileName)) {
            for (int i = 0; i < model.getRowCount(); i++) {
                writer.println("===============================================");
                writer.println("Full Name : " + model.getValueAt(i, 0));
                writer.println("ID : " + model.getValueAt(i, 1));
                writer.println("Course : " + model.getValueAt(i, 2));
            }
        } catch (IOException ex) {
            showMessageDialog(null, "Error updating data in the text file!", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields() {
        nameField.setText("");
        idField.setText("");
        box.setSelectedIndex(0);
    }
}

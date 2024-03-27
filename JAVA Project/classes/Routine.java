package classes;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.*;
import classes.basic.LoginWin;
import interfaces.IBasic;

public class Routine extends JFrame implements ActionListener, IBasic {

    private JLabel time, sat, sun, mon, tue, wed, thu, cr;
    private JButton save, delete, reset, back;
    private JTable table;
    private JScrollPane scroll;
    private JComboBox<String> box1, box2, box3, box4, box5, box6, box7;
    private DefaultTableModel model;

    private String[] rows = new String[8];
    private String[] column = { "Time", "Sat", "Sun", "Mon", "Tue", "Wed", "Thu" };

    public Routine() {
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

        cr = new JLabel("Class Routine");
        cr.setBounds(400, 40, 200, 40);
        Font crFont = new Font("Segoe UI", Font.BOLD, 20);
        cr.setForeground(Color.WHITE);
        cr.setFont(crFont);
        panel.add(cr);
        Font courseFont = new Font("Segoe UI", Font.BOLD, 16);

        time = new JLabel("Time :");
        time.setBounds(50, 90, 100, 20);
        time.setFont(courseFont);
        time.setForeground(Color.WHITE);
        panel.add(time);

        sat = new JLabel("Saturday :");
        sat.setBounds(50, 130, 100, 20);
        sat.setFont(courseFont);
        sat.setForeground(Color.white);
        panel.add(sat);

        sun = new JLabel("Sunday :");
        sun.setBounds(50, 170, 100, 20);
        sun.setFont(courseFont);
        sun.setForeground(Color.white);
        panel.add(sun);

        mon = new JLabel("Monday :");
        mon.setBounds(50, 210, 100, 20);
        mon.setFont(courseFont);
        mon.setForeground(Color.white);
        panel.add(mon);

        tue = new JLabel("Tuesday :");
        tue.setBounds(50, 250, 100, 20);
        tue.setFont(courseFont);
        tue.setForeground(Color.white);
        panel.add(tue);

        wed = new JLabel("Wednesday :");
        wed.setBounds(50, 290, 100, 20);
        wed.setFont(courseFont);
        wed.setForeground(Color.white);
        panel.add(wed);

        thu = new JLabel("Thursday :");
        thu.setBounds(50, 330, 100, 20);
        thu.setFont(courseFont);
        thu.setForeground(Color.WHITE);
        panel.add(thu);

        String[] time = { "Choose a time slot...", "8.00 am-9.00 am", "9.30 am-11.00 am", "11.30 am -1.00 pm",
                "1.30 pm-2.00 pm" };
        box1 = new JComboBox<>(time);
        box1.setBounds(160, 90, 200, 30);
        box1.setSelectedIndex(0);
        box1.setBackground(Color.white);
        panel.add(box1);

        String[] course1 = { "Choose a subject...", "No class", "Java", "C#", "Data Structure", "Algorithm" };
        box2 = new JComboBox<>(course1);
        box2.setBounds(160, 130, 200, 30);
        box2.setSelectedIndex(0);
        box2.setBackground(Color.white);
        panel.add(box2);

        String[] course2 = { "Choose a subject...", "No class", "Java", "C#", "Data Structure", "Algorithm" };
        box3 = new JComboBox<>(course2);
        box3.setBounds(160, 170, 200, 30);
        box3.setSelectedIndex(0);
        box3.setBackground(Color.white);
        panel.add(box3);

        String[] course3 = { "Choose a subject...", "No class", "Java", "C#", "Data Structure", "Algorithm" };
        box4 = new JComboBox<>(course3);
        box4.setBounds(160, 210, 200, 30);
        box4.setSelectedIndex(0);
        box4.setBackground(Color.white);
        panel.add(box4);

        String[] course4 = { "Choose a subject...", "No class", "Java", "C#", "Data Structure", "Algorithm" };
        box5 = new JComboBox<>(course4);
        box5.setBounds(160, 250, 200, 30);
        box5.setSelectedIndex(0);
        box5.setBackground(Color.white);
        panel.add(box5);

        String[] course5 = { "Choose a subject...", "No class", "Java", "C#", "Data Structure", "Algorithm" };
        box6 = new JComboBox<>(course5);
        box6.setBounds(160, 290, 200, 30);
        box6.setSelectedIndex(0);
        box6.setBackground(Color.white);
        panel.add(box6);

        String[] course6 = { "Choose a subject...", "No class", "Java", "C#", "Data Structure", "Algorithm" };
        box7 = new JComboBox<>(course6);
        box7.setBounds(160, 330, 200, 30);
        box7.setSelectedIndex(0);
        box7.setBackground(Color.white);
        panel.add(box7);

        back = new JButton(new ImageIcon("images/back.png"));
        back.setBounds(20, 20, 35, 35);
        back.setFocusPainted(false);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.setContentAreaFilled(false);
        back.setBorderPainted(true);
        panel.add(back);
        back.addActionListener(this);

        save = new JButton("Save");
        save.setBounds(50, 400, 100, 30);
        save.setFont(courseFont);
        save.setBackground(Color.RED);
        save.setForeground(Color.WHITE);
        panel.add(save);
        save.addActionListener(this);

        reset = new JButton("Reset");
        reset.setBounds(160, 400, 100, 30);
        reset.setFont(courseFont);
        reset.setBackground(Color.RED);
        reset.setForeground(Color.WHITE);
        panel.add(reset);
        reset.addActionListener(this);

        delete = new JButton("Delete");
        delete.setBounds(270, 400, 100, 30);
        delete.setFont(courseFont);
        delete.setBackground(Color.RED);
        delete.setForeground(Color.WHITE);
        panel.add(delete);
        delete.addActionListener(this);

        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);
        table.setModel(model);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.getColumnModel().getColumn(0).setPreferredWidth(130);
        table.getColumnModel().getColumn(1);
        table.getColumnModel().getColumn(2);
        table.getColumnModel().getColumn(3);
        table.getColumnModel().getColumn(4);
        table.getColumnModel().getColumn(5);
        table.getColumnModel().getColumn(6);

        scroll = new JScrollPane(table);
        scroll.setBounds(400, 90, 550, 340);
        scroll.setBackground(Color.WHITE);
        panel.add(scroll);

        String file = ".\\File\\" + LoginWin.userName + "_Routine.txt";
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
                if (x.equals("Time")) {

                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(7);
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(6);
                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(6);
                    rows[3] = Files.readAllLines(Paths.get(file)).get((i + 3)).substring(6);
                    rows[4] = Files.readAllLines(Paths.get(file)).get((i + 4)).substring(6);
                    rows[5] = Files.readAllLines(Paths.get(file)).get((i + 5)).substring(6);
                    rows[6] = Files.readAllLines(Paths.get(file)).get((i + 6)).substring(6);
                    model.addRow(rows);
                }
            }

        } catch (Exception ex) {
            return;
        }

    }

    public void actionPerformed(ActionEvent e) {
        String b1 = String.valueOf(box1.getSelectedItem());
        String b2 = String.valueOf(box2.getSelectedItem());
        String b3 = String.valueOf(box3.getSelectedItem());
        String b4 = String.valueOf(box4.getSelectedItem());
        String b5 = String.valueOf(box5.getSelectedItem());
        String b6 = String.valueOf(box6.getSelectedItem());
        String b7 = String.valueOf(box7.getSelectedItem());

        if (e.getSource() == save) {
            if (((box1.getSelectedIndex()) == 0) || ((box2.getSelectedIndex()) == 0) || ((box3.getSelectedIndex()) == 0)
                    || ((box4.getSelectedIndex()) == 0) || ((box5.getSelectedIndex()) == 0)
                    || ((box6.getSelectedIndex()) == 0) || ((box7.getSelectedIndex()) == 0)) {
                showMessageDialog(null, "Please fill all of the fields.", "Error!", JOptionPane.WARNING_MESSAGE);
            } else {
                String file = ".\\File\\" + LoginWin.userName + "_Routine.txt";
                try {
                    File file1 = new File(file);
                    if (!file1.exists()) {
                        file1.createNewFile();
                    }
                    FileWriter fileWriter = new FileWriter(file1, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    PrintWriter printWriter = new PrintWriter(bufferedWriter);

                    {
                        printWriter.println("===============================================");
                        printWriter.println("Time : " + b1);
                        printWriter.println("Sat : " + b2);
                        printWriter.println("Sun : " + b3);
                        printWriter.println("Mon : " + b4);
                        printWriter.println("Tue : " + b5);
                        printWriter.println("Wed : " + b6);
                        printWriter.println("Thu : " + b7);
                    }
                    printWriter.close();

                    setVisible(false);
                    Routine frame = new Routine();
                    frame.setVisible(true);

                } catch (Exception ex) {
                    System.out.print(ex);
                }
            }
        } else if (e.getSource() == reset) {
            setVisible(false);
            Routine frame = new Routine();
            frame.setVisible(true);
        }
        if (e.getSource() == delete) {
            if (table.getSelectionModel().isSelectionEmpty()) {
                showMessageDialog(null, "Please select a row to delete", "Warning!", JOptionPane.WARNING_MESSAGE);
            } else {
                int selectedRow = table.getSelectedRow();

                try {
                    String fileName = "File/" + LoginWin.userName + "_Routine.txt";
                    String tempFileName = "File/temp.txt";

                    BufferedReader reader = new BufferedReader(new FileReader(fileName));
                    BufferedWriter writer = new BufferedWriter(new FileWriter(tempFileName));

                    String lineToRemove = table.getValueAt(selectedRow, 0).toString();
                    String currentLine;

                    while ((currentLine = reader.readLine()) != null) {
                        if (currentLine.contains(lineToRemove)) {
                            for (int i = 0; i < 4; i++) {
                                reader.readLine();
                            }
                        } else {
                            writer.write(currentLine + "\n");
                        }
                    }

                    writer.close();
                    reader.close();

                    File file1 = new File(fileName);
                    File tempFile = new File(tempFileName);
                    if (file1.delete() && tempFile.renameTo(file1)) {
                        showMessageDialog(null, "Row deleted successfully!");
                        setVisible(false);
                        Routine frame = new Routine();
                        frame.setVisible(true);
                    } else {
                        showMessageDialog(null, "Error deleting row!");
                    }
                } catch (Exception ex) {
                    System.out.print(ex);
                }
            }
        }
        if (e.getSource() == back) {
            this.setVisible(false);
            new Dashboard();
        }

    }
}

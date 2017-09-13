package last;

import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.*;
public class ServerSocketScanEx extends JFrame 
    implements ActionListener, Runnable{
    private JButton jbtn_scan;
    private JTextField jtf_ip;
    private JList jlist_result;
    private JLabel jlabel_ip;
    private DefaultListModel listmodel;
    private int index;
    private String ip;
    public ServerSocketScanEx(String message){          
        super(message);
        jbtn_scan = new JButton("���� ��ĵ");
        listmodel = new DefaultListModel();
        jlist_result = new JList(listmodel);
        jlist_result.setVisibleRowCount(10);
        
        JPanel jpanel_south = new JPanel();
        jpanel_south.add(jbtn_scan);
        
        jbtn_scan.addActionListener(this);
        JScrollPane jsp = new JScrollPane(jlist_result);
        add(jsp,BorderLayout.CENTER);
        add(jpanel_south,BorderLayout.SOUTH);
        
        pack();
        setVisible(true);   
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent ae){
        Object obj = ae.getSource();
        if(obj == jbtn_scan){
            listmodel.insertElementAt(ip,index);
            jlist_result.setSelectedIndex(index);              
            index++;
            Thread t = new Thread(this);
            t.start();     
        }
    }
    public void run(){
        ServerSocket s = null;
        for(int i=1;i<65536;i++){
            try{
                s = new ServerSocket(i);
            }catch(java.io.IOException e){
                listmodel.insertElementAt(i+
                        "�� ��Ʈ�� ������Դϴ�",index);
                jlist_result.setSelectedIndex(index);     
            }         
        }    
        listmodel.insertElementAt("���� ��ĵ�� �������ϴ�.",index);
        jlist_result.setSelectedIndex(index);                
    }
    public static void main(String[] args){
        JFrame.setDefaultLookAndFeelDecorated(true);
        new ServerSocketScanEx("ServerPort Sanner");
    }
}










package projectmine;
import javax.swing.JFrame;
import java.awt.Button;
import java.awt.GridLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProjectMine implements ActionListener{
    public static final int WIDTH = 300;
    public static final int HIGTH = 200;
    private JFrame fm1;
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    private JMenu mu;
    private JMenuItem Newgame;
    private JMenuBar bar;
    private Container contentPane;
    private int randomNum1,randomNum2,count;
    private JPanel board , show ;
    private JTextField textfieldl;
    
    public static void main(String[] args) {
        ProjectMine pm = new ProjectMine();
        pm.init();
    }
   
    void init(){     
    fm1 = new JFrame("Epic Hard Mine Game");
    board = new JPanel();
    show = new JPanel();
    contentPane = fm1.getContentPane();
    contentPane.setLayout(new BorderLayout()); 
    fm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    btn1 = new Button("1");//ปุ่มที่1;
    btn2 = new Button("2");//ปุ่มที่2
    btn3 = new Button("3");//ปุ่มที่3
    btn4 = new Button("4");//ปุ่มที่4
    btn5 = new Button("5");//ปุ่มที่5
    btn6 = new Button("6");//ปุ่มที่6
    btn7 = new Button("7");//ปุ่มที่7
    btn8 = new Button("8");//ปุ่มที่8
    btn9 = new Button("9");//ปุ่มที่9
    
    mu = new JMenu("File");
    Newgame = new JMenuItem("Newgame");
    bar = new JMenuBar();
    mu.add(Newgame);
    bar.add(mu);
    fm1.setJMenuBar(bar);
    contentPane.setVisible(true);
    
    fm1.add(btn1);
    fm1.add(btn2);
    fm1.add(btn3);
    fm1.add(btn4);
    fm1.add(btn5);
    fm1.add(btn6);
    fm1.add(btn7);
    fm1.add(btn8);
    fm1.add(btn9);
    btn1.addActionListener(this);
    btn2.addActionListener(this);
    btn3.addActionListener(this);
    btn4.addActionListener(this);
    btn5.addActionListener(this);
    btn6.addActionListener(this);
    btn7.addActionListener(this);
    btn8.addActionListener(this);
    btn9.addActionListener(this);
    Newgame.addActionListener(new MenuActionListener());

    fm1.setLayout(new GridLayout(3,3));
    fm1.setSize(300,200);
    fm1.setVisible(true);
    fm1.show();
    count = 1;
    }
    class MenuActionListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    count = 1;
        System.out.println("-----------------------------");
        System.out.println("        Newgame           ");
        System.out.println("      Your Point is 0     ");
        System.out.println("-----------------------------");

  }
}
    
    
    public void actionPerformed(ActionEvent e){
String buttonString = e.getActionCommand();
randomNum1 = (int)(Math.random() * 10);
randomNum2 = (int)(Math.random() * 10);
if(count <9){
    if(buttonString.equals("1")){
       if( randomNum1 == 1 || randomNum2 ==1) {
        System.out.println("-----------------------------");
        System.out.println("    Num1 Found Bomb  ");
        System.out.println("     Game Over        ");
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        count = 1;
        } 
    else {
        System.out.println("-------------------------------");
        System.out.println("  Num1 It safe,Goodluck ");
        System.out.println(" Your point is  " + count);
        System.out.println("-------------------------------");
        count += 1;
    }}
else if (buttonString.equals("2")){
        if( randomNum1 == 2 || randomNum2 ==2 ) {
        System.out.println("-----------------------------");
        System.out.println("    Num2 Found Bomb  ");
        System.out.println("     Game Over        ");
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        count = 1;


} else {
        System.out.println("---------------------------------");
        System.out.println("  Num2 It safe,Goodluck ");
        System.out.println(" Your point is  " + count);
        System.out.println("---------------------------------");
        count += 1;
           
    }}
else if (buttonString.equals("3")){
        if( randomNum1 == 3 || randomNum2 ==3 ) {
        System.out.println("-----------------------------");
        System.out.println("    Num3 Found Bomb  ");
        System.out.println("     Game Over        ");
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        count = 1;


} else {
        System.out.println("---------------------------------");
        System.out.println("  Num3 It safe,Goodluck ");
        System.out.println(" Your point is  " + count);
        System.out.println("---------------------------------");
        count +=1;
    }}
else if (buttonString.equals("4")){
        if( randomNum1 == 4 || randomNum2 ==4 ) {
        System.out.println("-----------------------------");
        System.out.println("    Num4 Found Bomb  ");
        System.out.println("     Game Over        ");
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        count = 1;


} else {
        System.out.println("---------------------------------");
        System.out.println("  Num4 It safe,Goodluck ");
        System.out.println(" Your point is  " + count);
        System.out.println("---------------------------------");
        count +=1;
    }}
else if (buttonString.equals("5")){
        if( randomNum1 == 5 || randomNum2 ==5 ) {
        System.out.println("-----------------------------");
        System.out.println("    Num5 Found Bomb  ");
        System.out.println("     Game Over        ");
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        count = 1;


} else {
        System.out.println("---------------------------------");
        System.out.println("  Num5 It safe,Goodluck ");
        System.out.println(" Your point is  " + count);
        System.out.println("---------------------------------");
        count +=1;
    }}
else if (buttonString.equals("6")){
        if( randomNum1 == 6 || randomNum2 ==6 ) {
        System.out.println("-----------------------------");
        System.out.println("    Num6 Found Bomb  ");
        System.out.println("     Game Over        ");
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        count = 1;


} else {
        System.out.println("---------------------------------");
        System.out.println("  Num6 It safe,Goodluck ");
        System.out.println(" Your point is  " + count);
        System.out.println("---------------------------------");
        count +=1;
        }}
else if (buttonString.equals("7")){
        if( randomNum1 == 7 || randomNum2 == 7 ) {
        System.out.println("-----------------------------");
        System.out.println("    Num7 Found Bomb  ");
        System.out.println("     Game Over        ");
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        count = 1;


} else {
        System.out.println("---------------------------------");
        System.out.println("  Num7 It safe,Goodluck ");
        System.out.println(" Your point is  " + count);
        System.out.println("---------------------------------");
        count += 1;
    }}
else if (buttonString.equals("8")){
        if( randomNum1 == 8 || randomNum2 == 8  ) {
        System.out.println("-----------------------------");
        System.out.println("    Num8 Found Bomb  ");
        System.out.println("     Game Over        ");
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        count = 1;


} else {
        System.out.println("---------------------------------");
        System.out.println("  Num8 It safe,Goodluck ");
        System.out.println(" Your point is  " + count);
        System.out.println("---------------------------------");
        count +=1;
    }}
else if (buttonString.equals("9")){
        if( randomNum1 == 9 || randomNum2 == 9 ) {
        System.out.println("-----------------------------");
        System.out.println("    Num9 Found Bomb  ");
        System.out.println("     Game Over        ");
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        count = 1;
} else {
        System.out.println("---------------------------------");
        System.out.println("  Num9 It safe,Goodluck ");
        System.out.println(" Your point is  " + count);
        System.out.println("---------------------------------");
        count += 1;
    }}
}
else {
    System.out.println("Congratulations You Win Epic Hard Mine game");
    count = 1;
}
    }}
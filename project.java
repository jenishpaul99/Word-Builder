
import java.awt.EventQueue;
import javax.swing.JLayeredPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.jar.JarOutputStream;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.io.*;

public class project {

	private JFrame frame;
	JLabel gamelbl2 = new JLabel(""); JLabel gamelbl3 = new JLabel(""); JLabel gamelbl4 = new JLabel("");JLabel gamelbl5 = new JLabel("");JLabel gamelbl6 = new JLabel("");JLabel gamelbl7 = new JLabel("");
	JLabel gamelbl8 = new JLabel("");JLabel gamelbl1 = new JLabel("");JLabel gamelbl9 = new JLabel("");JLabel gamelbl17 = new JLabel("");JLabel gamelbl25 = new JLabel("");JLabel gamelbl33 = new JLabel("");
	JLabel gamelbl41 = new JLabel("");JLabel gamelbl49 = new JLabel("");JLabel gamelbl57 = new JLabel("");JLabel gamelbl58 = new JLabel("");JLabel gamelbl59 = new JLabel("");JLabel gamelbl60 = new JLabel("");
	JLabel gamelbl61 = new JLabel("");JLabel gamelbl62 = new JLabel("");JLabel gamelbl63 = new JLabel("");JLabel gamelbl64 = new JLabel("");JLabel gamelbl56 = new JLabel("");JLabel gamelbl48 = new JLabel("");
	JLabel gamelbl40 = new JLabel("");JLabel gamelbl32 = new JLabel("");JLabel gamelbl24 = new JLabel("");JLabel gamelbl16 = new JLabel("");JLabel gamelbl10 = new JLabel("");JLabel gamelbl11 = new JLabel("");
	JLabel gamelbl12 = new JLabel("");JLabel gamelbl13 = new JLabel("");JLabel gamelbl14 = new JLabel("");JLabel gamelbl19 = new JLabel("");JLabel gamelbl20 = new JLabel("");JLabel gamelbl26 = new JLabel("");
	JLabel gamelbl15 = new JLabel("");JLabel gamelbl18 = new JLabel("");JLabel gamelbl21 = new JLabel("");JLabel gamelbl22 = new JLabel("");JLabel gamelbl23 = new JLabel("");JLabel gamelbl27 = new JLabel("");
	JLabel gamelbl28 = new JLabel("");JLabel gamelbl29 = new JLabel("");JLabel gamelbl30 = new JLabel("");JLabel gamelbl31 = new JLabel("");JLabel gamelbl39 = new JLabel("");JLabel gamelbl47 = new JLabel("");
	JLabel gamelbl55 = new JLabel("");JLabel gamelbl38 = new JLabel("");JLabel gamelbl46 = new JLabel("");JLabel gamelbl54 = new JLabel("");JLabel gamelbl37 = new JLabel("");JLabel gamelbl45 = new JLabel("");
	JLabel gamelbl53 = new JLabel("");JLabel gamelbl52 = new JLabel("");JLabel gamelbl44 = new JLabel("");JLabel gamelbl36 = new JLabel("");JLabel gamelbl35 = new JLabel("");JLabel gamelbl34 = new JLabel("");
	JLabel gamelbl42 = new JLabel("");JLabel gamelbl43 = new JLabel("");JLabel gamelbl51 = new JLabel("");JLabel gamelbl50 = new JLabel("");JButton lvl1 = new JButton("Level 1");JButton lvl2 = new JButton("Level 2");int count=1;
	JMenuItem mntmNewGame = new JMenuItem("New Game"); char a[]={'0','0','0','0','0'};int pos1;int pos3;int pos4; int lvlno; int l1[]={0,0,0,0,0,0,0,0}; int pos2;JLabel lblPoints1 = new JLabel("Points:");
    int pts=0;int l2[]={0,0,0,0,0,0,0,0,0,0,0,0};int l3[]={0,0,0,0,0,0,0,0};int pos5;int l4[]={0,0,0,0,0,0};int l5[]= {0,0,0,0,0,0,0,0,0,0,0};
    JButton lvl5 = new JButton("Level 5");
JMenuItem mntmExit = new JMenuItem("Exit");JLabel lvlnolbl = new JLabel("");
 JButton lvl3 = new JButton("Level 3");

 JButton lvl4 = new JButton("Level 4");
 JButton ltrbtn1 = new JButton("");          
 JButton ltrbtn5 = new JButton("");
 JButton ltrbtn3 = new JButton("");
JButton ltrbtn4 = new JButton("");
 JButton ltrbtn2 = new JButton("");
 JLabel label1 = new JLabel("");
 JLabel label2 = new JLabel("");
  JLabel label3 = new JLabel("");
 JLabel label4 = new JLabel("");
 JLabel label5 = new JLabel("");
JButton btnCheck = new JButton("Check");
  JButton btnReset = new JButton("Clear");
  private final JLabel ptslbl = new JLabel("");
  ImageIcon icon = new ImageIcon("label.jpg");
 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project window = new project();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	void check1()
	{
		if(a[0]=='S'&&a[1]=='A'&&a[2]=='W'&&a[3]=='0'&&a[4]=='0')
		{     
			gamelbl19.setText("S");gamelbl27.setText("A");gamelbl35.setText("W");btnReset.doClick();
			if(l1[0]==1)
				{
				JOptionPane.showMessageDialog(null, "Word already found");
				}
			else
				{pts=pts+10;l1[0]=1;btnReset.doClick();}}
		else if(a[0]=='R'&&a[1]=='A'&&a[2]=='W'&&a[3]=='0'&&a[4]=='0')
		{
			gamelbl37.setText("R");gamelbl45.setText("A");gamelbl53.setText("W");btnReset.doClick();
			if(l1[1]==1)
			{
			JOptionPane.showMessageDialog(null, "Word already found");
			}
		else
			{pts=pts+10;l1[1]=1;btnReset.doClick();}
		}
		
		else if(a[0]=='W'&&a[1]=='A'&&a[2]=='R'&&a[3]=='S'&&a[4]=='0')
		{   
			gamelbl35.setText("W");gamelbl36.setText("A");gamelbl37.setText("R");gamelbl38.setText("S");btnReset.doClick();
			if(l1[2]==1)
			{
			JOptionPane.showMessageDialog(null, "Word already found");
			}
		else
			{pts=pts+10;l1[2]=1;btnReset.doClick();}
		}
		
		else if(a[0]=='W'&&a[1]=='A'&&a[2]=='R'&&a[3]=='0'&&a[4]=='0')
		{   
			gamelbl53.setText("W");gamelbl54.setText("A");gamelbl55.setText("R");btnReset.doClick();
			if(l1[3]==1)
			{
			JOptionPane.showMessageDialog(null, "Word already found");
			}
		else
			{pts=pts+10;l1[3]=1;btnReset.doClick();}
			
		}
		else if(a[0]=='W'&&a[1]=='A'&&a[2]=='S'&&a[3]=='0'&&a[4]=='0')
		{
			gamelbl22.setText("W");gamelbl30.setText("A");gamelbl38.setText("S");btnReset.doClick();
			if(l1[4]==1)
			{
			JOptionPane.showMessageDialog(null, "Word already found");
			}
		else
			{pts=pts+10;l1[4]=1;btnReset.doClick();}
		}
		else if(a[0]=='R'&&a[1]=='A'&&a[2]=='W'&&a[3]=='S'&&a[4]=='0')
		{
			
			if(l1[5]==1)
			{
			JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
		else
			{JOptionPane.showMessageDialog(null, "You found a extra word");pts=pts+15;l1[5]=1;btnReset.doClick();}
		}
		else if(a[0]=='A'&&a[1]=='R'&&a[2]=='S'&&a[3]=='0'&&a[4]=='0')
		{
			
			if(l1[6]==1)
			{
			JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
		else
			{JOptionPane.showMessageDialog(null, "You found a extra word");pts=pts+15;l1[6]=1;btnReset.doClick();}
		}
		else if(a[0]=='R'&&a[1]=='A'&&a[2]=='S'&&a[3]=='0'&&a[4]=='0')
		{
			
			if(l1[7]==1)
			{
			JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
		else
			{JOptionPane.showMessageDialog(null, "You found a extra word");pts=pts+15;l1[7]=1;btnReset.doClick();}
		}
		
		else 
		{JOptionPane.showMessageDialog(null, "Invalid word");pts=pts-5;btnReset.doClick();}
		if(l1[0]!=0&&l1[1]!=0&&l1[2]!=0&&l1[3]!=0&&l1[4]!=0)
		{
			JOptionPane.showMessageDialog(null,"You have completed level 1!!!!"); lvlno=2; lvl1.setBackground(Color.GREEN);lvl2.setEnabled(true);lvl2.doClick();
		}
		
	
		
	}
	void check2()
	{
		if(a[0]=='M'&&a[1]=='E'&&a[2]=='S'&&a[3]=='S'&&a[4]=='0')
		{ gamelbl35.setText("M");gamelbl36.setText("E");gamelbl37.setText("S");gamelbl38.setText("S");btnReset.doClick();
		if(l2[0]==1)
		{
			JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
		else
		{pts=pts+10;l2[0]=1;btnReset.doClick();}
		
		}
		else if(a[0]=='S'&&a[1]=='E'&&a[2]=='E'&&a[3]=='S'&&a[4]=='0')
		{ gamelbl14.setText("M");gamelbl22.setText("E");gamelbl30.setText("S");gamelbl38.setText("S");btnReset.doClick();
		if(l2[1]==1)
		{
			JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
		else
		{pts=pts+10;l2[1]=1;btnReset.doClick();
		}}
		else if(a[0]=='S'&&a[1]=='E'&&a[2]=='E'&&a[3]=='M'&&a[4]=='S')
		{ gamelbl11.setText("S");gamelbl19.setText("E");gamelbl27.setText("E");gamelbl35.setText("M");gamelbl43.setText("S");btnReset.doClick();
		if(l2[2]==1)
		{
			JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
		else
		{pts=pts+10;l2[2]=1;btnReset.doClick();
		}}
		else if(a[0]=='S'&&a[1]=='E'&&a[2]=='E'&&a[3]=='M'&&a[4]=='0')
		{ gamelbl37.setText("S");gamelbl45.setText("E");gamelbl53.setText("E");gamelbl61.setText("M");btnReset.doClick();
		if(l2[3]==1)
		{
			JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
		else
		{pts=pts+10;l2[3]=1;btnReset.doClick();
		}}
		else if(a[0]=='S'&&a[1]=='E'&&a[2]=='E'&&a[3]=='0'&&a[4]=='0')
		{ gamelbl52.setText("S");gamelbl53.setText("E");gamelbl54.setText("E");btnReset.doClick();
		if(l2[4]==1)
		{
			JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
		else
		{pts=pts+10;l2[4]=1;btnReset.doClick();
		}
        }
		else if(a[0]=='S'&&a[1]=='E'&&a[2]=='M'&&a[3]=='E'&&a[4]=='S')
		{
			
			if(l2[5]==1)
			{
			JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
		else
			{JOptionPane.showMessageDialog(null, "You found a extra word");pts=pts+15;l2[5]=1;btnReset.doClick();}
		}
		else if(a[0]=='E'&&a[1]=='M'&&a[2]=='E'&&a[3]=='S'&&a[4]=='0')
		{
			
			if(l2[6]==1)
			{
			JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
		else
			{JOptionPane.showMessageDialog(null, "You found a extra word");pts=pts+15;l2[6]=1;btnReset.doClick();}
		}
		else if(a[0]=='E'&&a[1]=='S'&&a[2]=='E'&&a[3]=='S'&&a[4]=='0')
		{
			
			if(l2[7]==1)
			{
			JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
		else
			{JOptionPane.showMessageDialog(null, "You found a extra word");pts=pts+15;l2[7]=1;btnReset.doClick();}
		}
		else if(a[0]=='S'&&a[1]=='E'&&a[2]=='M'&&a[3]=='E'&&a[4]=='0')
		{
			
			if(l2[8]==1)
			{
			JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
		else
			{JOptionPane.showMessageDialog(null, "You found a extra word");pts=pts+15;l2[8]=1;btnReset.doClick();}
		}
		else if(a[0]=='E'&&a[1]=='M'&&a[2]=='E'&&a[3]=='0'&&a[4]=='0')
		{
			
			if(l2[9]==1)
			{
			JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
		else
			{JOptionPane.showMessageDialog(null, "You found a extra word");pts=pts+15;l2[9]=1;btnReset.doClick();}
		}
		else if(a[0]=='E'&&a[1]=='M'&&a[2]=='S'&&a[3]=='0'&&a[4]=='0')
		{
			
			if(l2[10]==1)
			{
			JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
		else
			{JOptionPane.showMessageDialog(null, "You found a extra word");pts=pts+15;l2[10]=1;btnReset.doClick();}
		}
		else if(a[0]=='E'&&a[1]=='S'&&a[2]=='S'&&a[3]=='0'&&a[4]=='0')
		{
			
			if(l2[11]==1)
			{
			JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
		else
			{JOptionPane.showMessageDialog(null, "You found a extra word");pts=pts+15;l2[11]=1;btnReset.doClick();}
		}
		else 
		{JOptionPane.showMessageDialog(null, "Invalid word");pts=pts-5;btnReset.doClick();}
		if(l2[0]!=0&&l2[1]!=0&&l2[2]!=0&&l2[3]!=0&&l2[4]!=0)
		{
			JOptionPane.showMessageDialog(null,"You have completed level 2!!!!"); lvlno=3; lvl2.setBackground(Color.GREEN);lvl3.setEnabled(true);lvl3.doClick();
		}
	}
	void check3()
	{
		if(a[0]=='C'&&a[1]=='A'&&a[2]=='T'&&a[3]=='0'&&a[4]=='0')
		{
			if(l3[0]==1)
			{
				JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
			else
			{gamelbl11.setText("C");gamelbl12.setText("A");gamelbl13.setText("T");btnReset.doClick();
				pts=pts+10;l3[0]=1;btnReset.doClick();}
		}
		else if(a[0]=='C'&&a[1]=='A'&&a[2]=='P'&&a[3]=='0'&&a[4]=='0')
		{
			if(l3[1]==1)
			{
				JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
			else
			{gamelbl11.setText("C");gamelbl19.setText("A");gamelbl27.setText("P");btnReset.doClick();
				pts=pts+10;l3[1]=1;btnReset.doClick();}
		}
		else if(a[0]=='P'&&a[1]=='A'&&a[2]=='C'&&a[3]=='T'&&a[4]=='0')
		{
			if(l3[2]==1)
			{
				JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
			else
			{gamelbl27.setText("P");gamelbl28.setText("A");gamelbl29.setText("C");gamelbl30.setText("T");btnReset.doClick();
				pts=pts+10;l3[2]=1;btnReset.doClick();}
		}
		else if(a[0]=='P'&&a[1]=='A'&&a[2]=='T'&&a[3]=='0'&&a[4]=='0')
		{
			if(l3[3]==1)
			{
				JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
			else
			{gamelbl34.setText("P");gamelbl42.setText("A");gamelbl50.setText("T");btnReset.doClick();
				pts=pts+10;l3[3]=1;btnReset.doClick();}
		}
		else if(a[0]=='A'&&a[1]=='P'&&a[2]=='T'&&a[3]=='0'&&a[4]=='0')
		{
			if(l3[4]==1)
			{
				JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
			else
			{gamelbl42.setText("A");gamelbl43.setText("P");gamelbl44.setText("T");btnReset.doClick();
				pts=pts+10;l3[4]=1;btnReset.doClick();}
		}
		else if(a[0]=='A'&&a[1]=='C'&&a[2]=='T'&&a[3]=='0'&&a[4]=='0')
		{
			if(l3[5]==1)
			{
				JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
			else
			{gamelbl28.setText("A");gamelbl36.setText("C");gamelbl44.setText("T");btnReset.doClick();
				pts=pts+10;l3[5]=1;btnReset.doClick();}
		}
		else if(a[0]=='T'&&a[1]=='A'&&a[2]=='P'&&a[3]=='0'&&a[4]=='0')
		{
			if(l3[6]==1)
			{
				JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
			else
			{gamelbl30.setText("T");gamelbl38.setText("A");gamelbl46.setText("P");btnReset.doClick();
				pts=pts+10;l3[6]=1;btnReset.doClick();}
		}
		else if(a[0]=='P'&&a[1]=='A'&&a[2]=='C'&&a[3]=='0'&&a[4]=='0')
		{
			if(l3[7]==1)
			{
				JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
			else
			{;btnReset.doClick();
				JOptionPane.showMessageDialog(null, "You found a extra word");pts=pts+15;l3[7]=1;btnReset.doClick();}
		}
		else 
		{JOptionPane.showMessageDialog(null, "Invalid word");pts=pts-5;btnReset.doClick();}
		if(l3[0]!=0&&l3[1]!=0&&l3[2]!=0&&l3[3]!=0&&l3[4]!=0&&l3[5]!=0&&l3[6]!=0)
		{
			JOptionPane.showMessageDialog(null,"You have completed level 3!!!!"); lvlno=4; lvl3.setBackground(Color.GREEN);lvl4.setEnabled(true);lvl4.doClick();
		}
		
		
		}	
		
	void check4()
	{
		if(a[0]=='W'&&a[1]=='O'&&a[2]=='R'&&a[3]=='N'&&a[4]=='0')
		{
			if(l4[0]==1)
			{
				JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
			else
			{gamelbl12.setText("W");gamelbl20.setText("O");gamelbl28.setText("R");gamelbl36.setText("N");btnReset.doClick();
				pts=pts+10;l4[0]=1;btnReset.doClick();}
		}
		else if(a[0]=='N'&&a[1]=='O'&&a[2]=='W'&&a[3]=='0'&&a[4]=='0')
		{
			if(l4[1]==1)
			{
				JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
			else
			{gamelbl10.setText("N");gamelbl11.setText("O");gamelbl12.setText("W");btnReset.doClick();
				pts=pts+10;l4[1]=1;btnReset.doClick();}
		}
		else if(a[0]=='N'&&a[1]=='O'&&a[2]=='W'&&a[3]=='0'&&a[4]=='0')
		{
			if(l4[1]==1)
			{
				JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
			else
			{gamelbl10.setText("N");gamelbl11.setText("O");gamelbl12.setText("W");btnReset.doClick();
				pts=pts+10;l4[1]=1;btnReset.doClick();}
		}
		else if(a[0]=='W'&&a[1]=='O'&&a[2]=='N'&&a[3]=='0'&&a[4]=='0')
		{
			if(l4[2]==1)
			{
				JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
			else
			{gamelbl6.setText("W");gamelbl14.setText("O");gamelbl22.setText("N");btnReset.doClick();
				pts=pts+10;l4[2]=1;btnReset.doClick();}
			
		}
		else if(a[0]=='O'&&a[1]=='W'&&a[2]=='N'&&a[3]=='0'&&a[4]=='0')
		{
			if(l4[3]==1)
			{
				JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
			else
			{gamelbl20.setText("O");gamelbl21.setText("W");gamelbl22.setText("N");btnReset.doClick();
				pts=pts+10;l4[3]=1;btnReset.doClick();}
			
		}
		else if(a[0]=='N'&&a[1]=='O'&&a[2]=='R'&&a[3]=='0'&&a[4]=='0')
		{
			if(l4[4]==1)
			{
				JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
			else
			{gamelbl36.setText("N");gamelbl37.setText("O");gamelbl38.setText("R");btnReset.doClick();
				pts=pts+10;l4[4]=1;btnReset.doClick();}
			
		}
		else if(a[0]=='R'&&a[1]=='O'&&a[2]=='W'&&a[3]=='0'&&a[4]=='0')
		{
			if(l4[5]==1)
			{
				JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
			else
			{gamelbl46.setText("O");gamelbl54.setText("W");gamelbl38.setText("R");btnReset.doClick();
				pts=pts+10;l4[5]=1;btnReset.doClick();}
			
		}
		else 
		{JOptionPane.showMessageDialog(null, "Invalid word");pts=pts-5;btnReset.doClick();}
		if(l4[0]!=0&&l4[1]!=0&&l4[2]!=0&&l4[3]!=0&&l4[4]!=0&&l4[5]!=0)
		{
			JOptionPane.showMessageDialog(null,"You have completed level 4!!!!"); lvlno=5; lvl4.setBackground(Color.GREEN);lvl5.setEnabled(true);lvl5.doClick();
		}
	}	
	void check5()
	{
		if(a[0]=='L'&& a[1]=='A'&& a[2]=='B'&& a[3]=='0'&&a[4]=='0')
		{
			
				if(l5[0]==1)
				{
					JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
				}
				else
				{gamelbl4.setText("L");gamelbl5.setText("A");gamelbl6.setText("B");btnReset.doClick();
					pts=pts+10;l5[0]=1;btnReset.doClick();}
		}
		if(a[0]=='L'&&a[1]=='A'&&a[2]=='C'&&a[3]=='K'&&a[4]=='0')
		{
			if(l5[1]==1)
			{
				JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
			else
			{gamelbl4.setText("L");gamelbl12.setText("A");gamelbl20.setText("C");gamelbl28.setText("K");btnReset.doClick();
				pts=pts+10;l5[1]=1;btnReset.doClick();}
		}
		if(a[0]=='B'&&a[1]=='A'&&a[2]=='C'&&a[3]=='K'&&a[4]=='0')
		{
			if(l5[2]==1)
			{
				JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
			else
			{gamelbl18.setText("B");gamelbl19.setText("A");gamelbl20.setText("C");gamelbl21.setText("K");btnReset.doClick();
				pts=pts+10;l5[2]=1;btnReset.doClick();}
		}
		if(a[0]=='B'&&a[1]=='L'&&a[2]=='A'&&a[3]=='C'&&a[4]=='K')
		{
			if(l5[3]==1)
			{
				JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
			else
			{gamelbl18.setText("B");gamelbl26.setText("L");gamelbl34.setText("A");gamelbl42.setText("C");gamelbl50.setText("K");btnReset.doClick();
				pts=pts+10;l5[3]=1;btnReset.doClick();}
		}
		if(a[0]=='C'&&a[1]=='A'&&a[2]=='B'&&a[3]=='0'&&a[4]=='0')
		{
			if(l5[4]==1)
			{
				JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
			else
			{gamelbl42.setText("C");gamelbl43.setText("A");gamelbl44.setText("B");btnReset.doClick();
				pts=pts+10;l5[4]=1;btnReset.doClick();}
		}
		if(a[0]=='B'&&a[1]=='A'&&a[2]=='L'&&a[3]=='K'&&a[4]=='0')
		{
			if(l5[5]==1)
			{
				JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
			else
			{    JOptionPane.showMessageDialog(null, "You found a extra word");   btnReset.doClick();
				pts=pts+15;l5[5]=1;btnReset.doClick();}
		}
		if(a[0]=='C'&&a[1]=='A'&&a[2]=='L'&&a[3]=='K'&&a[4]=='0')
		{
			if(l5[6]==1)
			{
				JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
			}
			else
			{    JOptionPane.showMessageDialog(null, "You found a extra word");   btnReset.doClick();
				pts=pts+15;l5[6]=1;btnReset.doClick();}
		}
		if(a[0]=='A'&& a[1]=='L'&& a[2]=='B'&& a[3]=='0'&&a[4]=='0')
		{
			
				if(l5[7]==1)
				{
					JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
				}
				else
				{JOptionPane.showMessageDialog(null, "You found a extra word");btnReset.doClick();
					pts=pts+15;l5[7]=1;btnReset.doClick();}
		}
		if(a[0]=='B'&& a[1]=='A'&& a[2]=='L'&& a[3]=='0'&&a[4]=='0')
		{
			
				if(l5[8]==1)
				{
					JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
				}
				else
				{JOptionPane.showMessageDialog(null, "You found a extra word");btnReset.doClick();
					pts=pts+15;l5[8]=1;btnReset.doClick();}
		}
		if(a[0]=='K'&& a[1]=='A'&& a[2]=='B'&& a[3]=='0'&&a[4]=='0')
		{
			
				if(l5[9]==1)
				{
					JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
				}
				else
				{JOptionPane.showMessageDialog(null, "You found a extra word");btnReset.doClick();
					pts=pts+15;l5[9]=1;btnReset.doClick();}
		}
		if(a[0]=='L'&& a[1]=='A'&& a[2]=='C'&& a[3]=='0'&&a[4]=='0')
		{
			
				if(l5[10]==1)
				{
					JOptionPane.showMessageDialog(null, "Word already found");btnReset.doClick();
				}
				else
				{JOptionPane.showMessageDialog(null, "You found a extra word");btnReset.doClick();
					pts=pts+15;l5[10]=1;btnReset.doClick();}
		}
		if(l5[0]!=0&&l5[1]!=0&&l5[2]!=0&&l5[3]!=0&&l5[4]!=0)
		{
			JOptionPane.showMessageDialog(null,"You have successfully completed the game.\nThank you for playing.!!!!"); lvlno=5; lvl5.setBackground(Color.GREEN);
	    frame.dispose();
		}
		
		
	}
	
	
	void reset()
	{btnReset.doClick();lvlnolbl.setText(" ");
		 Border border = BorderFactory.createEmptyBorder();
		ltrbtn1.setText(" ");ltrbtn2.setText(" ");ltrbtn3.setText(" ");ltrbtn4.setText(" ");ltrbtn5.setText(" ");
	gamelbl1.setText(" ");gamelbl2.setText(" ");gamelbl3.setText(" ");gamelbl4.setText(" ");gamelbl5.setText(" ");gamelbl6.setText(" ");gamelbl7.setText(" ");gamelbl8.setText(" ");gamelbl9.setText(" ");
	gamelbl10.setText(" ");gamelbl11.setText(" ");gamelbl12.setText(" ");gamelbl13.setText(" ");gamelbl14.setText(" ");gamelbl15.setText(" ");gamelbl16.setText(" ");gamelbl17.setText(" ");gamelbl18.setText(" ");
	gamelbl19.setText(" ");gamelbl20.setText(" ");gamelbl21.setText(" ");gamelbl22.setText(" ");gamelbl23.setText(" ");gamelbl24.setText(" ");gamelbl25.setText(" ");gamelbl26.setText(" ");gamelbl27.setText(" ");
	gamelbl28.setText(" ");gamelbl29.setText(" ");gamelbl30.setText(" ");gamelbl31.setText(" ");gamelbl32.setText(" ");gamelbl33.setText(" ");gamelbl34.setText(" ");gamelbl35.setText(" ");gamelbl36.setText(" ");
	gamelbl37.setText(" ");gamelbl38.setText(" ");gamelbl39.setText(" ");gamelbl40.setText(" ");gamelbl41.setText(" ");gamelbl42.setText(" ");gamelbl43.setText(" ");gamelbl44.setText(" ");gamelbl45.setText(" ");
	gamelbl46.setText(" ");gamelbl47.setText(" ");gamelbl48.setText(" ");gamelbl49.setText(" ");gamelbl50.setText(" ");gamelbl51.setText(" ");gamelbl52.setText(" ");gamelbl53.setText(" ");gamelbl54.setText(" ");
	gamelbl55.setText(" ");gamelbl56.setText(" ");gamelbl57.setText(" ");gamelbl58.setText(" ");gamelbl59.setText(" ");gamelbl60.setText(" ");gamelbl61.setText(" ");gamelbl62.setText(" ");
	gamelbl63.setText(" ");gamelbl64.setText(" ");
	
	gamelbl2.setBackground(new Color(135, 206, 235));
	gamelbl2.setBorder(border);
	gamelbl2.setOpaque(false);
	gamelbl2.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl2.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl2.setBounds(90, 75, 45, 45);
	frame.getContentPane().add(gamelbl2);


	gamelbl3.setOpaque(false);gamelbl3.setBorder(border);
	gamelbl3.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl3.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl3.setBackground(new Color(135, 206, 235));
	gamelbl3.setBounds(135, 75, 45, 45);
	frame.getContentPane().add(gamelbl3);


	gamelbl4.setOpaque(false);gamelbl4.setBorder(border);
	gamelbl4.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl4.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl4.setBackground(new Color(135, 206, 235));
	gamelbl4.setBounds(180, 75, 45, 45);
	frame.getContentPane().add(gamelbl4);


	gamelbl5.setOpaque(false);gamelbl5.setBorder(border);
	gamelbl5.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl5.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl5.setBackground(new Color(135, 206, 235));
	gamelbl5.setBounds(225, 75, 45, 45);
	frame.getContentPane().add(gamelbl5);


	gamelbl6.setOpaque(false);gamelbl6.setBorder(border);
	gamelbl6.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl6.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl6.setBackground(new Color(135, 206, 235));
	gamelbl6.setBounds(270, 75, 45, 45);
	frame.getContentPane().add(gamelbl6);


	gamelbl7.setOpaque(false);gamelbl7.setBorder(border);
	gamelbl7.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl7.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl7.setBackground(new Color(135, 206, 235));
	gamelbl7.setBounds(315, 75, 45, 45);
	frame.getContentPane().add(gamelbl7);


	gamelbl8.setOpaque(false);gamelbl8.setBorder(border);
	gamelbl8.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl8.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl8.setBackground(new Color(135, 206, 235));
	gamelbl8.setBounds(360, 75, 45, 45);
	frame.getContentPane().add(gamelbl8);


	gamelbl1.setOpaque(false);gamelbl1.setBorder(border);
	gamelbl1.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl1.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl1.setBackground(new Color(135, 206, 235));
	gamelbl1.setBounds(45, 75, 45, 45);
	frame.getContentPane().add(gamelbl1);


	gamelbl9.setOpaque(false);gamelbl9.setBorder(border);
	gamelbl9.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl9.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl9.setBackground(new Color(135, 206, 235));
	gamelbl9.setBounds(45, 120, 45, 45);
	frame.getContentPane().add(gamelbl9);


	gamelbl17.setOpaque(false);gamelbl17.setBorder(border);
	gamelbl17.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl17.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl17.setBackground(new Color(135, 206, 235));
	gamelbl17.setBounds(45, 165, 45, 45);
	frame.getContentPane().add(gamelbl17);


	gamelbl25.setOpaque(false);gamelbl25.setBorder(border);
	gamelbl25.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl25.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl25.setBackground(new Color(135, 206, 235));
	gamelbl25.setBounds(45, 210, 45, 45);
	frame.getContentPane().add(gamelbl25);


	gamelbl33.setOpaque(false);gamelbl33.setBorder(border);
	gamelbl33.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl33.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl33.setBackground(new Color(135, 206, 235));
	gamelbl33.setBounds(45, 255, 45, 45);
	frame.getContentPane().add(gamelbl33);


	gamelbl41.setOpaque(false);gamelbl41.setBorder(border);
	gamelbl41.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl41.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl41.setBackground(new Color(135, 206, 235));
	gamelbl41.setBounds(45, 300, 45, 45);
	frame.getContentPane().add(gamelbl41);


	gamelbl49.setOpaque(false);gamelbl49.setBorder(border);
	gamelbl49.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl49.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl49.setBackground(new Color(135, 206, 235));
	gamelbl49.setBounds(45, 345, 45, 45);
	frame.getContentPane().add(gamelbl49);


	gamelbl57.setOpaque(false);gamelbl57.setBorder(border);
	gamelbl57.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl57.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl57.setBackground(new Color(135, 206, 235));
	gamelbl57.setBounds(45, 390, 45, 45);
	frame.getContentPane().add(gamelbl57);


	gamelbl58.setOpaque(false);gamelbl58.setBorder(border);
	gamelbl58.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl58.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl58.setBackground(new Color(135, 206, 235));
	gamelbl58.setBounds(90, 390, 45, 45);
	frame.getContentPane().add(gamelbl58);


	gamelbl59.setOpaque(false);gamelbl59.setBorder(border);
	gamelbl59.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl59.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl59.setBackground(new Color(135, 206, 235));
	gamelbl59.setBounds(135, 390, 45, 45);
	frame.getContentPane().add(gamelbl59);


	gamelbl60.setOpaque(false);gamelbl60.setBorder(border);
	gamelbl60.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl60.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl60.setBackground(new Color(135, 206, 235));
	gamelbl60.setBounds(180, 390, 45, 45);
	frame.getContentPane().add(gamelbl60);


	gamelbl61.setOpaque(false);gamelbl61.setBorder(border);
	gamelbl61.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl61.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl61.setBackground(new Color(135, 206, 235));
	gamelbl61.setBounds(225, 390, 45, 45);
	frame.getContentPane().add(gamelbl61);


	gamelbl62.setOpaque(false);gamelbl62.setBorder(border);
	gamelbl62.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl62.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl62.setBackground(new Color(135, 206, 235));
	gamelbl62.setBounds(270, 390, 45, 45);
	frame.getContentPane().add(gamelbl62);


	gamelbl63.setOpaque(false);gamelbl63.setBorder(border);
	gamelbl63.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl63.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl63.setBackground(new Color(135, 206, 235));
	gamelbl63.setBounds(315, 390, 45, 45);
	frame.getContentPane().add(gamelbl63);


	gamelbl64.setOpaque(false);gamelbl64.setBorder(border);
	gamelbl64.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl64.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl64.setBackground(new Color(135, 206, 235));
	gamelbl64.setBounds(360, 390, 45, 45);
	frame.getContentPane().add(gamelbl64);


	gamelbl56.setOpaque(false);gamelbl56.setBorder(border);
	gamelbl56.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl56.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl56.setBackground(new Color(135, 206, 235));
	gamelbl56.setBounds(360, 345, 45, 45);
	frame.getContentPane().add(gamelbl56);


	gamelbl48.setOpaque(false);gamelbl48.setBorder(border);
	gamelbl48.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl48.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl48.setBackground(new Color(135, 206, 235));
	gamelbl48.setBounds(360, 300, 45, 45);
	frame.getContentPane().add(gamelbl48);


	gamelbl40.setOpaque(false);gamelbl40.setBorder(border);
	gamelbl40.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl40.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl40.setBackground(new Color(135, 206, 235));
	gamelbl40.setBounds(360, 255, 45, 45);
	frame.getContentPane().add(gamelbl40);


	gamelbl32.setOpaque(false);gamelbl32.setBorder(border);
	gamelbl32.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl32.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl32.setBackground(new Color(135, 206, 235));
	gamelbl32.setBounds(360, 210, 45, 45);
	frame.getContentPane().add(gamelbl32);


	gamelbl24.setOpaque(false);gamelbl24.setBorder(border);
	gamelbl24.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl24.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl24.setBackground(new Color(135, 206, 235));
	gamelbl24.setBounds(360, 165, 45, 45);
	frame.getContentPane().add(gamelbl24);


	gamelbl16.setOpaque(false);gamelbl16.setBorder(border);
	gamelbl16.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl16.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl16.setBackground(new Color(135, 206, 235));
	gamelbl16.setBounds(360, 120, 45, 45);
	frame.getContentPane().add(gamelbl16);


	gamelbl10.setOpaque(false);gamelbl10.setBorder(border);
	gamelbl10.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl10.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl10.setBackground(new Color(135, 206, 235));
	gamelbl10.setBounds(90, 120, 45, 45);
	frame.getContentPane().add(gamelbl10);


	gamelbl11.setOpaque(false);gamelbl11.setBorder(border);
	gamelbl11.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl11.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl11.setBackground(new Color(135, 206, 235));
	gamelbl11.setBounds(135, 120, 45, 45);
	frame.getContentPane().add(gamelbl11);


	gamelbl12.setOpaque(false);gamelbl12.setBorder(border);
	gamelbl12.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl12.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl12.setBackground(new Color(135, 206, 235));
	gamelbl12.setBounds(180, 120, 45, 45);
	frame.getContentPane().add(gamelbl12);


	gamelbl13.setOpaque(false);gamelbl13.setBorder(border);
	gamelbl13.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl13.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl13.setBackground(new Color(135, 206, 235));
	gamelbl13.setBounds(225, 120, 45, 45);
	frame.getContentPane().add(gamelbl13);


	gamelbl14.setOpaque(false);gamelbl14.setBorder(border);
	gamelbl14.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl14.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl14.setBackground(new Color(135, 206, 235));
	gamelbl14.setBounds(270, 120, 45, 45);
	frame.getContentPane().add(gamelbl14);


	gamelbl15.setOpaque(false);gamelbl15.setBorder(border);
	gamelbl15.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl15.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl15.setBackground(new Color(135, 206, 235));
	gamelbl15.setBounds(315, 120, 45, 45);
	frame.getContentPane().add(gamelbl15);


	gamelbl18.setOpaque(false);gamelbl18.setBorder(border);
	gamelbl18.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl18.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl18.setBackground(new Color(135, 206, 235));
	gamelbl18.setBounds(90, 165, 45, 45);
	frame.getContentPane().add(gamelbl18);


	gamelbl19.setOpaque(false);gamelbl19.setBorder(border);
	gamelbl19.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl19.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl19.setBackground(new Color(135, 206, 235));
	gamelbl19.setBounds(135, 165, 45, 45);
	frame.getContentPane().add(gamelbl19);


	gamelbl20.setOpaque(false);gamelbl20.setBorder(border);
	gamelbl20.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl20.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl20.setBackground(new Color(135, 206, 235));
	gamelbl20.setBounds(180, 165, 45, 45);
	frame.getContentPane().add(gamelbl20);


	gamelbl21.setOpaque(false);gamelbl21.setBorder(border);
	gamelbl21.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl21.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl21.setBackground(new Color(135, 206, 235));
	gamelbl21.setBounds(225, 165, 45, 45);
	frame.getContentPane().add(gamelbl21);


	gamelbl22.setOpaque(false);gamelbl22.setBorder(border);
	gamelbl22.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl22.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl22.setBackground(new Color(135, 206, 235));
	gamelbl22.setBounds(270, 165, 45, 45);
	frame.getContentPane().add(gamelbl22);


	gamelbl23.setOpaque(false);gamelbl23.setBorder(border);
	gamelbl23.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl23.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl23.setBackground(new Color(135, 206, 235));
	gamelbl23.setBounds(315, 165, 45, 45);
	frame.getContentPane().add(gamelbl23);


	gamelbl26.setOpaque(false);gamelbl26.setBorder(border);
	gamelbl26.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl26.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl26.setBackground(new Color(135, 206, 235));
	gamelbl26.setBounds(90, 210, 45, 45);
	frame.getContentPane().add(gamelbl26);


	gamelbl27.setOpaque(false);gamelbl27.setBorder(border);
	gamelbl27.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl27.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl27.setBackground(new Color(135, 206, 235));
	gamelbl27.setBounds(135, 210, 45, 45);
	frame.getContentPane().add(gamelbl27);


	gamelbl28.setOpaque(false);gamelbl28.setBorder(border);
	gamelbl28.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl28.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl28.setBackground(new Color(135, 206, 235));
	gamelbl28.setBounds(180, 210, 45, 45);
	frame.getContentPane().add(gamelbl28);


	gamelbl29.setOpaque(false);gamelbl29.setBorder(border);
	gamelbl29.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl29.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl29.setBackground(new Color(135, 206, 235));
	gamelbl29.setBounds(225, 210, 45, 45);
	frame.getContentPane().add(gamelbl29);


	gamelbl30.setOpaque(false);gamelbl30.setBorder(border);
	gamelbl30.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl30.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl30.setBackground(new Color(135, 206, 235));
	gamelbl30.setBounds(270, 210, 45, 45);
	frame.getContentPane().add(gamelbl30);


	gamelbl31.setOpaque(false);gamelbl31.setBorder(border);
	gamelbl31.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl31.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl31.setBackground(new Color(135, 206, 235));
	gamelbl31.setBounds(315, 210, 45, 45);
	frame.getContentPane().add(gamelbl31);


	gamelbl39.setOpaque(false);gamelbl39.setBorder(border);
	gamelbl39.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl39.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl39.setBackground(new Color(135, 206, 235));
	gamelbl39.setBounds(315, 255, 45, 45);
	frame.getContentPane().add(gamelbl39);


	gamelbl47.setOpaque(false);gamelbl47.setBorder(border);
	gamelbl47.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl47.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl47.setBackground(new Color(135, 206, 235));
	gamelbl47.setBounds(315, 300, 45, 45);
	frame.getContentPane().add(gamelbl47);


	gamelbl55.setOpaque(false);gamelbl55.setBorder(border);
	gamelbl55.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl55.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl55.setBackground(new Color(135, 206, 235));
	gamelbl55.setBounds(315, 345, 45, 45);
	frame.getContentPane().add(gamelbl55);


	gamelbl38.setOpaque(false);gamelbl38.setBorder(border);
	gamelbl38.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl38.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl38.setBackground(new Color(135, 206, 235));
	gamelbl38.setBounds(270, 255, 45, 45);
	frame.getContentPane().add(gamelbl38);


	gamelbl46.setOpaque(false);gamelbl46.setBorder(border);
	gamelbl46.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl46.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl46.setBackground(new Color(135, 206, 235));
	gamelbl46.setBounds(270, 300, 45, 45);
	frame.getContentPane().add(gamelbl46);


	gamelbl54.setOpaque(false);gamelbl54.setBorder(border);
	gamelbl54.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl54.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl54.setBackground(new Color(135, 206, 235));
	gamelbl54.setBounds(270, 345, 45, 45);
	frame.getContentPane().add(gamelbl54);


	gamelbl37.setOpaque(false);gamelbl37.setBorder(border);
	gamelbl37.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl37.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl37.setBackground(new Color(135, 206, 235));
	gamelbl37.setBounds(225, 255, 45, 45);
	frame.getContentPane().add(gamelbl37);


	gamelbl45.setOpaque(false);gamelbl45.setBorder(border);
	gamelbl45.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl45.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl45.setBackground(new Color(135, 206, 235));
	gamelbl45.setBounds(225, 300, 45, 45);
	frame.getContentPane().add(gamelbl45);


	gamelbl53.setOpaque(false);gamelbl53.setBorder(border);
	gamelbl53.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl53.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl53.setBackground(new Color(135, 206, 235));
	gamelbl53.setBounds(225, 345, 45, 45);
	frame.getContentPane().add(gamelbl53);


	gamelbl52.setOpaque(false);gamelbl52.setBorder(border);
	gamelbl52.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl52.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl52.setBackground(new Color(135, 206, 235));
	gamelbl52.setBounds(180, 345, 45, 45);
	frame.getContentPane().add(gamelbl52);


	gamelbl44.setOpaque(false);gamelbl44.setBorder(border);
	gamelbl44.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl44.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl44.setBackground(new Color(135, 206, 235));
	gamelbl44.setBounds(180, 300, 45, 45);
	frame.getContentPane().add(gamelbl44);


	gamelbl36.setOpaque(false);gamelbl36.setBorder(border);
	gamelbl36.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl36.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl36.setBackground(new Color(135, 206, 235));
	gamelbl36.setBounds(180, 255, 45, 45);
	frame.getContentPane().add(gamelbl36);


	gamelbl35.setOpaque(false);gamelbl35.setBorder(border);
	gamelbl35.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl35.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl35.setBackground(new Color(135, 206, 235));
	gamelbl35.setBounds(135, 255, 45, 45);
	frame.getContentPane().add(gamelbl35);


	gamelbl34.setOpaque(false);gamelbl34.setBorder(border);
	gamelbl34.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl34.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl34.setBackground(new Color(135, 206, 235));
	gamelbl34.setBounds(90, 255, 45, 45);
	frame.getContentPane().add(gamelbl34);


	gamelbl42.setOpaque(false);gamelbl42.setBorder(border);
	gamelbl42.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl42.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl42.setBackground(new Color(135, 206, 235));
	gamelbl42.setBounds(90, 300, 45, 45);
	frame.getContentPane().add(gamelbl42);

	gamelbl43.setOpaque(false);gamelbl43.setBorder(border);
	gamelbl43.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl43.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl43.setBackground(new Color(135, 206, 235));
	gamelbl43.setBounds(135, 300, 45, 45);
	frame.getContentPane().add(gamelbl43);

	gamelbl51.setOpaque(false);gamelbl51.setBorder(border);
	gamelbl51.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl51.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl51.setBackground(new Color(135, 206, 235));
	gamelbl51.setBounds(135, 345, 45, 45);
	frame.getContentPane().add(gamelbl51);




	gamelbl50.setOpaque(false);gamelbl50.setBorder(border);
	gamelbl50.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl50.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl50.setBackground(new Color(135, 206, 235));
	gamelbl50.setBounds(90, 345, 45, 45);
	frame.getContentPane().add(gamelbl50);
	label1.setOpaque(false);label1.setBorder(border);
	label1.setHorizontalAlignment(SwingConstants.CENTER);
	label1.setFont(new Font("Tahoma", Font.PLAIN, 20));
	label1.setBackground(new Color(135, 206, 235));
	label1.setBounds(573, 445, 45, 45);
	frame.getContentPane().add(label1);
	label2.setOpaque(false);label2.setBorder(border);
	label2.setHorizontalAlignment(SwingConstants.CENTER);
	label2.setFont(new Font("Tahoma", Font.PLAIN, 20));
	label2.setBackground(new Color(135, 0, 235));
	label2.setBounds(628, 445, 45, 45);
	frame.getContentPane().add(label2);
	label3.setOpaque(false);label3.setBorder(border);
	label3.setHorizontalAlignment(SwingConstants.CENTER);
	label3.setFont(new Font("Tahoma", Font.PLAIN, 20));
	label3.setBackground(new Color(135, 0, 235));
	label3.setBounds(683, 445, 45, 45);
	frame.getContentPane().add(label3);
	label4.setOpaque(false);label4.setBorder(border);
	label4.setHorizontalAlignment(SwingConstants.CENTER);
	label4.setFont(new Font("Tahoma", Font.PLAIN, 20));
	label4.setBackground(new Color(135, 206, 235));
	label4.setBounds(729, 445, 45, 45);
	frame.getContentPane().add(label4);
	label5.setOpaque(false);label5.setBorder(border);
	label5.setHorizontalAlignment(SwingConstants.CENTER);
	label5.setFont(new Font("Tahoma", Font.PLAIN, 20));
	label5.setBackground(new Color(135, 206, 235));
	label5.setBounds(773, 445, 45, 45);
	frame.getContentPane().add(label5);
	gamelbl1.setVisible(false);
gamelbl2.setVisible(false);
gamelbl3.setVisible(false);
gamelbl4.setVisible(false);
gamelbl5.setVisible(false);
gamelbl6.setVisible(false);
gamelbl7.setVisible(false);
gamelbl8.setVisible(false);
gamelbl9.setVisible(false);
gamelbl10.setVisible(false);
gamelbl11.setVisible(false);
gamelbl12.setVisible(false);
gamelbl13.setVisible(false);
gamelbl14.setVisible(false);
gamelbl15.setVisible(false);
gamelbl16.setVisible(false);
gamelbl17.setVisible(false);
gamelbl18.setVisible(false);
gamelbl19.setVisible(false);
gamelbl20.setVisible(false);
gamelbl21.setVisible(false);
gamelbl22.setVisible(false);
gamelbl23.setVisible(false);
gamelbl24.setVisible(false);
gamelbl25.setVisible(false);
gamelbl26.setVisible(false);
gamelbl27.setVisible(false);
gamelbl28.setVisible(false);
gamelbl29.setVisible(false);
gamelbl30.setVisible(false);
gamelbl31.setVisible(false);
gamelbl32.setVisible(false);
gamelbl33.setVisible(false);
gamelbl34.setVisible(false);
gamelbl35.setVisible(false);
gamelbl36.setVisible(false);
gamelbl37.setVisible(false);
gamelbl38.setVisible(false);
gamelbl39.setVisible(false);
gamelbl40.setVisible(false);
gamelbl41.setVisible(false);
gamelbl42.setVisible(false);
gamelbl43.setVisible(false);
gamelbl44.setVisible(false);
gamelbl45.setVisible(false);
gamelbl46.setVisible(false);
gamelbl47.setVisible(false);
gamelbl48.setVisible(false);
gamelbl49.setVisible(false);
gamelbl50.setVisible(false);
gamelbl51.setVisible(false);
gamelbl52.setVisible(false);
gamelbl53.setVisible(false);
gamelbl54.setVisible(false);
gamelbl55.setVisible(false);
gamelbl56.setVisible(false);
gamelbl57.setVisible(false);
gamelbl58.setVisible(false);
gamelbl59.setVisible(false);
gamelbl60.setVisible(false);
gamelbl61.setVisible(false);
gamelbl62.setVisible(false);
gamelbl63.setVisible(false);
gamelbl64.setVisible(false);
	}

	/**
	 * Create the application.
	 */
	public project() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JOptionPane.showMessageDialog(null, "WELCOME TO WORD BUILDER.\nRules\n1) Create combination from given letters to form meaningful words.\n2) You get 10 points for finding a word in the Crossword.\n3) You get 15 points for finding a EXTRA word not in the Crossword.\n4) You get -5 points for INVALID word.\n5) Plural words ARE ALLOWED.");
		Border border = LineBorder.createBlackLineBorder();
		frame = new JFrame();
		try{
		frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("background.jpg")))));
		}
		catch(IOException e)
		{
		System.out.println("Image not found");
		}
		lvlnolbl.setForeground(Color.white);ptslbl.setForeground(Color.white);lblPoints1.setForeground(Color.white);
	
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
		frame.setBackground(new Color(135, 206, 235));
		frame.setBounds(100, 100, 585, 699);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(null);
		 icon = new ImageIcon(icon.getImage());
		lvl2.setEnabled(false);lvl3.setEnabled(false);lvl4.setEnabled(false);lvl5.setEnabled(false);
		
		
		
		
		lvl1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent lv1) {lvl1.setEnabled(false);lvlno=1;reset(); 
			lvlnolbl.setText("Level 1"); ptslbl.setText(String.valueOf(pts));
			gamelbl19.setVisible(true);
gamelbl27.setVisible(true);
gamelbl35.setVisible(true);
gamelbl36.setVisible(true);
gamelbl37.setVisible(true);
gamelbl38.setVisible(true);
gamelbl45.setVisible(true);
gamelbl53.setVisible(true);
gamelbl54.setVisible(true);
gamelbl55.setVisible(true);
gamelbl30.setVisible(true);
gamelbl22.setVisible(true);

				gamelbl19.setOpaque(true);gamelbl19.setBorder(border);
				gamelbl19.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl19.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl19.setBackground(new Color(135, 206, 235));
				gamelbl19.setBounds(135, 165, 45, 45);
				frame.getContentPane().add(gamelbl19);
				gamelbl27.setOpaque(true);gamelbl27.setBorder(border);
				gamelbl27.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl27.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl27.setBackground(new Color(135, 206, 235));
				gamelbl27.setBounds(135, 210, 45, 45);
				frame.getContentPane().add(gamelbl27);
				gamelbl35.setOpaque(true);gamelbl35.setBorder(border);
				gamelbl35.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl35.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl35.setBackground(new Color(135, 206, 235));
				gamelbl35.setBounds(135, 255, 45, 45);
				frame.getContentPane().add(gamelbl35);
				gamelbl36.setOpaque(true);gamelbl36.setBorder(border);
				gamelbl36.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl36.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl36.setBackground(new Color(135, 206, 235));
				gamelbl36.setBounds(180, 255, 45, 45);
				frame.getContentPane().add(gamelbl36);
				gamelbl37.setOpaque(true);gamelbl37.setBorder(border);
				gamelbl37.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl37.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl37.setBackground(new Color(135, 206, 235));
				gamelbl37.setBounds(225, 255, 45, 45);
				frame.getContentPane().add(gamelbl37);
				gamelbl37.setOpaque(true);gamelbl37.setBorder(border);
				gamelbl37.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl37.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl37.setBackground(new Color(135, 206, 235));
				gamelbl37.setBounds(225, 255, 45, 45);
				frame.getContentPane().add(gamelbl37);
				gamelbl38.setOpaque(true);gamelbl38.setBorder(border);
				gamelbl38.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl38.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl38.setBackground(new Color(135, 206, 235));
				gamelbl38.setBounds(270, 255, 45, 45);
				frame.getContentPane().add(gamelbl38);
				gamelbl45.setOpaque(true);gamelbl45.setBorder(border);
				gamelbl45.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl45.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl45.setBackground(new Color(135, 206, 235));
				gamelbl45.setBounds(225, 300, 45, 45);
				frame.getContentPane().add(gamelbl45);
				gamelbl53.setOpaque(true);gamelbl53.setBorder(border);
				gamelbl53.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl53.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl53.setBackground(new Color(135, 206, 235));
				gamelbl53.setBounds(225, 345, 45, 45);
				frame.getContentPane().add(gamelbl53);
				gamelbl54.setOpaque(true);gamelbl54.setBorder(border);
				gamelbl54.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl54.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl54.setBackground(new Color(135, 206, 235));
				gamelbl54.setBounds(270, 345, 45, 45);
				frame.getContentPane().add(gamelbl54);
				gamelbl55.setOpaque(true);gamelbl55.setBorder(border);
				gamelbl55.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl55.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl55.setBackground(new Color(135, 206, 235));
				gamelbl55.setBounds(315, 345, 45, 45);
				frame.getContentPane().add(gamelbl55);
				gamelbl30.setOpaque(true);gamelbl30.setBorder(border);
				gamelbl30.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl30.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl30.setBackground(new Color(135, 206, 235));
				gamelbl30.setBounds(270, 210, 45, 45);
				frame.getContentPane().add(gamelbl30);
				gamelbl22.setOpaque(true);gamelbl22.setBorder(border);
				gamelbl22.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl22.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl22.setBackground(new Color(135, 206, 235));
				gamelbl22.setBounds(270, 165, 45, 45);
				frame.getContentPane().add(gamelbl22);
				label1.setOpaque(true);label1.setBorder(border);
				label1.setHorizontalAlignment(SwingConstants.CENTER);
				label1.setFont(new Font("Tahoma", Font.PLAIN, 20));
				label1.setBackground(new Color(165, 255, 177));
				label1.setBounds(297, 445, 45, 45);
				frame.getContentPane().add(label1);
				label2.setOpaque(true);label2.setBorder(border);
				label2.setHorizontalAlignment(SwingConstants.CENTER);
				label2.setFont(new Font("Tahoma", Font.PLAIN, 20));
				label2.setBackground(new Color(165, 255, 177));
				label2.setBounds(342, 445, 45, 45);
				frame.getContentPane().add(label2);
				label3.setOpaque(true);label3.setBorder(border);
				label3.setHorizontalAlignment(SwingConstants.CENTER);
				label3.setFont(new Font("Tahoma", Font.PLAIN, 20));
				label3.setBackground(new Color(165, 255, 177));
				label3.setBounds(387, 445, 45, 45);
				frame.getContentPane().add(label3);
				label4.setOpaque(true);label4.setBorder(border);
				label4.setHorizontalAlignment(SwingConstants.CENTER);
				label4.setFont(new Font("Tahoma", Font.PLAIN, 20));
				label4.setBackground(new Color(165, 255, 177));
				label4.setBounds(432, 445, 45, 45);
				frame.getContentPane().add(label4);
				ltrbtn1.setText("W");ltrbtn2.setText("A");ltrbtn3.setText("R");ltrbtn4.setText("S");
				
				ltrbtn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent W) {
						ltrbtn1.setEnabled(false);
						if(pos1==0)
						{
							a[pos1]='W';label1.setText("W");pos1++;
					}
						else if(pos1==1)
						{
							a[pos1]='W';label2.setText("W");pos1++;
					}
						else if(pos1==2)
						{
							a[pos1]='W';label3.setText("W");pos1++;
					}
						else if(pos1==3)
						{
							a[pos1]='W';label4.setText("W");pos1++;
					}
						
					}
				});
				
				ltrbtn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent A) {
						ltrbtn2.setEnabled(false);
						if(pos1==0)
						{
							a[pos1]='A';label1.setText("A");pos1++;
					}
						else if(pos1==1)
						{
							a[pos1]='A';label2.setText("A");pos1++;
					}
						else if(pos1==2)
						{
							a[pos1]='A';label3.setText("A");pos1++;
					}
						else if(pos1==3)
						{
							a[pos1]='A';label4.setText("A");pos1++;
					}
						
					}
				});
				
				ltrbtn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent R) {
						ltrbtn3.setEnabled(false);
						if(pos1==0)
						{
							a[pos1]='R';label1.setText("R");pos1++;
					}
						else if(pos1==1)
						{
							a[pos1]='R';label2.setText("R");pos1++;
					}
						else if(pos1==2)
						{
							a[pos1]='R';label3.setText("R");pos1++;
					}
						else if(pos1==3)
						{
							a[pos1]='R';label4.setText("R");pos1++;
					}
						
					}
				});
				
				ltrbtn4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent R) {
						
						if(pos1==0)
						{ltrbtn4.setEnabled(false);
							a[pos1]='S';label1.setText("S");pos1++;
					}
						else if(pos1==1)
						{
							a[pos1]='S';label2.setText("S");pos1++;
					}
						else if(pos1==2)
						{
							a[pos1]='S';label3.setText("S");pos1++;
					}
						else if(pos1==3)
						{
							a[pos1]='S';label4.setText("S");pos1++;
					}
						
					}
				});
				
				
			}
		});
		lvl1.setBounds(444, 75, 89, 23);
		frame.getContentPane().add(lvl1);
		lvl2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent lv2) {{lvlno=2;reset();lvl2.setEnabled(false);
			lvlnolbl.setText("Level 2");
			
gamelbl11.setVisible(true);
gamelbl19.setVisible(true);
gamelbl27.setVisible(true);
gamelbl35.setVisible(true);
gamelbl43.setVisible(true);
gamelbl36.setVisible(true);
gamelbl37.setVisible(true);
gamelbl38.setVisible(true);
gamelbl30.setVisible(true);
gamelbl22.setVisible(true);
gamelbl14.setVisible(true);
gamelbl45.setVisible(true);
gamelbl53.setVisible(true);
gamelbl52.setVisible(true);
gamelbl54.setVisible(true);
gamelbl61.setVisible(true);

			label1.setOpaque(true);label1.setBorder(border);
			label1.setHorizontalAlignment(SwingConstants.CENTER);
			label1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			label1.setBackground(new Color(165, 255, 177));
			label1.setBounds(297, 445, 45, 45);
			frame.getContentPane().add(label1);
			label2.setOpaque(true);label2.setBorder(border);
			label2.setHorizontalAlignment(SwingConstants.CENTER);
			label2.setFont(new Font("Tahoma", Font.PLAIN, 20));
			label2.setBackground(new Color(165, 255, 177));
			label2.setBounds(342, 445, 45, 45);
			frame.getContentPane().add(label2);
			label3.setOpaque(true);label3.setBorder(border);
			label3.setHorizontalAlignment(SwingConstants.CENTER);
			label3.setFont(new Font("Tahoma", Font.PLAIN, 20));
			label3.setBackground(new Color(165, 255, 177));
			label3.setBounds(387, 445, 45, 45);
			frame.getContentPane().add(label3);
			label4.setOpaque(true);label4.setBorder(border);
			label4.setHorizontalAlignment(SwingConstants.CENTER);
			label4.setFont(new Font("Tahoma", Font.PLAIN, 20));
			label4.setBackground(new Color(165, 255, 177));
			label4.setBounds(432, 445, 45, 45);
			frame.getContentPane().add(label4);
			label5.setOpaque(true);label5.setBorder(border);
			label5.setHorizontalAlignment(SwingConstants.CENTER);
			label5.setFont(new Font("Tahoma", Font.PLAIN, 20));
			label5.setBackground(new Color(165, 255, 177));
			label5.setBounds(477, 445, 45, 45);
			frame.getContentPane().add(label5);
			
			gamelbl11.setOpaque(true);gamelbl11.setBorder(border);
			gamelbl11.setHorizontalAlignment(SwingConstants.CENTER);
			gamelbl11.setFont(new Font("Tahoma", Font.PLAIN, 20));
			gamelbl11.setBackground(new Color(247,197,172));
			gamelbl11.setBounds(135, 120, 45, 45);
			frame.getContentPane().add(gamelbl11);
			gamelbl19.setOpaque(true);gamelbl19.setBorder(border);
			gamelbl19.setHorizontalAlignment(SwingConstants.CENTER);
			gamelbl19.setFont(new Font("Tahoma", Font.PLAIN, 20));
			gamelbl19.setBackground(new Color(247,197,172));
			gamelbl19.setBounds(135, 165, 45, 45);
			frame.getContentPane().add(gamelbl19);
			gamelbl27.setOpaque(true);gamelbl27.setBorder(border);
			gamelbl27.setHorizontalAlignment(SwingConstants.CENTER);
			gamelbl27.setFont(new Font("Tahoma", Font.PLAIN, 20));
			gamelbl27.setBackground(new Color(247,197,172));
			gamelbl27.setBounds(135, 210, 45, 45);
			frame.getContentPane().add(gamelbl27);
			gamelbl35.setOpaque(true);gamelbl35.setBorder(border);
			gamelbl35.setHorizontalAlignment(SwingConstants.CENTER);
			gamelbl35.setFont(new Font("Tahoma", Font.PLAIN, 20));
			gamelbl35.setBackground(new Color(247,197,172));
			gamelbl35.setBounds(135, 255, 45, 45);
			frame.getContentPane().add(gamelbl35);
			gamelbl43.setOpaque(true);gamelbl43.setBorder(border);
			gamelbl43.setHorizontalAlignment(SwingConstants.CENTER);
			gamelbl43.setFont(new Font("Tahoma", Font.PLAIN, 20));
			gamelbl43.setBackground(new Color(247,197,172));
			gamelbl43.setBounds(135, 300, 45, 45);
			frame.getContentPane().add(gamelbl43);
			gamelbl36.setOpaque(true);gamelbl36.setBorder(border);
			gamelbl36.setHorizontalAlignment(SwingConstants.CENTER);
			gamelbl36.setFont(new Font("Tahoma", Font.PLAIN, 20));
			gamelbl36.setBackground(new Color(247,197,172));
			gamelbl36.setBounds(180, 255, 45, 45);
			frame.getContentPane().add(gamelbl36);
			gamelbl37.setOpaque(true);gamelbl37.setBorder(border);
			gamelbl37.setHorizontalAlignment(SwingConstants.CENTER);
			gamelbl37.setFont(new Font("Tahoma", Font.PLAIN, 20));
			gamelbl37.setBackground(new Color(247,197,172));
			gamelbl37.setBounds(225, 255, 45, 45);
			frame.getContentPane().add(gamelbl37);
			gamelbl38.setOpaque(true);gamelbl38.setBorder(border);
			gamelbl38.setHorizontalAlignment(SwingConstants.CENTER);
			gamelbl38.setFont(new Font("Tahoma", Font.PLAIN, 20));
			gamelbl38.setBackground(new Color(247,197,172));
			gamelbl38.setBounds(270, 255, 45, 45);
			frame.getContentPane().add(gamelbl38);
			gamelbl30.setOpaque(true);gamelbl30.setBorder(border);
			gamelbl30.setHorizontalAlignment(SwingConstants.CENTER);
			gamelbl30.setFont(new Font("Tahoma", Font.PLAIN, 20));
			gamelbl30.setBackground(new Color(247,197,172));
			gamelbl30.setBounds(270, 210, 45, 45);
			frame.getContentPane().add(gamelbl30);
			gamelbl22.setOpaque(true);gamelbl22.setBorder(border);
			gamelbl22.setHorizontalAlignment(SwingConstants.CENTER);
			gamelbl22.setFont(new Font("Tahoma", Font.PLAIN, 20));
			gamelbl22.setBackground(new Color(247,197,172));
			gamelbl22.setBounds(270, 165, 45, 45);
			frame.getContentPane().add(gamelbl22);
			gamelbl14.setOpaque(true);gamelbl14.setBorder(border);
			gamelbl14.setHorizontalAlignment(SwingConstants.CENTER);
			gamelbl14.setFont(new Font("Tahoma", Font.PLAIN, 20));
			gamelbl14.setBackground(new Color(247,197,172));
			gamelbl14.setBounds(270, 120, 45, 45);
			frame.getContentPane().add(gamelbl14);
			gamelbl45.setOpaque(true);gamelbl45.setBorder(border);
			gamelbl45.setHorizontalAlignment(SwingConstants.CENTER);
			gamelbl45.setFont(new Font("Tahoma", Font.PLAIN, 20));
			gamelbl45.setBackground(new Color(247,197,172));
			gamelbl45.setBounds(225, 300, 45, 45);
			frame.getContentPane().add(gamelbl45);
			gamelbl53.setOpaque(true);gamelbl53.setBorder(border);
			gamelbl53.setHorizontalAlignment(SwingConstants.CENTER);
			gamelbl53.setFont(new Font("Tahoma", Font.PLAIN, 20));
			gamelbl53.setBackground(new Color(247,197,172));
			gamelbl53.setBounds(225, 345, 45, 45);
			frame.getContentPane().add(gamelbl53);
			gamelbl52.setOpaque(true);gamelbl52.setBorder(border);
			gamelbl52.setHorizontalAlignment(SwingConstants.CENTER);
			gamelbl52.setFont(new Font("Tahoma", Font.PLAIN, 20));
			gamelbl52.setBackground(new Color(247,197,172));
			gamelbl52.setBounds(180, 345, 45, 45);
			frame.getContentPane().add(gamelbl52);
			gamelbl54.setOpaque(true);gamelbl54.setBorder(border);
			gamelbl54.setHorizontalAlignment(SwingConstants.CENTER);
			gamelbl54.setFont(new Font("Tahoma", Font.PLAIN, 20));
			gamelbl54.setBackground(new Color(247,197,172));
			gamelbl54.setBounds(270, 345, 45, 45);
			frame.getContentPane().add(gamelbl54);
			gamelbl61.setOpaque(true);gamelbl61.setBorder(border);
			gamelbl61.setHorizontalAlignment(SwingConstants.CENTER);
			gamelbl61.setFont(new Font("Tahoma", Font.PLAIN, 20));
			gamelbl61.setBackground(new Color(247,197,172));
			gamelbl61.setBounds(225, 390, 45, 45);
			frame.getContentPane().add(gamelbl61);
           
			ltrbtn1.setText("E");ltrbtn2.setText("S");ltrbtn3.setText("S");ltrbtn4.setText("E");ltrbtn5.setText("M");
			
			ltrbtn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent E) {
					ltrbtn1.setEnabled(false);
					if(pos2==0)
					{
						a[pos2]='E';label1.setText("E");pos2++;
				}
					else if(pos2==1)
					{
						a[pos2]='E';label2.setText("E");pos2++;
				}
					else if(pos2==2)
					{
						a[pos2]='E';label3.setText("E");pos2++;
				}
					else if(pos2==3)
					{
						a[pos2]='E';label4.setText("E");pos2++;
				}
					else if(pos2==4)
					{
						a[pos2]='E';label5.setText("E");pos2++;
				}
					
				}
			});
			
			ltrbtn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent S) {
					ltrbtn2.setEnabled(false);
					if(pos2==0)
					{
						a[pos2]='S';label1.setText("S");pos2++;
				}
					else if(pos2==1)
					{
						a[pos2]='S';label2.setText("S");pos2++;
				}
					else if(pos2==2)
					{
						a[pos2]='S';label3.setText("S");pos2++;
				}
					else if(pos2==3)
					{
						a[pos2]='S';label4.setText("S");pos2++;
				}
					else if(pos2==4)
					{
						a[pos2]='S';label5.setText("S");pos2++;
				}
					
				}
			});
			
			ltrbtn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent S) {
					ltrbtn3.setEnabled(false);
					if(pos2==0)
					{
						a[pos2]='S';label1.setText("S");pos2++;
				}
					else if(pos2==1)
					{
						a[pos2]='S';label2.setText("S");pos2++;
				}
					else if(pos2==2)
					{
						a[pos2]='S';label3.setText("S");pos2++;
				}
					else if(pos2==3)
					{
						a[pos2]='S';label4.setText("S");pos2++;
				}
					else if(pos2==4)
					{
						a[pos2]='S';label5.setText("S");pos2++;
				}
					
				}
			});
			
			ltrbtn4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent E1) {
					ltrbtn4.setEnabled(false);
					if(pos2==0)
					{
						a[pos2]='E';label1.setText("E");pos2++;
				}
					else if(pos2==1)
					{
						a[pos2]='E';label2.setText("E");pos2++;
				}
					else if(pos2==2)
					{
						a[pos2]='E';label3.setText("E");pos2++;
				}
					else if(pos2==3)
					{
						a[pos2]='E';label4.setText("E");pos2++;
				}
					else if(pos2==4)
					{
						a[pos2]='E';label5.setText("E");pos2++;
				}
					
				}
			});
			ltrbtn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent M) {
					ltrbtn5.setEnabled(false);
					if(pos2==0)
					{
						a[pos2]='M';label1.setText("M");pos2++;
				}
					else if(pos2==1)
					{
						a[pos2]='M';label2.setText("M");pos2++;
				}
					else if(pos2==2)
					{
						a[pos2]='M';label3.setText("M");pos2++;
				}
					else if(pos2==3)
					{
						a[pos2]='M';label4.setText("M");pos2++;
				}
					else if(pos2==4)
					{
						a[pos2]='M';label5.setText("M");pos2++;
				}
					
				}
			});
			
			}
			}});
		
		
		lvl2.setBounds(444, 113, 89, 23);
		frame.getContentPane().add(lvl2);
		lvl3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent lv3) {lvlno=3;reset();lvl3.setEnabled(false);
			lvlnolbl.setText("Level 3");
			gamelbl11.setVisible(true);
gamelbl12.setVisible(true);
gamelbl13.setVisible(true);
gamelbl19.setVisible(true);
gamelbl27.setVisible(true);
gamelbl28.setVisible(true);
gamelbl29.setVisible(true);
gamelbl30.setVisible(true);
gamelbl43.setVisible(true);
gamelbl34.setVisible(true);
gamelbl36.setVisible(true);
gamelbl38.setVisible(true);
gamelbl42.setVisible(true);
gamelbl44.setVisible(true);
gamelbl46.setVisible(true);
gamelbl50.setVisible(true);
			
			
						label1.setOpaque(true);label1.setBorder(border);
			label1.setOpaque(true);label1.setBorder(border);
			label1.setHorizontalAlignment(SwingConstants.CENTER);
			label1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			label1.setBackground(new Color(217, 247, 66));
			label1.setBounds(297, 445, 45, 45);
			frame.getContentPane().add(label1);
			label2.setOpaque(true);label2.setBorder(border);
			label2.setHorizontalAlignment(SwingConstants.CENTER);
			label2.setFont(new Font("Tahoma", Font.PLAIN, 20));
			label2.setBackground(new Color(217, 247, 66));
			label2.setBounds(342, 445, 45, 45);
			frame.getContentPane().add(label2);
			label3.setOpaque(true);label3.setBorder(border);
			label3.setHorizontalAlignment(SwingConstants.CENTER);
			label3.setFont(new Font("Tahoma", Font.PLAIN, 20));
			label3.setBackground(new Color(217, 247, 66));
			label3.setBounds(387, 445, 45, 45);
			frame.getContentPane().add(label3);
			label4.setOpaque(true);label4.setBorder(border);
			label4.setHorizontalAlignment(SwingConstants.CENTER);
			label4.setFont(new Font("Tahoma", Font.PLAIN, 20));
			label4.setBackground(new Color(217, 247, 66));
			label4.setBounds(432, 445, 45, 45);
			frame.getContentPane().add(label4);
				gamelbl11.setOpaque(true);gamelbl11.setBorder(border);
			gamelbl11.setHorizontalAlignment(SwingConstants.CENTER);
			gamelbl11.setFont(new Font("Tahoma", Font.PLAIN, 20));
			gamelbl11.setBackground(new Color(247,197,172));
			gamelbl11.setBounds(135, 120, 45, 45);
			frame.getContentPane().add(gamelbl11);
			
				frame.getContentPane().add(gamelbl11);
				gamelbl12.setOpaque(true);gamelbl12.setBorder(border);
				gamelbl12.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl12.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl12.setBackground(new Color(135, 206, 235));
				gamelbl12.setBounds(180, 120, 45, 45);
				frame.getContentPane().add(gamelbl21);


				gamelbl13.setOpaque(true);gamelbl13.setBorder(border);
				gamelbl13.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl13.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl13.setBackground(new Color(135, 206, 235));
				gamelbl13.setBounds(225, 120, 45, 45);
				frame.getContentPane().add(gamelbl13);
				gamelbl19.setOpaque(true);gamelbl19.setBorder(border);
				gamelbl19.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl19.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl19.setBackground(new Color(135, 206, 235));
				gamelbl19.setBounds(135, 165, 45, 45);
				frame.getContentPane().add(gamelbl19);
				gamelbl27.setOpaque(true);gamelbl27.setBorder(border);
				gamelbl27.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl27.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl27.setBackground(new Color(135, 206, 235));
				gamelbl27.setBounds(135, 210, 45, 45);
				frame.getContentPane().add(gamelbl27);
				gamelbl28.setOpaque(true);gamelbl28.setBorder(border);
				gamelbl28.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl28.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl28.setBackground(new Color(135, 206, 235));
				gamelbl28.setBounds(180, 210, 45, 45);
				frame.getContentPane().add(gamelbl28);
				gamelbl29.setOpaque(true);gamelbl29.setBorder(border);
				gamelbl29.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl29.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl29.setBackground(new Color(135, 206, 235));
				gamelbl29.setBounds(225, 210, 45, 45);
				frame.getContentPane().add(gamelbl29);
				gamelbl30.setOpaque(true);gamelbl30.setBorder(border);
				gamelbl30.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl30.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl30.setBackground(new Color(135, 206, 235));
				gamelbl30.setBounds(270, 210, 45, 45);
				frame.getContentPane().add(gamelbl30);
				gamelbl43.setOpaque(true);gamelbl43.setBorder(border);
				gamelbl43.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl43.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl43.setBackground(new Color(135, 206, 235));
				gamelbl43.setBounds(135, 300, 45, 45);
				frame.getContentPane().add(gamelbl43);
				gamelbl34.setOpaque(true);gamelbl34.setBorder(border);
	gamelbl34.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl34.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl34.setBackground(new Color(135, 206, 235));
	gamelbl34.setBounds(90, 255, 45, 45);
	frame.getContentPane().add(gamelbl34);
	gamelbl36.setOpaque(true);gamelbl36.setBorder(border);
	gamelbl36.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl36.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl36.setBackground(new Color(135, 206, 235));
	gamelbl36.setBounds(180, 255, 45, 45);
	frame.getContentPane().add(gamelbl36);
	
	gamelbl38.setOpaque(true);gamelbl38.setBorder(border);
	gamelbl38.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl38.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl38.setBackground(new Color(135, 206, 235));
	gamelbl38.setBounds(270, 255, 45, 45);
	frame.getContentPane().add(gamelbl38);
	gamelbl42.setOpaque(true);gamelbl42.setBorder(border);
	gamelbl42.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl42.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl42.setBackground(new Color(135, 206, 235));
	gamelbl42.setBounds(90, 300, 45, 45);
	frame.getContentPane().add(gamelbl42);
	gamelbl44.setOpaque(true);gamelbl44.setBorder(border);
	gamelbl44.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl44.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl44.setBackground(new Color(135, 206, 235));
	gamelbl44.setBounds(180, 300, 45, 45);
	frame.getContentPane().add(gamelbl44);
	gamelbl46.setOpaque(true);gamelbl46.setBorder(border);
	gamelbl46.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl46.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl46.setBackground(new Color(135, 206, 235));
	gamelbl46.setBounds(270, 300, 45, 45);
	frame.getContentPane().add(gamelbl46);
	gamelbl50.setOpaque(true);gamelbl50.setBorder(border);
	gamelbl50.setHorizontalAlignment(SwingConstants.CENTER);
	gamelbl50.setFont(new Font("Tahoma", Font.PLAIN, 20));
	gamelbl50.setBackground(new Color(135, 206, 235));
	gamelbl50.setBounds(90, 345, 45, 45);
	frame.getContentPane().add(gamelbl50);
				ltrbtn1.setText("P");ltrbtn2.setText("A");ltrbtn3.setText("C");ltrbtn4.setText("T");
				
				ltrbtn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent P) {
						
						if(pos3==0)
						{
							a[pos3]='P';label1.setText("P");pos3++;
					}
						else if(pos3==1)
						{
							a[pos3]='P';label2.setText("P");pos3++;
					}
						else if(pos3==2)
						{
							a[pos3]='P';label3.setText("P");pos3++;
					}
						else if(pos3==3)
						{
							a[pos3]='P';label4.setText("P");pos3++;
					}
						
					}
				});
				
				ltrbtn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent A) {
						
						if(pos3==0)
						{
							a[pos3]='A';label1.setText("A");pos3++;
					}
						else if(pos3==1)
						{
							a[pos3]='A';label2.setText("A");pos3++;
					}
						else if(pos3==2)
						{
							a[pos3]='A';label3.setText("A");pos3++;
					}
						else if(pos3==3)
						{
							a[pos3]='A';label4.setText("A");pos3++;
					}
						
					}
				});
				
				ltrbtn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent C) {
						
						if(pos3==0)
						{
							a[pos3]='C';label1.setText("C");pos3++;
					}
						else if(pos3==1)
						{
							a[pos3]='C';label2.setText("C");pos3++;
					}
						else if(pos3==2)
						{
							a[pos3]='C';label3.setText("C");pos3++;
					}
						else if(pos3==3)
						{
							a[pos3]='C';label4.setText("C");pos3++;
					}
						
					}
				});
				
				ltrbtn4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent T) {
						
						if(pos3==0)
						{
							a[pos3]='T';label1.setText("T");pos3++;
					}
						else if(pos3==1)
						{
							a[pos3]='T';label2.setText("T");pos3++;
					}
						else if(pos3==2)
						{
							a[pos3]='T';label3.setText("T");pos3++;
					}
						else if(pos3==3)
						{
							a[pos3]='T';label4.setText("T");pos3++;
					}
						
					}
				});	
				
			}
		});
		lvl3.setBounds(444, 147, 89, 23);
		
		frame.getContentPane().add(lvl3);
		lvl4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent lv4) {
				lvlno=4;reset();lvl4.setEnabled(false);
				lvlnolbl.setText("Level 4");
				gamelbl10.setVisible(true);
gamelbl11.setVisible(true);
gamelbl12.setVisible(true);
gamelbl20.setVisible(true);
gamelbl28.setVisible(true);
gamelbl36.setVisible(true);
gamelbl37.setVisible(true);
gamelbl38.setVisible(true);
gamelbl46.setVisible(true);
gamelbl54.setVisible(true);
gamelbl21.setVisible(true);
gamelbl22.setVisible(true);
gamelbl6.setVisible(true);
gamelbl14.setVisible(true);
				label1.setOpaque(true);label1.setBorder(border);
				label1.setHorizontalAlignment(SwingConstants.CENTER);
				label1.setFont(new Font("Tahoma", Font.PLAIN, 20));
				label1.setBackground(new Color(165, 255, 177));
				label1.setBounds(297, 445, 45, 45);
				frame.getContentPane().add(label1);
				label2.setOpaque(true);label2.setBorder(border);
				label2.setHorizontalAlignment(SwingConstants.CENTER);
				label2.setFont(new Font("Tahoma", Font.PLAIN, 20));
				label2.setBackground(new Color(165, 255, 177));
				label2.setBounds(342, 445, 45, 45);
				frame.getContentPane().add(label2);
				label3.setOpaque(true);label3.setBorder(border);
				label3.setHorizontalAlignment(SwingConstants.CENTER);
				label3.setFont(new Font("Tahoma", Font.PLAIN, 20));
				label3.setBackground(new Color(165, 255, 177));
				label3.setBounds(387, 445, 45, 45);
				frame.getContentPane().add(label3);
				label4.setOpaque(true);label4.setBorder(border);
				label4.setHorizontalAlignment(SwingConstants.CENTER);
				label4.setFont(new Font("Tahoma", Font.PLAIN, 20));
				label4.setBackground(new Color(165, 255, 177));
				label4.setBounds(432, 445, 45, 45);
				frame.getContentPane().add(label4);
				
				gamelbl10.setOpaque(true);gamelbl10.setBorder(border);
				gamelbl10.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl10.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl10.setBackground(new Color(135, 206, 235));
				gamelbl10.setBounds(90, 120, 45, 45);
				frame.getContentPane().add(gamelbl10);


				gamelbl11.setOpaque(true);gamelbl11.setBorder(border);
				gamelbl11.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl11.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl11.setBackground(new Color(135, 206, 235));
				gamelbl11.setBounds(135, 120, 45, 45);
				frame.getContentPane().add(gamelbl11);


				gamelbl12.setOpaque(true);gamelbl12.setBorder(border);
				gamelbl12.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl12.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl12.setBackground(new Color(135, 206, 235));
				gamelbl12.setBounds(180, 120, 45, 45);
				frame.getContentPane().add(gamelbl12);
				gamelbl20.setOpaque(true);gamelbl20.setBorder(border);
				gamelbl20.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl20.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl20.setBackground(new Color(135, 206, 235));
				gamelbl20.setBounds(180, 165, 45, 45);
				frame.getContentPane().add(gamelbl20);
				gamelbl28.setOpaque(true);gamelbl28.setBorder(border);
				gamelbl28.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl28.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl28.setBackground(new Color(135, 206, 235));
				gamelbl28.setBounds(180, 210, 45, 45);
				frame.getContentPane().add(gamelbl28);
				gamelbl36.setOpaque(true);gamelbl36.setBorder(border);
				gamelbl36.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl36.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl36.setBackground(new Color(135, 206, 235));
				gamelbl36.setBounds(180, 255, 45, 45);
				frame.getContentPane().add(gamelbl36);
				gamelbl37.setOpaque(true);gamelbl37.setBorder(border);
				gamelbl37.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl37.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl37.setBackground(new Color(135, 206, 235));
				gamelbl37.setBounds(225, 255, 45, 45);
				frame.getContentPane().add(gamelbl37);
				gamelbl38.setOpaque(true);gamelbl38.setBorder(border);
				gamelbl38.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl38.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl38.setBackground(new Color(135, 206, 235));
				gamelbl38.setBounds(270, 255, 45, 45);
				frame.getContentPane().add(gamelbl38);
				gamelbl46.setOpaque(true);gamelbl46.setBorder(border);
				gamelbl46.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl46.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl46.setBackground(new Color(135, 206, 235));
				gamelbl46.setBounds(270, 300, 45, 45);
				frame.getContentPane().add(gamelbl46);
				gamelbl54.setOpaque(true);gamelbl54.setBorder(border);
				gamelbl54.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl54.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl54.setBackground(new Color(135, 206, 235));
				gamelbl54.setBounds(270, 345, 45, 45);
				frame.getContentPane().add(gamelbl54);
				gamelbl21.setOpaque(true);gamelbl21.setBorder(border);
				gamelbl21.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl21.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl21.setBackground(new Color(135, 206, 235));
				gamelbl21.setBounds(225, 165, 45, 45);
				frame.getContentPane().add(gamelbl21);
                gamelbl22.setOpaque(true);gamelbl22.setBorder(border);
				gamelbl22.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl22.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl22.setBackground(new Color(135, 206, 235));
				gamelbl22.setBounds(270, 165, 45, 45);
				frame.getContentPane().add(gamelbl22);
				gamelbl6.setOpaque(true);gamelbl6.setBorder(border);
				gamelbl6.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl6.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl6.setBackground(new Color(135, 206, 235));
				gamelbl6.setBounds(270, 75, 45, 45);
				frame.getContentPane().add(gamelbl6);
				gamelbl14.setOpaque(true);gamelbl14.setBorder(border);
				gamelbl14.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl14.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl14.setBackground(new Color(135, 206, 235));
				gamelbl14.setBounds(270, 120, 45, 45);
				frame.getContentPane().add(gamelbl14);
				ltrbtn1.setText("N");ltrbtn2.setText("O");ltrbtn3.setText("W");ltrbtn4.setText("R");
				
				ltrbtn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent N) {
						ltrbtn1.setEnabled(false);
						if(pos4==0)
						{
							a[pos4]='N';label1.setText("N");pos4++;
					}
						else if(pos4==1)
						{
							a[pos4]='N';label2.setText("N");pos4++;
					}
						else if(pos4==2)
						{
							a[pos4]='N';label3.setText("N");pos4++;
					}
						else if(pos4==3)
						{
							a[pos4]='N';label4.setText("N");pos4++;
					}
						else if(pos4==4)
						{
							a[pos4]='N';label5.setText("N");pos4++;
					}
						
					}
				});
				
				ltrbtn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent O) {
						ltrbtn2.setEnabled(false);
						if(pos4==0)
						{
							a[pos4]='O';label1.setText("O");pos4++;
					}
						else if(pos4==1)
						{
							a[pos4]='O';label2.setText("O");pos4++;
					}
						else if(pos4==2)
						{
							a[pos4]='O';label3.setText("O");pos4++;
					}
						else if(pos4==3)
						{
							a[pos4]='O';label4.setText("O");pos4++;
					}
						else if(pos4==4)
						{
							a[pos4]='O';label5.setText("O");pos4++;
					}
						
					}
				});
				
				ltrbtn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent W) {
						ltrbtn3.setEnabled(false);
						if(pos4==0)
						{
							a[pos4]='W';label1.setText("W");pos4++;
					}
						else if(pos4==1)
						{
							a[pos4]='W';label2.setText("W");pos4++;
					}
						else if(pos4==2)
						{
							a[pos4]='W';label3.setText("W");pos4++;
					}
						else if(pos4==3)
						{
							a[pos4]='W';label4.setText("W");pos4++;
					}
						else if(pos4==4)
						{
							a[pos4]='W';label5.setText("W");pos4++;
					}
					}
				});
				
				ltrbtn4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent E1) {
						ltrbtn4.setEnabled(false);
						if(pos4==0)
						{
							a[pos4]='R';label1.setText("R");pos4++;
					}
						else if(pos4==1)
						{
							a[pos4]='R';label2.setText("R");pos4++;
					}
						else if(pos4==2)
						{
							a[pos4]='R';label3.setText("R");pos4++;
					}
						else if(pos4==3)
						{
							a[pos4]='R';label4.setText("R");pos4++;
					}
						else if(pos4==4)
						{
							a[pos4]='R';label5.setText("R");pos4++;
					}
						
					}
				});
			}
		});
		lvl4.setBounds(444, 181, 89, 23);
		
		frame.getContentPane().add(lvl4);
		lvl5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent lv5) {
				lvlno=5;reset();lvl5.setEnabled(false);
				lvlnolbl.setText("Level 5");
				gamelbl4.setVisible(true);
gamelbl5.setVisible(true);
gamelbl6.setVisible(true);
gamelbl12.setVisible(true);
gamelbl18.setVisible(true);
gamelbl19.setVisible(true);
gamelbl20.setVisible(true);
gamelbl21.setVisible(true);
gamelbl26.setVisible(true);
gamelbl28.setVisible(true);
gamelbl34.setVisible(true);
gamelbl42.setVisible(true);
gamelbl43.setVisible(true);
gamelbl50.setVisible(true);
gamelbl44.setVisible(true);
				
				label1.setOpaque(true);label1.setBorder(border);
				label1.setHorizontalAlignment(SwingConstants.CENTER);
				label1.setFont(new Font("Tahoma", Font.PLAIN, 20));
				label1.setBackground(new Color(165, 255, 177));
				label1.setBounds(297, 445, 45, 45);
				frame.getContentPane().add(label1);
				label2.setOpaque(true);label2.setBorder(border);
				label2.setHorizontalAlignment(SwingConstants.CENTER);
				label2.setFont(new Font("Tahoma", Font.PLAIN, 20));
				label2.setBackground(new Color(165, 255, 177));
				label2.setBounds(342, 445, 45, 45);
				frame.getContentPane().add(label2);
				label3.setOpaque(true);label3.setBorder(border);
				label3.setHorizontalAlignment(SwingConstants.CENTER);
				label3.setFont(new Font("Tahoma", Font.PLAIN, 20));
				label3.setBackground(new Color(165, 255, 177));
				label3.setBounds(387, 445, 45, 45);
				frame.getContentPane().add(label3);
				label4.setOpaque(true);label4.setBorder(border);
				label4.setHorizontalAlignment(SwingConstants.CENTER);
				label4.setFont(new Font("Tahoma", Font.PLAIN, 20));
				label4.setBackground(new Color(165, 255, 177));
				label4.setBounds(432, 445, 45, 45);
				frame.getContentPane().add(label4);
				label5.setOpaque(true);label5.setBorder(border);
				label5.setHorizontalAlignment(SwingConstants.CENTER);
				label5.setFont(new Font("Tahoma", Font.PLAIN, 20));
				label5.setBackground(new Color(165, 255, 177));
				label5.setBounds(480, 445, 45, 45);
				frame.getContentPane().add(label5);
				
				ltrbtn1.setText("B");ltrbtn2.setText("L");ltrbtn3.setText("A");ltrbtn4.setText("C");ltrbtn5.setText("K");
				gamelbl4.setOpaque(false);gamelbl4.setBorder(border);
				gamelbl4.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl4.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl4.setBackground(new Color(135, 206, 235));
				gamelbl4.setBounds(180, 75, 45, 45);
				frame.getContentPane().add(gamelbl4);


				gamelbl5.setOpaque(false);gamelbl5.setBorder(border);
				gamelbl5.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl5.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl5.setBackground(new Color(135, 206, 235));
				gamelbl5.setBounds(225, 75, 45, 45);
				frame.getContentPane().add(gamelbl5);


				gamelbl6.setOpaque(false);gamelbl6.setBorder(border);
				gamelbl6.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl6.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl6.setBackground(new Color(135, 206, 235));
				gamelbl6.setBounds(270, 75, 45, 45);
				frame.getContentPane().add(gamelbl6);
				gamelbl12.setOpaque(false);gamelbl12.setBorder(border);
				gamelbl12.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl12.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl12.setBackground(new Color(135, 206, 235));
				gamelbl12.setBounds(180, 120, 45, 45);
				frame.getContentPane().add(gamelbl12);
				gamelbl18.setOpaque(false);gamelbl18.setBorder(border);
				gamelbl18.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl18.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl18.setBackground(new Color(135, 206, 235));
				gamelbl18.setBounds(90, 165, 45, 45);
				frame.getContentPane().add(gamelbl18);


				gamelbl19.setOpaque(false);gamelbl19.setBorder(border);
				gamelbl19.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl19.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl19.setBackground(new Color(135, 206, 235));
				gamelbl19.setBounds(135, 165, 45, 45);
				frame.getContentPane().add(gamelbl19);


				gamelbl20.setOpaque(false);gamelbl20.setBorder(border);
				gamelbl20.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl20.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl20.setBackground(new Color(135, 206, 235));
				gamelbl20.setBounds(180, 165, 45, 45);
				frame.getContentPane().add(gamelbl20);


				gamelbl21.setOpaque(false);gamelbl21.setBorder(border);
				gamelbl21.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl21.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl21.setBackground(new Color(135, 206, 235));
				gamelbl21.setBounds(225, 165, 45, 45);
				frame.getContentPane().add(gamelbl21);
				gamelbl26.setOpaque(false);gamelbl26.setBorder(border);
				gamelbl26.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl26.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl26.setBackground(new Color(135, 206, 235));
				gamelbl26.setBounds(90, 210, 45, 45);
				frame.getContentPane().add(gamelbl26);
				gamelbl28.setOpaque(false);gamelbl28.setBorder(border);
				gamelbl28.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl28.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl28.setBackground(new Color(135, 206, 235));
				gamelbl28.setBounds(180, 210, 45, 45);
				frame.getContentPane().add(gamelbl28);
				gamelbl34.setOpaque(false);gamelbl34.setBorder(border);
				gamelbl34.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl34.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl34.setBackground(new Color(135, 206, 235));
				gamelbl34.setBounds(90, 255, 45, 45);
				frame.getContentPane().add(gamelbl34);


				gamelbl42.setOpaque(false);gamelbl42.setBorder(border);
				gamelbl42.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl42.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl42.setBackground(new Color(135, 206, 235));
				gamelbl42.setBounds(90, 300, 45, 45);
				frame.getContentPane().add(gamelbl42);

				gamelbl43.setOpaque(false);gamelbl43.setBorder(border);
				gamelbl43.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl43.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl43.setBackground(new Color(135, 206, 235));
				gamelbl43.setBounds(135, 300, 45, 45);
				frame.getContentPane().add(gamelbl43);
				gamelbl50.setOpaque(false);gamelbl50.setBorder(border);
				gamelbl50.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl50.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl50.setBackground(new Color(135, 206, 235));
				gamelbl50.setBounds(90, 345, 45, 45);
				frame.getContentPane().add(gamelbl50);
				gamelbl44.setOpaque(false);gamelbl44.setBorder(border);
				gamelbl44.setHorizontalAlignment(SwingConstants.CENTER);
				gamelbl44.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gamelbl44.setBackground(new Color(135, 206, 235));
				gamelbl44.setBounds(180, 300, 45, 45);
				frame.getContentPane().add(gamelbl44);
				
				ltrbtn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent B) {
						ltrbtn1.setEnabled(false);
						if(pos5==0)
						{
							a[pos5]='B';label1.setText("B");pos5++;
					}
						else if(pos5==1)
						{
							a[pos5]='B';label2.setText("B");pos5++;
					}
						else if(pos5==2)
						{
							a[pos5]='B';label3.setText("B");pos5++;
					}
						else if(pos5==3)
						{
							a[pos5]='B';label4.setText("B");pos5++;
					}
						else if(pos5==4)
						{
							a[pos5]='B';label5.setText("B");pos5++;
					}
						
					}
				});
				
				ltrbtn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent L) {
						ltrbtn2.setEnabled(false);
						if(pos5==0)
						{
							a[pos5]='L';label1.setText("L");pos5++;
					}
						else if(pos5==1)
						{
							a[pos5]='L';label2.setText("L");pos5++;
					}
						else if(pos5==2)
						{
							a[pos5]='L';label3.setText("L");pos5++;
					}
						else if(pos5==3)
						{
							a[pos5]='L';label4.setText("L");pos5++;
					}
						else if(pos5==4)
						{
							a[pos5]='L';label5.setText("L");pos5++;
					}
						
					}
				});
				
				ltrbtn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent A) {
						ltrbtn3.setEnabled(false);
						if(pos5==0)
						{
							a[pos5]='A';label1.setText("A");pos5++;
					}
						else if(pos5==1)
						{
							a[pos5]='A';label2.setText("A");pos5++;
					}
						else if(pos5==2)
						{
							a[pos5]='A';label3.setText("A");pos5++;
					}
						else if(pos5==3)
						{
							a[pos5]='A';label4.setText("A");pos5++;
					}
						else if(pos5==4)
						{
							a[pos5]='A';label5.setText("A");pos5++;
					}
					}
				});
				
				ltrbtn4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent C) {
						ltrbtn4.setEnabled(false);
						if(pos5==0)
						{
							a[pos5]='C';label1.setText("C");pos5++;
					}
						else if(pos5==1)
						{
							a[pos5]='C';label2.setText("C");pos5++;
					}
						else if(pos5==2)
						{
							a[pos5]='C';label3.setText("C");pos5++;
					}
						else if(pos5==3)
						{
							a[pos5]='C';label4.setText("C");pos5++;
					}
						else if(pos5==4)
						{
							a[pos5]='C';label5.setText("C");pos5++;
					}
						
					}
				});
				ltrbtn5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent K) {
						ltrbtn5.setEnabled(false);
						if(pos5==0)
						{
							a[pos5]='K';label1.setText("K");pos5++;
					}
						else if(pos5==1)
						{
							a[pos5]='K';label2.setText("K");pos5++;
					}
						else if(pos5==2)
						{
							a[pos5]='K';label3.setText("K");pos5++;
					}
						else if(pos5==3)
						{
							a[pos5]='K';label4.setText("K");pos5++;
					}
						else if(pos5==4)
						{
							a[pos5]='K';label5.setText("K");pos5++;
					}
						
					}
				});
			}
		});
		lvl5.setBounds(444, 181, 89, 23);
		
		
		
		frame.getContentPane().add(lvl5);
		ltrbtn1.setIcon(icon);
		 ltrbtn1.setHorizontalTextPosition(JButton.CENTER);
		 ltrbtn1.setVerticalTextPosition(JButton.CENTER);
		frame.getContentPane().add(ltrbtn1);
		ltrbtn2.setIcon(icon);
		 ltrbtn2.setHorizontalTextPosition(JButton.CENTER);
		 ltrbtn2.setVerticalTextPosition(JButton.CENTER);
		frame.getContentPane().add(ltrbtn2);
		ltrbtn3.setIcon(icon);
		 ltrbtn3.setHorizontalTextPosition(JButton.CENTER);
		 ltrbtn3.setVerticalTextPosition(JButton.CENTER);
		frame.getContentPane().add(ltrbtn3);
		ltrbtn4.setIcon(icon);
		 ltrbtn4.setHorizontalTextPosition(JButton.CENTER);
		 ltrbtn4.setVerticalTextPosition(JButton.CENTER);
		frame.getContentPane().add(ltrbtn4);
		ltrbtn5.setIcon(icon);
		 ltrbtn5.setHorizontalTextPosition(JButton.CENTER);
		 ltrbtn5.setVerticalTextPosition(JButton.CENTER);
		frame.getContentPane().add(ltrbtn5);
		btnCheck.setIcon(icon);
		btnCheck.setHorizontalTextPosition(JButton.CENTER);
		btnCheck.setVerticalTextPosition(JButton.CENTER);
		frame.getContentPane().add(btnCheck);
		
		btnReset.setIcon(icon);
		btnReset.setHorizontalTextPosition(JButton.CENTER);
		btnReset.setVerticalTextPosition(JButton.CENTER);
		frame.getContentPane().add(btnReset);
		
		
		
		
		
		ltrbtn1.setBackground(Color.WHITE);
		ltrbtn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ltrbtn1.setBounds(146, 451, 50, 50);
		
		frame.getContentPane().add(ltrbtn1);
		ltrbtn5.setBackground(Color.WHITE);
		ltrbtn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ltrbtn5.setBounds(146, 517, 50, 50);
		
		frame.getContentPane().add(ltrbtn5);
		ltrbtn3.setBackground(Color.WHITE);
		ltrbtn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ltrbtn3.setBounds(146, 579, 50, 50);
		
		frame.getContentPane().add(ltrbtn3);
		ltrbtn4.setBackground(Color.WHITE);
		ltrbtn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ltrbtn4.setBounds(211, 517, 50, 50);
		
		frame.getContentPane().add(ltrbtn4);
		ltrbtn2.setBackground(Color.WHITE);
		ltrbtn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ltrbtn2.setBounds(83, 517, 50, 50);
		frame.getContentPane().add(ltrbtn2);
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label1.setBounds(297, 474, 45, 45);
		
		 label1.setIcon(icon);
		 label1.setHorizontalTextPosition(JLabel.CENTER);
		 label1.setVerticalTextPosition(JLabel.CENTER);
		frame.getContentPane().add(label1);
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label2.setBounds(342, 474, 45, 45);
		 label2.setIcon(icon);
		 label2.setHorizontalTextPosition(JLabel.CENTER);
		 label2.setVerticalTextPosition(JLabel.CENTER);
		
		frame.getContentPane().add(label2);
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label3.setBounds(387, 474, 45, 45);
		 label3.setIcon(icon);
		 label3.setHorizontalTextPosition(JLabel.CENTER);
		 label3.setVerticalTextPosition(JLabel.CENTER);
		
		frame.getContentPane().add(label3);
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label4.setBounds(432, 474, 45, 45);
		 label4.setIcon(icon);
		 label4.setHorizontalTextPosition(JLabel.CENTER);
		 label4.setVerticalTextPosition(JLabel.CENTER);
		
		frame.getContentPane().add(label4);
		label5.setHorizontalAlignment(SwingConstants.CENTER);
		label5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label5.setBounds(477, 474, 45, 45);
		 label5.setIcon(icon);
		 label5.setHorizontalTextPosition(JLabel.CENTER);
		 label5.setVerticalTextPosition(JLabel.CENTER);
		 
		 gamelbl1.setIcon(icon);
		 gamelbl1.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl1.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl2.setIcon(icon);
		 gamelbl2.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl2.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl3.setIcon(icon);
		 gamelbl3.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl3.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl4.setIcon(icon);
		 gamelbl4.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl4.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl5.setIcon(icon);
		 gamelbl5.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl5.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl6.setIcon(icon);
		 gamelbl6.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl6.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl7.setIcon(icon);
		 gamelbl7.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl7.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl8.setIcon(icon);
		 gamelbl8.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl8.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl9.setIcon(icon);
		 gamelbl9.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl9.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl10.setIcon(icon);
		 gamelbl10.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl10.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl11.setIcon(icon);
		 gamelbl11.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl11.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl12.setIcon(icon);
		 gamelbl12.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl12.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl13.setIcon(icon);
		 gamelbl13.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl13.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl14.setIcon(icon);
		 gamelbl14.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl14.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl15.setIcon(icon);
		 gamelbl15.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl15.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl16.setIcon(icon);
		 gamelbl16.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl16.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl17.setIcon(icon);
		 gamelbl17.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl17.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl18.setIcon(icon);
		 gamelbl18.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl18.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl19.setIcon(icon);
		 gamelbl19.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl19.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl20.setIcon(icon);
		 gamelbl20.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl20.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl21.setIcon(icon);
		 gamelbl21.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl21.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl22.setIcon(icon);
		 gamelbl22.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl22.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl23.setIcon(icon);
		 gamelbl23.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl23.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl24.setIcon(icon);
		 gamelbl24.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl24.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl25.setIcon(icon);
		 gamelbl25.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl25.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl26.setIcon(icon);
		 gamelbl26.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl26.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl27.setIcon(icon);
		 gamelbl27.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl27.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl28.setIcon(icon);
		 gamelbl28.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl28.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl29.setIcon(icon);
		 gamelbl29.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl29.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl30.setIcon(icon);
		 gamelbl30.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl30.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl31.setIcon(icon);
		 gamelbl31.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl31.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl32.setIcon(icon);
		 gamelbl32.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl32.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl33.setIcon(icon);
		 gamelbl33.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl33.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl34.setIcon(icon);
		 gamelbl34.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl34.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl35.setIcon(icon);
		 gamelbl35.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl35.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl36.setIcon(icon);
		 gamelbl36.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl36.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl37.setIcon(icon);
		 gamelbl37.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl37.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl38.setIcon(icon);
		 gamelbl38.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl38.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl39.setIcon(icon);
		 gamelbl39.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl39.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl40.setIcon(icon);
		 gamelbl40.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl40.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl41.setIcon(icon);
		 gamelbl41.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl41.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl42.setIcon(icon);
		 gamelbl42.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl42.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl43.setIcon(icon);
		 gamelbl43.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl43.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl44.setIcon(icon);
		 gamelbl44.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl44.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl45.setIcon(icon);
		 gamelbl45.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl45.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl46.setIcon(icon);
		 gamelbl46.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl46.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl47.setIcon(icon);
		 gamelbl47.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl47.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl48.setIcon(icon);
		 gamelbl48.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl48.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl49.setIcon(icon);
		 gamelbl49.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl49.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl50.setIcon(icon);
		 gamelbl50.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl50.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl51.setIcon(icon);
		 gamelbl51.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl51.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl52.setIcon(icon);
		 gamelbl52.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl52.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl53.setIcon(icon);
		 gamelbl53.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl53.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl54.setIcon(icon);
		 gamelbl54.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl54.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl55.setIcon(icon);
		 gamelbl55.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl55.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl56.setIcon(icon);
		 gamelbl56.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl56.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl57.setIcon(icon);
		 gamelbl57.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl57.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl58.setIcon(icon);
		 gamelbl58.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl58.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl59.setIcon(icon);
		 gamelbl59.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl59.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl60.setIcon(icon);
		 gamelbl60.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl60.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl61.setIcon(icon);
		 gamelbl61.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl61.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl62.setIcon(icon);
		 gamelbl62.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl62.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl63.setIcon(icon);
		 gamelbl63.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl63.setVerticalTextPosition(JLabel.CENTER);
		 gamelbl64.setIcon(icon);
		 gamelbl64.setHorizontalTextPosition(JLabel.CENTER);
		 gamelbl64.setVerticalTextPosition(JLabel.CENTER);
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(lvlno==1)
					check1();
				else if(lvlno==2)
					check2();
				else if(lvlno==3)
					check3();
				else if(lvlno==4)
					check4();
				else if(lvlno==5)
					check5();
			}
		});
		btnCheck.setBounds(315, 554, 83, 32);
		
		frame.getContentPane().add(btnCheck);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent rs) {
				int i;
				for(i=0;i<5;i++)
					a[i]='0';label1.setText(" ");label2.setText(" ");label3.setText(" ");label4.setText(" ");label5.setText(" ");
					ptslbl.setText(String.valueOf(pts));
				if(lvlno==1)
					{pos1=0;pos2=10;ltrbtn1.setEnabled(true);ltrbtn2.setEnabled(true);ltrbtn3.setEnabled(true);ltrbtn4.setEnabled(true);ltrbtn5.setEnabled(true);}
				else if(lvlno==2)
			{pos1=10;pos2=0;ltrbtn1.setEnabled(true);ltrbtn2.setEnabled(true);ltrbtn3.setEnabled(true);ltrbtn4.setEnabled(true);ltrbtn5.setEnabled(true);}
				else if(lvlno==3)
				{pos1=10;pos2=10;pos3=0;ltrbtn1.setEnabled(true);ltrbtn2.setEnabled(true);ltrbtn3.setEnabled(true);ltrbtn4.setEnabled(true);ltrbtn5.setEnabled(true);}
				else if(lvlno==4)
				{pos1=10;pos2=10;pos3=10;pos4=0;ltrbtn1.setEnabled(true);ltrbtn2.setEnabled(true);ltrbtn3.setEnabled(true);ltrbtn4.setEnabled(true);ltrbtn5.setEnabled(true);}
				else if(lvlno==5)
				{pos1=10;pos2=10;pos3=10;pos4=10;pos5=0;ltrbtn1.setEnabled(true);ltrbtn2.setEnabled(true);ltrbtn3.setEnabled(true);ltrbtn4.setEnabled(true);ltrbtn5.setEnabled(true);}
			}
			
		});
		btnReset.setBounds(415, 554, 83, 32);
		
		frame.getContentPane().add(btnReset);
		
		
		lvlnolbl.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lvlnolbl.setHorizontalAlignment(SwingConstants.CENTER);
		lvlnolbl.setBounds(126, 11, 216, 53);
		frame.getContentPane().add(lvlnolbl);
		
		
		lblPoints1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPoints1.setBounds(444, 30, 46, 32);
		frame.getContentPane().add(lblPoints1);
		ptslbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ptslbl.setHorizontalAlignment(SwingConstants.LEFT);
		ptslbl.setBounds(487, 30, 46, 34);
		
		frame.getContentPane().add(ptslbl);
		
		
		lvl5.setBounds(444, 215, 89, 23);
		frame.getContentPane().add(lvl5);
		
		
	
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mnFile.add(mntmNewGame);
		
		mnFile.add(mntmExit);
	}
}

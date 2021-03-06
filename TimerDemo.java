 import java.awt.*;
 import java.awt.event.*;    
 import javax.swing.*; 
 import javax.swing.border.*;
 import java.util.*; 

 public class TimerDemo extends JFrame implements ActionListener {
    final static int maxtid = 60;
    final static int msPerSek = 10;   // ska egentligen vara 1000
    CircleDiagram d = new CircleDiagram(0, maxtid);
    JTextField f = new JTextField(10);
    javax.swing.Timer tim =  new javax.swing.Timer(60 * msPerSek, this);
		
   public TimerDemo() {
	  JPanel p = new JPanel();
	  setLayout(new BorderLayout());
	  add(p, BorderLayout.NORTH); add(d, BorderLayout.CENTER);
	  p.setLayout(new FlowLayout());
	  p.add(new JLabel("Antal minuter: ", JLabel.RIGHT));
	  p.add(f);
	  d.setPreferredSize(new Dimension(100,100));
	  d.setBorder(new EtchedBorder());
	  f.addActionListener(this);   
	  pack(); 
	  setVisible(true); 
	  setDefaultCloseOperation(EXIT_ON_CLOSE); 
   }
	
	public void actionPerformed(ActionEvent e) {
	    if (e.getSource() == f) {
		d.setForeground(Color.black);
		tim.stop();
		int n;
		try {
		    n = Integer.parseInt(f.getText());
		}
		catch (NumberFormatException ex) {
		    f.setText("???");
		    return;
		}
		if (n > 0 && n <= maxtid) {
		    d.setValue(n);
		    tim.start();
		}
		else
		    f.setText("???");
	    }
	    else if (e.getSource() == tim) {
		d.setValue(d.getValue()-1);
		if (d.getValue() <= 0) {
		    tim.stop();
		    d.setValue(maxtid);
		    d.setForeground(Color.red);
		    Toolkit.getDefaultToolkit().beep();
		}
	    }		 
	}
     
     public static void main(String[] arg) { 
	 new TimerDemo(); 
     } 
 }

 import java.awt.*; 
 import javax.swing.*; 

 public class CircleDiagram extends JPanel { 
   private int value, min, max;
 
   public CircleDiagram(int minimum, int maximum) { 
     if (minimum >= maximum) 
	    throw new IllegalArgumentException("Illegal minimum and maximum values"); 
     min = minimum; max = maximum; value = min;
	  setBackground(Color.white);
   } 

   public CircleDiagram() { 
     this(0, 100);         // sätt intervallet till 0..100
   } 

   public void setValue(int v) { 
     if (v < min) 
       value = min;        // för litet värde, sätt till minimum
     else if (v > max) 
       value = max;        // för stort värde, sätt till maximum
     else 
       value = v;          // värdet OK, innanför gränserna
     repaint();
   } 

   public int getValue() { 
     return value; 
   } 

   @Override
   public void paintComponent(Graphics g) { 
     super.paintComponent(g);    // ritar bakgrund
     Insets i = getInsets();     // omgivande rams utbredning 
     int w = getWidth()-i.left-i.right;  // tillgänglig bredd
     int h = getHeight()-i.top-i.bottom; // tillgänglig höjd 
     int diam = Math.min(h,w);    // cirkelns diameter 
     // beräkna startposition för omgivande rektangel 
     int x = i.left + (w-diam)/2;  
     int y = i.top  + (h-diam)/2;  
     g.drawOval(x, y, diam, diam); // rita hela cirkel ofylld
     double part = (double) (value-min) / (max-min);  
     int partFilled  = (int)(part * 360 + 0.5);    
     g.fillArc(x, y, diam, diam, 90, -partFilled); //rita medurs 
   } 
 }

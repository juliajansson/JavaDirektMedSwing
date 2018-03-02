import javax.swing.*;
import java.util.*;
import java.awt.*;

public class Spelplan extends JPanel {
    char[][] rutor = new char[3][3];

    public Spelplan() {
	for (int i = 0; i < 3; i++)
	    for (int j = 0; j < 3; j++)
		rutor[i][j] = ' ';
	setBackground(Color.white);
    }

    public char avläs(int rad, int kol) {
	return rutor[rad][kol];
    }

    public void placera(char tecken, int rad, int kol) {
	rutor[rad][kol]=tecken;
	repaint();
    }

    public void flytta(int r1, int k1, int r2, int k2) {
	rutor[r2][k2]=rutor[r1][k1];
	rutor[r1][k1]=' ';
	repaint();
    }

    public char vinst() {
	//Kolla rad
	for (int i = 0; i < 3; i++)
	    if (rutor[i][0] == rutor[i][1] && rutor[i][1] == rutor[i][2]) {
		char vinnare = avläs(i,1);
		return vinnare;
	    }
	
	//Kolla kolumn
	for (int i = 0; i < 3; i++)
	    if (rutor[0][i] == rutor[1][i] && rutor[1][i] == rutor[2][i]) {
		char vinnare = avläs(1,i);
		return vinnare;
	    }

	//Kolla diagonal
	if (rutor[0][0] == rutor[1][1] && rutor[1][1] == rutor[2][2]) {
		char vinnare = avläs(2,2);
		return vinnare;
	    }
	else if (rutor[0][2] == rutor[1][1] && rutor[1][1] == rutor[2][0]) {
		char vinnare = avläs(1,1);
		return vinnare;
	    }
	else
	    return ' ';

    }

    public void paintComponent(Graphics g) {
	super.paintComponent(g);
	int dx = getSize().width / 3;
	int dy = getSize().height / 3;
	for (int r=0; r<3; r++)
	    for (int k=0; k<3; k++) {
		g.drawRect(k*dx, r*dy, dx, dy);
		if (rutor[r][k] == 'x') {
		    g.drawLine(k*dx, r*dy, (k+1)*dx, (r+1)*dy);
		    g.drawLine((k+1)*dx, r*dy, k*dx, (r+1)*dy);
		}
		else if (rutor[r][k] == 'o')   
		    g.drawOval(k*dx, r*dy, dx, dy);
	    }    
    }
}
       

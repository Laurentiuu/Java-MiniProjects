import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class View {

	private JFrame frame = new JFrame("Calcul Polinoame");
	private JLabel label1 = new JLabel("Polinom 1: ");
	private JLabel label2 = new JLabel("Polinom 2: ");
	private JLabel label3 = new JLabel("Operatie: ");

	private JLabel l1 = new JLabel("X^5 +");
	private JLabel l2 = new JLabel("X^4 +");
	private JLabel l3 = new JLabel("X^3 +");
	private JLabel l4 = new JLabel("X^2 +");
	private JLabel l5 = new JLabel("X^1 +");
	private JLabel l6 = new JLabel("X^0");
	private JLabel l7 = new JLabel("= 0");
	private JLabel l8 = new JLabel("X^5 +");
	private JLabel l9 = new JLabel("X^4 +");
	private JLabel l10 = new JLabel("X^3 +");
	private JLabel l11 = new JLabel("X^2 +");
	private JLabel l12 = new JLabel("X^1 +");
	private JLabel l13 = new JLabel("X^0");
	private JLabel l14 = new JLabel("= 0");
	private JTextField t1 = new JTextField();
	private JTextField t2 = new JTextField();
	private JTextField t3 = new JTextField();
	private JTextField t4 = new JTextField();
	private JTextField t5 = new JTextField();
	private JTextField t6 = new JTextField();
	private JTextField t7 = new JTextField();
	private JTextField t8 = new JTextField();
	private JTextField t9 = new JTextField();
	private JTextField t10 = new JTextField();
	private JTextField t11 = new JTextField();
	private JTextField t12 = new JTextField();

	private JTextField r = new JTextField();

	private JButton b1 = new JButton("+");
	private JButton b2 = new JButton("-");
	private JButton b3 = new JButton("*");
	private JButton b4 = new JButton("'");

	View() {
		// Frame
		frame.setSize(860, 400);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.gray);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		label1.setBounds(100, 10, 150, 40);
		label1.setForeground(Color.black);
		label1.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 25));
		frame.add(label1);

		label2.setBounds(100, 50, 150, 40);
		label2.setForeground(Color.black);
		label2.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 25));
		frame.add(label2);

		label3.setBounds(140, 160, 150, 40);
		label3.setForeground(Color.black);
		label3.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 25));
		frame.add(label3);

		// Afisarea polinoamelor
		t1.setBounds(230, 20, 34, 25);
		t1.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 17));
		l1.setBounds(270, 20, 50, 25);
		l1.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 17));
		l1.setForeground(Color.black);
		frame.add(t1);
		frame.add(l1);

		t2.setBounds(315, 20, 34, 25);
		t2.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 17));
		l2.setBounds(355, 20, 50, 25);
		l2.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 17));
		l2.setForeground(Color.black);
		frame.add(t2);
		frame.add(l2);

		t3.setBounds(400, 20, 34, 25);
		t3.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 17));
		l3.setBounds(440, 20, 50, 25);
		l3.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 17));
		l3.setForeground(Color.black);
		frame.add(t3);
		frame.add(l3);

		t4.setBounds(485, 20, 34, 25);
		t4.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 17));
		l4.setBounds(525, 20, 50, 25);
		l4.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 17));
		l4.setForeground(Color.black);
		frame.add(t4);
		frame.add(l4);

		t5.setBounds(570, 20, 34, 25);
		t5.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 17));
		l5.setBounds(610, 20, 50, 25);
		l5.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 17));
		l5.setForeground(Color.black);
		frame.add(t5);
		frame.add(l5);

		t6.setBounds(655, 20, 34, 25);
		t6.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 17));
		l6.setBounds(695, 20, 50, 25);
		l6.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 17));
		l6.setForeground(Color.black);
		frame.add(t6);
		frame.add(l6);

		l7.setBounds(730, 20, 50, 25);
		l7.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 17));
		l7.setForeground(Color.black);
		frame.add(l7);

		t7.setBounds(230, 60, 34, 25);
		t7.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 17));
		l8.setBounds(270, 60, 50, 25);
		l8.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 17));
		l8.setForeground(Color.black);
		frame.add(t7);
		frame.add(l8);

		t8.setBounds(315, 60, 34, 25);
		t8.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 17));
		l9.setBounds(355, 60, 50, 25);
		l9.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 17));
		l9.setForeground(Color.black);
		frame.add(t8);
		frame.add(l9);

		t9.setBounds(400, 60, 34, 25);
		t9.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 17));
		l10.setBounds(440, 60, 50, 25);
		l10.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 17));
		l10.setForeground(Color.black);
		frame.add(t9);
		frame.add(l10);

		t10.setBounds(485, 60, 34, 25);
		t10.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 17));
		l11.setBounds(525, 60, 50, 25);
		l11.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 17));
		l11.setForeground(Color.black);
		frame.add(t10);
		frame.add(l11);

		t11.setBounds(570, 60, 34, 25);
		t11.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 17));
		l12.setBounds(610, 60, 50, 25);
		l12.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 17));
		l12.setForeground(Color.black);
		frame.add(t11);
		frame.add(l12);

		t12.setBounds(655, 60, 34, 25);
		t12.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 17));
		l13.setBounds(695, 60, 50, 25);
		l13.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 17));
		l13.setForeground(Color.black);
		frame.add(t12);
		frame.add(l13);

		l14.setBounds(730, 60, 50, 25);
		l14.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 17));
		l14.setForeground(Color.black);
		frame.add(l14);

		// Butoane
		b1.setBounds(260, 165, 50, 30);
		b1.setFont(new Font("SansSerif", Font.BOLD, 20));
		frame.add(b1);
		b2.setBounds(370, 165, 50, 30);
		b2.setFont(new Font("SansSerif", Font.BOLD, 20));
		frame.add(b2);
		b3.setBounds(480, 165, 50, 30);
		b3.setFont(new Font("SansSerif", Font.BOLD, 20));
		frame.add(b3);
		b4.setBounds(590, 165, 50, 30);
		b4.setFont(new Font("SansSerif", Font.BOLD, 20));
		frame.add(b4);
		
		//Rezultat
		r.setBounds(50, 250, 750, 80);
		r.setEditable(false);
		r.setBackground(Color.DARK_GRAY);
		r.setForeground(Color.white);
		r.setFont(new Font("SansSerif", Font.BOLD, 18));
		frame.add(r);
		frame.setVisible(true);
	}

	public JButton getB1() {
		return b1;
	}

	public JButton getB2() {
		return b2;
	}

	public JButton getB3() {
		return b3;
	}

	public JButton getB4() {
		return b4;
	}

	public int getT1() {
		if (t1.getText().isEmpty())
			return 0;
		else
			return Integer.parseInt(t1.getText());
	}

	public int getT2() {
		if (t2.getText().isEmpty())
			return 0;
		else
			return Integer.parseInt(t2.getText());
	}

	public int getT3() {
		if (t3.getText().isEmpty())
			return 0;
		else
			return Integer.parseInt(t3.getText());
	}

	public int getT4() {
		if (t4.getText().isEmpty())
			return 0;
		else
			return Integer.parseInt(t4.getText());
	}

	public int getT5() {
		if (t5.getText().isEmpty())
			return 0;
		else
			return Integer.parseInt(t5.getText());
	}

	public int getT6() {
		if (t6.getText().isEmpty())
			return 0;
		else
			return Integer.parseInt(t6.getText());
	}

	public int getT7() {
		if (t7.getText().isEmpty())
			return 0;
		else
			return Integer.parseInt(t7.getText());
	}

	public int getT8() {
		if (t8.getText().isEmpty())
			return 0;
		else
			return Integer.parseInt(t8.getText());
	}

	public int getT9() {
		if (t9.getText().isEmpty())
			return 0;
		else
			return Integer.parseInt(t9.getText());
	}

	public int getT10() {
		if (t10.getText().isEmpty())
			return 0;
		else
			return Integer.parseInt(t10.getText());
	}

	public int getT11() {
		if (t11.getText().isEmpty())
			return 0;
		else
			return Integer.parseInt(t11.getText());
	}

	public int getT12() {
		if (t12.getText().isEmpty())
			return 0;
		else
			return Integer.parseInt(t12.getText());
	}
	
	void setRez(String s) {
		this.r.setText(s);
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	void addAduareListener(ActionListener a) {
		b1.addActionListener(a);		
	}

	void addScadereListener(ActionListener a) {
		b2.addActionListener(a);
	}

	void addInmultireListener(ActionListener a) {
		b3.addActionListener(a);
	}

	void addDerivareListener(ActionListener a) {
		b4.addActionListener(a);
	}
}

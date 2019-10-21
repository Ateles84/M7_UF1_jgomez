package m7_UFone;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.awt.event.ActionEvent;

public class Pt02 extends JFrame {

	private JButton btnAfegir;
	private JButton btnQuitar;
	private JButton btnMatricular;
	private JList<String> listAlMat;
	private JList<String> listAl;
	private JTextField textNouAl;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pt02 frame = new Pt02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pt02() {
		setTitle("Pt02_jgomez");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblLlistaAlumnes = new JLabel("Llista Alumnes");

		JLabel lblAlumnesMatriculats = new JLabel("Alumnes Matriculats");

		listAl = new JList<String>(new DefaultListModel<String>());

		listAlMat = new JList<String>(new DefaultListModel<String>());

		btnMatricular = new JButton("Matricular");

		btnQuitar = new JButton("Quitar");

		JLabel lblNouAlumne = new JLabel("Nou Alumne:");

		btnAfegir = new JButton("Inscriure");
		btnAfegir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				inscriureAl();
			}
		});

		textNouAl = new JTextField();

		textNouAl.setColumns(10);

		JButton btnEliminarAl = new JButton("Eliminar alumne seleccionat");
		btnEliminarAl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				eliminarAl();
			}
		});

		btnMatricular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				matricularAl();
			}
		});
		
		btnQuitar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				desmatricularAl();
			}
		});

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(53)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGroup(gl_contentPane
								.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(
												listAl, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
										.addGap(54)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
												.addComponent(btnQuitar, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(btnMatricular, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGap(47).addComponent(listAlMat, GroupLayout.PREFERRED_SIZE, 127,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblLlistaAlumnes, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
										.addGap(230).addComponent(lblAlumnesMatriculats, GroupLayout.PREFERRED_SIZE,
												148, GroupLayout.PREFERRED_SIZE)))
								.addGap(59))
						.addGroup(gl_contentPane.createSequentialGroup().addGroup(gl_contentPane
								.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnEliminarAl, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(textNouAl, Alignment.LEADING).addGroup(Alignment.LEADING,
										gl_contentPane.createSequentialGroup().addComponent(lblNouAlumne)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnAfegir)))
								.addGap(333)))));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLlistaAlumnes, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(lblAlumnesMatriculats))
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
						gl_contentPane.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(listAl, GroupLayout.PREFERRED_SIZE, 202,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(listAlMat, GroupLayout.PREFERRED_SIZE, 202,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNouAlumne).addComponent(btnAfegir))
								.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(30).addComponent(btnMatricular)
								.addGap(18).addComponent(btnQuitar).addGap(153)))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(textNouAl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnEliminarAl).addGap(52)));
		contentPane.setLayout(gl_contentPane);
	}

	public void inscriureAl() {
		((DefaultListModel) (listAl).getModel()).addElement(textNouAl.getText());
	}

	public void eliminarAl() {
		if (listAl.getSelectedIndices().length > 0) {
			IntStream lol = Arrays.stream(listAl.getSelectedIndices());
			lol.boxed().sorted(Collections.reverseOrder())
					.forEach(i -> ((DefaultListModel) (listAl).getModel()).removeElementAt(i));
		}

		if (listAlMat.getSelectedIndices().length > 0) {
			IntStream lol = Arrays.stream(listAlMat.getSelectedIndices());
			lol.boxed().sorted(Collections.reverseOrder())
					.forEach(i -> ((DefaultListModel) (listAlMat).getModel()).removeElementAt(i));
		}
	}

	public void matricularAl() {
		IntStream lol = Arrays.stream(listAl.getSelectedIndices());
		lol.boxed().sorted(Collections.reverseOrder()).forEach(
				i -> ((DefaultListModel) (listAlMat).getModel()).addElement(listAl.getModel().getElementAt(i)));
		eliminarAl();
	}
	
	public void desmatricularAl() {
		IntStream lol = Arrays.stream(listAlMat.getSelectedIndices());
		lol.boxed().sorted(Collections.reverseOrder()).forEach(
				i -> ((DefaultListModel) (listAl).getModel()).addElement(listAlMat.getModel().getElementAt(i)));
		eliminarAl();
	}
}

package m7_UFone;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;

import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class XDD extends JFrame {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public XDD() {
		setTitle("Pt1 Joan Gomez");
		setResizable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);

		JLabel lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.gridheight = 2;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		getContentPane().add(lblNombre, gbc_lblNombre);

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridheight = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);

		JLabel lblCiudad = new JLabel("Ciudad:");
		GridBagConstraints gbc_lblCiudad = new GridBagConstraints();
		gbc_lblCiudad.anchor = GridBagConstraints.WEST;
		gbc_lblCiudad.gridheight = 2;
		gbc_lblCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_lblCiudad.gridx = 1;
		gbc_lblCiudad.gridy = 3;
		getContentPane().add(lblCiudad, gbc_lblCiudad);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Selecciona una ciudad", "Barcelona", "Madrid",
				"Valencia", "Málaga", "Sevilla", "Ourense" }));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridheight = 2;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 3;
		getContentPane().add(comboBox, gbc_comboBox);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.gridheight = 5;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 5;
		getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JLabel lblAficiones = new JLabel("Aficiones:");
		GridBagConstraints gbc_lblAficiones = new GridBagConstraints();
		gbc_lblAficiones.insets = new Insets(0, 0, 5, 5);
		gbc_lblAficiones.gridheight = 2;
		gbc_lblAficiones.gridx = 0;
		gbc_lblAficiones.gridy = 0;
		panel.add(lblAficiones, gbc_lblAficiones);

		JCheckBox chckbxGolf = new JCheckBox("Golf");
		GridBagConstraints gbc_chckbxGolf = new GridBagConstraints();
		gbc_chckbxGolf.anchor = GridBagConstraints.WEST;
		gbc_chckbxGolf.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxGolf.gridx = 0;
		gbc_chckbxGolf.gridy = 2;
		panel.add(chckbxGolf, gbc_chckbxGolf);

		JCheckBox chckbxPadel = new JCheckBox("Padel");
		GridBagConstraints gbc_chckbxPadel = new GridBagConstraints();
		gbc_chckbxPadel.anchor = GridBagConstraints.WEST;
		gbc_chckbxPadel.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxPadel.gridx = 1;
		gbc_chckbxPadel.gridy = 2;
		panel.add(chckbxPadel, gbc_chckbxPadel);

		JCheckBox chckbxTenis = new JCheckBox("Tenis");
		GridBagConstraints gbc_chckbxTenis = new GridBagConstraints();
		gbc_chckbxTenis.anchor = GridBagConstraints.WEST;
		gbc_chckbxTenis.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxTenis.gridx = 0;
		gbc_chckbxTenis.gridy = 3;
		panel.add(chckbxTenis, gbc_chckbxTenis);

		JCheckBox chckbxPetanca = new JCheckBox("Petanca");
		GridBagConstraints gbc_chckbxPetanca = new GridBagConstraints();
		gbc_chckbxPetanca.anchor = GridBagConstraints.WEST;
		gbc_chckbxPetanca.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxPetanca.gridx = 1;
		gbc_chckbxPetanca.gridy = 3;
		panel.add(chckbxPetanca, gbc_chckbxPetanca);

		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 5;
		gbc_panel_1.gridwidth = 9;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 4;
		gbc_panel_1.gridy = 5;
		getContentPane().add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_panel_1.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		JLabel lblGnero = new JLabel("Género:");
		GridBagConstraints gbc_lblGnero = new GridBagConstraints();
		gbc_lblGnero.insets = new Insets(0, 0, 5, 5);
		gbc_lblGnero.gridheight = 2;
		gbc_lblGnero.gridx = 0;
		gbc_lblGnero.gridy = 0;
		panel_1.add(lblGnero, gbc_lblGnero);

		JRadioButton rdbtnHombre = new JRadioButton("Hombre");
		GridBagConstraints gbc_rdbtnHombre = new GridBagConstraints();
		gbc_rdbtnHombre.anchor = GridBagConstraints.WEST;
		gbc_rdbtnHombre.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnHombre.gridx = 2;
		gbc_rdbtnHombre.gridy = 1;
		panel_1.add(rdbtnHombre, gbc_rdbtnHombre);

		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		GridBagConstraints gbc_rdbtnMujer = new GridBagConstraints();
		gbc_rdbtnMujer.anchor = GridBagConstraints.WEST;
		gbc_rdbtnMujer.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnMujer.gridx = 2;
		gbc_rdbtnMujer.gridy = 2;
		panel_1.add(rdbtnMujer, gbc_rdbtnMujer);

		JRadioButton rdbtnOtro = new JRadioButton("Otro");
		GridBagConstraints gbc_rdbtnOtro = new GridBagConstraints();
		gbc_rdbtnOtro.anchor = GridBagConstraints.WEST;
		gbc_rdbtnOtro.gridx = 2;
		gbc_rdbtnOtro.gridy = 3;
		panel_1.add(rdbtnOtro, gbc_rdbtnOtro);

		ButtonGroup BG = new ButtonGroup();

		BG.add(rdbtnOtro);
		BG.add(rdbtnMujer);
		BG.add(rdbtnHombre);

		JButton btnNewButton = new JButton("ENVIAR");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.gridwidth = 7;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 10;
		getContentPane().add(btnNewButton, gbc_btnNewButton);

		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if (textField.equals(""))
					JOptionPane.showMessageDialog(null, "El nombre no puede estar vacio :(", "Error",
							JOptionPane.WARNING_MESSAGE);

				else if (comboBox.getSelectedItem().toString().contentEquals("Selecciona una ciudad"))
					JOptionPane.showMessageDialog(null, "Elije una ciudad", "Error", JOptionPane.WARNING_MESSAGE);

				else if (!(rdbtnHombre.isSelected() || rdbtnMujer.isSelected() || rdbtnOtro.isSelected()))
					JOptionPane.showMessageDialog(null, "Selecciona un genero", "Error", JOptionPane.WARNING_MESSAGE);

				else {
					Secundaria lol = new Secundaria();
					lol.lblNombre.setText(lol.lblNombre.getText() + " " + textField.getText());
					lol.lblNewLabel.setText(lol.lblNewLabel.getText() + " " + comboBox.getSelectedItem().toString());
					if (chckbxGolf.isSelected())
						lol.lblAficiones.setText(lol.lblAficiones.getText() + " " + chckbxGolf.getText().toString());
					if (chckbxTenis.isSelected())
						lol.lblAficiones.setText(lol.lblAficiones.getText() + " " + chckbxTenis.getText().toString());
					if (chckbxPadel.isSelected())
						lol.lblAficiones.setText(lol.lblAficiones.getText() + " " + chckbxPadel.getText().toString());
					if (chckbxPetanca.isSelected())
						lol.lblAficiones.setText(lol.lblAficiones.getText() + " " + chckbxPetanca.getText().toString());
					if (rdbtnHombre.isSelected())
						lol.lblGenero.setText(lol.lblGenero.getText() + " " + rdbtnHombre.getText());
					if (rdbtnMujer.isSelected())
						lol.lblGenero.setText(lol.lblGenero.getText() + " " + rdbtnMujer.getText());
					if (rdbtnOtro.isSelected())
						lol.lblGenero.setText(lol.lblGenero.getText() + " " + rdbtnOtro.getText());

					lol.setVisible(true);
					dispose();
				}

			}
		});
		
		pack();
		setVisible(true);

	}

	public static void main(String[] args) {
		XDD lol = new XDD();

	}

}

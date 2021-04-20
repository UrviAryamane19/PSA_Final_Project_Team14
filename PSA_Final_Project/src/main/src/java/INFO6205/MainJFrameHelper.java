
package INFO6205;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class MainJFrameHelper {

	protected JFrame jFrame;
	protected  JFrame jFrame2;
	protected JFrame jFrame3;

	public MainJFrameHelper() {
		firstframe();
		spreadframe();
	}
	public void firstframe() {
		jFrame = new JFrame();
		jFrame.setResizable(false);
		jFrame.setSize(new Dimension(1600, 900));
		jFrame.getContentPane().setLayout(null);
		jFrame.getContentPane().setBackground(Color.WHITE);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jFrame2 = new JFrame();
		jFrame2.setResizable(false);
		jFrame2.setSize(new Dimension(1600, 900));
		jFrame2.getContentPane().setLayout(null);
		jFrame2.getContentPane().setBackground(Color.WHITE);
		jFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jFrame3 = new JFrame();
		jFrame3.setResizable(false);
		jFrame3.setSize(new Dimension(1600, 900));
		jFrame3.getContentPane().setLayout(null);
		jFrame3.getContentPane().setBackground(Color.WHITE);
		jFrame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon imageIconTwo = new ImageIcon("PSA_Final_Project/src/main/src/java/INFO6205/covidhead.jpg");
		Image imageHeader = imageIconTwo.getImage();
		Image newimg1 = imageHeader.getScaledInstance(1200, 250,  Image.SCALE_SMOOTH);
		imageIconTwo = new ImageIcon(newimg1);
		JLabel virus1 = new JLabel();
		virus1.setBounds(100,1,1200,250);
		virus1.setIcon(imageIconTwo);
		jFrame.getContentPane().add(virus1);

		JLabel covLabel = new JLabel("Stay Informed, Stay Safe !");
		covLabel.setBounds(50,170,1300,300);
		covLabel.setFont (covLabel.getFont ().deriveFont (60.0f));
		covLabel.setHorizontalAlignment(JLabel.CENTER);
		covLabel.setForeground(Color.RED);
		jFrame.getContentPane().add(covLabel);

		ImageIcon imageIconOne = new ImageIcon("PSA_Final_Project/src/main/src/java/INFO6205/covid.jpg");
		Image image = imageIconOne.getImage();
		Image newimg = image.getScaledInstance(300, 300,  Image.SCALE_SMOOTH);
		imageIconOne = new ImageIcon(newimg);
		JLabel virus = new JLabel();
		virus.setBounds(300,380,400,300);
		virus.setIcon(imageIconOne);
		jFrame.getContentPane().add(virus);


		JToggleButton viewGraphs = new JToggleButton("View Graphs for SARS-COV");
		viewGraphs.setEnabled(false);
		viewGraphs.setBounds(720, 630, 250, 20);
		jFrame.getContentPane().add(viewGraphs);
		viewGraphs.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent eve) {
				if (viewGraphs.isSelected()) {
					jFrame2.setVisible(true);
				}
				else
					jFrame2.setVisible(false);
			}
		});

		JToggleButton viewGraphs1 = new JToggleButton("View Graphs for SARS-COV2");
		viewGraphs1.setEnabled(false);
		viewGraphs1.setBounds(720, 660, 250, 20);
		jFrame.getContentPane().add(viewGraphs1);
		viewGraphs1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent eve) {
				if (viewGraphs1.isSelected()) {
					jFrame3.setVisible(true);
				}
				else
					jFrame3.setVisible(false);
			}
		});

		JLabel label3 = new JLabel("Graphs for SARS-COV ");
		label3.setBounds(400,15, 700, 70);
		label3.setFont (covLabel.getFont ().deriveFont (50.0f));
		label3.setHorizontalAlignment(JLabel.CENTER);
		label3.setForeground(Color.RED);
		jFrame2.getContentPane().add(label3);

		JLabel label = new JLabel( );
		label.setBounds(5, 110, 500,300);
		label.setIcon(new ImageIcon("PSA_Final_Project/src/main/src/java/INFO6205/sarscov.PNG"));
		jFrame2.getContentPane().add(label);

		JLabel labelimg1 = new JLabel( );
		labelimg1.setBounds(5, 440, 500,300);
		labelimg1.setIcon(new ImageIcon("PSA_Final_Project/src/main/src/java/INFO6205/sarscov_afterlockdown.PNG"));
		jFrame2.getContentPane().add(labelimg1);

		JLabel labelimg2 = new JLabel( );
		labelimg2.setBounds(520, 110, 500,300);
		labelimg2.setIcon(new ImageIcon("PSA_Final_Project/src/main/src/java/INFO6205/sarscov_aftermaks.PNG"));
		jFrame2.getContentPane().add(labelimg2);

		JLabel labelimg3 = new JLabel( );
		labelimg3.setBounds(520, 440, 500,300);
		labelimg3.setIcon(new ImageIcon("PSA_Final_Project/src/main/src/java/INFO6205/sarscov_afterquarantine.PNG"));
		jFrame2.getContentPane().add(labelimg3);

		JLabel labelimg4 = new JLabel( );
		labelimg4.setBounds(1035, 110, 500,300);
		labelimg4.setIcon(new ImageIcon("PSA_Final_Project/src/main/src/java/INFO6205/sarscov_aftersociald.PNG"));
		jFrame2.getContentPane().add(labelimg4);

		JLabel labelimg5 = new JLabel( );
		labelimg5.setBounds(1035, 440, 500,300);
		labelimg5.setIcon(new ImageIcon("PSA_Final_Project/src/main/src/java/INFO6205/sarscov_aftervaccine.PNG"));
		jFrame2.getContentPane().add(labelimg5);

		JLabel label4 = new JLabel("Graphs for SARS-COV2");
		label4.setBounds(400,15, 700, 70);
		label4.setFont (covLabel.getFont ().deriveFont (50.0f));
		label4.setHorizontalAlignment(JLabel.CENTER);
		label4.setForeground(Color.RED);
		jFrame3.getContentPane().add(label4);

		JLabel labelimg6 = new JLabel( );
		labelimg6.setBounds(5, 110, 500,300);
		labelimg6.setIcon(new ImageIcon("PSA_Final_Project/src/main/src/java/INFO6205/sarscov2.png"));
		jFrame3.getContentPane().add(labelimg6);

		JLabel labelimg7 = new JLabel( );
		labelimg7.setBounds(5, 440, 500,300);
		labelimg7.setIcon(new ImageIcon("PSA_Final_Project/src/main/src/java/INFO6205/sarscov2_lockdown.png"));
		jFrame3.getContentPane().add(labelimg7);

		JLabel labelimg8 = new JLabel( );
		labelimg8.setBounds(520, 110, 500,300);
		labelimg8.setIcon(new ImageIcon("PSA_Final_Project/src/main/src/java/INFO6205/sarscov2_mask.png"));
		jFrame3.getContentPane().add(labelimg8);

		JLabel labelimg9 = new JLabel( );
		labelimg9.setBounds(520, 440, 500,300);
		labelimg9.setIcon(new ImageIcon("PSA_Final_Project/src/main/src/java/INFO6205/sarscov2_quarantine.png"));
		jFrame3.getContentPane().add(labelimg9);

		JLabel labelimg10 = new JLabel( );
		labelimg10.setBounds(1035, 110, 500,300);
		labelimg10.setIcon(new ImageIcon("PSA_Final_Project/src/main/src/java/INFO6205/sarscov2_socialdist.png"));
		jFrame3.getContentPane().add(labelimg10);

		JLabel labelimg11 = new JLabel( );
		labelimg11.setBounds(1035, 440, 500,300);
		labelimg11.setIcon(new ImageIcon("PSA_Final_Project/src/main/src/java/INFO6205/sarscov2_vaccine.png"));
		jFrame3.getContentPane().add(labelimg11);

		JToggleButton initiate_vaccination = new JToggleButton("Initiate vaccination");
		initiate_vaccination.setEnabled(false);
		initiate_vaccination.setBounds(720, 600, 250, 20);
		jFrame.getContentPane().add(initiate_vaccination);
		initiate_vaccination.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent eve) {
				if (initiate_vaccination.isSelected())
					SimulationValues.vaccine = true;
				else
					SimulationValues.vaccine = false;
			}
		});

		JComboBox<String> typeOfVirus = new JComboBox<>();
		typeOfVirus.setModel(new DefaultComboBoxModel<String>(new String[] {"SARS-CoV", "SARS-CoV-2"}));
		typeOfVirus.setSelectedIndex(0);
		typeOfVirus.setBounds(770, 390, 146, 22);
		jFrame.getContentPane().add(typeOfVirus);

		JToggleButton stopbutton = new JToggleButton("Stop");
		stopbutton.setEnabled(false);
		stopbutton.setBounds(840, 450, 70, 20);
		jFrame.add(stopbutton);
		stopbutton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent eve) {
				DemoHelper.endSim();
			}
		});

		JToggleButton startbutton = new JToggleButton("Start");
		startbutton.setEnabled(false);
		startbutton.setBounds(765, 450, 70, 20);
		jFrame.add(startbutton);
		startbutton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent eve) {
				if (startbutton.isSelected()) {
					startbutton.setText("Pause");
					DemoHelper.count1 = true;
				}
				else  {
					startbutton.setText("Start");
					DemoHelper.count1 = false;
				}
			}
		});

		JToggleButton lockdown_button = new JToggleButton("Initiate Lockdown");
		lockdown_button.setEnabled(false);
		lockdown_button.setBounds(720, 480, 250, 20);
		jFrame.getContentPane().add(lockdown_button);
		lockdown_button.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent eve) {
				if (lockdown_button.isSelected()) {
					SimulationValues.lockdown =true;
					DisplaySpreadHelper.displaySpreadHelper.lockdownPlace(DisplaySpreadHelper.place1);
				}
				else {
					SimulationValues.lockdown =false;
					DisplaySpreadHelper.displaySpreadHelper.removeLockdown(DisplaySpreadHelper.place1);
				}
			}
		});

		JToggleButton trackingToQuarantine = new JToggleButton("Start Quarantine");
		trackingToQuarantine.setEnabled(false);
		trackingToQuarantine.setBounds(720, 510, 250, 20);
		jFrame.getContentPane().add(trackingToQuarantine);
		trackingToQuarantine.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent eve) {
				if (trackingToQuarantine.isSelected())
					SimulationValues.contactTrace = true;
				else
					SimulationValues.contactTrace = false;
			}
		});

		JToggleButton socialDistanceButton = new JToggleButton("Initiate Social Distancing");
		socialDistanceButton.setEnabled(false);
		socialDistanceButton.setBounds(720, 540, 250, 20);
		jFrame.getContentPane().add(socialDistanceButton);
		socialDistanceButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent eve) {
				if (socialDistanceButton.isSelected())
					SimulationValues.socialDistance = true;
				else
					SimulationValues.socialDistance = false;
			}
		});

		JToggleButton maskButton = new JToggleButton("Apply Mask");
		maskButton.setEnabled(false);
		maskButton.setBounds(720, 570, 250, 20);
		jFrame.getContentPane().add(maskButton);
		maskButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent eve) {
				if (maskButton.isSelected())
					SimulationValues.mask = true;
				else
					SimulationValues.mask = false;
			}
		});

		JToggleButton runButton = new JToggleButton("Run");
		runButton.setBounds(790, 420, 100, 20);
		jFrame.getContentPane().add(runButton);
		runButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				SimulationValues.typeOfVirus = (String) typeOfVirus.getSelectedItem();
				typeOfVirus.setEnabled(false);
				runButton.setEnabled(false);
				socialDistanceButton.setEnabled(true);
				trackingToQuarantine.setEnabled(true);
				lockdown_button.setEnabled(true);
				stopbutton.setEnabled(true);
				startbutton.setEnabled(true);
				maskButton.setEnabled(true);
				viewGraphs.setEnabled(true);
				viewGraphs1.setEnabled(true);
				initiate_vaccination.setEnabled(true);
				SimulationValues.start12 =true;
			}
		});
	}

	public void spreadframe() {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				jFrame.setVisible(true);
			}
		});

	}
}
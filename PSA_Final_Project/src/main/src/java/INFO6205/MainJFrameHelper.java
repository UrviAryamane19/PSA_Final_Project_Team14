
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

	public MainJFrameHelper() {
		firstframe();
		spreadframe();
	}
	public void firstframe() {
		jFrame = new JFrame();
		jFrame.setResizable(false);
		jFrame.setSize(new Dimension(1400, 800));
		jFrame.getContentPane().setLayout(null);
		jFrame.getContentPane().setBackground(Color.WHITE);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jFrame2 = new JFrame();
		jFrame2.setResizable(false);
		jFrame2.setSize(new Dimension(1400, 800));
		jFrame2.getContentPane().setLayout(null);
		jFrame2.getContentPane().setBackground(Color.WHITE);
		jFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel covLabel = new JLabel("COVID - 19 Simulator !");
		covLabel.setBounds(10,50,1400,300);
		covLabel.setFont (covLabel.getFont ().deriveFont (105.0f));
		covLabel.setHorizontalAlignment(JLabel.CENTER);
		covLabel.setForeground(Color.RED);
		jFrame.getContentPane().add(covLabel);

		ImageIcon imageIconOne = new ImageIcon("/Users/rahul-bhiwande/Downloads/covid.png");
		Image image = imageIconOne.getImage();
		Image newimg = image.getScaledInstance(400, 300,  Image.SCALE_SMOOTH);
		imageIconOne = new ImageIcon(newimg);
		JLabel virus = new JLabel();
		virus.setBounds(130,270,400,300);
		virus.setIcon(imageIconOne);
		jFrame.getContentPane().add(virus);


		JToggleButton viewGraphs = new JToggleButton("View Graphs");
		viewGraphs.setEnabled(false);
		viewGraphs.setBounds(610, 515, 250, 20);
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

		JComboBox<String> typeOfVirus = new JComboBox<>();
		typeOfVirus.setModel(new DefaultComboBoxModel<String>(new String[] {"SARS-CoV", "SARS-CoV-2"}));
		typeOfVirus.setSelectedIndex(0);
		typeOfVirus.setBounds(660, 300, 146, 22);
		jFrame.getContentPane().add(typeOfVirus);

		JLabel label3 = new JLabel("Graph before ");
		label3.setBounds(25,290, 700, 14);
		jFrame2.getContentPane().add(label3);

		JLabel label = new JLabel( );
		label.setBounds(25, 300, 750,450);
		label.setIcon(new ImageIcon("src/main/src/java/INFO6205/SarsGraph.png"));
		jFrame2.getContentPane().add(label);

		JLabel label4 = new JLabel("Graphs After");
		label4.setBounds(700,290, 1000, 14);
		jFrame2.getContentPane().add(label4);

		JLabel label5 = new JLabel( );
		label5.setBounds(700, 300, 750,450);
		label5.setIcon(new ImageIcon("src/main/src/java/INFO6205/SarsGraph2.png"));
		jFrame2.getContentPane().add(label5);

		JToggleButton stopbutton = new JToggleButton("Stop");
		stopbutton.setEnabled(false);
		stopbutton.setBounds(735, 355, 70, 20);
		jFrame.add(stopbutton);
		stopbutton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent eve) {
				DemoHelper.endSim();
			}
		});

		JToggleButton startbutton = new JToggleButton("Start");
		startbutton.setEnabled(false);
		startbutton.setBounds(660, 355, 70, 20);
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
		lockdown_button.setBounds(610, 395, 250, 20);
		jFrame.getContentPane().add(lockdown_button);
		lockdown_button.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent eve) {
				if (lockdown_button.isSelected()) {
					SimulationValues.lockdownplace1 =true;
					DisplaySpreadHelper.displaySpreadHelper.lockdownPlace(DisplaySpreadHelper.place1);
				}
				else {
					SimulationValues.lockdownplace1 =false;
					DisplaySpreadHelper.displaySpreadHelper.removeLockdown(DisplaySpreadHelper.place1);
				}
			}
		});

		JToggleButton trackingToQuarantine = new JToggleButton("Start Quarantine");
		trackingToQuarantine.setEnabled(false);
		trackingToQuarantine.setBounds(610, 425, 250, 20);
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
		socialDistanceButton.setBounds(610, 455, 250, 20);
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
		maskButton.setBounds(610, 485, 250, 20);
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
		runButton.setBounds(680, 330, 100, 20);
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
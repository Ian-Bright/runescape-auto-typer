import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;

import java.awt.AWTException;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingWorker;
import javax.swing.JLabel;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.ButtonGroup;

import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;

public class AutoTyperFrame {

    private JFrame frame;
    private JTextField timeDelay;
    private JTextField textChoice;
    private JButton btnStart;
    private JButton btnStop;
    private int time;
    private String milli;
    private String sec;
    JComboBox<String> comboBox;
    HashMap<JRadioButton, String> effectMap;
    HashMap<JRadioButton, String> colorMap;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AutoTyperFrame window = new AutoTyperFrame();
                    window.frame.setTitle("AutoTyper");
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public AutoTyperFrame() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 550, 341);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        btnStart = new JButton("Start");

        btnStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == btnStart) {
                    run();

                }
            }
        });


        btnStart.setBounds(102, 262, 117, 29);
        frame.getContentPane().add(btnStart);

        btnStop = new JButton("Stop");
        btnStop.setBounds(293, 262, 117, 29);
        frame.getContentPane().add(btnStop);

        JLabel lblEnterTheAmount = new JLabel("Time delay: ");
        lblEnterTheAmount.setBounds(306, 11, 75, 16);
        frame.getContentPane().add(lblEnterTheAmount);

        timeDelay = new JTextField();
        timeDelay.setBounds(303, 34, 130, 26);
        frame.getContentPane().add(timeDelay);
        timeDelay.setColumns(10);

        JLabel lblEnterWhatYou = new JLabel("Enter what you would like to type out: ");
        lblEnterWhatYou.setBounds(10, 11, 229, 16);
        frame.getContentPane().add(lblEnterWhatYou);

        textChoice = new JTextField();
        textChoice.setBounds(6, 34, 278, 26);
        frame.getContentPane().add(textChoice);
        textChoice.setColumns(10);
       
        comboBox = new JComboBox();
        comboBox.setBounds(441, 34, 69, 26);
        milli = "ms";
        sec = "s";
        comboBox.addItem(milli);
        comboBox.addItem(sec);
        frame.getContentPane().add(comboBox);
        
        JLabel text_effects = new JLabel("Text Effects: ");
        text_effects.setBounds(10, 71, 109, 14);
        frame.getContentPane().add(text_effects);
        
        JLabel color = new JLabel("Color: ");
        color.setBounds(306, 71, 46, 14);
        frame.getContentPane().add(color);
        
        
        
        // Button that make up the color section
        
        JRadioButton yellow_button = new JRadioButton("Yellow");
        yellow_button.setBounds(301, 92, 109, 23);
        frame.getContentPane().add(yellow_button);
        
        JRadioButton red_button = new JRadioButton("Red");
        red_button.setBounds(301, 118, 109, 23);
        frame.getContentPane().add(red_button);
        
        JRadioButton green_button = new JRadioButton("Green");
        green_button.setBounds(301, 144, 109, 23);
        frame.getContentPane().add(green_button);
        
        JRadioButton cyan_button = new JRadioButton("Cyan");
        cyan_button.setBounds(301, 167, 109, 23);
        frame.getContentPane().add(cyan_button);
        
        JRadioButton purple_button = new JRadioButton("Purple");
        purple_button.setBounds(301, 193, 109, 23);
        frame.getContentPane().add(purple_button);
        
        JRadioButton flash_1_button = new JRadioButton("Flash 1");
        flash_1_button.setBounds(407, 92, 103, 23);
        frame.getContentPane().add(flash_1_button);
        
        JRadioButton flash_2_button = new JRadioButton("Flash 2");
        flash_2_button.setBounds(407, 118, 98, 23);
        frame.getContentPane().add(flash_2_button);
        
        JRadioButton flash_3_button = new JRadioButton("Flash 3");
        flash_3_button.setBounds(407, 144, 109, 23);
        frame.getContentPane().add(flash_3_button);
        
        JRadioButton glow_1_button = new JRadioButton("Glow 1");
        glow_1_button.setBounds(407, 167, 109, 23);
        frame.getContentPane().add(glow_1_button);
        
        JRadioButton glow_2_button = new JRadioButton("Glow 2");
        glow_2_button.setBounds(407, 193, 103, 23);
        frame.getContentPane().add(glow_2_button);
        
        JRadioButton glow_3_button = new JRadioButton("Glow 3");
        glow_3_button.setBounds(407, 219, 109, 23);
        frame.getContentPane().add(glow_3_button);
        
        JRadioButton no_color_button = new JRadioButton("None");
        no_color_button.setBounds(301, 219, 109, 23);
        frame.getContentPane().add(no_color_button);
        
        
        
        // Button that make up the text effect group 
        
        JRadioButton wave_1_button = new JRadioButton("Wave");
        wave_1_button.setBounds(10, 92, 109, 23);
        frame.getContentPane().add(wave_1_button);
        
        JRadioButton wave_2_button = new JRadioButton("Wave 2");
        wave_2_button.setBounds(10, 118, 109, 23);
        frame.getContentPane().add(wave_2_button);
        
        JRadioButton shake_button = new JRadioButton("Shake");
        shake_button.setBounds(10, 144, 109, 23);
        frame.getContentPane().add(shake_button);
        
        JRadioButton slide_button = new JRadioButton("Slide");
        slide_button.setBounds(116, 92, 103, 23);
        frame.getContentPane().add(slide_button);
        
        JRadioButton scroll_button = new JRadioButton("Scroll");
        scroll_button.setBounds(115, 118, 83, 23);
        frame.getContentPane().add(scroll_button);
        
        JRadioButton no_effects_button = new JRadioButton("None");
        no_effects_button.setBounds(115, 144, 83, 23);
        frame.getContentPane().add(no_effects_button);
        
        // Create and initialize button group for text colors
        
        ButtonGroup color_group = new ButtonGroup();
        color_group.add(yellow_button);
        color_group.add(red_button);
        color_group.add(green_button);
        color_group.add(cyan_button);
        color_group.add(purple_button);
        color_group.add(flash_1_button);
        color_group.add(flash_2_button);
        color_group.add(flash_3_button);
        color_group.add(glow_1_button);
        color_group.add(glow_2_button);
        color_group.add(glow_3_button);
        color_group.add(no_color_button);
        
        // Create and initialize button group for text effects
        
        ButtonGroup effects_group = new ButtonGroup();
        effects_group.add(wave_1_button);
        effects_group.add(wave_2_button);
        effects_group.add(shake_button);
        effects_group.add(slide_button);
        effects_group.add(scroll_button);
        effects_group.add(no_effects_button);
        
        // Initialize color map and add respective buttons to map
        
        colorMap = new HashMap<JRadioButton, String>();
        
        colorMap.put(yellow_button, "yellow:");
        colorMap.put(red_button, "red:");
        colorMap.put(green_button, "green:");
        colorMap.put(cyan_button, "cyan:");
        colorMap.put(purple_button, "purple:");
        colorMap.put(flash_1_button, "flash1:");
        colorMap.put(flash_2_button, "flash2:");
        colorMap.put(flash_3_button, "flash3:");
        colorMap.put(glow_1_button, "glow1:");
        colorMap.put(glow_2_button, "glow2:");
        colorMap.put(glow_3_button, "glow3:");
        colorMap.put(no_color_button, "");
        
     // Initialize effect map and add respective buttons to map
        
        effectMap = new HashMap<JRadioButton, String>();
        
        effectMap.put(wave_1_button, "wave:");
        effectMap.put(wave_2_button, "wave2:");
        effectMap.put(shake_button, "shake:");
        effectMap.put(slide_button, "slide:");
        effectMap.put(scroll_button, "scroll:");
        effectMap.put(no_effects_button, "");
                       
    }
    
    /**
     * Helper method to get active text effect of buttons selected.
     */
    private String getTextEffect()  {
    	for(Map.Entry<JRadioButton, String> pair: effectMap.entrySet()) {
    		if(pair.getKey().isSelected()) return pair.getValue();
    	}
    	return "";
    }
    
    /**
     * Helper method to get active text colors of buttons selected.
     */
    private String getTextColor()  {
    	for(Map.Entry<JRadioButton, String> pair: colorMap.entrySet()) {
    		if(pair.getKey().isSelected()) return pair.getValue();
    	}
    	return "";
    }
    
    
    /**
     * Run Auto Typer in background thread.
     */
    private void run() {
        SwingWorker<Void, Void> worker = new SwingWorker<Void,Void>(){

            @Override
            protected Void doInBackground() throws Exception {
            	String text = textChoice.getText();
            	String textEffect = getTextEffect();
            	String textColor = getTextColor();
                boolean firstIteration = true;
                while(true) {

                    if(firstIteration) {
                        Thread.sleep(2000);
                        AutoTyper.typeString(textColor + textEffect + text);
                        firstIteration = false;
                    }
                    if(comboBox.getSelectedItem() == milli) {
                    time = Integer.parseInt(timeDelay.getText());
                    }
                    else {
                        time = Integer.parseInt(timeDelay.getText()) * 1000;
                    }
                    Thread.sleep(time);
                    AutoTyper.typeString(textColor + textEffect + text);

                }
            }

        };
        worker.execute();
        btnStop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                // Stop the swing worker thread
                worker.cancel(true);
            }
        });

    }
}

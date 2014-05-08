import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import java.awt.*;
import java.io.*;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.Writer;

public class Interface{
    private JFrame f; //Main frame
    private JTextArea ta; // Text area
	private JScrollPane sbrText; // Scroll pane for text area
    private JButton btnQuit; // Quit Program
    private JButton btnOpen; // Quit Program
    private JTextPane tp;
    
    public parseFeature featureParser;
    public Interface(){ //Constructor
        // Create Frame
        f = new JFrame("Swing Demo");
		f.getContentPane().setLayout(new FlowLayout());
        
        // Create Scrolling Text Area in Swing
//        ta = new JTextArea("", 50, 50);
//		ta.setLineWrap(true);
		
		tp = new JTextPane();
        tp.setBounds( 0, 0, 500, 500 );  
		
		sbrText = new JScrollPane(tp);
		sbrText.setPreferredSize( new Dimension( 500, 500 ) );  
		sbrText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
		// Create Quit Button
//        btnQuit = new JButton("Quit");
//        btnQuit.addActionListener(
//			new ActionListener(){
//				public void actionPerformed(ActionEvent e){
//					System.exit(0);         
//				}
//			}
//		);
        
        btnOpen = new JButton("Open");
        btnOpen.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					JFileChooser openFile = new JFileChooser();
	                openFile.showOpenDialog(null);
	                File file = openFile.getSelectedFile();
					String filePath = file.getPath();
	                System.out.println(filePath);
					
					String output = "";
					
					
					
					System.out.println(filePath);
				       try{
				            BufferedReader br = new BufferedReader(new FileReader(filePath));
				            String line = null;

				            while ((line = br.readLine()) != null ){
				            	output = output+line + "\n";			            			            
				            

				            }
				            String userFeature = featureParser.getUserFeature(output);
				            output = featureParser.query(userFeature);
				            
				            try {
				    	    	Writer out = new BufferedWriter(new OutputStreamWriter(
				    					 new FileOutputStream("output.txt"), "UTF-8"));
				    	    	out.write(output);
				    	    	out.close();
				    	    }
				    	    catch(Exception e2){
				    	    	//do nothing
				    	    }
				            
				            
				       } catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
				       finally{
				    	   
				       }
				       
				       SimpleAttributeSet green = new SimpleAttributeSet();
						StyleConstants.setFontFamily(green, "Courier New Italic");
						StyleConstants.setForeground(green, Color.GREEN);
						
						SimpleAttributeSet blue = new SimpleAttributeSet();
						StyleConstants.setFontFamily(blue, "Courier New Italic");
						StyleConstants.setForeground(blue, Color.BLUE);
						
						Boolean whichColor = false;
						try{
				            BufferedReader br = new BufferedReader(new FileReader("/home/cloudera/workspace/JobSeeker/output.txt"));
				            String line = null;

				            while ((line = br.readLine()) != null ){
				            	output = output+line + "\n";				            	

				            	line = line.replace("<li>", "");
				            	line = line.replace("</li>", "");
				            	line = line.replace("<strong>", "");
				            	line = line.replace("</strong>", "");
				            	line = line.replace("<br>", "");
				            	line = line.replace("</br>", "");
				            	line = line.replace("<ul>", "");
				            	line = line.replace("</ul>", "");
				            	line = line.replace("<p>", "");
				            	line = line.replace("</p>", "");
				            	line = line.replace("锟斤拷", "");
				            	line = line.replace("��", "");
				            	line = line.replace("?", "");


				            	if (whichColor == false){
					            	tp.getDocument().insertString(0,line + "\n"+"\n", green);
					            	whichColor = true;
				            	}
				            	else{
					            	tp.getDocument().insertString(0,line + "\n"+"\n", blue);
					            	whichColor = false;
				            	}
				            }

				            }
				            catch (FileNotFoundException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (BadLocationException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						       finally{
						    	   
						       }
						
					
//				   ta.setText(output);
//					String filePath = openFile.getFilterPath() + "/"+dialog.getFileName();
				}
			}
		);
        
    }

    public void launchFrame(){ // Create Layout
        // Add text area and button to frame
		f.getContentPane().add(sbrText);
        f.getContentPane().add(btnOpen);
		
		 // Close when the close button is clicked
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Display Frame
        f.pack(); // Adjusts frame to size of components
        f.setVisible(true);
    }
    
//    public static void main(String args[]){
//        Interface gui = new Interface();
//        gui.launchFrame();
//    }
}
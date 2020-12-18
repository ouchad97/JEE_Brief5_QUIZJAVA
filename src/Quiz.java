import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

@SuppressWarnings("serial")
public class Quiz extends JFrame{
//HOUSSNI OUCHAD
	
	
	//
	//
	//
	public int points=0;
	private JFrame frame;
	private JPanel panel1, panel2, panel3;
	private GridLayout experimentLayout; 
	private JLabel Label1;
	private ButtonGroup G;
	private JRadioButton /*Radio Buttons niveau 1*/
						 Radio1_nv1_Qst1, Radio2_nv1_Qst1, Radio3_nv1_Qst1, 
	 					 Radio1_nv1_Qst2, Radio2_nv1_Qst2, Radio3_nv1_Qst2,
	 					 Radio1_nv1_Qst3, Radio2_nv1_Qst3, Radio3_nv1_Qst3,
	 					 Radio1_nv1_Qst4, Radio2_nv1_Qst4,
	 					 Radio1_nv1_Qst5, Radio2_nv1_Qst5, Radio3_nv1_Qst5, 
	 					 /*Radio Buttons niveau 2*/
	 					 Radio1_nv2_Qst1, Radio2_nv2_Qst1, Radio3_nv2_Qst1, 
	 					 Radio1_nv2_Qst2, Radio2_nv2_Qst2, Radio3_nv2_Qst2,
	 					 Radio1_nv2_Qst3, Radio2_nv2_Qst3,
	 					 Radio1_nv2_Qst4, Radio2_nv2_Qst4, Radio3_nv2_Qst4,
	 					 Radio1_nv2_Qst5, Radio2_nv2_Qst5, Radio3_nv2_Qst5,
						 /*Radio Buttons niveau 3*/
	 					 Radio1_nv3_Qst1, Radio2_nv3_Qst1, Radio3_nv3_Qst1,
	 					 Radio1_nv3_Qst2, Radio2_nv3_Qst2,
	 					 Radio1_nv3_Qst3, Radio2_nv3_Qst3,
	 					 Radio1_nv3_Qst4, Radio2_nv3_Qst4,
	 					 Radio1_nv3_Qst5, Radio2_nv3_Qst5, Radio3_nv3_Qst5;
	private JButton BtnValider1, BtnValider2, BtnValider3;
	//
	//
	//
	public Quiz() { // Debut constructeur
		//
		//
		//
		//						/*************************************************************************/
		//						/*************************       Niveau 1       **************************/
		//						/*************************************************************************/
		//
		//
		//
		super("Quiz");
		  frame = new JFrame();
		  
	/*Panel*/
		  panel1 = new JPanel();
	      
	/*Grid Layout*/
		experimentLayout = new GridLayout(0,4);
		panel1.setLayout(experimentLayout);
		
	/*Question 1*/
	//Label
		Label1= new JLabel("1- JAVA est un langage : ");
		panel1.add(Label1);
	//RadioButtons
		Radio1_nv1_Qst1=new JRadioButton("Compilé");
		panel1.add(Radio1_nv1_Qst1);
		//
		Radio2_nv1_Qst1=new JRadioButton("Interprété");
		panel1.add(Radio2_nv1_Qst1);
		//
		Radio3_nv1_Qst1=new JRadioButton("Compilé et interpreté");
		panel1.add(Radio3_nv1_Qst1);
		//
		G = new ButtonGroup();
		G.add(Radio1_nv1_Qst1);
		G.add(Radio2_nv1_Qst1);
		G.add(Radio3_nv1_Qst1);
		
	/*Question2*/
	//Label
		Label1= new JLabel("2- Toutes les classes héritent de la classe : ");
		panel1.add(Label1);
	//RadioButtons
		Radio1_nv1_Qst2=new JRadioButton("Main");
		panel1.add(Radio1_nv1_Qst2);
		//
		Radio2_nv1_Qst2=new JRadioButton("Object");
		panel1.add(Radio2_nv1_Qst2);
		//
		Radio3_nv1_Qst2=new JRadioButton("AWT");
		panel1.add(Radio3_nv1_Qst2);
		//
		G = new ButtonGroup();
		G.add(Radio1_nv1_Qst2);
		G.add(Radio2_nv1_Qst2);
		G.add(Radio3_nv1_Qst2);
	
	/*Question3*/
	//Label
		Label1= new JLabel("3- Par convention une classe : ");
		panel1.add(Label1);
	//RadioButtons
		Radio1_nv1_Qst3=new JRadioButton("est en minuscule");
		panel1.add(Radio1_nv1_Qst3);
		//
		Radio2_nv1_Qst3=new JRadioButton("commence par une majuscule");
		panel1.add(Radio2_nv1_Qst3);
		//
		Radio3_nv1_Qst3=new JRadioButton("est en majuscules");
		panel1.add(Radio3_nv1_Qst3);
		//
		G = new ButtonGroup();
		G.add(Radio1_nv1_Qst3);
		G.add(Radio2_nv1_Qst3);
		G.add(Radio3_nv1_Qst3);
		
	/*Question4*/
	//Label
		Label1= new JLabel("4- Est-ce que on peut avoir plusieurs constructeurs pour la même classe : ");
		panel1.add(Label1);
	//RadioButtons
		Radio1_nv1_Qst4=new JRadioButton("oui");
		panel1.add(Radio1_nv1_Qst4);
		//
		Radio2_nv1_Qst4=new JRadioButton("non");
		panel1.add(Radio2_nv1_Qst4);
		//label vide
		Label1= new JLabel("");
		panel1.add(Label1);
		//
		G = new ButtonGroup();
		G.add(Radio1_nv1_Qst4);
		G.add(Radio2_nv1_Qst4);
		
	/*Question5*/
	//Label
		Label1= new JLabel("5- Dans la ligne \"public class A implements B\", B est : : ");
		panel1.add(Label1);
	//RadioButtons
		Radio1_nv1_Qst5=new JRadioButton("Interfacce");
		panel1.add(Radio1_nv1_Qst5);
		//
		Radio2_nv1_Qst5=new JRadioButton("Classe parent");
		panel1.add(Radio2_nv1_Qst5);
		//
		Radio3_nv1_Qst5=new JRadioButton("Package");
		panel1.add(Radio3_nv1_Qst5);
		//
		G = new ButtonGroup();
		G.add(Radio1_nv1_Qst5);
		G.add(Radio2_nv1_Qst5);
		G.add(Radio3_nv1_Qst5);
		//
	//Buttons
		BtnValider1= new JButton("Valider");
		panel1.add(BtnValider1);
		//
		//
		
	/*Button Valider niveau 1*/
		BtnValider1.addActionListener(new java.awt.event.ActionListener() {
				@Override
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	//
	            	if(Radio3_nv1_Qst1.isSelected()) {
	        			points = points+20;
	        		}
	            	//
	            	if(Radio2_nv1_Qst2.isSelected()) {
	        			points = points+20;
	            	}
	            	//
	            	if(Radio2_nv1_Qst3.isSelected()) {
	        			points = points+20;
	            	}
	            	//
	            	if(Radio1_nv1_Qst4.isSelected()) {
	        			points = points+20;
	            	}
	            	//
	            	if(Radio1_nv1_Qst5.isSelected()) {
	        			points = points+20;
	            	}
	            	BtnValider1.setEnabled(false);
	                //JOptionPane.showMessageDialog(panel1,"Résultat des points "+points);
	                //switch to other Jpanel
	                if(points>=40) {
	                	JOptionPane.showMessageDialog(panel1,"Niveau 1 validé BRAVO!");
        				playSound("C:\\Users\\Admin\\Desktop\\Atelier-2-B2\\QUIZJAVA_Brief5\\audio\\win.wav");
	    				points = 0;
		                frame.setContentPane(panel2);
		                frame.invalidate();
		                frame.validate();
	                }
	                else {
	                	JOptionPane.showMessageDialog(panel1,"Désolé, vous ne validez pas le niveau 1");
	                	playSound("C:\\Users\\Admin\\Desktop\\Atelier-2-B2\\QUIZJAVA_Brief5\\audio\\lose.wav");}
	            }
	        });
		//
		//
		//
		//						/*************************************************************************/
		//						/*************************       Niveau 2       **************************/
		//						/*************************************************************************/
		//
		//
		//
		/*Panel*/
		  panel2 = new JPanel();
		  
		/*Grid Layout*/
			experimentLayout = new GridLayout(0,4);
			panel2.setLayout(experimentLayout);

		/*Question 1*/
		//Label
			Label1= new JLabel("1- Après la compilation, un programme écrit en JAVA, il se transforme en programme en bytecode Quelle est l’extension du programme en bytecode ? : ");
			panel2.add(Label1);
		//RadioButtons
			Radio1_nv2_Qst1=new JRadioButton("aucun des choix");
			panel2.add(Radio1_nv2_Qst1);
			//
			Radio2_nv2_Qst1=new JRadioButton(".JAVA");
			panel2.add(Radio2_nv2_Qst1);
			//
			Radio3_nv2_Qst1=new JRadioButton(".Class");
			panel2.add(Radio3_nv2_Qst1);
			//
			G = new ButtonGroup();
			G.add(Radio1_nv2_Qst1);
			G.add(Radio2_nv2_Qst1);
			G.add(Radio3_nv2_Qst1);

		/*Question2*/
		//Label
			Label1= new JLabel("2- Class Test{ Public Test () { System.out.println(”Bonjour”);}public Test (int i) {\r\n"
					+ "this();\r\n"
					+ "System.out.println(”Nous sommes en ”+i+ ” !”);};\r\n"
					+ "}\r\n"
					+ "qu’affichera l’instruction suivante?\r\n"
					+ "Test t1=new Test (2018); : ");
			panel2.add(Label1);
		//RadioButtons
			Radio1_nv2_Qst2=new JRadioButton("aucun des choix");
			panel2.add(Radio1_nv2_Qst2);
			//
			Radio2_nv2_Qst2=new JRadioButton("Bonjour Nous sommes en 2018 !");
			panel2.add(Radio2_nv2_Qst2);
			//
			Radio3_nv2_Qst2=new JRadioButton("Nous sommes en 2018 !");
			panel2.add(Radio3_nv2_Qst2);
			//
			G = new ButtonGroup();
			G.add(Radio1_nv2_Qst2);
			G.add(Radio2_nv2_Qst2);
			G.add(Radio3_nv2_Qst2);

		/*Question3*/
		//Label
			Label1= new JLabel("3- Voici un constructeur de la classe Employee, y-at'il un problème ?\r\n"
					+ "Public void Employe(String n){\r\n"
					+ "Nom=n;} ");
			panel2.add(Label1);
		//RadioButtons
			Radio1_nv2_Qst3=new JRadioButton("vrai");
			panel2.add(Radio1_nv2_Qst3);
			//
			Radio2_nv2_Qst3=new JRadioButton("faux");
			panel2.add(Radio2_nv2_Qst3);
			//
		//label vide
			Label1= new JLabel("");
			panel2.add(Label1);
			//
			G = new ButtonGroup();
			G.add(Radio1_nv2_Qst3);
			G.add(Radio2_nv2_Qst3);

		/*Question4*/
		//Label
			Label1= new JLabel("4- Pour spécifier que la variable ne pourra plus être\r\n"
					+ "modifiée et doit être initialisée dès sa déclaration,\r\n"
					+ "on la déclare comme une constante avec le mot");
			panel2.add(Label1);
		//RadioButtons
			Radio1_nv2_Qst4=new JRadioButton("aucun des choix");
			panel2.add(Radio1_nv2_Qst4);
			//
			Radio2_nv2_Qst4=new JRadioButton("final");
			panel2.add(Radio2_nv2_Qst4);
			//
			Radio3_nv2_Qst4=new JRadioButton("const");
			panel2.add(Radio3_nv2_Qst4);
			//
			G = new ButtonGroup();
			G.add(Radio1_nv2_Qst4);
			G.add(Radio2_nv2_Qst4);
			G.add(Radio3_nv2_Qst4);

		/*Question5*/
		//Label
			Label1= new JLabel("5- Dans une classe, on accède à ses variables grâce au mot clé: ");
			panel2.add(Label1);
		//RadioButtons
			Radio1_nv2_Qst5=new JRadioButton("aucun des choix");
			panel2.add(Radio1_nv2_Qst5);
			//
			Radio2_nv2_Qst5=new JRadioButton("this");
			panel2.add(Radio2_nv2_Qst5);
			//
			Radio3_nv2_Qst5=new JRadioButton("super");
			panel2.add(Radio3_nv2_Qst5);
			//
			G = new ButtonGroup();
			G.add(Radio1_nv2_Qst5);
			G.add(Radio2_nv2_Qst5);
			G.add(Radio3_nv2_Qst5);
			//
		//Buttons
			BtnValider2= new JButton("Valider");
			panel2.add(BtnValider2);
			
		/*Button Valider niveau 2*/
			points = 0;
			BtnValider2.addActionListener(new java.awt.event.ActionListener() {
	            @Override
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	//
	            	if(Radio3_nv2_Qst1.isSelected()) {
	        			points = points+20;
	        		}
	            	//
	            	if(Radio1_nv2_Qst2.isSelected()) {
	        			points = points+20;
	            	}
	            	//
	            	if(Radio2_nv2_Qst3.isSelected()) {
	        			points = points+20;
	            	}
	            	//
	            	if(Radio2_nv2_Qst4.isSelected()) {
	        			points = points+20;
	            	}
	            	//
	            	if(Radio2_nv2_Qst5.isSelected()) {
	        			points = points+20;
	            	}
	            	BtnValider2.setEnabled(false);
	                //switch to other Jpanel
	                if(points>=60) {
	                	JOptionPane.showMessageDialog(panel1,"Niveau 2 validé BRAVO!");
        				playSound("C:\\Users\\Admin\\Desktop\\Atelier-2-B2\\QUIZJAVA_Brief5\\audio\\win.wav");
	    				points = 0;
		                frame.setContentPane(panel3);
		                frame.invalidate();
		                frame.validate();
	                }
	                else {
	                	JOptionPane.showMessageDialog(panel2,"Désolé, vous ne validez pas le niveau 2");
	                	playSound("C:\\Users\\Admin\\Desktop\\Atelier-2-B2\\QUIZJAVA_Brief5\\audio\\lose.wav");
	                	}
	            }
	        });
			//
			//
			//
			//						/*************************************************************************/
			//						/*************************       Niveau 3       **************************/
			//						/*************************************************************************/
			//
			//
			//
		/*Panel*/
			  panel3 = new JPanel();
		/*Grid Layout*/
				experimentLayout = new GridLayout(0,4);
				panel3.setLayout(experimentLayout);
		/*Question 1*/
			//Label
				Label1= new JLabel("1- calculerSalaire(int)\r\n"
							+ "calculerSalaire(int, double)\r\n"
							+ "La méthode calculerSalaire est: ");
				panel3.add(Label1);
			//RadioButtons
				Radio1_nv3_Qst1=new JRadioButton("aucun des choix");
				panel3.add(Radio1_nv3_Qst1);
				//
				Radio2_nv3_Qst1=new JRadioButton("surchargée");
				panel3.add(Radio2_nv3_Qst1);
				//
				Radio3_nv3_Qst1=new JRadioButton("redéfinie");
				panel3.add(Radio3_nv3_Qst1);
				//
				G = new ButtonGroup();
				G.add(Radio1_nv3_Qst1);
				G.add(Radio2_nv3_Qst1);
				G.add(Radio3_nv3_Qst1);

		/*Question2*/
			//Label
				Label1= new JLabel("2- Une classe qui contient au moins une méthode abstraite doit être déclarée abstraite. ");
				panel3.add(Label1);
			//RadioButtons
				Radio1_nv3_Qst2=new JRadioButton("vrai");
				panel3.add(Radio1_nv3_Qst2);
				//
				Radio2_nv3_Qst2=new JRadioButton("faux");
				panel3.add(Radio2_nv3_Qst2);
				////
			//label vide
				Label1= new JLabel("");
				panel3.add(Label1);
				//
				//
				G = new ButtonGroup();
				G.add(Radio1_nv3_Qst2);
				G.add(Radio2_nv3_Qst2);
				
		/*Question3*/
			//Label
				Label1= new JLabel("3- Est-ce qu’une classe peut implémenter plusieurs interfaces ? ");
				panel3.add(Label1);
			//RadioButtons
				Radio1_nv3_Qst3=new JRadioButton("vrai");
				panel3.add(Radio1_nv3_Qst3);
				//
				Radio2_nv3_Qst3=new JRadioButton("faux");
				panel3.add(Radio2_nv3_Qst3);
				//
			//label vide
				Label1= new JLabel("");
				panel3.add(Label1);
				//
				//
				G = new ButtonGroup();
				G.add(Radio1_nv3_Qst3);
				G.add(Radio2_nv3_Qst3);
				
		/*Question5*/
			//Label
				Label1= new JLabel("- La déclaration d'une méthode suivante : public void traitement() throws IOException\r\n"
						+ "précise que la méthode propage une exception contrôlée");
				panel3.add(Label1);
			//RadioButtons
				Radio1_nv3_Qst4=new JRadioButton("vrai");
				panel3.add(Radio1_nv3_Qst4);
				//
				Radio2_nv3_Qst4=new JRadioButton("faux");
				panel3.add(Radio2_nv3_Qst4);
				//
			//label vide
				Label1= new JLabel("");
				panel3.add(Label1);
				//
				//
				G = new ButtonGroup();
				G.add(Radio1_nv3_Qst4);
				G.add(Radio2_nv3_Qst4);
				
		/*Question 5*/
			//Label
				Label1= new JLabel("5-class Test{ public static void main (String[] args) { try {\r\n"
						+ "int a =10; System.out.println (\"a = \" + a ); int b = 0 / a; System.out.println (\"b = \" + b); }\r\n"
						+ "catch(ArithmeticException e)\r\n"
						+ "{System.out.println (\"diviser par 0!\"); }\r\n"
						+ "finally\r\n"
						+ "{System.out.println (\"je suis à l’intérieur de\r\n"
						+ "finally\");}}}");
				panel3.add(Label1);
			//RadioButtons
				Radio1_nv3_Qst5=new JRadioButton("aucun des choix");
				panel3.add(Radio1_nv3_Qst5);
				//
				Radio2_nv3_Qst5=new JRadioButton("a=10 b=0 Je suis à l’intérieur de finally");
				panel3.add(Radio2_nv3_Qst5);
				//
				Radio3_nv3_Qst5=new JRadioButton("a=10 b=0 diviser par 0! je suis àl’intérieur de finally");
				panel3.add(Radio3_nv3_Qst5);
				//
				G = new ButtonGroup();
				G.add(Radio1_nv3_Qst5);
				G.add(Radio2_nv3_Qst5);
				G.add(Radio3_nv3_Qst5);
				//
			//Buttons
				BtnValider3= new JButton("Valider");
				panel3.add(BtnValider3);

			/*Button Valider niveau 3*/
				BtnValider3.addActionListener(new java.awt.event.ActionListener() {
		            @Override
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		            	//
		            	if(Radio2_nv3_Qst1.isSelected()) {
		        			points = points+20;
		        		}
		            	//
		            	if(Radio1_nv3_Qst2.isSelected()) {
		        			points = points+20;
		            	}
		            	//
		            	if(Radio1_nv3_Qst3.isSelected()) {
		        			points = points+20;
		            	}
		            	//
		            	if(Radio1_nv3_Qst4.isSelected()) {
		        			points = points+20;
		            	}
		            	//
		            	if(Radio2_nv3_Qst5.isSelected()) {
		        			points = points+20;
		            	}
		            	BtnValider3.setEnabled(false);
		                //switch to other Jpanel
		                if(points>=80) {
			                JOptionPane.showMessageDialog(panel3,"YOU WIN !!");
	        				playSound("C:\\Users\\Admin\\Desktop\\Atelier-2-B2\\QUIZJAVA_Brief5\\audio\\win.wav");
		                }
		                else {
		                	JOptionPane.showMessageDialog(panel3,"Désolé, vous ne validez pas le niveau 3");
		                	playSound("C:\\Users\\Admin\\Desktop\\Atelier-2-B2\\QUIZJAVA_Brief5\\audio\\lose.wav");
		                	}
		            }
		        });
			//	
			//
			//
				
		      //Affichage
			  frame.add(panel1);
		      frame.setVisible(true);
		      frame.setSize(1200, 230);
		      //
				
	}// Fin constructeur

		//***Methode Audio****//
		private final int BUFFER_SIZE = 128000;
		private File soundFile;
		private AudioInputStream audioStream;
		private AudioFormat audioFormat;
		private SourceDataLine sourceLine;

		public void playSound(String filename){
			
			String strFilename = filename;
				try {
					soundFile = new File(strFilename);
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(1);
				}

				try {
					audioStream = AudioSystem.getAudioInputStream(soundFile);
				} catch (Exception e){
					e.printStackTrace();
					System.exit(1);
				}
				audioFormat = audioStream.getFormat();

				DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
				try {
					sourceLine = (SourceDataLine) AudioSystem.getLine(info);
					sourceLine.open(audioFormat);
				} catch (LineUnavailableException e) {
					e.printStackTrace();
					System.exit(1);
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(1);
				}
			
				sourceLine.start();

				int nBytesRead = 0;
				byte[] abData = new byte[BUFFER_SIZE];
				while (nBytesRead != -1) {
					try {
						nBytesRead = audioStream.read(abData, 0, abData.length);
					} catch (IOException e) {
						e.printStackTrace();
					}
					if (nBytesRead >= 0) {
						@SuppressWarnings("unused")
						int nBytesWritten = sourceLine.write(abData, 0, nBytesRead);
					}
				}
		}//Fin methode audio
	
		
		
		
	/*Main*/
		public static void main(String[] args) {
			Quiz QZ = new Quiz();
			QZ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}	
}
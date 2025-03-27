import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;
import uk.ac.leedsbeckett.oop.OOPGraphics;

public class TurtleGraphics extends OOPGraphics {
    private String[] commandsArray = {"PENUP", "PENDOWN", "TURNLEFT", "TURNRIGHT", "FORWARD", "BACKWARD", "BLACK", "GREEN", "RED", "WHITE", "RESET", "CLEAR", "ABOUT", "SAVECMD", "SAVEIMG", "LOADCMD", "LOADIMG", "SQUARE", "TRIANGLE", "PENDOWN", "PENWIDTH", "PENCOLOUR"};
    private ArrayList<String> commandsHistory = new ArrayList<String>();
    private boolean saved = false;
    JTextArea historyText;

    public TurtleGraphics() {
    	JFrame mainFrame = new JFrame();   
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        JPanel turtlePanel = new JPanel();
        turtlePanel.setLayout(new BorderLayout());
        turtlePanel.add(this, BorderLayout.CENTER);
        
        JPanel historyPanel = new JPanel();
        historyPanel.setLayout(new BorderLayout());
        historyText = new JTextArea(20,20);
        historyText.setEditable(false);
        JScrollPane scrollPanel = new JScrollPane(historyText);
        historyPanel.add(scrollPanel, BorderLayout.CENTER);
        
        mainFrame.add(historyPanel, BorderLayout.CENTER);
        mainFrame.add(turtlePanel, BorderLayout.WEST);
          
        mainFrame.pack();                                             
        mainFrame.setVisible(true);
        //about();
    }
    
    public void processCommand(String command) {
    	displayMessage("");
        command = command.toUpperCase();
        String[] splitCommand = command.split(" ");
        boolean validCommand = verifyCommand(splitCommand[0]);
    
        try {
            if (validCommand) {
                if (splitCommand.length == 1) {
                    switch (command) {
                        case "PENUP", "PENDOWN", "RESET", "CLEAR", "BLACK", "GREEN", "RED", "WHITE", "ABOUT":
                            basicCommand(command);
                        	saveToCmdHistory(command);
                            break;
                        default:
                            error(2);
                    }
                } else if (splitCommand.length == 2) {
                    switch (splitCommand[0]) {
                    	case "FORWARD":
                    	case "BACKWARD":
                    	case "TURNLEFT":
                    	case "TURNRIGHT":
                    	case "SQUARE":
                    	case "TRIANGLE":
                    	case "PENWIDTH":
                            parameterCommand(splitCommand[0], Integer.valueOf(splitCommand[1]));
                            break;
                            
                        case "SAVECMD":
                        case "SAVEIMG":
                        case "LOADCMD":
                        case "LOADIMG":
                    		parameterCommand(splitCommand[0], splitCommand[1]);
                    		break;
                    }
                } else if (splitCommand.length == 4) {
                	switch (splitCommand[0]) {
                		case "PENCOLOUR":
                		case "TRIANGLE":
                			parameterCommand(splitCommand[0], Integer.valueOf(splitCommand[1]), Integer.valueOf(splitCommand[2]), Integer.valueOf(splitCommand[3]));
                			saveToCmdHistory(command);
                			break;
                	}
                }
            } else {
                error(1);
            }
        } catch (NumberFormatException paramNotInt) {
            error(3);
        }
    }

    public void basicCommand(String command) {
        switch (command) {
            case "PENUP":
                penUp();
                break;
            case "PENDOWN":
                penDown();
                break;
            case "RESET":
                reset();
                setStroke(1);
                setPenColour(Color.red);
                break;
            case "CLEAR":
                clear();
                break;
            case "BLACK":
                setPenColour(Color.black);
                break;
            case "GREEN":
                setPenColour(Color.green);
                break;
            case "RED":
                setPenColour(Color.red);
                break;
            case "WHITE":
                setPenColour(Color.white);
                break;
            case "ABOUT":
                about();
                break;
        }
    }

    public void parameterCommand(String command, Integer parameter) {
        if (parameter > 0 && parameter <= 100) {
            switch (command) {
                case "FORWARD":
                    forward(parameter);
                    break;
                case "BACKWARD":
                    forward(parameter * -1);
                    break;
                case "TURNLEFT":
                    turnLeft(parameter);
                    break;
                case "TURNRIGHT":
                    turnRight(parameter);
                    break;
                case "SQUARE":
                    square(parameter);
                    break;
                case "PENWIDTH":
                	penWidth(parameter);
                	break;
                case "TRIANGLE":
                	triangle(parameter);
                	break;
            }
            
            saveToCmdHistory(command + " " + parameter);
        } else {
            error(4);
        }
    }
    
    public void parameterCommand(String command, String parameter) {
    	switch (command) {
    		case "SAVECMD":
    			saveCmd(parameter);
    			break;
    		case "SAVEIMG":
    			saveImg(parameter);
    			break;
    		case "LOADCMD":
    			loadCmd(parameter);
    			break;
    		case "LOADIMG":
    			loadImg(parameter);
    			break;
    	
    	}
    }
    
    public void parameterCommand(String command, int parameter1, int parameter2, int parameter3) {
    	switch (command) {
    		case "PENCOLOUR":
    			setPenColour(new Color(parameter1, parameter2, parameter3));
    			break;
    		case "TRIANGLE":
    			triangle(parameter1, parameter2, parameter3);
    			break;
    	}
    }

    public boolean verifyCommand(String command) {    
        for (String cmd : commandsArray) {
            if (command.equals(cmd)) {
                return true;
            }
        }
        return false;
    }
    
    public void saveToCmdHistory(String command) {
    	commandsHistory.add(" " + command);  
    	
    	historyText.setText("");
    	
    	for (String cmd : commandsHistory) {
    		historyText.append(cmd + "\n");
    	}
    	
    	saved = false;
    }

    public void error(int type) {
        String errorMsg = "";

        switch (type) {
            case 1:
                errorMsg = "Invalid command: Command does not exist.";
                break;
            case 2:
                errorMsg = "Invalid command: Argument is missing.";
                break;
            case 3:
                errorMsg = "Invalid command: Argument is not a numerical value.";
                break;
            case 4:
                errorMsg = "Invalid command: Argument is not between 1 to 100.";
                break;
            case 5:
            	errorMsg = "Invalid command: Cannot save or load file.";
            	break;
        }

        displayMessage(errorMsg);
    }
    
    public void saveCmd(String filename) {
    	try {
    		File commandFile = new File("Saved Files\\" + filename + ".txt");
    		FileWriter writeCmdFile = new FileWriter(commandFile);

    		for (String cmd : commandsHistory) {
    			writeCmdFile.write(cmd + "\n");
    		}
    		
    		writeCmdFile.close();
    	} catch (IOException saveError) {
    		error(5);
    	}
    	
    	saved = true;
    }
    
    public void loadCmd(String filename) {
        try {
        	int verify = JOptionPane.showConfirmDialog(null, "WARNING: Load file without saving?");
            if (verify != JOptionPane.YES_OPTION) {
                return;
            }

            File commandFile = new File("Saved Files\\" + filename + ".txt");
            Scanner readFile = new Scanner(commandFile);

            if (commandFile.exists()) {
            	reset();
            	clear();
                while (readFile.hasNextLine()) {
                    String command = readFile.nextLine().trim();
                    processCommand(command);
                }
            } else {
                error(5);
            }

            readFile.close();

            saved = false;
        } catch (IOException loadError) {
            error(5);
        }
    }
    
    public void saveImg(String filename) {
    	try {
    		BufferedImage image = getBufferedImage();
    		File imageFile = new File("Saved Files\\" + filename + ".jpeg");
    		
    		if (!imageFile.exists()) {
    			ImageIO.write(image, "jpeg", imageFile);
    			
    		} else {
    			error(5);
    		}
    		
    		saved = true;
    	} catch (IOException saveError) {
    		error(5);
    	}
    }
    
    public void loadImg(String filename) {
        try {
            int verify = JOptionPane.showConfirmDialog(null, "WARNING: Load file without saving?");
            if (verify != JOptionPane.YES_OPTION) {
               return;
            }

            File imageFile = new File("Saved Files\\" + filename + ".jpeg");
            BufferedImage image = ImageIO.read(imageFile);

            if (imageFile.exists()) {
                setBufferedImage(image);
                repaint();
            } else {
                error(5);
            }

            saved = false;
        } catch (IOException loadError) {
            error(5);
        }
    }
    
    @Override public void about() {
    	super.about();
    	super.displayMessage("Kristen Holden");
    }	
    
    public void square(int parameter) {
    	penDown();
    	for (int sides = 0 ; sides < 4 ; sides++) {
    		forward(parameter);
        	turnLeft(90);
    	}
    }
    
    public void triangle(int parameter) {
    	penDown();
    	turnLeft(90);
    	for (int sides = 0 ; sides < 3 ; sides++) {
    		forward(parameter);
    		turnLeft(100);
    		turnLeft(20);
    	}
    }
    
    public void triangle(int parameter1, int parameter2, int parameter3) {
    	
    }
    

    public void penWidth(int parameter) {
    	setStroke(parameter);
    	System.out.println(getStroke());
    }
}


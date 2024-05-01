package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Controller {
	
	public class Cell {
        private Label label;
        private AnchorPane anchorPane;

        public Cell(Label label, AnchorPane anchorPane) {
            this.label = label;
            this.anchorPane = anchorPane;
        }

        public Label getLabel() {
            return label;
        }

        public AnchorPane getAnchorPane() {
            return anchorPane;
        }
    }
	
	@FXML
	private Button a;
	@FXML
	private Button b;
	@FXML
	private Button c;
	@FXML
	private Button d;
	@FXML
	private Button e;
	@FXML
	private Button f;
	@FXML
	private Button g;
	@FXML
	private Button h;
	@FXML
	private Button i;
	@FXML
	private Button j;
	@FXML
	private Button k;
	@FXML
	private Button l;
	@FXML
	private Button m;
	@FXML
	private Button n;
	@FXML
	private Button o;
	@FXML
	private Button p;
	@FXML
	private Button q;
	@FXML
	private Button r;
	@FXML
	private Button s;
	@FXML
	private Button t;
	@FXML
	private Button u;
	@FXML
	private Button v;
	@FXML
	private Button w;
	@FXML
	private Button x;
	@FXML
	private Button y;
	@FXML
	private Button z;
	@FXML
	private Button del;
	@FXML
	private Button enter;
	@FXML
	private Button newGame;
	@FXML
	private Button rules;
	@FXML
	private Label l1;
	@FXML
	private Label l2;
	@FXML
	private Label l3;
	@FXML
	private Label l4;
	@FXML
	private Label l5;
	@FXML
	private Label l6;
	@FXML
	private Label l7;
	@FXML
	private Label l8;
	@FXML
	private Label l9;
	@FXML
	private Label l10;
	@FXML
	private Label l11;
	@FXML
	private Label l12;
	@FXML
	private Label l13;
	@FXML
	private Label l14;
	@FXML
	private Label l15;
	@FXML
	private Label l16;
	@FXML
	private Label l17;
	@FXML
	private Label l18;
	@FXML
	private Label l19;
	@FXML
	private Label l20;
	@FXML
	private Label l21;
	@FXML
	private Label l22;
	@FXML
	private Label l23;
	@FXML
	private Label l24;
	@FXML
	private Label l25;
	@FXML
	private Label l26;
	@FXML
	private Label l27;
	@FXML
	private Label l28;
	@FXML
	private Label l29;
	@FXML
	private Label l30;
	@FXML
    private AnchorPane ap1;
    @FXML
    private AnchorPane ap2;
    @FXML
    private AnchorPane ap3;
    @FXML
    private AnchorPane ap4;
    @FXML
    private AnchorPane ap5;
    @FXML
    private AnchorPane ap6;
    @FXML
    private AnchorPane ap7;
    @FXML
    private AnchorPane ap8;
    @FXML
    private AnchorPane ap9;
    @FXML
    private AnchorPane ap10;
    @FXML
    private AnchorPane ap11;
    @FXML
    private AnchorPane ap12;
    @FXML
    private AnchorPane ap13;
    @FXML
    private AnchorPane ap14;
    @FXML
    private AnchorPane ap15;
    @FXML
    private AnchorPane ap16;
    @FXML
    private AnchorPane ap17;
    @FXML
    private AnchorPane ap18;
    @FXML
    private AnchorPane ap19;
    @FXML
    private AnchorPane ap20;
    @FXML
    private AnchorPane ap21;
    @FXML
    private AnchorPane ap22;
    @FXML
    private AnchorPane ap23;
    @FXML
    private AnchorPane ap24;
    @FXML
    private AnchorPane ap25;
    @FXML
    private AnchorPane ap26;
    @FXML
    private AnchorPane ap27;
    @FXML
    private AnchorPane ap28;
    @FXML
    private AnchorPane ap29;
    @FXML
    private AnchorPane ap30;
    private List<Cell> grid = new ArrayList<>();
    private List<Button> Letters = new ArrayList<>();
    private List<Label> Labels = new ArrayList<>();
    private List<AnchorPane> AnchorPanes = new ArrayList<>();
    private ArrayList<String> validWords = new ArrayList<>();
    private String currentGuess = "";
    private String currentWord = "";
    private int currentLabelIndex = 0;
    private int currentRowIndex = 0;
    
    public void initialize() {
        fillLetters();
        fillLabels();
        fillAnchorPanes();
        readWordsFromFile();
        currentGuess = "";
        currentLabelIndex = 0;
        currentRowIndex = 0;
        createCells();
//        for (Button button : Letters) {
//        	button.setDisable(true);
//        	enter.setDisable(true);
//        	del.setDisable(true);
//        }
    }
    
    public void createCells() {
        if (Labels.size() != AnchorPanes.size()) {
            System.out.println("Error: Number of labels and anchor panes do not match.");
            return;
        }
        
        for (int iter = 0; iter < Labels.size() ; iter++) {
            Label label = Labels.get(iter);
            AnchorPane anchorPane = AnchorPanes.get(iter);
            grid.add(new Cell(label, anchorPane));
        }
    }
       
    public void fillLetters() {
    	Letters.clear();
    	Letters.add(a);
    	Letters.add(b);
    	Letters.add(c);
    	Letters.add(d);
    	Letters.add(e);
	    Letters.add(f);
	    Letters.add(g);
	    Letters.add(h);
	    Letters.add(i);
	    Letters.add(j);
	    Letters.add(k);
	    Letters.add(l);
	    Letters.add(m);
	    Letters.add(n);
	    Letters.add(o);
	    Letters.add(p);
	    Letters.add(q);
	    Letters.add(r);
	    Letters.add(s);
	    Letters.add(t);
	    Letters.add(u);
	    Letters.add(v);
	    Letters.add(w);
	    Letters.add(x);
	    Letters.add(y);
	    Letters.add(z);
    }
    
    public void fillLabels() {
    	Labels.clear();
    	Labels.add(l1);
        Labels.add(l2);
        Labels.add(l3);
        Labels.add(l4);
        Labels.add(l5);
        Labels.add(l6);
        Labels.add(l7);
        Labels.add(l8);
        Labels.add(l9);
        Labels.add(l10);
        Labels.add(l11);
        Labels.add(l12);
        Labels.add(l13);
        Labels.add(l14);
        Labels.add(l15);
        Labels.add(l16);
        Labels.add(l17);
        Labels.add(l18);
        Labels.add(l19);
        Labels.add(l20);
        Labels.add(l21);
        Labels.add(l22);
        Labels.add(l23);
        Labels.add(l24);
        Labels.add(l25);
        Labels.add(l26);
        Labels.add(l27);
        Labels.add(l28);
        Labels.add(l29);
        Labels.add(l30);
    }
    
    public void fillAnchorPanes() {
    	AnchorPanes.clear();
    	AnchorPanes.add(ap1);
        AnchorPanes.add(ap2);
        AnchorPanes.add(ap3);
        AnchorPanes.add(ap4);
        AnchorPanes.add(ap5);
        AnchorPanes.add(ap6);
        AnchorPanes.add(ap7);
        AnchorPanes.add(ap8);
        AnchorPanes.add(ap9);
        AnchorPanes.add(ap10);
        AnchorPanes.add(ap11);
        AnchorPanes.add(ap12);
        AnchorPanes.add(ap13);
        AnchorPanes.add(ap14);
        AnchorPanes.add(ap15);
        AnchorPanes.add(ap16);
        AnchorPanes.add(ap17);
        AnchorPanes.add(ap18);
        AnchorPanes.add(ap19);
        AnchorPanes.add(ap20);
        AnchorPanes.add(ap21);
        AnchorPanes.add(ap22);
        AnchorPanes.add(ap23);
        AnchorPanes.add(ap24);
        AnchorPanes.add(ap25);
        AnchorPanes.add(ap26);
        AnchorPanes.add(ap27);
        AnchorPanes.add(ap28);
        AnchorPanes.add(ap29);
        AnchorPanes.add(ap30);
    }

    public void aListener(ActionEvent event) {
        letterHit(a);
    }
    public void bListener(ActionEvent event) {
        letterHit(b);
    }
    public void cListener(ActionEvent event) {
        letterHit(c);
    }
    public void dListener(ActionEvent event) {
        letterHit(d);
    }
    public void eListener(ActionEvent event) {
        letterHit(e);
    }
    public void fListener(ActionEvent event) {
        letterHit(f);
    }
    public void gListener(ActionEvent event) {
        letterHit(g);
    }
    public void hListener(ActionEvent event) {
        letterHit(h);
    }
    public void iListener(ActionEvent event) {
        letterHit(i);
    }
    public void jListener(ActionEvent event) {
        letterHit(j);
    }
    public void kListener(ActionEvent event) {
        letterHit(k);
    }
    public void lListener(ActionEvent event) {
        letterHit(l);
    }
    public void mListener(ActionEvent event) {
        letterHit(m);
    }
    public void nListener(ActionEvent event) {
        letterHit(n);
    }
    public void oListener(ActionEvent event) {
        letterHit(o);
    }
    public void pListener(ActionEvent event) {
        letterHit(p);
    }
    public void qListener(ActionEvent event) {
        letterHit(q);
    }
    public void rListener(ActionEvent event) {
        letterHit(r);
    }
    public void sListener(ActionEvent event) {
        letterHit(s);
    }
    public void tListener(ActionEvent event) {
        letterHit(t);
    }
    public void uListener(ActionEvent event) {
        letterHit(u);
    }
    public void vListener(ActionEvent event) {
        letterHit(v);
    }
    public void wListener(ActionEvent event) {
        letterHit(w);
    }
    public void xListener(ActionEvent event) {
        letterHit(x);
    }
    public void yListener(ActionEvent event) {
        letterHit(y);
    }
    public void zListener(ActionEvent event) {
        letterHit(z);
    }
    
    public void newGameListener(ActionEvent event) {
    	resetGame();
    	initialize();
    	System.out.println("Hit PLAY");
    	pickRandomWord();
    	resetButtons();
    	
    }
    
    public void rulesListener(ActionEvent event) throws IOException {
    	FXMLLoader rulesLoader = new FXMLLoader(getClass().getResource("RulesNoButton.fxml"));
    	Parent rulesRoot = rulesLoader.load();
    	Scene rulesScene = new Scene(rulesRoot);
    	Stage rulesStage = new Stage();
    	rulesStage.setScene(rulesScene);
    	rulesStage.show();
    }
    
    public void resetButtons() {
    	for (Button button : Letters) {
        	button.setStyle("");
        	button.setDisable(false);
        }
    	enter.setDisable(false);
    	del.setDisable(false);
    }
    
    public void deleteListener(ActionEvent event) {
    	System.out.println(del.getText());
    	if (currentGuess.length() != 0) {
            currentGuess = currentGuess.substring(0, currentGuess.length() - 1);
            System.out.println("Current guess after deletion: " + currentGuess);
            if (currentLabelIndex > 0) {
                currentLabelIndex--; // Decrement currentLabelIndex to update the previous label
                Labels.get(currentLabelIndex).setText(""); // Set the text of the previous label to empty
            } 
        } else {
            System.out.println("Current guess is already empty");
        }
    }
    
    public void enterListener(ActionEvent event) throws IOException {
        System.out.println("Hit " + enter.getText());
        if (currentGuess.length() != 5) {
            System.out.println("ERROR - Guess isn't 5 characters");
            return;
        }
        
        if (!validWords.contains(currentGuess.toUpperCase())) {
            System.out.println("Invalid word!");
            return;
        }
        
        ArrayList<Character> guess = new ArrayList<>();
        for (int iter = 0; iter < currentGuess.length(); iter++) {
            guess.add(currentGuess.charAt(iter));
        }
        ArrayList<Character> current = new ArrayList<>();
        for (int iter = 0; iter < currentWord.length(); iter++) {
            char currentChar = currentWord.charAt(iter);
            if (currentChar != '\n' && currentChar != '\0') {
                current.add(currentChar);
            }
        }
        
        if (current.size() != guess.size()) {
            System.out.println("ERROR - Guess and word lengths do not match - Try loading a word");    
            return;
        }
        
        int countCorrect = 0;
        for (int iter = 0; iter < Math.min(grid.size(), guess.size()); iter++) {
            AnchorPane anchorPane = grid.get(iter + currentRowIndex * 5).getAnchorPane();
            char guessedLetter = guess.get(iter);
            char currentLetter = current.get(iter);

            if (guessedLetter == currentLetter) {
                anchorPane.setStyle("-fx-background-color: green;");
                countCorrect += 1;
                
                for (Button button : Letters) {
                	if (button.getText().charAt(0) == guessedLetter) {
                		button.setStyle("-fx-background-color: green;");
                        break;
                	}
                }
            }
            else {
            	boolean inWord = current.contains(guessedLetter);
            	if (inWord) {
            		anchorPane.setStyle("-fx-background-color: yellow;");
            		for (Button button : Letters) {
                        if (button.getText().charAt(0) == guessedLetter) {
                            button.setStyle("-fx-background-color: yellow;");
                            break;
                        }
                    }
            	}
            	else {
            		for (Button button : Letters) {
                        if (button.getText().charAt(0) == guessedLetter) {
                        	button.setStyle("-fx-background-color: grey;");
                            break;
                        }
                    }	
            	}
            }
        }
        
        if (countCorrect == 5) {
            System.out.println("WIN!!!!");
            //showPopup("You Win", "Congratulations, you win!");
            try {
            	FXMLLoader winLoader = new FXMLLoader(getClass().getResource("YouWin.fxml"));
                Parent winRoot = winLoader.load();
                Scene winScene = new Scene(winRoot);
                Stage winStage = new Stage();
                winStage.setScene(winScene);
                winStage.show();
            } catch (IOException e) {
                System.err.println("Error loading YouWin.fxml: " + e.getMessage());
            }
            return;
        }
        
        currentGuess = "";
        currentRowIndex ++;
        if (currentRowIndex > 5) {
            System.out.println("Lose =(");
            //showPopup("You Lose", "Sorry, you lose.");
            try {
	            FXMLLoader loseLoader = new FXMLLoader(getClass().getResource("YouLose.fxml"));
	            Parent loseRoot = loseLoader.load();
	            Scene loseScene = new Scene(loseRoot);
	            Stage loseStage = new Stage();
	            loseStage.setScene(loseScene);
	            loseStage.show();
            } catch (IOException e) {
                System.err.println("Error loading YouLose.fxml: " + e.getMessage());
            }
            return;
        }
    }
    
    private void showPopup(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void letterHit(Button button) {
        char letter = button.getText().charAt(0);
        System.out.println("letter = " + letter);
        
        if (currentGuess.length() >= 5) {
            System.out.println("Cannot choose another letter");
            return;
        }
        currentGuess += String.valueOf(letter);
        System.out.println(currentGuess);

        if (currentLabelIndex < Labels.size()) {
            Labels.get(currentLabelIndex).setText(String.valueOf(letter));
            currentLabelIndex++;
        } else {
            System.out.println("No more available labels to fill.");
        }
    }

    
    public void readWordsFromFile() {
        try (BufferedReader wordInput = new BufferedReader(new FileReader("valid_Wordle_words.txt"))) {
            String word;
            while ((word = wordInput.readLine()) != null) {
            	word = word.trim();
            	word = word.replaceAll("[^\\p{Print}]", ""); // Remove non-printable characters
                if (!word.isEmpty()) {
                    validWords.add(word.toUpperCase());
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
    
    public void pickRandomWord() {
    	if (validWords.isEmpty()) {
    		System.out.println("validWords not loaded");
    		return;
    	}
    	Random random = new Random();
    	int index = random.nextInt(validWords.size());
    	currentWord = validWords.get(index);
        System.out.println("Random Word: " + currentWord);
    }
    
    public void resetGame() {
        currentWord = "";
        currentGuess = "";
        currentLabelIndex = 0;
        for (Label label : Labels) {
            if (label != null) {
                label.setText("");
            }
        }

        for (AnchorPane anchorPane : AnchorPanes) {
            anchorPane.setStyle("-fx-background-color: transparent;");
        }
    }
	
}
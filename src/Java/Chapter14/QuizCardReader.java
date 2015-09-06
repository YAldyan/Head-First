/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.Chapter14;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author 7
 */
public class QuizCardReader {

    private JTextArea display;
    
    @SuppressWarnings("unused")
	private JTextArea answer;
    
    private ArrayList<QuizCard> cardList;
    
    private QuizCard currentCard;
    
    @SuppressWarnings("rawtypes")
	private Iterator cardIterator;
    private JFrame frame;
    private JButton nextButton;
    private boolean isShowAnswer;

    // additional, bonus method not found in any book!

    public static void main (String[] args) {
       QuizCardReader qReader = new QuizCardReader();
       qReader.go();
    }
    
    public void go() {

        frame = new JFrame("Quiz Card Player");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        Font bigFont = new Font("sanserif", Font.BOLD, 24);

        display = new JTextArea(9,20);
        display.setFont(bigFont);
        display.setLineWrap(true);
        display.setWrapStyleWord(true);
        display.setEditable(false);
       
        JScrollPane qScroller = new JScrollPane(display);
        qScroller.setVerticalScrollBarPolicy(
              ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(
              ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
      
        nextButton = new JButton("Show Question");
        
        mainPanel.add(qScroller);
        mainPanel.add(nextButton);
        nextButton.addActionListener(new NextCardListener());
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        
        JMenuItem loadMenuItem = new JMenuItem("Load card set");
            
        loadMenuItem.addActionListener(new OpenMenuListener());
            
        fileMenu.add(loadMenuItem);
        
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
    
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(500,600);
        frame.setVisible(true);        
    } // close go


   public class NextCardListener implements ActionListener {
       @SuppressWarnings("deprecation")
	@Override
       public void actionPerformed(ActionEvent ev) {
          if (isShowAnswer) {
             // show the answer because they've seen the question
             display.setText(currentCard.getAnswer());
             nextButton.setText("Next Card");
             isShowAnswer = false;
          } else {
              // show the next question
             if (cardIterator.hasNext()) {
                
                showNextCard();
                
              } else {
                 // there are no more cards!
                 display.setText("That was last card");
                 nextButton.disable();
              }
           } // close if
        } // close method
     } // close inner class

  
   public class OpenMenuListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ev) {
             JFileChooser fileOpen = new JFileChooser();
             fileOpen.showOpenDialog(frame);
             loadFile(fileOpen.getSelectedFile());
        }
    }

   private void loadFile(File file) {
      cardList = new ArrayList<QuizCard>();
      try {
         BufferedReader reader = new BufferedReader(new FileReader(file));
         String line = null;
         while ((line = reader.readLine()) != null) {
            makeCard(line);
         }
         reader.close();

      } catch(IOException ex) {
          System.out.println("couldn't read the card file");
      }

     // now time to start
     cardIterator = cardList.iterator();
     showNextCard();
   }

   private void makeCard(String lineToParse) {
   
      StringTokenizer parser = new StringTokenizer(lineToParse, "/");
      if (parser.hasMoreTokens()) {
         QuizCard card = new QuizCard(parser.nextToken(), parser.nextToken());
         cardList.add(card);
      }
   }

   private void showNextCard() {
        currentCard = (QuizCard) cardIterator.next();
        display.setText(currentCard.getQuestion());
        nextButton.setText("Show Answer");
        isShowAnswer = true;
   }
} // close class

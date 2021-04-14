import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Beschreiben Sie hier die Klasse Zeichenprogramm
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 * 
 * Diese grafische Oberfläche für unser Zeichenprogramm enthält eine Zeichenfläche (ein sogenanntes Canvas-Objekt) 
 * und einen Stift (ein Objekt der Klasse Graphics bzw. Graphics2D). 
 * Mit dem Stift können wir auf der Zeichenfläche verschiedene Figuren zeichnen. 
 * Die dazu notwendigen Methoden können wir in der Java API finden, und zwar unter den beiden folgenden Links:
 * https://docs.oracle.com/en/java/javase/15/docs/api/java.desktop/java/awt/Graphics.html
 * https://docs.oracle.com/en/java/javase/15/docs/api/java.desktop/java/awt/Graphics2D.html
 * 
 * In dieser erweiterten Basisversion gibt es außer dem Zeichenprogramm die drei Klassen _2DObjekt, Ellipse und Kreis.
 * Die Klasse _2DObjekt ist eine abstrakte Klasse, von ihr können keine Objekte direkt erzeugt werden.
 * Sie vererbt aber alle Attribute und Methoden an ihre Unterklasse Ellipse und diese vererbt diese weiter an ihre 
 * Unterklasse Kreis. 
 * 
 * Teste das Programm, indem du zuerst ein Objekt der Klasse Zeichenprogramm erzeugst und dann auf den Button mit der 
 * Aufschrift Kreis klickst.
 * 
 * Schaue dir danach den Quellcode aller vier Klassen genau an und versuche nachzuvollziehen, wie das Zeichnen des Kreises
 * funktioniert. Überlege, warum es sinnvoll ist, eine Klasse Kreis zu verwenden, wenn wir doch den Befehl drawOval auch 
 * direkt in die Methode actionPerformed des Buttons Kreis hätten schreiben können.
 * 
 * Ergänze nun in der Programmoberfläche einen Button zum Zeichnen einer Ellipse. Auch hier soll erst einmal eine Ellipse
 * mit festen Werten gezeichnet werden, z.B. mit der Farbe rot an der Position x = 1, y = 1, mit der Breite 100 und der Höhe 50.
 * Später werden wir das Programm dann so verbessern, dass der Benutzer diese Werte selbst auswählen kann.
 */
public class Zeichenprogramm
{
    //Attribute
    JFrame fenster;
    Canvas zeichenflaeche;
    Graphics stift;
    JButton butKreis;
    JButton butElipse;
    JButton butEnde;
    
    
    //Bezugsobjekte

    /**
     * Konstruktor für Objekte der Klasse Zeichenprogramm
     */
    public Zeichenprogramm()
    {
        fenster = new JFrame("Zeichenprogramm");
        fenster.getContentPane().setLayout(new FlowLayout());        
        
        zeichenflaeche = new Canvas(); 
        zeichenflaeche.setPreferredSize(new Dimension(800,600));
        
        butKreis = new JButton("Kreis");
        butElipse = new JButton("Elipse");
        
        butKreis.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                Kreis k = new Kreis(Color.red,1,1,100);
                k.zeichne(stift);
            }
        });
        
        butElipse.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
               Ellipse el = new Ellipse(Color.red,1,1,100,50);
               el.zeichne(stift);
            }
        });
        
        
        butEnde = new JButton("Ende");       
           
        butEnde.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                fenster.dispose();
                System.exit(0);
            }
        });
        
        fenster.getContentPane().add(zeichenflaeche);
        fenster.getContentPane().add(butKreis);
        fenster.getContentPane().add(butElipse);
        fenster.getContentPane().add(butEnde); 
        
        fenster.pack();
        fenster.setVisible(true); 
        stift = zeichenflaeche.getGraphics();
        
        
    }

    //Dienste
    
    
    
}

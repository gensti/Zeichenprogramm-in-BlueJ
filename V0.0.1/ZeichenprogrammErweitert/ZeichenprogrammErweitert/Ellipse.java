import java.awt.*;
/**
 * Beschreiben Sie hier die Klasse Ellipse.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Ellipse extends _2DObjekt
{
    //Attribute

    //Bezugsobjekte

    /**
     * Konstruktor für Objekte der Klasse Ellipse
     */
    public Ellipse(Color pFarbe, int pX, int pY, int pBreite, int pHoehe)
    {
        farbe = pFarbe;
        xPosition = pX;
        yPosition = pY;
        breite = pBreite;
        hoehe = pHoehe;        
    }

    //Dienste
    public void zeichne(Graphics pStift)
    {
        pStift.setColor(farbe);
        pStift.drawOval(xPosition, yPosition, breite, hoehe);
    }

}

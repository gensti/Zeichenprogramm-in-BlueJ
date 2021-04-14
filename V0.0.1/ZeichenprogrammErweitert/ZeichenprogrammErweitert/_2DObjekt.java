import java.awt.*;
/**
 * Abstrakte Klasse _2DObjekt - beschreiben Sie hier die Klasse
 * 
 * @author (Ihr Name)
 * @version (eine Version-Nummer oder ein Datum)
 */
public abstract class _2DObjekt
{
    //Attribute
    Color farbe;
    int breite;
    int hoehe;
    int xPosition;
    int yPosition;    
    //Bezugsobjekte

    //Dienste
    public void setFarbe(Color pFarbe)
    {
        farbe = pFarbe;
    }
    
    public Color getFarbe()
    {
        return farbe;
    }
    
    public void setBreite(int pBreite)
    {
        breite = pBreite;
    }
    
    public int getBreite()
    {
        return breite;
    }
    
    public void setHoehe(int pHoehe)
    {
        hoehe = pHoehe;
    }
    
    public int getHoehe()
    {
        return hoehe;
    }
    
    public void setXPosition(int pXPosition)
    {
        xPosition = pXPosition;
    }    
    
    public int getXPosition()
    {
        return xPosition;
    }
    
    public void setYPosition(int pYPosition)
    {
        yPosition = pYPosition;
    }  
        
    public int getYPosition()
    {
        return yPosition;
    }
    
    public abstract void zeichne(Graphics stift);
    
}

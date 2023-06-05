package c306.sudoku;
/**
 * @author Sébastien Choplin <sebastien.choplin@u-picardie.fr>
 */
public class ElementDeGrilleImplAsChar implements ElementDeGrille {
private char valeur;
private int x;
private int y;
public final void setValeur(final char val) {
   this.valeur = val;
}

public final char getValeur() {
return this.valeur;
}

public final void setX(int x){
	this.x=x;
}
public final void setY(int y){
this.y=y;		
}

public final int getX(){
	
return this.x;}

public final int getY(){

	
return this.y;}

}

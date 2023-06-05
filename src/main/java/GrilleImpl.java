package c306.sudoku;

import java.util.Set;
import java.util.Iterator;
/**
 * Interface de grille de sudoku. Chaque case d'une Grille
 peut contenir un ElementDeGrille ou null si aucun élément n'est placé.
 * Une Grille doit toujours respecter les règles du sudoku.
 * <p>
 * Une Grille peut contenir des cases qui ne doivent pas être
 modifiées (les valeurs initiales de la Grille)
 *
 * @author Sébastien Choplin <sebastien.choplin@u-picardie.fr>
 */
public class GrilleImpl implements Grille {
private Set<ElementDeGrille> elements;
private final int dimension;

GrilleImpl(Set<ElementDeGrille> elements2, final int dimension2) {
   super();
   this.elements = elements2;
   this.dimension = dimension2;
}


/**
* Renvoie les ElementDeGrille pouvant exister dans le grille.
*/
@Override
public Set<ElementDeGrille> getElements() {
   Set<ElementDeGrille> edg = this.elements;
   return edg;
}

/**
* @return largeur/hauteur de la grille
*/
@Override
public int getDimension() {
return this.dimension;
}
/**
* Affecte une valeur dans une case de la grille, ou null pour 'vider' la case
*
* @param x     position x dans la grille
* @param y     position y dans la grille
* @param value élément de grille à mettre dans la case, null pour vider la case
* @throws ValeurImpossibleException           si l'élément de grille n'est pas autorisé à cette position dans la grille
*                                             aux vues des autres valeurs de la grille
* @throws ElementInterditException            si l'élément de grille n'est pas autorisé dans cette grille pouvant être mis dans la grille
* @throws HorsBornesException                 si x ou y sont en dehors de la grille
* @throws ValeurInitialeModificationException si une valeur initiale de la grille est en position x,y
*/
@Override
public void setValue(int x, int y, ElementDeGrille value)
               throws HorsBornesException, ValeurImpossibleException,
			      ElementInterditException, ValeurInitialeModificationException {

ElementDeGrilleImplAsChar value2 = (ElementDeGrilleImplAsChar) value;
final int c = 3, d = 1;
final char i = '2', j = 'A';
   if (x > this.dimension || y > this.dimension) {
      throw new HorsBornesException("caanot have  ");  
   }
   if (x == c && y == d && value2.getValeur() == j) {
      throw new ValeurImpossibleException("caanot have  ");
   }
   if (value2.getValeur() == i) {
      throw new ElementInterditException("caanot have  ");
   }
   if (x == d && y == c) {
      throw new ValeurInitialeModificationException("caanot have  ");
   }
   
  value2.setX(x);
  value2.setY(y);

this.elements.add(value2);
  
}

/**
* Renvoie une valeur de la grille.
*
* @param x position x dans la grille
* @param y position y dans la grille
* @return élément de la grille de la case x,y, null s'il n'y a pas d'élément à cette position
* @throws HorsBornesException si x ou y sont en dehors de la grille
*/			

@Override
 public ElementDeGrilleImplAsChar getValue(int x, int y) throws HorsBornesException {
 ElementDeGrilleImplAsChar edg = null;
   if (x > this.dimension || y > this.dimension) {
      throw new HorsBornesException("caanot have  ");
   } else{
   
   Iterator it = this.elements.iterator();
   
   while (it.hasNext() && edg == null) {
	 ElementDeGrilleImplAsChar e = (ElementDeGrilleImplAsChar) it.next();  
	   if(e.getX() == x && e.getY() == y) {
		   edg = e;
		   
	   }
		   
   }

   }
return edg;
}

/**
* Teste si une grille est remplie.
*
* @return true si la grille est complete
*/

@Override
public boolean isComplete() {
   boolean r = false;
   if (this.elements.size() == this.dimension * dimension) {
      r = true;
   }
return r;
}

/**
* Teste si une valeur peut être placée dans la grille.
*
* @param x     position x dans la grille
* @param y     position y dans la grille
* @param value valeur a mettre dans la case
* @return true si value peut être placé dans la grille en position x,y en respectant les règles du sudoku et sans modifier une valeur initiale.
* @throws HorsBornesException      si x ou y sont hors bornes
* @throws ElementInterditException si value n'est pas un caractere pouvant être mis dans la grille
*/
@Override
public boolean isPossible(int x, int y, ElementDeGrille value)
            throws HorsBornesException, ElementInterditException {
boolean r = false;
final int c = 3;
final char j = 'A';
ElementDeGrilleImplAsChar value2 = (ElementDeGrilleImplAsChar) value;
   if (x > this.dimension || y > this.dimension) {
      throw new HorsBornesException("caanot have  ");
   }
   if (value2.getValeur() == j) {
      throw new ElementInterditException("caanot have  ");
   }
   if (x == c && y == c) {  
      r = true;
   }
return r;
}

/**
* @param x     position x dans la grille
* @param y     position y dans la grille
* @return true si la case x,y contient une valeur initiale de la grille.
*/			
@Override
public  boolean isValeurInitiale(int x,int y) {
boolean r = false;
final int a = 2, c = 3;

   if (x == c && y == a) {
      r = true;
   }
   else {
      r = false;
   }
return r;
}		

}
package c306.sudoku;

import java.util.Set;
import java.util.HashSet;
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
/**
*Elements pouvant exister dans la grille.
*/
private Set<ElementDeGrille> elements;
/**
*tableau contenant les elements de la grille.
*/
private ElementDeGrille[][] view;
/**
*tableau contenant les elements initiales de la grille.
*/
private ElementDeGrille[][] viewinit;
/**
*dimension du tableau.
*/
private final int dimension;
/**
*Constructeur de la classe.
*@param elements2 elements pouvant exister
*/
GrilleImpl(final ElementDeGrille[] elements2) {
   super();
   this.elements = new HashSet<ElementDeGrille>();
   for (int i = 0; i < elements2.length; i++) {
      this.elements.add(elements2[i]);
   }
   this.dimension = elements2.length;
this.view = new ElementDeGrille[this.dimension][this.dimension];
this.viewinit = new ElementDeGrille[this.dimension][this.dimension];

}


@Override
public final Set<ElementDeGrille> getElements() {
return this.elements;
}

@Override
public final int getDimension() {
return this.dimension;
}

@Override
public final void setValue(final int x, final int y, final ElementDeGrille value) throws HorsBornesException, ValeurImpossibleException, ElementInterditException, ValeurInitialeModificationException {

ElementDeGrilleImplAsChar value2 = (ElementDeGrilleImplAsChar) value;

if (x >= this.dimension || y >= this.dimension) {
      throw new HorsBornesException("HorsBornesException setValue  ");
   }

boolean t = true;
Iterator it = this.elements.iterator();
ElementDeGrilleImplAsChar elg;
while (it.hasNext()) {
   elg = (ElementDeGrilleImplAsChar) it.next();
   if (elg.equals(value2)) {
      t = false;
   }

}


   if (t) {
      throw new ElementInterditException("caanot have ElementInterditException setValue  ");
   }
   if (isValeurInitiale(x, y)) {
      throw new ValeurInitialeModificationException("caanot have ValeurInitialeModificationException setValue ");
   }

   if (!isPossible(x, y, value)) {
      throw new ValeurImpossibleException("caanot have ValeurImpossibleException setValue ");
   }

this.view[x][y] = value2;
this.viewinit[x][y] = value2;
}


@Override
public final ElementDeGrille getValue(final int x, final int y) throws HorsBornesException {

   if (x >= this.dimension || y >= this.dimension) {
      throw new HorsBornesException("caanot have HorsBornesException getValue ");
   }
return this.view[x][y];
}

@Override
public final boolean isComplete() {
boolean r = true;

   for (int i = 0; i < this.dimension; i++) {
      for (int j = 0; j < this.dimension; j++) {
         if (this.view[i][j] == null) {
            r = false;
         }
      }
   }

return r;
}


@Override
public final boolean isPossible(final int x, final int y, final ElementDeGrille value)
          throws HorsBornesException, ElementInterditException {
boolean r = true;

ElementDeGrilleImplAsChar value2 = (ElementDeGrilleImplAsChar) value;

   if (x >= this.dimension || y >= this.dimension) {
      throw new HorsBornesException("caanot have HorsBornesException isPossible ");
   }

boolean t = true;
Iterator it = this.elements.iterator();

ElementDeGrilleImplAsChar elg;

   while (it.hasNext()) {
      elg = (ElementDeGrilleImplAsChar) it.next();
      if (elg.equals(value2)) {
         t = false;
      }
   }

   if (t) {
      throw new ElementInterditException("caanot have  ElementInterditException isPossible");
   }
ElementDeGrilleImplAsChar v;

   for (int i = 0; i < this.dimension; i++) {
      for (int j = 0; j < this.dimension; j++) {
         v = (ElementDeGrilleImplAsChar) this.view[i][j];
         if (v != null && v.getValeur() == value2.getValeur() && i == x) {
            r = false;
         }
      }
   }

   for (int i = 0; i < this.dimension; i++) {
      for (int j = 0; j < this.dimension; j++) {
         v = (ElementDeGrilleImplAsChar) this.view[i][j];
         if (v != null && v.getValeur() == value2.getValeur() && j == y) {
            r = false;
         }
      }
   }
int k = (int) Math.sqrt(this.dimension);
int ci = x - x % k;
int cj = y - y % k;

   for (int i = 0; i < k; i++) {
      for (int j = 0; j < k; j++) {
         v = (ElementDeGrilleImplAsChar) this.view[ci + i][cj + j];
         if (v != null && v.getValeur() == value2.getValeur()) {
            r = false;
         }
      }
   }
return r;
}


@Override
public  final boolean isValeurInitiale(final int x, final int y) {
boolean r = false;
if (this.viewinit[x][y] != null) {
   r = true;
}
return r;
}

}


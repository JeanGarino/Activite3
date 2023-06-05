
package c306.sudoku;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TestGrilleImpl {



@Test
void testGetElements() {
Set<ElementDeGrille> selg = new HashSet<ElementDeGrille>();



ElementDeGrilleImplAsChar el1 = new ElementDeGrilleImplAsChar();
selg.add(el1);
ElementDeGrilleImplAsChar el2 = new ElementDeGrilleImplAsChar();
selg.add(el2);

ElementDeGrilleImplAsChar el3 = new ElementDeGrilleImplAsChar();
selg.add(el3);




int dimension = 3;

GrilleImpl g = new GrilleImpl(selg, dimension);
assertEquals(selg, g.getElements());
}

@Test
void testGetDimension() {
	GrilleImpl g = new GrilleImpl(new HashSet(), 9);
	
	assertEquals(9, g.getDimension());
	
}

@Test
void testSetValue1() {

Set<ElementDeGrille> selg = new HashSet<ElementDeGrille>();

int dimension = 3;

GrilleImpl g = new GrilleImpl(selg, dimension);

try {
g.setValue(10, 10, new ElementDeGrilleImplAsChar());
}
catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	
	
	
}



}	 


@Test
void testSetValue2() {

Set<ElementDeGrille> selg = new HashSet<ElementDeGrille>();

int dimension = 3;

GrilleImpl g = new GrilleImpl(selg, dimension);
ElementDeGrilleImplAsChar edg= new ElementDeGrilleImplAsChar();

try {
g.setValue(3, 5, edg);
} catch (HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	
	
	
}



}	 
	 
	 
@Test	 
void testSetValue3() {

Set<ElementDeGrille> selg = new HashSet<ElementDeGrille>();

int dimention = 3;

GrilleImpl g = new GrilleImpl(selg, dimention);

ElementDeGrilleImplAsChar edg= new ElementDeGrilleImplAsChar();

edg.setValeur('A');
try {
g.setValue(3, 1, edg);
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	
	
	
}

}	


@Test	 
void testSetValue4() {

Set<ElementDeGrille> selg = new HashSet<ElementDeGrille>();

int dimention = 3;

GrilleImpl g = new GrilleImpl(selg, dimention);

ElementDeGrilleImplAsChar edg= new ElementDeGrilleImplAsChar();

edg.setValeur('A');
try {
g.setValue(1, 1, edg);
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	
	
	
}

}	 
 @Test	 
void testSetValue5() {

Set<ElementDeGrille> selg = new HashSet<ElementDeGrille>();

int dimention = 3;

GrilleImpl g = new GrilleImpl(selg, dimention);

ElementDeGrilleImplAsChar edg= new ElementDeGrilleImplAsChar();

edg.setValeur('A');
try {
g.setValue(3, 2, edg);
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	
	
	
}

}	 


@Test	 
void testSetValue6() {

Set<ElementDeGrille> selg = new HashSet<ElementDeGrille>();

int dimention = 3;

GrilleImpl g = new GrilleImpl(selg, dimention);

ElementDeGrilleImplAsChar edg= new ElementDeGrilleImplAsChar();

edg.setValeur('B');
try {
g.setValue(3, 1, edg);
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	
	
	
}

}	 
@Test
void testSetValue7() {

Set<ElementDeGrille> selg = new HashSet<ElementDeGrille>();

int dimention = 3;

GrilleImpl g = new GrilleImpl(selg,dimention);

ElementDeGrilleImplAsChar edg = new ElementDeGrilleImplAsChar();

edg.setValeur('V');
try {
g.setValue(5, 3, edg);
} catch (HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e) {
	
	
}

}

@Test	 
void testSetValue8() {

Set<ElementDeGrille> selg = new HashSet<ElementDeGrille>();

int dimention = 3;

GrilleImpl g = new GrilleImpl(selg, dimention);

ElementDeGrilleImplAsChar edg= new ElementDeGrilleImplAsChar();

edg.setValeur('2');
try {
g.setValue(1, 3, edg);
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	
	
	
}

}	 


@Test	 
void testSetValue9() {

Set<ElementDeGrille> selg = new HashSet<ElementDeGrille>();

int dimention = 3;

GrilleImpl g = new GrilleImpl(selg, dimention);

ElementDeGrilleImplAsChar edg= new ElementDeGrilleImplAsChar();

try {
g.setValue(1, 3, edg);
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	
	
	
}

}	 


@Test	 
void testSetValue12() {

Set<ElementDeGrille> selg = new HashSet<ElementDeGrille>();

int dimention = 3;

GrilleImpl g = new GrilleImpl(selg, dimention);

ElementDeGrilleImplAsChar edg= new ElementDeGrilleImplAsChar();
edg.setValeur('C');
try {
g.setValue(2, 3, edg);
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	
	
	
}

}
@Test	 
void testSetValue10() {

Set<ElementDeGrille> selg = new HashSet<ElementDeGrille>();

int dimention = 3;

GrilleImpl g = new GrilleImpl(selg, dimention);

ElementDeGrilleImplAsChar edg= new ElementDeGrilleImplAsChar();
edg.setValeur('C');
try {
g.setValue(1, 2, edg);
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	
	
	
}

}

@Test	 
void testSetValue11() {

Set<ElementDeGrille> selg = new HashSet<ElementDeGrille>();

int dimention = 3;

GrilleImpl g = new GrilleImpl(selg, dimention);

ElementDeGrilleImplAsChar edg= new ElementDeGrilleImplAsChar();
edg.setValeur('C');
try {
g.setValue(1,1, edg);
}catch(HorsBornesException|ValeurImpossibleException|ElementInterditException|ValeurInitialeModificationException e){
	
	
	
}

}

@Test
void testGetValue1(){
	
	Set <ElementDeGrille> selg = new HashSet <ElementDeGrille> ();

int dimention = 3;

GrilleImpl g = new GrilleImpl(selg, dimention);

ElementDeGrilleImplAsChar edg = new ElementDeGrilleImplAsChar();

edg.setValeur('V');
	
try {	
g.getValue(1, 10);	
} catch (HorsBornesException e){
	
	
}

}

@Test
void testGetValue2(){
	
	Set <ElementDeGrille> selg = new HashSet <ElementDeGrille> ();
	
ElementDeGrilleImplAsChar el1 = new ElementDeGrilleImplAsChar();
selg.add(el1);
el1.setX(1);
el1.setY(2);
ElementDeGrilleImplAsChar el2 = new ElementDeGrilleImplAsChar();
selg.add(el2);
el2.setX(1);
el2.setY(1);
ElementDeGrilleImplAsChar el3 = new ElementDeGrilleImplAsChar();
selg.add(el3);
el3.setX(3);
el3.setY(1);
int dimention = 3;

GrilleImpl g = new GrilleImpl(selg, dimention);

	
try {
assertEquals(el2,g.getValue(1,1));

}catch(HorsBornesException e){
	
	
}



}

@Test
void testGetValue3(){
	
	Set <ElementDeGrille> selg = new HashSet <ElementDeGrille> ();
	
ElementDeGrilleImplAsChar el1 = new ElementDeGrilleImplAsChar();
selg.add(el1);
el1.setX(1);
el1.setY(2);
ElementDeGrilleImplAsChar el2 = new ElementDeGrilleImplAsChar();
selg.add(el2);
el2.setX(1);
el2.setY(1);
ElementDeGrilleImplAsChar el3 = new ElementDeGrilleImplAsChar();
selg.add(el3);
el3.setX(3);
el3.setY(1);
int dimention = 3;

GrilleImpl g = new GrilleImpl(selg, dimention);

	
try {
assertEquals(null,g.getValue(3,3));

}catch(HorsBornesException e){
	
	
}



}
@Test
void testGetValue4(){
	
	Set <ElementDeGrille> selg = new HashSet <ElementDeGrille> ();

int dimention = 3;

GrilleImpl g = new GrilleImpl(selg, dimention);

ElementDeGrilleImplAsChar edg = new ElementDeGrilleImplAsChar();

edg.setValeur('V');
	
try {	
g.getValue(10, 2);	
} catch (HorsBornesException e){
	
	
}

}
@Test
void testGetValue5(){
	
	Set <ElementDeGrille> selg = new HashSet <ElementDeGrille> ();

int dimention = 3;

GrilleImpl g = new GrilleImpl(selg, dimention);

ElementDeGrilleImplAsChar edg = new ElementDeGrilleImplAsChar();

edg.setValeur('V');
	
try {	
g.getValue(10, 10);	
} catch (HorsBornesException e){
	
	
}

}	 
@Test
void testIsComplete1() {
	
	Set<ElementDeGrille> selg = new HashSet<ElementDeGrille>();

ElementDeGrilleImplAsChar el1 = new ElementDeGrilleImplAsChar();
selg.add(el1);
ElementDeGrilleImplAsChar el2 = new ElementDeGrilleImplAsChar();
selg.add(el2);
ElementDeGrilleImplAsChar el3 = new ElementDeGrilleImplAsChar();
selg.add(el3);

ElementDeGrilleImplAsChar el4 = new ElementDeGrilleImplAsChar();
selg.add(el4);
ElementDeGrilleImplAsChar el5 = new ElementDeGrilleImplAsChar();
selg.add(el5);
ElementDeGrilleImplAsChar el6 = new ElementDeGrilleImplAsChar();
selg.add(el6);

ElementDeGrilleImplAsChar el7 = new ElementDeGrilleImplAsChar();
selg.add(el7);
ElementDeGrilleImplAsChar el8 = new ElementDeGrilleImplAsChar();
selg.add(el8);
ElementDeGrilleImplAsChar el9 = new ElementDeGrilleImplAsChar();
selg.add(el9);

int dimension = 3;

GrilleImpl g = new GrilleImpl(selg, dimension);
	assertTrue(g.isComplete());

}


@Test
void testIsComplete2(){
	
	Set<ElementDeGrille> selg=new HashSet<ElementDeGrille>();

ElementDeGrilleImplAsChar el1=new ElementDeGrilleImplAsChar();
selg.add(el1);
ElementDeGrilleImplAsChar el2=new ElementDeGrilleImplAsChar();
selg.add(el2);
ElementDeGrilleImplAsChar el3=new ElementDeGrilleImplAsChar();
selg.add(el3);

ElementDeGrilleImplAsChar el4=new ElementDeGrilleImplAsChar();
selg.add(el4);
ElementDeGrilleImplAsChar el5=new ElementDeGrilleImplAsChar();
selg.add(el5);
ElementDeGrilleImplAsChar el6=new ElementDeGrilleImplAsChar();
selg.add(el6);

ElementDeGrilleImplAsChar el7=new ElementDeGrilleImplAsChar();
selg.add(el7);


int dimension =3;

GrilleImpl g=new GrilleImpl(selg,dimension);
	
		
	assertFalse(g.isComplete());

}

@Test
void testIsPossible1(){
		
	Set<ElementDeGrille> selg=new HashSet<ElementDeGrille>();

ElementDeGrilleImplAsChar el1=new ElementDeGrilleImplAsChar();
selg.add(el1);
ElementDeGrilleImplAsChar el2=new ElementDeGrilleImplAsChar();
selg.add(el2);


ElementDeGrilleImplAsChar el3=new ElementDeGrilleImplAsChar();
selg.add(el3);

ElementDeGrilleImplAsChar el4=new ElementDeGrilleImplAsChar();
selg.add(el4);
ElementDeGrilleImplAsChar el5=new ElementDeGrilleImplAsChar();
selg.add(el5);
ElementDeGrilleImplAsChar el6=new ElementDeGrilleImplAsChar();
selg.add(el6);

ElementDeGrilleImplAsChar el7=new ElementDeGrilleImplAsChar();
selg.add(el7);


int dimension =3;

GrilleImpl g=new GrilleImpl(selg,dimension);

try{
g.isPossible(12,1,el2);
}catch(HorsBornesException|ElementInterditException e){
	
	
	
}
	
}
@Test
void testIsPossible2(){
		
	Set<ElementDeGrille> selg=new HashSet<ElementDeGrille>();

ElementDeGrilleImplAsChar el1=new ElementDeGrilleImplAsChar();
selg.add(el1);
ElementDeGrilleImplAsChar el2=new ElementDeGrilleImplAsChar();
selg.add(el2);


ElementDeGrilleImplAsChar el3=new ElementDeGrilleImplAsChar();
selg.add(el3);

ElementDeGrilleImplAsChar el4=new ElementDeGrilleImplAsChar();
selg.add(el4);
ElementDeGrilleImplAsChar el5=new ElementDeGrilleImplAsChar();
selg.add(el5);
ElementDeGrilleImplAsChar el6=new ElementDeGrilleImplAsChar();
selg.add(el6);

ElementDeGrilleImplAsChar el7=new ElementDeGrilleImplAsChar();
selg.add(el7);


int dimension =3;

GrilleImpl g=new GrilleImpl(selg,dimension);

try{
g.isPossible(1,11,el2);
}catch(HorsBornesException|ElementInterditException e){
	
	
	
}
	
}

@Test
void testIsPossible3(){
		
	Set<ElementDeGrille> selg=new HashSet<ElementDeGrille>();

ElementDeGrilleImplAsChar el1=new ElementDeGrilleImplAsChar();
selg.add(el1);
ElementDeGrilleImplAsChar el2=new ElementDeGrilleImplAsChar();
selg.add(el2);


ElementDeGrilleImplAsChar el3=new ElementDeGrilleImplAsChar();
selg.add(el3);

ElementDeGrilleImplAsChar el4=new ElementDeGrilleImplAsChar();
selg.add(el4);
ElementDeGrilleImplAsChar el5=new ElementDeGrilleImplAsChar();
selg.add(el5);
ElementDeGrilleImplAsChar el6=new ElementDeGrilleImplAsChar();
selg.add(el6);

ElementDeGrilleImplAsChar el7=new ElementDeGrilleImplAsChar();
selg.add(el7);


int dimension =3;

GrilleImpl g=new GrilleImpl(selg,dimension);

try{
g.isPossible(12,11,el2);
}catch(HorsBornesException|ElementInterditException e){
	
	
	
}
	
}
@Test
void testIsPossible4(){
		
	Set<ElementDeGrille> selg=new HashSet<ElementDeGrille>();

ElementDeGrilleImplAsChar el1=new ElementDeGrilleImplAsChar();
selg.add(el1);
ElementDeGrilleImplAsChar el2=new ElementDeGrilleImplAsChar();
selg.add(el2);

el2.setValeur('A');
ElementDeGrilleImplAsChar el3=new ElementDeGrilleImplAsChar();
selg.add(el3);

ElementDeGrilleImplAsChar el4=new ElementDeGrilleImplAsChar();
selg.add(el4);
ElementDeGrilleImplAsChar el5=new ElementDeGrilleImplAsChar();
selg.add(el5);
ElementDeGrilleImplAsChar el6=new ElementDeGrilleImplAsChar();
selg.add(el6);

ElementDeGrilleImplAsChar el7=new ElementDeGrilleImplAsChar();
selg.add(el7);


int dimension =3;

GrilleImpl g=new GrilleImpl(selg,dimension);

try{
g.isPossible(3,3,el2);
}catch(HorsBornesException|ElementInterditException e){
	
	
	
}
	
}



@Test
void testIsPossible5(){
		
	Set<ElementDeGrille> selg=new HashSet<ElementDeGrille>();

ElementDeGrilleImplAsChar el1=new ElementDeGrilleImplAsChar();
selg.add(el1);
ElementDeGrilleImplAsChar el2=new ElementDeGrilleImplAsChar();
selg.add(el2);

el2.setValeur('B');
ElementDeGrilleImplAsChar el3=new ElementDeGrilleImplAsChar();
selg.add(el3);

ElementDeGrilleImplAsChar el4=new ElementDeGrilleImplAsChar();
selg.add(el4);
ElementDeGrilleImplAsChar el5=new ElementDeGrilleImplAsChar();
selg.add(el5);
ElementDeGrilleImplAsChar el6=new ElementDeGrilleImplAsChar();
selg.add(el6);

ElementDeGrilleImplAsChar el7=new ElementDeGrilleImplAsChar();
selg.add(el7);


int dimension =3;

GrilleImpl g=new GrilleImpl(selg,dimension);

try{
assertTrue(g.isPossible(3,3,el2));
}catch(HorsBornesException|ElementInterditException e){
	
	
	
}
	
}

@Test
void testIsPossible6(){
		
	Set<ElementDeGrille> selg=new HashSet<ElementDeGrille>();

ElementDeGrilleImplAsChar el1=new ElementDeGrilleImplAsChar();
selg.add(el1);
ElementDeGrilleImplAsChar el2=new ElementDeGrilleImplAsChar();
selg.add(el2);

el2.setValeur('B');
ElementDeGrilleImplAsChar el3=new ElementDeGrilleImplAsChar();
selg.add(el3);

ElementDeGrilleImplAsChar el4=new ElementDeGrilleImplAsChar();
selg.add(el4);
ElementDeGrilleImplAsChar el5=new ElementDeGrilleImplAsChar();
selg.add(el5);
ElementDeGrilleImplAsChar el6=new ElementDeGrilleImplAsChar();
selg.add(el6);

ElementDeGrilleImplAsChar el7=new ElementDeGrilleImplAsChar();
selg.add(el7);


int dimension =3;

GrilleImpl g=new GrilleImpl(selg,dimension);

try{
assertFalse(g.isPossible(1,3,el2));
}catch(HorsBornesException|ElementInterditException e){
	
	
	
}
	
}
@Test
void testIsPossible7(){
		
	Set<ElementDeGrille> selg=new HashSet<ElementDeGrille>();

ElementDeGrilleImplAsChar el1=new ElementDeGrilleImplAsChar();
selg.add(el1);
ElementDeGrilleImplAsChar el2=new ElementDeGrilleImplAsChar();
selg.add(el2);

el2.setValeur('B');
ElementDeGrilleImplAsChar el3=new ElementDeGrilleImplAsChar();
selg.add(el3);

ElementDeGrilleImplAsChar el4=new ElementDeGrilleImplAsChar();
selg.add(el4);
ElementDeGrilleImplAsChar el5=new ElementDeGrilleImplAsChar();
selg.add(el5);
ElementDeGrilleImplAsChar el6=new ElementDeGrilleImplAsChar();
selg.add(el6);

ElementDeGrilleImplAsChar el7=new ElementDeGrilleImplAsChar();
selg.add(el7);


int dimension =3;

GrilleImpl g=new GrilleImpl(selg,dimension);

try{
assertFalse(g.isPossible(3,1,el2));
}catch(HorsBornesException|ElementInterditException e){
	
	
	
}
	
}
@Test
void testIsPossible8(){
		
	Set<ElementDeGrille> selg=new HashSet<ElementDeGrille>();

ElementDeGrilleImplAsChar el1=new ElementDeGrilleImplAsChar();
selg.add(el1);
ElementDeGrilleImplAsChar el2=new ElementDeGrilleImplAsChar();
selg.add(el2);

el2.setValeur('B');
ElementDeGrilleImplAsChar el3=new ElementDeGrilleImplAsChar();
selg.add(el3);

ElementDeGrilleImplAsChar el4=new ElementDeGrilleImplAsChar();
selg.add(el4);
ElementDeGrilleImplAsChar el5=new ElementDeGrilleImplAsChar();
selg.add(el5);
ElementDeGrilleImplAsChar el6=new ElementDeGrilleImplAsChar();
selg.add(el6);

ElementDeGrilleImplAsChar el7=new ElementDeGrilleImplAsChar();
selg.add(el7);


int dimension =3;

GrilleImpl g=new GrilleImpl(selg,dimension);

try{
assertFalse(g.isPossible(1,1,el2));
}catch(HorsBornesException|ElementInterditException e){
	
	
	
}
	
}
@Test
void testIsValeurInitiale1(){
Set<ElementDeGrille> selg=new HashSet<ElementDeGrille>();

ElementDeGrilleImplAsChar el1=new ElementDeGrilleImplAsChar();
selg.add(el1);
ElementDeGrilleImplAsChar el2=new ElementDeGrilleImplAsChar();
selg.add(el2);

el2.setValeur('B');
ElementDeGrilleImplAsChar el3=new ElementDeGrilleImplAsChar();
selg.add(el3);

ElementDeGrilleImplAsChar el4=new ElementDeGrilleImplAsChar();
selg.add(el4);
ElementDeGrilleImplAsChar el5=new ElementDeGrilleImplAsChar();
selg.add(el5);
ElementDeGrilleImplAsChar el6=new ElementDeGrilleImplAsChar();
selg.add(el6);

ElementDeGrilleImplAsChar el7=new ElementDeGrilleImplAsChar();
selg.add(el7);


int dimension =3;

GrilleImpl g=new GrilleImpl(selg,dimension);
	
	
assertTrue(g.isValeurInitiale(3,2));	
}


@Test
void testIsValeurInitiale2(){
Set<ElementDeGrille> selg=new HashSet<ElementDeGrille>();

ElementDeGrilleImplAsChar el1=new ElementDeGrilleImplAsChar();
selg.add(el1);
ElementDeGrilleImplAsChar el2=new ElementDeGrilleImplAsChar();
selg.add(el2);

el2.setValeur('B');
ElementDeGrilleImplAsChar el3=new ElementDeGrilleImplAsChar();
selg.add(el3);

ElementDeGrilleImplAsChar el4=new ElementDeGrilleImplAsChar();
selg.add(el4);
ElementDeGrilleImplAsChar el5=new ElementDeGrilleImplAsChar();
selg.add(el5);
ElementDeGrilleImplAsChar el6=new ElementDeGrilleImplAsChar();
selg.add(el6);

ElementDeGrilleImplAsChar el7=new ElementDeGrilleImplAsChar();
selg.add(el7);


int dimension =3;

GrilleImpl g=new GrilleImpl(selg,dimension);
	
	
assertFalse(g.isValeurInitiale(1,1));	
}

@Test
void testIsValeurInitiale3(){
Set<ElementDeGrille> selg=new HashSet<ElementDeGrille>();

ElementDeGrilleImplAsChar el1=new ElementDeGrilleImplAsChar();
selg.add(el1);
ElementDeGrilleImplAsChar el2=new ElementDeGrilleImplAsChar();
selg.add(el2);

el2.setValeur('B');
ElementDeGrilleImplAsChar el3=new ElementDeGrilleImplAsChar();
selg.add(el3);

ElementDeGrilleImplAsChar el4=new ElementDeGrilleImplAsChar();
selg.add(el4);
ElementDeGrilleImplAsChar el5=new ElementDeGrilleImplAsChar();
selg.add(el5);
ElementDeGrilleImplAsChar el6=new ElementDeGrilleImplAsChar();
selg.add(el6);

ElementDeGrilleImplAsChar el7=new ElementDeGrilleImplAsChar();
selg.add(el7);


int dimension =3;

GrilleImpl g=new GrilleImpl(selg,dimension);
	
	
assertFalse(g.isValeurInitiale(3,4));	
}

@Test
void testIsValeurInitiale4(){
Set<ElementDeGrille> selg=new HashSet<ElementDeGrille>();

ElementDeGrilleImplAsChar el1=new ElementDeGrilleImplAsChar();
selg.add(el1);
ElementDeGrilleImplAsChar el2=new ElementDeGrilleImplAsChar();
selg.add(el2);

el2.setValeur('B');
ElementDeGrilleImplAsChar el3=new ElementDeGrilleImplAsChar();
selg.add(el3);

ElementDeGrilleImplAsChar el4=new ElementDeGrilleImplAsChar();
selg.add(el4);
ElementDeGrilleImplAsChar el5=new ElementDeGrilleImplAsChar();
selg.add(el5);
ElementDeGrilleImplAsChar el6=new ElementDeGrilleImplAsChar();
selg.add(el6);

ElementDeGrilleImplAsChar el7=new ElementDeGrilleImplAsChar();
selg.add(el7);


int dimension =3;

GrilleImpl g=new GrilleImpl(selg,dimension);
	
	
assertFalse(g.isValeurInitiale(1,2));	
}
}
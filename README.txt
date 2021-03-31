Chessers

Echipa: Borisov Victor-Mihai
	Deliu Cosmin Dragos
	Stroe Tudor Cristian
	Tudose Theodor

Instructiuni de compilare: 
  Avem un fisier Makefile cu 3 reguli, "make build", "make clean", "make run". Codul a fost testat sa ruleze pe java 8 si 11.

Structura proiectului: 
  Avem 3 componente majore ale proiectului: Comunicarea cu xboard, reprezentarea interna a tablei si mecanismulde mutare al pieselor.
  Pentru comunicarea cu xboard am citit de la stdin comenzi si am actualizat programul nostru in functie de comanda.
  Pentru reprezentarea tablei am ales varianta unei matrici de 8x8 de patratele, pe fiecare putandu-se afla sau nu cate o piesa.
  Piesele am decis sa le implementam prin clase separate pentru fiecare tip in parte. Acest lucru ne ofera o mai buna vizibilitate a mecanismelor care se intampla in spatele mutarilor. Piesele si patratelele sunt unite printr-o legatura 1 la 1.
  Mutarile le-am facut obiecte separate de piese. Mutarile sunt definite de piesa care trebuie mutata si patratelul destinatie. O mutare poate avea si atributul de "promoted", pentru cazul in care promovam un pion. Am ales sa folosim un Strategy Pattern pentru a cauta toate mutarile posibile pentru fiecare piesa in parte. Aceasta abordare ne ofera usurinta de a implementa celelalte piese si mutarile lor aferente.

Algoritmi folositi: 
  Se genereaza toate mutarile posibile si se alege random una din ele.

Surse de inspiratie:
  https://www.gnu.org/software/xboard/engine-intf.html - pentru comunicarea cu xboard
  https://www.youtube.com/watch?v=U4ogK0MIzqk&t=1441s - pentru realizarea mutarilor (chiar daca nu am implementat nimic inca, ne-a oferit o idee mai buna asupra a ce urmeaza sa facem, si asta ne-a determinat sa facem un Strategy Pattern si clase pentru piese)
  un search pe google cu "chess layout" ca sa stim cum sa interpretam mutarile de forma "e2e3".

Responsabilitatea fiecarui membru:
  Tudor + Mihai - Comunicarea cu xboard si research pentru ce comenzi trebuie sa interpretam
  Theodor + Cosmin - Reprezentarea interna a tablei
  Theodor + Cosmin - Generarea si aplicarea mutarilor
  Tudor + Mihai - Merging si debug + testare

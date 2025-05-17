package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringTestCase {
	String a;
	String s;
	String t;
	int valorSinInicializar;
	Integer valorSinInicializar1;

	@BeforeEach
	void setUp() {
		a = "abc";
		s = a;
	}

	@Test
	void test001() { // retorna 3
		int num = s.length();
		
		assertEquals(num, 3);
	}
	
	@Test
	void test002() { // Lanza un error porque la variable t no fue inicializada, entonces por defecto es null y no se puede usar length con un null.
		int num = t.length();
		
		assertEquals(num, 0);
	}
	
	@Test
	void test003() { // El + se usa para concatenar objetos de cualquier tipo a un string. Java convierte los objs a string para hacer la concatenacion.
		String str = 1 + a;
		
		assertEquals(str, "1abc");
	}
	
	@Test
	void test004() { // Retorna el string de la variable a, pero con cada caracter en mayusculas.
		String str = a.toUpperCase();
		
		assertEquals(str, "ABC");
	}
	
	@Test
	void test005() { // Retorna el indice de la primera ocurrencia del caracter dado en el String.
		int index = "Libertad".indexOf("r");
		
		assertEquals(index, 4);
	}
	
	@Test
	void test006() { // Retorna el indice de la ultima ocurrencia del caracter dado en el String.
		int index = "Universidad".lastIndexOf('i');
		
		assertEquals(index, 7);
	}
	
	@Test
	void test007() { // Retorna un substring contenido en un string entre los indices x e y. El primer caracter del substring es el que esta en el indice x y el ultimo el que esta en el indice (y-1)
		String str = "Quilmes".substring(2,4);
		
		assertEquals(str, "il");
	}
	
	@Test
	void test008() { // Esta concatenando un 3 a "abc", entonces el string queda como "3abc". startsWith(char c), evalua si el string comienza con un caracter c. En este caso da false porque no comienza con a, sino con 3.
		boolean b = (a.length() + a).startsWith("a");
		
		assertFalse(b);
	}
	
	@Test
	void test009() { // El operador == sirve para chear si 2 strings referencian a la misma direccion de memoria (asi sabe sin son el mismo string)
		boolean b = s == a;
		
		assertTrue(b);
	}
	
	@Test
	void test010() { // equals, a diferencia de ==, chequea si el valor(contenido) es el mismo. Es mejor usar esto para comparar cosas. OJO, tienen que ser del mismo tipo las cosas que se comparan!!
		boolean b = a.substring(1,3).equals("bc");
		
		assertTrue(b);
	}
	
	@Test
	void test011() {
		assertEquals(valorSinInicializar,0);
	}
	
	@Test
	void test012() {
		assertEquals(valorSinInicializar1,null);
	}

}

package test;

import estructuraAB.ArbolB;
import estructuraABB.ArbolBB;
import estructuraAG.ArbolG;

/*
 *  Algorithms II - Lab 1
 */
public class Practico1 {

	private static ArbolB arbolBin = new ArbolB();

	private static ArbolBB arbolBinBusqueda;

	private static ArbolG arbolG;

	// static Integer hijo1 = 1, hijo2 = 2, hijo3 = 3, hijo4 = 4, hijo5 = 5;

	static Integer hijo1 = 4, hijo2 = 4, hijo3 = 4, hijo4 = 4, hijo5 = 4;

	public static void main(String[] args) {

		// binary tree operations

		previousTask("ejercicio1");

		ejercicio1_a(); // nodes quantity
		ejercicio1_b(); // leaves quantity
		ejercicio1_c(); // weight amount
		ejercicio1_d(); // height
		ejercicio1_e(); // all evens
		ejercicio1_f(); // all equals
		ejercicio1_g(); // clone
		ejercicio1_h(); // mirror
		ejercicio1_i(); // balanced tree

		// binary search tree operations
		/*
		 * previousTask("ejercicio2");
		 * 
		 * ejercicio2(); // insert(numbers) and display
		 * 
		 * ejercicio3_a(); // insert(x) ejercicio3_b(); // erase minimum
		 * ejercicio3_c(); // erase(x) ejercicio3_d(); // belongs(x)
		 * ejercicio3_e(); // list ascending order ejercicio3_f(); // list
		 * descending order
		 */
		previousTask("ejercicio4");
		ejercicio4_b();

		// transformar un arbol binario en un arbol general
		ejercicio6();

		// obtener nivel de un arbol binario
		ejercicio7_a();

		// obtener nivel de un arbol general
		ejercicio7_b();

		ejercicio8();

	}

	private static void ejercicio8() {
		System.out.println(arbolG.camino("d"));
	}

	private static void ejercicio7_a() {
		arbolBin.getNodosNivel(2);

	}

	private static void ejercicio7_b() {
		// arbol G
		arbolG.getNodosNivelClase(2);
	}

	private static void ejercicio6() {
		ArbolBB a = new ArbolBB();
		a.transformarClase(arbolBin);

	}

	private static void ejercicio4_b() {
		// llamar
		System.out.println("cant hojas" + arbolG.cantHojas());

	}

	private static void ejercicio1_a() {
		System.out.println(" 1-a) Cantidad de nodos: " + arbolBin.getCantNodos());
	}

	private static void ejercicio1_b() {

		System.out.println(" 1-b) Cantidad de hojas: " + arbolBin.cantidadDeHojas());
	}

	private static void ejercicio1_c() {
		System.out.println(" 1-c) El peso del arbol es: " + arbolBin.getPeso());
	}

	private static void ejercicio1_d() {
		System.out.println(" 1-d) La altura del arbol es: " + arbolBin.getAltura());
	}

	private static void ejercicio1_e() {
		if (arbolBin.todosPares()) {
			System.out.println(" 1-e) Todos los elementos del �rbol son pares. ");
		} else {
			System.out.println(" 1-e) Existen impares entre los elementos del �rbol. ");
		}
	}

	private static void ejercicio1_f() {

		ArbolB arbolBin2 = new ArbolB();
		arbolBin2.insertar(6);
		if (arbolBin.esIgualA(arbolBin2)) {
			System.out.println(" 1-f) Los dos arboles son iguales. ");
		} else {
			System.out.println(" 1-f) Los dos arboles son diferentes. ");
		}
	}

	private static void ejercicio1_g() {
		ArbolB arbolClon = arbolBin.clon();
		if (!arbolClon.equals(null)) {
			System.out.println(" 1-g) Se hizo un clon del arbol. ");
		}
	}

	private static void ejercicio1_h() {
		if (!arbolBin.espejo().equals(null)) {
			System.out.println(" 1-g) Se hizo un espejo del arbol. ");
		}
	}

	private static void ejercicio1_i() {
		// TODO Auto-generated method stub

	}

	private static void ejercicio2() {
		Integer[] numeros = { 3, 1, 4, 6, 9, 2, 5, 7 };
		Integer tam = numeros.length;
		for (int i = 0; i < tam; i++) {
			arbolBinBusqueda.insertarOrdenado(numeros[i]);
		}
	}

	private static void ejercicio3_a() {

		arbolBinBusqueda.insertar(hijo1);
		arbolBinBusqueda.insertar(hijo2);
		arbolBinBusqueda.insertar(hijo3);
		arbolBinBusqueda.insertar(hijo4);
		arbolBinBusqueda.insertar(hijo5);
		System.out.println(" Se insertaron hijos 1, 2, 3, 4 y 5.");
	}

	private static void ejercicio3_b() {
		arbolBinBusqueda.borrarMinimo();
		System.out.println(" Se borro el minimo elemento del arbol.");
	}

	private static void ejercicio3_c() {
		arbolBinBusqueda.borrarElemento(hijo2);
	}

	private static void ejercicio3_d() {
		if (arbolBinBusqueda.pertenece(hijo2)) {
			System.out.println(" Existe " + hijo2);
		}
	}

	private static void ejercicio3_e() {
		arbolBinBusqueda.imprimirAsc();

	}

	private static void ejercicio3_f() {
		arbolBinBusqueda.imprimirDesc();

	}

	private static void previousTask(String input) {
		if (input == "ejercicio1") {
			arbolBin = new ArbolB(hijo1);
			arbolBin.getRaiz().insertarHijo(hijo2);
			arbolBin.getRaiz().insertarHijo(hijo3);
			arbolBin.getRaiz().insertarHijo(hijo4);
		} else if (input == "ejercicio2") {
			arbolBinBusqueda = new ArbolBB();
		} else if (input == "ejercicio4") {
			ArbolG arbolG = new ArbolG();
			arbolG.insertar("a");
			arbolG.insertar("b");
			arbolG.insertar("c");
			arbolG.insertar("d");
		}
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author ARCHV
 */
public class BookArray {
    public static void main(String[] args) {
        Book libros[] = new Book[10];
        libros[0] = new Fiction("Matar a un Ruiseñor");
        libros[1] = new Fiction("Orgullo y prejuicio");
        libros[2] = new Fiction("El Diario de Ana Frank");
        libros[3] = new Fiction("Harry Potter y la piedra filosofa");
        libros[4] = new Fiction("El gran Gatsby");
        libros[5] = new NonFiction("La telaraña de Carlota");
        libros[6] = new NonFiction("Don Quijote de La Mancha");
        libros[7] = new NonFiction("Historia de dos ciudadesl");
        libros[8] = new NonFiction("El principito ");
        libros[9] = new NonFiction("Cien Años de Soledad");
    }
    
}

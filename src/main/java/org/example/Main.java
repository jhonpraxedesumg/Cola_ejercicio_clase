package org.example;

import org.example.colas.ColaLineal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ColaLineal cl = new ColaLineal();
        try {
//            for (int i=0;i<100;i++){
//                cl.insertar(i);
            cl.insertar("Carlos");
            cl.insertar(3);
            cl.insertar("Andrea");
            cl.insertar(3.333);

            System.out.println("primer elemento");
            //quitar elementos
            while (!cl.colaVacia()){
                System.out.println("elemento quitado"+cl.quitar());
            }

        }catch (Exception ex){
            System.out.println("error"+ ex.getMessage());
        }
    }
}
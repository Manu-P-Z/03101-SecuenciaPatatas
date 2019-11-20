/* 
 * Copyright 2019 Manu Portolés Zagalá.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

/**
 *
 * @author Manu Portolés Zagalá
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Constantes
        final double PRECIO_PATATAS_KG = 0.3;
        final double SALDO_JAIMITO = 1;
        final double PRECIO_PIRULETA = 0.2;
        final String NOMBRE = "Jaimito";
        final int ENCARGO = 3;
        final String ARTICULO_PEDIDO = "Patatas";
        final String ARTICULO_IMPREVISTO = "Piruleta";

        //Variables
        int patatasCompradas;
        double dineroDevuelto;
        double dineroDevueltoPir;

        //Operaciones
        dineroDevueltoPir = (SALDO_JAIMITO - PRECIO_PIRULETA);
        patatasCompradas = (int) (dineroDevueltoPir / PRECIO_PATATAS_KG);
        dineroDevuelto = dineroDevueltoPir % PRECIO_PATATAS_KG;
        //Mensajes
        System.out.println("Secuencia de Patatas");
        System.out.println("====================");
        System.out.printf("%s %s%n", "Persona encargada .....:", NOMBRE);
        System.out.printf("%s %s%n", "Artículo encargado ....:", ARTICULO_PEDIDO);
        System.out.printf("%s %d kg%n", "Cantidad encargada ....:", ENCARGO);
        System.out.println("---");
        System.out.printf("%s %.2f €/kg%n", "Precio encargo ........:", PRECIO_PATATAS_KG);
        System.out.printf("%s %.2f €%n", "Dinero suministrado ...:", SALDO_JAIMITO);
        System.out.println("---");
        System.out.printf("%s %s €%n", "Artículo imprevisto ...:", ARTICULO_IMPREVISTO);
        System.out.printf("%s %.2f €%n", "Artículo imprevisto ...:", PRECIO_PIRULETA);
        System.out.println("---");
        System.out.printf("%s %d kg%n", "Cantidad comprada .....:", patatasCompradas);
        System.out.printf("%s %.2f €%n", "Dinero devuelto .......:", dineroDevuelto);

    }

}

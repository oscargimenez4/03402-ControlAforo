/* 
 * Copyright 2019 Oscar G.4 - oscargimenez4@gmail.com.
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

import java.util.Locale;
import java.util.Random;

/**
 *
 * @author Oscar G.4 - oscargimenez4@gmail.com
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {
        //Constantes
        final int AFORO_MAX = 1234;
        final int AFORO_MIN = 0;
        final int DIAS_MAX = 7;
        final int DIAS_MIN = 0;
        final String NOMBRE_DIA1 = "Lunes";
        final String NOMBRE_DIA2 = "Martes";
        final String NOMBRE_DIA3 = "Miércoles";
        final String NOMBRE_DIA4 = "Jueves";
        final String NOMBRE_DIA5 = "Viernes";
        final String NOMBRE_DIA6 = "Sábado";
        final String NOMBRE_DIA7 = "Domingo";
        //Variables
        int aforo = 0;
        int dia = 0;
        int acumulador = 0;
        int diaMax = 0;
        int diaMin = 7;
        int aforoMax = 0;
        int aforoMin = 1234;
        int mediaAforo = 0;
        int porcentaje = 100;
        double porcAforoMed = 0;
        double porcAforoMax = 0;
        double porcAforoMin = 0;
        String nomDia = null;
        String nomDiaMin = null;
        String nomDiaMax = null;
        //Cabecera
        System.out.println("CINES DEL CENTRO COMERCIAL XeKeBó - CONTROL DE AFORO");
        System.out.println("====================================================");
        //Bucle
        for (int i = DIAS_MIN; i < DIAS_MAX; i++) {
            //Random
            aforo = RND.nextInt(AFORO_MAX - AFORO_MIN + 1) + AFORO_MIN;
            acumulador += aforo;
            //Switch para definir el nombre de dias
            switch (dia + 1) {
                case 1:
                    nomDia = NOMBRE_DIA1;
                    break;
                case 2:
                    nomDia = NOMBRE_DIA2;
                    break;
                case 3:
                    nomDia = NOMBRE_DIA3;
                    break;
                case 4:
                    nomDia = NOMBRE_DIA4;
                    break;
                case 5:
                    nomDia = NOMBRE_DIA5;
                    break;
                case 6:
                    nomDia = NOMBRE_DIA6;
                    break;
                case 7:
                    nomDia = NOMBRE_DIA7;
                    break;
            }
            dia++;
            if (aforo > aforoMax) {
                aforoMax = aforo;
                diaMax = dia;
            }
            if (aforo < aforoMin) {
                aforoMin = aforo;
                diaMin = dia;
            }
            System.out.printf("%-9s - Aforo ....: %4d personas %n", nomDia, aforo);
        }
        //Switch para cambiar el nombre del dia que menos llovio
        switch (diaMin) {
            case 1:
                nomDiaMin = NOMBRE_DIA1;
                break;
            case 2:
                nomDiaMin = NOMBRE_DIA2;
                break;
            case 3:
                nomDiaMin = NOMBRE_DIA3;
                break;
            case 4:
                nomDiaMin = NOMBRE_DIA4;
                break;
            case 5:
                nomDiaMin = NOMBRE_DIA5;
                break;
            case 6:
                nomDiaMin = NOMBRE_DIA6;
                break;
            case 7:
                nomDiaMin = NOMBRE_DIA7;
                break;
        }
        //Switch para cambiar el nombre del dia que mas llovio
        switch (diaMax) {
            case 1:
                nomDiaMax = NOMBRE_DIA1;
                break;
            case 2:
                nomDiaMax = NOMBRE_DIA2;
                break;
            case 3:
                nomDiaMax = NOMBRE_DIA3;
                break;
            case 4:
                nomDiaMax = NOMBRE_DIA4;
                break;
            case 5:
                nomDiaMax = NOMBRE_DIA5;
                break;
            case 6:
                nomDiaMax = NOMBRE_DIA6;
                break;
            case 7:
                nomDiaMax = NOMBRE_DIA7;
                break;
        }
        mediaAforo = acumulador / DIAS_MAX;
        //Calculos de porcentajes
        porcAforoMed = ((double) mediaAforo / AFORO_MAX) * porcentaje;
        porcAforoMax = ((double) aforoMax / AFORO_MAX) * porcentaje;
        porcAforoMin = ((double) aforoMin / AFORO_MAX) * porcentaje;
        System.out.println("---");
        System.out.printf("Aforo semanal ........: %4d personas %n", acumulador);
        System.out.printf(Locale.ENGLISH, "Aforo medio diario ...: %4d personas"
                + " (%5.2f%%) %n", mediaAforo, porcAforoMed);
        System.out.println("---");
        System.out.printf(Locale.ENGLISH, "Día de máximo aforo ..: %4d personas"
                + " (%5.2f%%) - %3s %n", aforoMax, porcAforoMax, nomDiaMax);
        System.out.printf(Locale.ENGLISH, "Día de mínimo aforo ..: %4d personas"
                + " (%5.2f%%) - %3s %n", aforoMin, porcAforoMin, nomDiaMin);
    }
}

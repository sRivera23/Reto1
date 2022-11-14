/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retos.reto9;
import java.io.*;

public class FlujoPorLinea {
    public static void guardarPorLineas(String ruta, String[] lineas) {
        try (PrintWriter escritor = new PrintWriter(new FileWriter(ruta))) {
            for (String linea : lineas) {
                escritor.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
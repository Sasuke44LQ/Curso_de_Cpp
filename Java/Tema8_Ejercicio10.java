/*
 * TEMA 8: ESTRUCTURAS DE DATOS AVANZADAS - EJERCICIO 10
 * =======================================================
 * Escriba un programa que implemente una red social simple con grafos.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Tema8_Ejercicio10 {
    
    static class RedSocial {
        private HashMap<String, HashSet<String>> amigos;
        
        public RedSocial() {
            amigos = new HashMap<>();
        }
        
        public void agregarUsuario(String usuario) {
            amigos.putIfAbsent(usuario, new HashSet<>());
        }
        
        public void agregarAmistad(String usuario1, String usuario2) {
            agregarUsuario(usuario1);
            agregarUsuario(usuario2);
            amigos.get(usuario1).add(usuario2);
            amigos.get(usuario2).add(usuario1);  // Amistad bidireccional
        }
        
        public void mostrarAmigos(String usuario) {
            if (amigos.containsKey(usuario)) {
                System.out.println("Amigos de " + usuario + ": " + amigos.get(usuario));
            }
        }
        
        public int contarAmigos(String usuario) {
            return amigos.getOrDefault(usuario, new HashSet<>()).size();
        }
        
        public void mostrarRed() {
            for (Map.Entry<String, HashSet<String>> entrada : amigos.entrySet()) {
                System.out.println(entrada.getKey() + " -> " + entrada.getValue());
            }
        }
    }
    
    public static void main(String[] args) {
        RedSocial red = new RedSocial();
        
        System.out.println("=== RED SOCIAL ===");
        
        // Crear amistades
        red.agregarAmistad("Juan", "María");
        red.agregarAmistad("Juan", "Carlos");
        red.agregarAmistad("María", "Ana");
        red.agregarAmistad("Carlos", "Ana");
        red.agregarAmistad("Ana", "Luis");
        
        System.out.println("\n--- Toda la red ---");
        red.mostrarRed();
        
        System.out.println("\n--- Amigos individuales ---");
        red.mostrarAmigos("Juan");
        red.mostrarAmigos("María");
        red.mostrarAmigos("Ana");
        
        System.out.println("\n--- Número de amigos ---");
        System.out.println("Juan: " + red.contarAmigos("Juan") + " amigos");
        System.out.println("María: " + red.contarAmigos("María") + " amigos");
        System.out.println("Ana: " + red.contarAmigos("Ana") + " amigos");
    }
}

/*
 * SALIDA ESPERADA:
 * === RED SOCIAL ===
 * 
 * --- Toda la red ---
 * Juan -> [Carlos, María]
 * María -> [Ana, Juan]
 * Carlos -> [Ana, Juan]
 * Ana -> [Carlos, María, Luis]
 * Luis -> [Ana]
 * 
 * --- Amigos individuales ---
 * Amigos de Juan: [Carlos, María]
 * Amigos de María: [Ana, Juan]
 * Amigos de Ana: [Carlos, María, Luis]
 * 
 * --- Número de amigos ---
 * Juan: 2 amigos
 * María: 2 amigos
 * Ana: 3 amigos
 */

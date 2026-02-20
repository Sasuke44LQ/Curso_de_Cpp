/*
 * TEMA 9: PROGRAMACIÓN ORIENTADA A OBJETOS - EJERCICIO 9
 * ========================================================
 * Implemente clases con composición: Empresa contiene Empleados.
 */

import java.util.ArrayList;

public class Tema9_Ejercicio9 {
    
    static class Empleado {
        private int id;
        private String nombre;
        private String puesto;
        private double salario;
        
        public Empleado(int id, String nombre, String puesto, double salario) {
            this.id = id;
            this.nombre = nombre;
            this.puesto = puesto;
            this.salario = salario;
        }
        
        public void mostrarInfo() {
            System.out.printf("ID: %d | %s | %s | $%.2f%n", 
                            id, nombre, puesto, salario);
        }
        
        public double getSalario() { return salario; }
    }
    
    static class Empresa {
        private String nombre;
        private ArrayList<Empleado> empleados = new ArrayList<>();
        
        public Empresa(String nombre) {
            this.nombre = nombre;
        }
        
        public void agregarEmpleado(Empleado empleado) {
            empleados.add(empleado);
            System.out.println("Empleado agregado: " + empleado);
        }
        
        public void mostrarEmpleados() {
            System.out.println("\n=== EMPLEADOS DE " + nombre.toUpperCase() + " ===");
            for (Empleado emp : empleados) {
                emp.mostrarInfo();
            }
        }
        
        public double calcularNomina() {
            double total = 0;
            for (Empleado emp : empleados) {
                total += emp.getSalario();
            }
            return total;
        }
        
        public void mostrarEstadisticas() {
            System.out.println("\n=== ESTADÍSTICAS ===");
            System.out.println("Total de empleados: " + empleados.size());
            System.out.printf("Nómina total: $%.2f%n", calcularNomina());
            System.out.printf("Salario promedio: $%.2f%n", 
                            calcularNomina() / empleados.size());
        }
    }
    
    public static void main(String[] args) {
        // Crear empresa
        Empresa empresa = new Empresa("TechCorp");
        
        // Crear empleados
        empresa.agregarEmpleado(new Empleado(1, "Juan García", "Gerente", 3000));
        empresa.agregarEmpleado(new Empleado(2, "María López", "Ingeniera", 2500));
        empresa.agregarEmpleado(new Empleado(3, "Carlos Martín", "Desarrollador", 2000));
        empresa.agregarEmpleado(new Empleado(4, "Ana Rodríguez", "Diseñadora", 1800));
        
        empresa.mostrarEmpleados();
        empresa.mostrarEstadisticas();
    }
}

/*
 * SALIDA ESPERADA:
 * Empleado agregado: Tema9_Ejercicio9$Empleado@...
 * Empleado agregado: Tema9_Ejercicio9$Empleado@...
 * Empleado agregado: Tema9_Ejercicio9$Empleado@...
 * Empleado agregado: Tema9_Ejercicio9$Empleado@...
 * 
 * === EMPLEADOS DE TECHCORP ===
 * ID: 1 | Juan García | Gerente | $3000.00
 * ID: 2 | María López | Ingeniera | $2500.00
 * ID: 3 | Carlos Martín | Desarrollador | $2000.00
 * ID: 4 | Ana Rodríguez | Diseñadora | $1800.00
 * 
 * === ESTADÍSTICAS ===
 * Total de empleados: 4
 * Nómina total: $9300.00
 * Salario promedio: $2325.00
 */

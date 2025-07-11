import java.util.Arrays;
import java.util.TreeMap;

import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoDAOTreeMap;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Xavier Ortega"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runMapExamlpe() {
        // Mapa mapa = new Mapa();
        // mapa.runHashMap();
        // mapa.runLinkedHashMap();
        // mapa.runTreeMap();
        // mapa.runHashMapObj();
        // mapa.runTreeMapObj();
    }

    private static void runEmpleadoExample() {

        
        EmpleadoDAO empleadoDAOHash = new EmpleadoDAOHashMap();
        EmpleadoContoller empleadoContollerHash = new EmpleadoContoller(empleadoDAOHash);


        EmpleadoDAO empleadoDAOTree = new EmpleadoDAOTreeMap();
        EmpleadoContoller empleadoContollerTree = new EmpleadoContoller(empleadoDAOTree);

        
        Empleado emp1 = new Empleado(4, "Pedro", "DEV");
        Empleado emp2 = new Empleado(2, "Pedro", "DEV");
        Empleado emp3 = new Empleado(5, "Juan", "DEV");
        Empleado emp4 = new Empleado(3, "Maria", "DEV");
        Empleado emp5 = new Empleado(1, "Juan", "DEV");     

        System.out.println("HashMap");

        empleadoContollerHash.agregarEmpleado(emp1);
        empleadoContollerHash.agregarEmpleado(emp2);
        empleadoContollerHash.agregarEmpleado(emp3);
        empleadoContollerHash.agregarEmpleado(emp4);
        empleadoContollerHash.agregarEmpleado(emp5);
        empleadoContollerHash.list();
        empleadoContollerHash.remove(2);
        empleadoContollerHash.list();

        System.out.println("TreeMap");
        empleadoContollerTree.agregarEmpleado(emp1);
        empleadoContollerTree.agregarEmpleado(emp2);
        empleadoContollerTree.agregarEmpleado(emp3);
        empleadoContollerTree.agregarEmpleado(emp4);
        empleadoContollerTree.agregarEmpleado(emp5);
        empleadoContollerTree.list();
        empleadoContollerTree.remove(2);
        empleadoContollerTree.list();

        


    }

    private static void runEjerccios() {

        Ejercicios ejercicios = new Ejercicios();

        System.out.println("\n--- Ejercicios ---");

        // Test sumatoriaDeDos
        System.out.println("\n--- sumatoriaDeDos ---");
        int[] nums1 = {9, 2, 3, 6};
        int objetivo1 = 5;
        int[] result1 = ejercicios.sumatoriaDeDos(nums1, objetivo1);
        if (result1 != null) {
            System.out.println("Input: nums = " + Arrays.toString(nums1) + ", objetivo = " + objetivo1 + " -> Output: [" + result1[0] + "," + result1[1] + "]");
        } else {
            System.out.println("Input: nums = " + Arrays.toString(nums1) + ", objetivo = " + objetivo1 + " -> Output: null");
        }

        int[] nums2 = {9, 2, 3, 6};
        int objetivo2 = 10;
        int[] result2 = ejercicios.sumatoriaDeDos(nums2, objetivo2);
        if (result2 != null) {
            System.out.println("Input: nums = " + Arrays.toString(nums2) + ", objetivo = " + objetivo2 + " -> Output: [" + result2[0] + "," + result2[1] + "]");
        } else {
            System.out.println("Input: nums = " + Arrays.toString(nums2) + ", objetivo = " + objetivo2 + " -> Output: null");
        }

        // Test contarCaracteres
        System.out.println("\n--- contarCaracteres ---");
        ejercicios.contarCaracteres("hola");
        ejercicios.contarCaracteres("banana");

        // Test areAnagrams and sonAnagramas
        System.out.println("\n--- Anagramas ---");
        System.out.println("listen, silent are anagrams: " + Ejercicios.areAnagrams("listen", "silent"));
        System.out.println("hello, bello are anagrams: " + Ejercicios.areAnagrams("hello", "bello"));
        System.out.println("triangle, integral are anagrams: " + Ejercicios.areAnagrams("triangle", "integral"));
        System.out.println("roma, amor are anagrams (sonAnagramas): " + ejercicios.sonAnagramas("roma", "amor"));
    }

    
}

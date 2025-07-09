package controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");
    }

    public void runHashMap() {
        System.out.println("Ejecutando HashMap");
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("001", "Celular");
        mapa.put("002", "Laptop");
        mapa.put("003", "Celular");
        mapa.put("003", "PC");
        
        System.out.println(mapa);
        System.out.println(mapa.keySet());

        for (String codigo : mapa.keySet()) {
            System.out.println("Clave: " + codigo + ", Valor: " + mapa.get(codigo));
        }

        System.out.println(mapa.get("001")); 
        System.out.println(mapa.get("005")); 
    }


    public void runLinkedHashMap() {
        System.out.println("Ejecutando LinkedHashMap");
        // crear un mapa con clave numeros y valor nombre de personas solo nombre
        //Integer - String
        // Agregen 5 elementos e imprimir todos lo VALORES

        HashMap<Integer, String> linkedMap = new HashMap<>();

        linkedMap.put(1, "Juan");
        linkedMap.put(2, "Maria");
        linkedMap.put(3, "Pedro");
        linkedMap.put(4, "Ana");
        linkedMap.put(5, "Luis");

        for (String value : linkedMap.values()) {
            System.out.println("clave: " + linkedMap + "Nombre" + linkedMap.get(value));
        }
    }

    public void runTreeMap() {
        System.out.println("Ejecutando TreeMap");

        Map<Integer, String> items = new TreeMap<>();

        items.put(3, "carro");
        items.put(6, "bicicleta");
        items.put(1, "moto");

        //imprimir los valores

         for (Integer value : items.keySet ()) {
            System.out.println("Valor: " + value);
        }

    }

    public void runHashMapObj(){
        System.out.println("Ejecutando runHashMapObj");


        Map<Empleado, Integer> empleados = new HashMap<>();

        empleados.put(new Empleado(1, "Juan ", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan ", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro ", "Dev"), 1200);
        empleados.put(new Empleado(1, "Juan ", "Dev"), 2500);
        empleados.put(new Empleado(1, "Diego ", "Dev"), 3000);

        for (Empleado  empleado : empleados.keySet()) {
            System.out.println("Empleado: " + empleado.getId() + ", Salario: " + empleados.get(empleado));
        }

    }
    public void runTreeMapObj(){

        System.out.println("Ejecutando runTreeMapObj");

        Map<Empleado, Integer> empleados = new HashMap<>();

        empleados.put(new Empleado(1, "Juan ", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan ", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro ", "Dev"), 2000);
        empleados.put(new Empleado(3, "Diego ", "Dev"), 1200);
        empleados.put(new Empleado(3, "Juan ", "Senior"), 3000);

        for (Empleado  empleado : empleados.keySet()) {
            System.out.println("Empleado: " + empleado  + "Salario: "  +  empleados.get(empleado));
        }

    }

}

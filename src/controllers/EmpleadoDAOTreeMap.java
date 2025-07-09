package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoDAOTreeMap  implements EmpleadoDAO {

    private Map<Empleado, Empleado> empleados;

    


    public EmpleadoDAOTreeMap() {
        this.empleados = new HashMap<>();
    }

    @Override
    public void add(Empleado emp) {
        empleados.put(emp, emp);       
    }

    @Override
    public void list() {
         for (Empleado  emp : empleados.values()){
             System.out.println(emp);     


        }
    }

    @Override
    public void remove(int id) {
        // OPC 1 buscar el empleado con el id
        Empleado temporal = new Empleado(id, null, null);
        empleados.remove(temporal);
    }
    
    
}

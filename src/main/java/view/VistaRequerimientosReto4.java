package view;

import controller.ControladorRequerimientosReto4;
//import model.vo.LiderCiudad;
import model.vo.SumaProveedor;
import model.vo.LiderCiudad;
import model.vo.ProyectoCiudad;

import java.sql.SQLException;
import java.util.ArrayList;

public class VistaRequerimientosReto4 {

    public static ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();

    public static void requerimiento1() {

        System.out.println("-----Proyecto Ciudad-------");
        System.out.println("Constructora Fecha_Inicio Clasificación");

        try {
            ArrayList<ProyectoCiudad> proyectos = controlador.consultarProyectoCiudad();

            for(ProyectoCiudad p: proyectos){
                System.out.printf("%s %s %s %n",p.getConstructora(), p.getFechaInicio(), p.getClasificacion());
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }

    public static void requerimiento3() {  
        
        System.out.println("-----Suma Cantidades-------");
        System.out.println("Suma Cantidades");
        
        try {
            ArrayList<SumaProveedor> sumProveedor = controlador.consultarSumaProveedor();

            for(SumaProveedor s: sumProveedor){
                System.out.printf("%s %n", s.getSumaCantidades());
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void requerimiento4() {

        System.out.println("-----Líder Ciudad-------");
        System.out.println("Nombre Líder");

        try {
            ArrayList<LiderCiudad> liderCiudad = controlador.consultarLiderCiudad();

            for(LiderCiudad l: liderCiudad){
                System.out.printf("%s %n", l.getLiderCiudad());
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
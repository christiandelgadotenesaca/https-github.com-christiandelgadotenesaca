/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import Datos.Cls_Conexion;
import java.sql.ResultSet;
import javax.swing.JTable;

/**
 *
 * @author USUARIO
 */
public class Cls_Transacciones {
    private String TRAN_CODIGO; 
    private String TRAN_DESCRIPCION;
    private int TRAN_NUM_INICIO;
    private int TRAN_NUM_FIN;
    private int TRAN_NUM_SIGUIENTE;
    private String TRAN_NUM_FECHA_INICIO;
    private String TRAN_NUM_FECHA_CADUCA;
   
    //Constructores
    public Cls_Transacciones(String TRAN_CODIGO, String TRAN_DESCRIPCION, int TRAN_NUM_INICIO, int TRAN_NUM_FIN, int TRAN_NUM_SIGUIENTE, String TRAN_NUM_FECHA_INICIO, String TRAN_NUM_FECHA_CADUCA) {
        this.TRAN_CODIGO = TRAN_CODIGO;
        this.TRAN_DESCRIPCION = TRAN_DESCRIPCION;
        this.TRAN_NUM_INICIO = TRAN_NUM_INICIO;
        this.TRAN_NUM_FIN = TRAN_NUM_FIN;
        this.TRAN_NUM_SIGUIENTE = TRAN_NUM_SIGUIENTE;
        this.TRAN_NUM_FECHA_INICIO = TRAN_NUM_FECHA_INICIO;
        this.TRAN_NUM_FECHA_CADUCA = TRAN_NUM_FECHA_CADUCA;
    }
    //sobrecarga
     public Cls_Transacciones(String TRAN_CODIGO, int TRAN_NUM_SIGUIENTE) {
        this.TRAN_CODIGO = TRAN_CODIGO;
        this.TRAN_NUM_SIGUIENTE = TRAN_NUM_SIGUIENTE;
     
    }
    public Cls_Transacciones() {    
    } 
    
    
    public String getTRAN_CODIGO() {
        return TRAN_CODIGO;
    }

    public String getTRAN_DESCRIPCION() {
        return TRAN_DESCRIPCION;
    }

    public int getTRAN_NUM_INICIO() {
        return TRAN_NUM_INICIO;
    }

    public int getTRAN_NUM_FIN() {
        return TRAN_NUM_FIN;
    }

    public int getTRAN_NUM_SIGUIENTE() {
        return TRAN_NUM_SIGUIENTE;
    }

    public String getTRAN_NUM_FECHA_INICIO() {
        return TRAN_NUM_FECHA_INICIO;
    }

    public String getTRAN_NUM_FECHA_CADUCA() {
        return TRAN_NUM_FECHA_CADUCA;
    }
    Cls_Conexion cnx= new Cls_Conexion();
    public void Guardar (){
        cnx.ejecutar("call SPGuardarActualizarTransacciones('"+TRAN_CODIGO+"','"+TRAN_DESCRIPCION+"',"+TRAN_NUM_INICIO+","+TRAN_NUM_FIN+","+TRAN_NUM_SIGUIENTE+",'"+TRAN_NUM_FECHA_INICIO+"','"+TRAN_NUM_FECHA_CADUCA+"')");
    }
    public void ActualizarNumSiguiente(){
        cnx.ejecutar("call SPGuardarActualizarTransacciones('"+TRAN_CODIGO+"',null,0,0,"+TRAN_NUM_SIGUIENTE+",null,null)");
    }
       
     public void CargarDatos(JTable tblTransacciones)
    {
    //select* sirve para selecionar todos los datos que existen en la tabla
         cnx.CargarTabla("SELECT  TRAN_CODIGO AS CODIGO, TRAN_DESCRIPCION AS DESCRIPCION,TRAN_NUM_FECHA_INICIO AS FECHAINICIO, TRAN_NUM_FECHA_CADUCA AS FECHACADUCA,TRAN_NUM_INICIO AS INICIO,TRAN_NUM_FIN AS FIN,TRAN_NUM_SIGUIENTE AS PROXNUM  FROM transacciones_tb", tblTransacciones);
     
    }
     public String ConsFechaCad (){
        String FechaCad = cnx.ConsultaFechaCad("select TRAN_NUM_FECHA_CADUCA as FECHACADUCA from transacciones_tb where TRAN_CODIGO='FAC'");
        return FechaCad;
        //REvisar
     }
       
    
}

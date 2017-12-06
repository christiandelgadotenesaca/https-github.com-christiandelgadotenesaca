/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import Datos.Cls_Conexion;
import javax.swing.JTable;

/**
 *
 * @author USUARIO
 */
public class Cls_Producto {
    private int PROD_CODIGO;
    private int PROD_COD_ALTER; 
    private String PROD_DETALLE;
    private int PROD_STOCK;
    private double PROD_V_UNITARIO;
    private String PROD_ESTADO;

    public Cls_Producto(int PROD_CODIGO,int PROD_COD_ALTER, String PROD_DETALLE, int PROD_STOCK, double PROD_V_UNITARIO, String PROD_ESTADO) {
        this.PROD_CODIGO = PROD_CODIGO;
        this.PROD_COD_ALTER = PROD_COD_ALTER; 
        this.PROD_DETALLE = PROD_DETALLE;
        this.PROD_STOCK = PROD_STOCK;
        this.PROD_V_UNITARIO = PROD_V_UNITARIO;
        this.PROD_ESTADO = PROD_ESTADO;
    }
    
    public Cls_Producto(){
    }
    /**
     * @return the PROD_CODIGO
     */
    public int getPROD_CODIGO() {
        return PROD_CODIGO;
    }

    /**
     * @return the PROD_COD_ALTER
     */
    public int getPROD_COD_ALTER() {
        return PROD_COD_ALTER;
    }
    /**
     * @return the PROD_DETALLE
     */
    public String getPROD_DETALLE() {
        return PROD_DETALLE;
    }

    /**
     * @return the PROD_STOCK
     */
    public int getPROD_STOCK() {
        return PROD_STOCK;
    }

    /**
     * @return the PROD_V_UNITARIO
     */
    public double getPROD_V_UNITARIO() {
        return PROD_V_UNITARIO;
    }
    
    public String getPROD_ESTADO() {
        return PROD_ESTADO;
    }
    
    
     Cls_Conexion cnx=new Cls_Conexion();
  public void Guardar()
    {
        cnx.ejecutar("Insert into producto_tb (PROD_CODIGO,PROD_DETALLE,PROD_STOCK,PROD_V_UNITARIO,PROD_ESTADO) values ("+PROD_CODIGO+",'"+PROD_DETALLE+"',"+PROD_STOCK+","+PROD_V_UNITARIO+",'"+PROD_ESTADO+"')");
    }  
    public void GuardarActualizar()
    {
        cnx.ejecutar("Call SPGuardarActualizarProductos ("+PROD_CODIGO+","+PROD_COD_ALTER+",'"+PROD_DETALLE+"',"+PROD_STOCK+","+PROD_V_UNITARIO+",'"+PROD_ESTADO+"')");
    }
  //Frm_Buscar_Productos
   public void CargarDatos(JTable tblProductos)
    {
    //select* sirve para selecionar todos los datos que existen en la tabla
     cnx.CargarTabla("Select PROD_CODIGO as COD,PROD_COD_ALTER as CODIGO,PROD_DETALLE as DETALLE,PROD_STOCK as STOCK,PROD_V_UNITARIO as VALOR_UNITARIO  from producto_tb WHERE PROD_ESTADO='ACTIVO'", tblProductos);
     
    }
   //Frm_Productos
   public void CargarDatosTODOS(JTable tblProductos)
    {
    //select* sirve para selecionar todos los datos que existen en la tabla
     cnx.CargarTabla("Select PROD_CODIGO as COD,PROD_COD_ALTER as CODIGO, PROD_DETALLE as DETALLE,PROD_STOCK as STOCK,PROD_V_UNITARIO as VALOR_UNITARIO, PROD_ESTADO as ESTADO  from producto_tb", tblProductos);
     
    }
   //Frm_Buscar_Productos
   public void CargarDatosBuscados(JTable tblProductos, String valor)
    {
    //select* sirve para selecionar todos los datos que existen en la tabla
     cnx.CargarTabla("Select PROD_CODIGO as COD,PROD_COD_ALTER as CODIGO,PROD_DETALLE as DETALLE,PROD_STOCK as STOCK,PROD_V_UNITARIO as VALOR_UNITARIO from producto_tb where CONCAT (PROD_COD_ALTER,' ',PROD_DETALLE)  LIKE '%"+valor+"%' AND PROD_ESTADO ='ACTIVO' ", tblProductos);
     
    }
   //Frm_Productos
   public void CargarDatosBuscadosTODOS(JTable tblProductos, String valor)
    {
    //select* sirve para selecionar todos los datos que existen en la tabla
     cnx.CargarTabla("Select PROD_CODIGO as COD,PROD_COD_ALTER as CODIGO,PROD_DETALLE as DETALLE,PROD_STOCK as STOCK,PROD_V_UNITARIO as VALOR_UNITARIO, PROD_ESTADO as ESTADO from producto_tb where CONCAT (PROD_COD_ALTER,' ',PROD_DETALLE)  LIKE '%"+valor+"%'", tblProductos);
     
    }
    public Integer ConsultarProd(){
        Integer Consultarprod = cnx.ConsultaCodigoProd("Select max(PROD_CODIGO)+1 as MAXIMO from producto_tb") ; 
        return Consultarprod;   
    }

    
}

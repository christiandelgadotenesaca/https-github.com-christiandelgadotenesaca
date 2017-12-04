/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Formularios;

import Clases.Cls_Producto;
import static Formularios.Frm_Factura.i;
import static Formularios.Frm_Factura.lbl_total;
import static Formularios.Frm_Factura.matriz;
import static Formularios.Frm_Factura.tbl_detalle;
import static Formularios.Frm_Factura.total;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showConfirmDialog;

/**
 *
 * @author USUARIO
 */
public class Frm_Buscar_Producto extends javax.swing.JInternalFrame {
     boolean bandera;
     boolean banderanumero;
    /**
     * Creates new form Frm_Buscar_Producto
     */
    public Frm_Buscar_Producto() {
        initComponents();
        this.setTitle("Buscar Productos");
        Cls_Producto c1=new Cls_Producto();
        c1.CargarDatos(tblProductos);
        bandera = false;
        banderanumero=false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();

        setClosable(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));
        jPanel2.setPreferredSize(new java.awt.Dimension(361, 43));

        jLabel7.setText("Buscar :");

        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel7)
                .addGap(35, 35, 35)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel7)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de Productos"));

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
        Cls_Producto c1 = new Cls_Producto();
        c1.CargarDatosBuscados(tblProductos,txt_buscar.getText());
    }//GEN-LAST:event_txt_buscarKeyReleased

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
     int valor =  showConfirmDialog(null,"¿Seleccionar el Producto?","Opcion",JOptionPane.YES_NO_OPTION);
        
        if(valor==0){
           
            if(tblProductos.getSelectedRow()>=0)
            {
                //bandera para validar que el codigo no se repita
                bandera=false;  
                String [] datosLeidos={
//                    0
                    String.valueOf(tblProductos.getValueAt(tblProductos.getSelectedRow(),0)),
//                    1
                    String.valueOf(tblProductos.getValueAt(tblProductos.getSelectedRow(),1)),
//                    String.valueOf(tblProductos.getValueAt(tblProductos.getSelectedRow(),2)),
//                    2
                    String.valueOf(tblProductos.getValueAt(tblProductos.getSelectedRow(),3)),
                };
            // validar que el codigo no se repita    
            if (i>0){    
                for (int n=0;n<i;n++){
//                     JOptionPane.showMessageDialog(null,matriz[n][0] );
//                     JOptionPane.showMessageDialog(null,datosLeidos[0] );
                        if (Integer.parseInt(matriz[n][0])==Integer.parseInt(datosLeidos[0]))
                        {
                         bandera= true;
                         JOptionPane.showMessageDialog(null, "Error el producto seleccionado ya se encuentra en la factura");
                        }
                }
            }
            //bandera para validar que el codigo no se repita
            if(bandera==false){
                //pide la cantidad a ingresar
                String scantidad= (JOptionPane.showInputDialog("Cantidad"));
                //valida que la cantidad sea un dato numerico
                try {
                Integer numero = Integer.parseInt(scantidad);
                }
                catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "El dato digitado no es un numero","Error",JOptionPane.ERROR_MESSAGE);
                banderanumero=true;
                }
                //valida que la cantidad ingresado no sea nulo o caracter 
                if ((scantidad==null) || (banderanumero==true)) {
                } else {
                                   
                    int cantidad = Integer.parseInt(scantidad);
                    //valida que la cantidad sea mayor a cero
                    if ( (cantidad > 0)  )
                    {
                    double total_item = cantidad * Double.parseDouble(datosLeidos[2]);
                    //redondeo de numeros
                    double aux= Math.rint(total_item*100)/100;
                    total_item=aux;
                    //codigo no se ve 
                    matriz [i][0]=datosLeidos[0];
                    //cantidad 
                    matriz [i][1]=scantidad;
                    //detalle
                    matriz [i][2]=datosLeidos[1];
                    //v_unitario
                    matriz [i][3]=datosLeidos[2];
                    //v_total
                    matriz [i][4]=String.valueOf(total_item);
                    
                    for(int x=0;x<=i;x++){
                        
                        Frm_Factura.tbl_detalle.setValueAt(Integer.parseInt(matriz[x][1]), i, 0);
                        Frm_Factura.tbl_detalle.setValueAt(matriz[x][2], i, 1);
                        Frm_Factura.tbl_detalle.setValueAt(matriz[x][3], i, 2);
                        Frm_Factura.tbl_detalle.setValueAt(matriz[x][4], i, 3);
 
                    }
                    //cargar total
                    total = total + total_item;
                    double aux2= Math.rint(total*100)/100;
                    total=aux2;
                    lbl_total.setText(Double.toString(total));
                     
                    i=i+1;
                    this.setVisible(false);
                    //
                    } else {
                        JOptionPane.showMessageDialog(null,"La cantidad debe ser mayor a cero","Error",JOptionPane.ERROR_MESSAGE );
                    }
                }
                //una vez que el ingreso fue invalido la bandera vuelve a ser false 
                banderanumero=false;      

            }
            }
        }
  
    }//GEN-LAST:event_tblProductosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}

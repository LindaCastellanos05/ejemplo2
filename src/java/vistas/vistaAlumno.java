/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rendertabla.renderBotones;
import rendertabla.renderFoto;
import ws.ModeloAlumno;
import ws.WSColegioIntecap;
import ws.WSColegioIntecap_Service;

/**
 *
 * @author Linda
 */
public class vistaAlumno extends javax.swing.JFrame implements MouseListener {
    String ruta=null;
    DefaultTableModel mimodelAlumno;
    ArrayList<ModeloAlumno> dataAlumno = new ArrayList<>();
    WSColegioIntecap_Service servicio = new WSColegioIntecap_Service();
    WSColegioIntecap cliente = servicio.getWSColegioIntecapPort();
    
    /**
     * Creates new form vistaAlumno
     */
    
    public vistaAlumno() {
        initComponents();
        setLocationRelativeTo(null);
        listaAlumnoss();
        tblalumnos.addMouseListener(this);
    }
    public void listaAlumnoss(){
        tblalumnos.setDefaultRenderer(Object.class, new renderFoto());
        String Titulo[]={"id_alumno","nombre_alumno","apellido_alumno","imagen"};
        mimodelAlumno = new DefaultTableModel(null, Titulo);
        
        dataAlumno = (ArrayList<ModeloAlumno>) cliente.todosalumnos();
        int tamano = cliente.todosalumnos().size();
        
        Object[]obj = new Object[4];
        for (int i=0;i<tamano;i++){
            obj[0]=dataAlumno.get(i).getIdAlumno();
            obj[1]=dataAlumno.get(i).getNombreAlumno();
            obj[2]=dataAlumno.get(i).getApellidoAlumno();
          
            String value =dataAlumno.get(i).getFoto();
            if(value!=null){
            //System.out.println(value);
            byte[]data = Base64.getDecoder().decode(value);
            
            try{
                BufferedImage img = null;
                try{
                    img = ImageIO.read(new ByteArrayInputStream(data));
                    
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
                ImageIcon icon = new ImageIcon(img.getScaledInstance(50, 50, 50));
                obj[3] = new JLabel(icon);
                
            }catch(Exception e){
                obj[3] = "no image";
            }
            }else{
                 obj[3] = "no image";
            }
            mimodelAlumno.addRow(obj);
        }
         tblalumnos.setRowHeight(60);
        tblalumnos.setModel(mimodelAlumno);
    }
    //accedera a la tabla
  public void vertabla(){
             int numfilas = tblalumnos.getColumnCount();
                 
       String[] par = new String[numfilas];
       for( int i =0; i< numfilas; i++){
       par [i]= String .valueOf(tblalumnos.getValueAt(tblalumnos.getSelectedRow(), i));
     
 }
       String nombrealumno = par[1];
       String apellidoalumno = par[2];
       String idalumno = par[0];
       
       txtnombreal.setText(nombrealumno);
       txtapellidoal.setText(apellidoalumno);
       txtidal.setText(idalumno);

  System.out.println("se esta haciendo click en la tabla");
  }

  public void limpiar(){
      txtidal.setText("");
      txtnombreal.setText("");
      txtapellidoal.setText("");
      lblruta.setText("");
      lblfoto.setIcon(null);
  }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblalumnos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtidal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnombreal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtapellidoal = new javax.swing.JTextField();
        btncrearal = new javax.swing.JButton();
        btneditaral = new javax.swing.JButton();
        btneliminaral = new javax.swing.JButton();
        lblruta = new javax.swing.JLabel();
        btnfoto = new javax.swing.JButton();
        lblfoto = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnbuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        tblalumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblalumnos);

        jPanel2.setBackground(new java.awt.Color(255, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ALUMNOS");

        jLabel2.setText("ID Alumno:");

        jLabel3.setText("Nombre Alumno:");

        jLabel4.setText("Apellido Alumno:");

        btncrearal.setText("crear");
        btncrearal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearalActionPerformed(evt);
            }
        });

        btneditaral.setText("editar");
        btneditaral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditaralActionPerformed(evt);
            }
        });

        btneliminaral.setText("eliminar");
        btneliminaral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminaralActionPerformed(evt);
            }
        });

        btnfoto.setText("foto");
        btnfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfotoActionPerformed(evt);
            }
        });

        jLabel5.setText("Elejir foto alumno:");

        btnbuscar.setText("buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtidal, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnbuscar))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtapellidoal, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                            .addComponent(txtnombreal)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2))))
                                .addComponent(btnfoto)
                                .addComponent(jLabel5))
                            .addComponent(lblruta, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btneliminaral)
                                    .addComponent(btneditaral)
                                    .addComponent(btncrearal)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar))
                .addGap(3, 3, 3)
                .addComponent(btncrearal)
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtnombreal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneditaral))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btneliminaral))
                .addGap(18, 18, 18)
                .addComponent(txtapellidoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnfoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblruta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncrearalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearalActionPerformed
        if(lblruta.getText().toString().equals("")||txtnombreal.getText().toString().equals("")
                ||txtapellidoal.getText().toString().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar un nombre, apellido y foto del alumno");
        }else{
        String nombre = txtnombreal.getText().toString();
        String apellido = txtapellidoal.getText().toString();
        
        ModeloAlumno modal = new ModeloAlumno();
        modal.setApellidoAlumno(apellido);
        modal.setNombreAlumno(nombre);
        modal.setFoto(lblruta.getText().toString());
       
        cliente.crearAlumno(modal);
        JOptionPane.showMessageDialog(this, "Se ha añadido exitosamente");
        listaAlumnoss();
        limpiar();
        }
    }//GEN-LAST:event_btncrearalActionPerformed

    private void btneditaralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditaralActionPerformed
        if(txtnombreal.getText().toString().equals("")||txtapellidoal.getText().toString().equals("")||
                txtidal.getText().toString().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar el nombre, apellido y ID del alumno que"
                    + "desea editar");
        }else{ 
            
        String nombre = txtnombreal.getText().toString();
        String apellido = txtapellidoal.getText().toString();
        int id = Integer.parseInt(txtidal.getText().toString());
        
        ModeloAlumno modal = new ModeloAlumno();
        modal.setApellidoAlumno(apellido);
        modal.setNombreAlumno(nombre);
        modal.setFoto(lblruta.getText().toString());
        
        modal.setIdAlumno(id);
       
        if(lblruta.getText().toString().equals("")){
               cliente.actualizarAlumno2(modal);
       }else{
            cliente.actualizarAlumno(modal);
        }
        
        JOptionPane.showMessageDialog(this, "Se ha editado exitosamente");
        listaAlumnoss();
        limpiar();
        }
    }//GEN-LAST:event_btneditaralActionPerformed

    private void btneliminaralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminaralActionPerformed
        if(txtidal.getText().toString().equals("")){
            JOptionPane.showMessageDialog(this, "Debe seleccionar el ID del alumno que desea eliminar");
        }else{
        int id = Integer.parseInt(txtidal.getText().toString());
        
         ModeloAlumno modal = new ModeloAlumno();
         modal.setIdAlumno(id);
         
         cliente.eliminarAlumno(id);
         JOptionPane.showMessageDialog(this, "Se ha eliminado exitosamente");
        listaAlumnoss();
        limpiar();
        }
    }//GEN-LAST:event_btneliminaralActionPerformed

    private void btnfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfotoActionPerformed
        JFileChooser btnseleccionar = new JFileChooser();
       btnseleccionar.setCurrentDirectory(new File("Pictures"));
       
       //captura imagen y ruta
       int ap = btnseleccionar.showOpenDialog(this);
       
       if(ap==JFileChooser.APPROVE_OPTION){
           ruta= btnseleccionar.getSelectedFile().getAbsolutePath();
           lblruta.setText(ruta);
           //proporciones:
           ImageIcon imagenicon = new ImageIcon(ruta);
           Image image = imagenicon.getImage();
           Image nuevaimagen = image.getScaledInstance(60, 60, 60);
           
           //imagenicon = new ImageIcon();
           lblfoto.setIcon(new ImageIcon(nuevaimagen));
           
       }
    }//GEN-LAST:event_btnfotoActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        if(txtidal.getText().toString().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar un ID para la busqueda de alumno");
        }else{
        int id = Integer.parseInt(txtidal.getText().toString());
        ModeloAlumno moda = new ModeloAlumno();
         if(cliente.buscarAlumno(id).isEmpty()){
           JOptionPane.showMessageDialog(this, "error, no existe alumno");
          
         }else{
            List<ModeloAlumno> listaid = cliente.buscarAlumno(id);
            
            System.out.println("id"+listaid.get(0).getIdAlumno());
            for(int i=0;i<listaid.size();i++){
                int idalumno=(listaid.get(i).getIdAlumno());
                  System.out.println("esto es id for"+idalumno);
                String nombrealumno = listaid.get(i).getNombreAlumno();
                System.out.println("esto es nombre for"+nombrealumno);
                 txtnombreal.setText(nombrealumno);
                 String apealumno = listaid.get(i).getApellidoAlumno();
                 System.out.println("esto es ape for"+apealumno);
                 txtapellidoal.setText(apealumno);
                 
            }
       
         }
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vistaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncrearal;
    private javax.swing.JButton btneditaral;
    private javax.swing.JButton btneliminaral;
    private javax.swing.JButton btnfoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JLabel lblruta;
    private javax.swing.JTable tblalumnos;
    private javax.swing.JTextField txtapellidoal;
    private javax.swing.JTextField txtidal;
    private javax.swing.JTextField txtnombreal;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==tblalumnos){
            vertabla();
        }
         }

    @Override
    public void mousePressed(MouseEvent e) {
         }

    @Override
    public void mouseReleased(MouseEvent e) {
         }

    @Override
    public void mouseEntered(MouseEvent e) {
        }

    @Override
    public void mouseExited(MouseEvent e) {
        }
}

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Image;

public class Formulario extends Requerimientos {
JFrame frame;
JTable tabla1, tabla2, tabla3 = new JTable();
JButton send1, send2, send3;
Image imagen;

public Formulario () throws SQLException {
initformulario();
}
private void initformulario () throws SQLException {
frame = new JFrame("RETO 5 <BEATRIZ RODRIGUEZ>");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(600, 700);
frame.setResizable(false);

// Creando MenuBar y agregando componentes
JMenuBar mb = new JMenuBar();
mb.setAlignmentY(Component.LEFT_ALIGNMENT);
JMenu m1 = new JMenu("EXIT");
JMenu m2 = new JMenu("CONSULTAS");
JMenu m3 = new JMenu("PARTICIPANTE");

// Adición de Jmenu a JmenuBar
mb.add(m1);
mb.add(m2);
mb.add(m3);

//Creando los JmenuItem
JMenuItem MeI1 = new JMenuItem("Salir");
JMenuItem MeI2 = new JMenuItem("Consulta 1");
JMenuItem MeI3 = new JMenuItem("Consulta 2");
JMenuItem MeI4 = new JMenuItem("Consulta 3");
JMenuItem MeI5 = new JMenuItem("Grupo 51, Reto 5, Beatriz Rodriguez");

// Adición de JMenuItem a JMenu
m1.add(MeI1);
m2.add(MeI2);
m2.add(MeI3);
m2.add(MeI4);
m3.add(MeI5);

// Construcción del objeto JPanel para albergar la botonera
JPanel Botonera = new JPanel();

// Designar al panel un FLOWLAYOUT  con componentes centrados
Botonera.setLayout(new FlowLayout(FlowLayout.CENTER));

// Creación de Label para dar espacio entre los botones
JLabel espacio1 = new JLabel("        ");
JLabel espacio2 = new JLabel("        ");

// Construción de botones
JButton send1 = new JButton("Consulta 1");
JButton send2 = new JButton("Consulta 2");
JButton send3 = new JButton("Consulta 3");

// Adición de botones al panel
Botonera.add(send1);
Botonera.add(espacio1);
Botonera.add(send2);
Botonera.add(espacio2);
Botonera.add(send3);

// Creación de las tablas y de las cabeceras para ser usadas más adelante

// Consulta 1:
String[] nombres1 = {"Nombre_Material","Precio_Unidad"};
tabla1 = new JTable(mostrar(),nombres1);


// Consulta 2:
String[] nombres2 = {"CONSTRUCTORA","CIUDAD"};
tabla2 = new JTable(mostrar1(),nombres2);

// Consulta 3:
String[] nombres3 = {"PROVEEDOR","NOMBRE MATERIAL", "IMPORTADO","PRECIO UNIDAD", "CANTIDAD"};
tabla3 = new JTable(mostrar2(),nombres3);

// Creación del Jscroll para las tablas
JScrollPane Panel = new JScrollPane();
// Agregar los paneles al panel Bordelayout que es el principal
frame.getContentPane().add(BorderLayout.SOUTH,Botonera);
frame.getContentPane().add(Panel, BorderLayout.CENTER);
frame.getContentPane().add(BorderLayout.NORTH,mb);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
frame.setLocationRelativeTo(null);

// Se crean los eventos Actionlistener y se adicionan al botón y los menuitem
// Para el evento clic de un botón, al hacer clic se alimenta el panel con la tabla 1

ActionListener consulta1 = new ActionListener(){
@Override
public void actionPerformed(ActionEvent ae){
Panel.add(tabla1);
// para que se visualice la tabla:
Panel.setViewportView(tabla1);
}
};
send1.addActionListener(consulta1);
MeI2. addActionListener(consulta1);

ActionListener consulta2 = new ActionListener(){
@Override
public void actionPerformed(ActionEvent ae){
Panel.add(tabla2);
// para que se visualice la tabla:
Panel.setViewportView(tabla2);
}
};
send2.addActionListener(consulta2);
MeI3. addActionListener(consulta2);

ActionListener consulta3 = new ActionListener(){
@Override
public void actionPerformed(ActionEvent ae){
Panel.add(tabla3);
// para que se visualice la tabla:
Panel.setViewportView(tabla3);
}
};
send3.addActionListener(consulta3);
MeI4. addActionListener(consulta3);

// Evento listener para salir

ActionListener salir = new ActionListener(){
@Override
public void actionPerformed(ActionEvent ae){
// para cerrar la aplicación
System.exit(0);
}
};

MeI1.addActionListener(salir);
}
}


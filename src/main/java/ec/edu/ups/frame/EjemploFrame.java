/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.frame;

import ec.edu.ups.frame.clases.EsquemaRaton;
import ec.edu.ups.frame.clases.InterrupcionesDeAccion;
import ec.edu.ups.frame.clases.InterrupcionesDeElemento;
import ec.edu.ups.frame.clases.InterrupcionesDeEnfoque;
import ec.edu.ups.frame.clases.InterrupcionesDeRaton;
import ec.edu.ups.frame.clases.InterrupcionesDeTeclado;
import ec.edu.ups.frame.clases.InterrupcionesDeVentana;
import ec.edu.ups.frame.clases.MiVentana;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.Point;
import java.awt.TextField;

/**
 *
 * @author User
 */
public class EjemploFrame {

    public static void main(String[] args) {
        
        //----Creacion de ventanas-----
        //Frame miVentana= new Frame();
        //miVentana.setSize(600,400);
        //miVentana.setTitle("Mi ventana de ejemplo");
        //miVentana.setVisible(true);
        
        // -----Creacion de ventanas propias-----
        //MiVentana v1 = new MiVentana();
        //MiVentana v2 = new MiVentana("Ventana2");
        //MiVentana v3 = new MiVentana("Ventana3", 400, 200);
          
        //-----Posicionamiento-----
        //Frame miMarco = new Frame();
        //miMarco.setSize(600, 400);
        //miMarco.setTitle("Mi ventana de ejemplo");
        //miMarco.setLocation(new Point(100,220));
        //miMarco.setVisible(true);
          
        //-----Posicionamiento con un constructor----- 
        //MiVentana v3 = new MiVentana("Ventana3", 400, 200, 400, 100);
        
        //-----Boton1-----
        //Frame miVentana = new Frame();
        //Button botonHola = new Button("Hola");
        //miVentana.setSize(400, 200);
        //miVentana.setTitle("Ventana con botón");
        //miVentana.setVisible(true);
        //miVentana.add(botonHola);
        
        //-----Ventana con panel-----
        //Frame miVentana = new Frame();
        //Panel miPanel = new Panel();
        //Button botonArea = new Button("Calcular área");
        //Button boton2 = new Button("Hola");
        //Button botonPerimetro = new Button("Calcular Perimetro");
        //Button boton3 = new Button("Bye");
        //miVentana.setSize(600, 400);
        //miVentana.setTitle("Ventana con botones");
        //miVentana.setVisible(true);
        //miVentana.add(miPanel);
        //FlowLayout posicionamientoSecuencial = new FlowLayout(FlowLayout.RIGHT);
        //miPanel.setLayout(posicionamientoSecuencial);
        //miPanel.add(botonArea);
        //miPanel.add(botonPerimetro);
        //miPanel.add(boton2);
        //miPanel.add(boton3);
        
        //-----Utilizacion de paneles-----
        //Frame miMarco = new Frame();
        //Panel panelPrincipal = new Panel();
        //Panel panelIzq = new Panel();
        //Panel panelDcha = new Panel();
        //Button botonCorrer = new Button("Correr");
        //Button botonSaltar = new Button("Saltar");
        //Button botonDescansar = new Button("Descansar");
        //miMarco.add(panelPrincipal);
        //panelPrincipal.add(panelIzq);
        //panelPrincipal.add(panelDcha);
        //panelIzq.add(botonCorrer);
        //panelIzq.add(botonSaltar);
        //panelDcha.add(botonDescansar);
        //miMarco.setSize(400,200);
        //miMarco.setTitle("Ventana con paneles");
        //miMarco.setVisible(true);
        
        //-----Flowlayout-----
        //Frame miVentana = new Frame();
        //Panel miPanel = new Panel();
        //FlowLayout posicionamientoSecuencial = new FlowLayout();
        //Button botonA = new Button("Primer botón");
        //Button botonB = new Button("Segundo botón");
        //Button botonC = new Button("Tercer botón");
        //Button botonD = new Button("Cuarto botón");
        //miPanel.setLayout(posicionamientoSecuencial);
        //miVentana.add(miPanel);
        //miPanel.add(botonA);
        //miPanel.add(botonB);
        //miPanel.add(botonC);
        //miPanel.add(botonD);
        //miVentana.setSize(300, 100);
        //miVentana.setTitle("Ventana con flow layout");
        //miVentana.setVisible(true);
        
        //-----Borderlayout-----
        //Frame miMarco = new Frame();
        //Panel panelMenuNorte = new Panel();
        //Panel panelGeneral = new Panel();
        //BorderLayout puntosCardinales = new BorderLayout();
        //FlowLayout opcionesMenu = new FlowLayout();
        //Button botonOpcion1 = new Button("Opción 1");
        //Button botonOpcion2 = new Button("Opción 2");
        //Button botonOpcion3 = new Button("Opción 3");
        //Button botonSur = new Button("Sur");
        //Button botonEste = new Button("Este");
        //Button botonOeste = new Button("Oeste");
        //Button botonCentro = new Button("Centro");
        //panelGeneral.setLayout(puntosCardinales);
        //panelMenuNorte.setLayout(opcionesMenu);
        //miMarco.add(panelGeneral);
        //panelGeneral.add(panelMenuNorte, BorderLayout.NORTH);
        //panelMenuNorte.add(botonOpcion1);
        //panelMenuNorte.add(botonOpcion2);
        //panelMenuNorte.add(botonOpcion3);
        //panelGeneral.add(botonSur, BorderLayout.SOUTH);
        //panelGeneral.add(botonEste, BorderLayout.EAST);
        //panelGeneral.add(botonOeste, BorderLayout.WEST);
        //panelGeneral.add(botonCentro, BorderLayout.CENTER);
        //miMarco.setSize(400, 150);
        //miMarco.setTitle("Ventana con BorderLayout");
        //miMarco.setVisible(true);
        
        //-----Gridlayout-----
        //Frame miVentana = new Frame();
        //Panel miPanel = new Panel();
        //GridLayout matriz = new GridLayout(2, 3);
        //Button[] botones = new Button[6];
        //for (int i = 0; i < 6; i++) {
            //botones[i] = new Button("Botón " + i);
        //}
        //miPanel.setLayout(matriz);
        //for (int i = 0; i < 6; i++) {
            //miPanel.add(botones[i]);
        //}
        //miVentana.add(miPanel);
        //miVentana.setSize(300, 100);
        //miVentana.setTitle("Ventana con GridLayout");
        //miVentana.setVisible(true);
              
        //-----Etiqueta-----
        //Frame miMarco = new Frame();
        //Label titulo = new Label("Notas de matematicas");
        //miMarco.add(titulo);
        //miMarco.setSize(200,100);
        //miMarco.setTitle("Ventana con etiqueta");
        //miMarco.setVisible(true);
        
        //-----Campo de texto-----
        //Frame miMarco = new Frame();
        //Panel entradaDeDatos = new Panel(new FlowLayout());
        //TextField nombre = new TextField(15);
        //TextField apellidos = new TextField(60);
        //TextField nacionalidad = new TextField("Espanola",15);
        //entradaDeDatos.add(nombre);
        //entradaDeDatos.add(apellidos);
        //entradaDeDatos.add(nacionalidad);
        //miMarco.add(entradaDeDatos);
        //miMarco.setSize(500, 130);
        //miMarco.setTitle("Ventana con campos de texto");
        //miMarco.setVisible(true);
        
        //-----Mouselistener-----
        //Frame miVentana = new Frame("Esquema de eventos");
        //Panel miPanel = new Panel();
        //Button botonHola = new Button("Saludo");
        //Button botonAdios = new Button("Despedida");
        //miPanel.add(botonHola);
        //miPanel.add(botonAdios);
        //miVentana.add(miPanel);
        //miVentana.setSize(200, 100);
        //miVentana.setVisible(true);
        //botonHola.addMouseListener(new EsquemaRaton());
        //botonAdios.addMouseListener(new EsquemaRaton());
        
        //-----Mouseadapter-----
        //final int NUM_OPCIONES = 12;
        //Label mensaje = new Label("Mensaje asociado al botón pulsado");
        //Button[] botones = new Button[NUM_OPCIONES];
        //for (int i = 0; i < NUM_OPCIONES; i++) {
            //botones[i] = new Button("Opcion " + i);
            //if (i < 10) {
                //botones[i].setName("0" + i);
            //} else {
                //botones[i].setName(String.valueOf(i));
            //}
        //}
        //Frame miVentana = new Frame("Prueba eventos de raton");
        //Panel panelPrincipal = new Panel(new GridLayout(NUM_OPCIONES + 1, 1));
        //panelPrincipal.add(mensaje);
        //for (int i = 0; i < NUM_OPCIONES; i++) {
            //panelPrincipal.add(botones[i]);
        //}
        //miVentana.add(panelPrincipal);
        //miVentana.setSize(400, 600);
        //miVentana.setVisible(true);
        //for (int i = 0; i < NUM_OPCIONES; i++) {
            //botones[i].addMouseListener(new InterrupcionesDeRaton(mensaje));
        //}
        
        //-----Keyadapter-----
        //Frame miVentana = new Frame("Prueba eventos de raton");
        //Panel miPanel = new Panel();
        //Button boton1 = new Button("Silencio");
        //Button boton2 = new Button("Máquina de escribir");
        //miPanel.add(boton1);
        //miPanel.add(boton2);
        //miVentana.add(miPanel);
        //miVentana.setSize(400, 400);
        //miVentana.setVisible(true);
        //boton2.addKeyListener(new InterrupcionesDeTeclado());
        
        //-----Windowlistener-----
        //Frame miVentana = new Frame("Prueba eventos de ventana");
        //miVentana.setSize(200, 100);
        //miVentana.setVisible(true);
        //Frame otraVentana = new Frame("Prueba eventos de ventana");
        //otraVentana.setSize(100, 50);
        //otraVentana.setLocation(200, 0);
        //otraVentana.setVisible(true);
        //miVentana.addWindowListener(new InterrupcionesDeVentana());
        //otraVentana.addWindowListener(new InterrupcionesDeVentana());
        
        //-----Actionlistener-----
        //Frame miVentana = new Frame("Prueba eventos de acción");
        //Panel miPanel = new Panel(new GridLayout(3, 1));
        //Button boton = new Button("Etiqueta del boton");
        //TextField campoDeTexto = new TextField("Texto del campo 8");
        //List lista = new List(3);
        //lista.add("Opcion 1 de la lista");
        //lista.add("Opcion 2 de la lista");
        //lista.add("Opcion 3 de la lista");
        //lista.add("Opcion 4 de la lista");
        //miPanel.add(boton);
        //miPanel.add(campoDeTexto);
        //miPanel.add(lista);
        //boton.addActionListener(new InterrupcionesDeAccion());
        //campoDeTexto.addActionListener(new InterrupcionesDeAccion());
        //lista.addActionListener(new InterrupcionesDeAccion());
        //miVentana.add(miPanel);
        //miVentana.setSize(400, 200);
        //miVentana.setVisible(true);
        
        //-----Focuslistener-----
        //Frame miVentana = new Frame("Prueba eventos de enfoque");
        //Panel miPanel = new Panel();
        //Button boton1 = new Button("Componente 1");
        //Button boton2 = new Button("Componente 2");
        //miPanel.add(boton1);
        //miPanel.add(boton2);
        //miVentana.add(miPanel);
        //miVentana.setSize(300, 200);
        //miVentana.setVisible(true);
        //boton2.addFocusListener(new InterrupcionesDeEnfoque());
        
        //------Itemlistener-----
        //Frame miVentana = new Frame("Prueba eventos de elemento");
        //Panel miPanel = new Panel(new GridLayout(4, 1));
        //Checkbox diesel = new Checkbox("Diesel", true);
        //Checkbox farosXenon = new Checkbox("Faros de Xenon", false);
        //Checkbox llantasAleacion = new Checkbox("Llantas de aleacion", false);
        //Checkbox pinturaMetalizada = new Checkbox("Pintura Metalizada", true);
        //miPanel.add(diesel);
        //miPanel.add(farosXenon);
        //miPanel.add(llantasAleacion);
        //miPanel.add(pinturaMetalizada);
        //diesel.addItemListener(new InterrupcionesDeElemento());
        //farosXenon.addItemListener(new InterrupcionesDeElemento());
        //llantasAleacion.addItemListener(new InterrupcionesDeElemento());
        //pinturaMetalizada.addItemListener(new InterrupcionesDeElemento());
        //miVentana.add(miPanel);
        //miVentana.setSize(400, 200);
        //miVentana.setVisible(true);
    }
}

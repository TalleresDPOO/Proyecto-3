package view;
import java.io.BufferedReader;
import javax.swing.*;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import modelo.Participante;
import procesador.Loader;



public class Interfaz {

	private Participante usuario;
	private Loader loader;
	
	public Interfaz(Participante usuario) {
		this.usuario = usuario;
		JFrame frame = new JFrame("Proyecto 2"); 

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

				
	}
	
	private void interfaz_principal(){
		
		Jlabel label = new Jlabel ("Elige la acción que requieres utilizar: ")
	    frame.getContentPane().add(label));
		Jbutton button = new Jbutton ("Crear Proyecto");
				   
		frame.getContentPane().add(button);
				
	    Jbutton button2 = new Jbutton ("Agregar nuevo participante");
		
	    		   
	    frame.getContentPane().add(button2);
	    Jbutton button3 = new Jbutton ("Definir tipo de actividad");
	    		   
	    frame.getContentPane().add(button3);
	    Jbutton button4 = new Jbutton ("Registrar actividad");
	    		   
	    frame.getContentPane().add(button4);
	    Jbutton button5 = new Jbutton ("modificar actividad");
	    		   
	    frame.getContentPane().add(button5);
	    Jbutton button6 = new Jbutton ("cronometrar actividad");
    
	    frame.getContentPane().add(button6);
		
		
	}
	private void ejecutar_opciones(){
		
	Integer opcion = Integer.parseInt("Ingrese_una_opcion ");
	
	if (button == True) {
	

		Jlabel label = new Jlabel ("Nombre: ");
		frame.getContentPane().add(label);
		
		JTextField texto = new JTextField();
		
				

		Jlabel label2 = new Jlabel ("Descripción: ");
		frame.getContentPane().add(label2);
		
		JTextField texto2 = new JTextField();
		
		
				

		Jlabel label3 = new Jlabel ("Fecha de inicio: ");
		frame.getContentPane().add(label3);
		
		JTextField texto3 = new JTextField();
		
						

		Jlabel label4 = new Jlabel ("Fecha de finalización: ");
		frame.getContentPane().add(label4);
		
		JTextField texto4 = new JTextField();
	
	}
	else if (button2) == True){
		opcion2();
		
	}
    else if (button3 == True){
    	Jlabel label3 = new Jlabel ("Tipo de actividad: ");
		frame.getContentPane().add(label3);
		
		JTextField texto = new JTextField();
		
		Jbutton button5 = new Jbutton ("Guardar");
		   
		frame.getContentPane().add(button5);
		    
		Jbutton button6 = new Jbutton ("Eliminar texto");
 		   
	    frame.getContentPane().add(button6);
		
						

		
	}
    else if (button4 == True){
    	modelo.registrar_actividad;
		
	}  
    else if (button5 == True){
		modelo.modificar_actividad;
	}
    else if (button6 == True){
		modelo.cronometrar_actividad
	}
    
    
	
	}
		
	
	 private void opcion2() {
		String nombre_usuario = input("Ingrese su nombre de usuario ");
		String correo_usuario = input("Ingrese su correo ");
		Boolean es_duenio = true;
		ArrayList actividades = new ArrayList<String>(); 
		ArrayList participantes = new ArrayList<Participante>();
		
		this.usuario = new Participante(nombre_usuario, correo_usuario, es_duenio, actividades);
	    System.out.println("Ingrese nombre del proyecto");
	    loader.crear_proyecto(participantes, actividades);
	    	    
		
	}
	
	
	static private String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
			
			}
		return null;
		}
}


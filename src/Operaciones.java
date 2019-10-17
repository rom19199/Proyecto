import java.io.*;
import java.util.ArrayList;

public class Operaciones {
	private float MIC;
	private String complexion;
	private String ejercicio;
	public Operaciones () {
		MIC = 0;
		complexion = "";
		ejercicio = "";
		
	}
	public float encontrarMIC (Calendario persona) {
		MIC = persona.getPesoKilogramos() / (persona.getEstaturaCentimetros()*persona.getEstaturaCentimetros());
		return MIC;
		
	}
	public String encontrarComplexion () {
		if (MIC > 25) {
			complexion = "Tiene sobrepeso";
			
		}
		if (MIC < 18) {
			complexion = "Tiene deficit de peso";
		}
		if (MIC > 18 && MIC < 25){
			complexion = "Esta en el rango recomendado";
		}
		
		return complexion;
		
	}
	public String ejerciciosRecomendados(){
		if (MIC > 25){
			ejercicio = "Se recomienda hacer 30 minutos de cardio al dÃ­a seguido de 4 sets de 30 sentadillas, \n30 despechadas, 30 burpees, 30 abdominales y una plancha de 30 segundos. Asimismo, se recomienda \naumentar el nivel a 10 repeticiones mÃ¡s cada mes hasta lograr resultados.";
		}
		if (MIC < 18){
			ejercicio = "Se recomienda hacer 10 minutos de cardio al dÃ­a seguido de 5 sets de 30 sentadillas, \n30 despechadas y 30 abdominales. Le exortamos a subir el nÃºmero de repeticiones cada mes a 10 mÃ¡s \nya que de esta manera seguira haciendo esfuerzo y manipulando el muscula para que crezca.";
		}
		if (MIC > 18 && MIC <25){
			ejercicio = "Se recomienda hacer 20 minutos de cardio al dÃ­a seguido de 4 sets de 20 sentadillas, \n20 despechadas y 20 burpees. Si desea lucir un cuerpo mÃ¡s marcado puede aumentar las repeticiones,\n pero si su meta es mantenerse en el peso ideal le exortamos a seguir nuetstra recomendaciÃ³n.";
		}
		return ejercicio;
	
	}
	public String Diabetes(){
		
		return "";
	}
	/**
	 * @return the mIC
	 */
	public float getMIC() {
		return MIC;
	}
	/**
	 * @param mIC the mIC to set
	 */
	public void setMIC(float mIC) {
		MIC = mIC;
	}
	
	public ArrayList<String> leerTxt(String direccion){
			String texto ="";
			ArrayList<String> BaseDatos = new ArrayList<String>();
			
			try {
				BufferedReader bf = new BufferedReader(new FileReader(direccion));
				String temp = "";
				String bfRead;
				
				while ((bfRead = bf.readLine()) != null) {
					BaseDatos.add(bfRead);
				}
				
				texto = temp;
			
			}catch(Exception e){
				System.err.println("No se encontro archivo");
		}	
			return BaseDatos;
                }
                
	
	public void escribir(ArrayList<Usuario> usuario)
	{
		FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("BaseDatos.txt");
            pw = new PrintWriter(fichero);

            for (int i = 0; i < usuario.size(); i++)
            {
            	
            	pw.println(usuario.get(i).toString());

            	
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
	}
	
	public ArrayList<Usuario> leerBase(ArrayList<String> base)
	{
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		for(int i = 0; i < base.size(); i++)
		{
			String [] cliente = base.get(i).split(",");
			usuarios.add(new Usuario(cliente[0],cliente[1],cliente[2], cliente[3],cliente[4],cliente[5], cliente[6]));
		}
		
		return usuarios;
	}
	
	public int clienteActual(String nombre, ArrayList<Usuario> clientes)
	{
		int clienteActual = 0;
		for(int i = 0 ; i < clientes.size(); i++)
		{
			if(clientes.get(i).getNombre().contentEquals(nombre))
			{
				clienteActual = i;
			}
		}
		return clienteActual;
	}
                
	
	
	
	
	

}

	

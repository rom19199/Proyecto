import java.io.*;

public class Operaciones {
	private float MIC;
	private String complexion;
	public Operaciones () {
		MIC = 0;
		complexion = "";
		
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
	
	public String Dieta() {
		String dieta = "debe consumir un aproximado de 2500 calorias \n al dia en 3 comidas/dia. ";
		return dieta;
	}
	
	public String Ejercicio() {
		String ejercicio = "Se le recomienda los siguientes ejercicios: 5 sets de 20 lagartijas, 5 sets de 20 \n abdomjinales y 5 sets de 20 squats, con un descanso de 10 segundos entre cada sets.";
		return ejercicio;
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

	

}

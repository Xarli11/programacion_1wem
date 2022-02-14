import java.util.Arrays;
//Clase Publica Cartelera
public class Cartelera {
private static final String[] ciudades= {"madrid","barna","sevilla"}; //Se crea un string que solo puede tener 3 posibilidades
private Pelicula[][] cartelera; //Se crea el array bidimensional que se llama cartelera del tipo pelicula
private int longitud;//numero de pelis por cada ciudad 
public Cartelera( int longitud) {//Se crea un array del tamaño de longitud
	this.longitud = longitud;
	this.cartelera = new Pelicula[ciudades.length][longitud];
}

public Cartelera(Pelicula[][] cartelera) {  //Funcion que es del tipo Cartelera que se pasa por parametro un array del tipo Pelicula llamado cartelera
	
	this.cartelera = cartelera; //El comando this. hace referencia al parametro 
	this.longitud = cartelera[0].length; //El comando this. hace referencia al parametro 
	return cartelera;
}
public void agregarPelicula (Pelicula p,String ciudad) { //Parametros que se pasan a la funcion para poder trabajar con ellos
	int pos=-1; 
	for (int i = 0; i < ciudades.length; i++) {
		if (ciudades[i].equals(ciudad)) {
			pos=i;
			break;
		}
	}
	if (pos!=-1) {// debe encontrar el lugar y hacer cartelera[pos][lugar]=p
		for (int i=0;i<cartelera[pos].length;i++) {
			if (cartelera[pos][i]==null) {
				cartelera[pos][i]=p;
				break;
			}
		}
	}
}
@Override
public String toString() { // Aun no se que es
	String s="";
	for (int i = 0; i < cartelera.length; i++) {
		s+="\n cartelera de "+ciudades[i]+"\n";
		for (int j = 0; j < cartelera[i].length; j++) {
			if (cartelera[i][j]!=null)
			s+="\n"+cartelera[i][j].toString();
		}
		
	}
	return s;
}

}

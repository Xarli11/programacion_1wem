import java.util.Arrays;

public class Cartelera {
private static final String[] ciudades= {"madrid","barna","sevilla"};
private Pelicula[][] cartelera;
private int longitud;//nº de pelis por cada ciudad
public Cartelera( int longitud) {
	this.longitud = longitud;
	this.cartelera = new Pelicula[ciudades.length][longitud];
}
public Cartelera(Pelicula[][] cartelera) {
	
	this.cartelera = cartelera;
	this.longitud = cartelera[0].length;
}
public void agregarPelicula (Pelicula p,String ciudad) {
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
public String toString() {
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

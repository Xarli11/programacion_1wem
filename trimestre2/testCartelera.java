
public class testCartelera {

	public static void main(String[] args) {
	Cartelera c=new Cartelera(2);
	Pelicula p1=new Pelicula("el b patron","drama",90);
	p1.agregar("bardem");
	p1.agregar("ynma");
	Pelicula p2=new Pelicula("maixebel","drama",80);
	p2.agregar("ggg");
	c.agregarPelicula(p1, "barna");
	c.agregarPelicula(p2, "barna");
	c.agregarPelicula(p2, "madrid");
	c.agregarPelicula(p2, "sevilla");
	System.out.println(c);
	Pelicula p3=new Pelicula("gfdgfd","drama",80);
	p3.agregar("acror1");
	c.agregarPelicula(p3, "sevilla");
	System.out.println(c);
	}

}

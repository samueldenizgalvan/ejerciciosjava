import java.util.HashMap;
import java.util.HashSet;

public class directorio {

    private HashSet<Amigos> misAmigos;

    public void setMisAmigos(HashSet<Amigos> misAmigos) {
        this.misAmigos = misAmigos;
    }

    public HashSet<Amigos> getMisAmigos() {
        return misAmigos;
    }

    public void baseDatoAmigos() {
        misAmigos.add(new Amigos("Cinthia", 655333222, "subaru222@gmail.com", "02/07/1982"));
        misAmigos.add(new Amigos("Carlos", 655111122, "graciasperono@gmail.com", "19/24/1991"));
        misAmigos.add(new Amigos("Rosa", 625333221, "holasiholano@gmail.com", "12/31/1990"));
        misAmigos.add(new Amigos("Almudena", 655831222, "voyalascanteras@gmail.com", "09/02/1980"));
        misAmigos.add(new Amigos("Juana", 682531222, "camanolo@gmail.es", "30 / 3 / 1955"));
        misAmigos.add(new Amigos("Pepe", 692955816, "mediamark@gmail.com", "1 / 22 / 2000"));
    }

    public void mostrar() {
        for (K key : misAmigos.keySet()) {
            System.out.println(key + "=" + misAmigos.get(key));
        }
    }
}
import java.util.List;
import java.util.ArrayList;

public class Biblioteca {

    List<Carti> carti;

    public Biblioteca() {
        carti = new ArrayList<>();

    }
public void adaugaCarte(Carti carte){
        carti.add(carte);
}
public void stergeCarte(Carti carte){
        carti.remove(carte);
}
    public List<Carti> getAllBooks() {
        return carti;
    }


}
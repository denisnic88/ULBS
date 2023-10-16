public class Pagina {
    int nrPagina;
    String continut;

 public Pagina(int nrPagina, String continut){

    this.nrPagina=nrPagina;
    this.continut=continut;

 }

    public int getNrPagina() {
        return nrPagina;
    }

    public String getContinut() {
        return continut;
    }

    public void setNrPagina(int pageNumber) {
        this.nrPagina = nrPagina;
    }

    public void setContinut(String content) {
        this.continut = continut;
    }

}

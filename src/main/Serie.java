package main;

public class Serie {
    String serie;
    String tag;
    int capitulo;

    public Serie(String serie, int capitulo, String tag) {
        // TODO Auto-generated constructor stub
        this.serie = serie;
        this.capitulo = capitulo;
        this.tag = tag;
    }

    public String getTag() {
        return this.tag;
    }
    public void setTag(String tag) {
        this.tag = tag;
    }
    public int getCapitulo() {
        return this.capitulo;
    }
    public void setCapitulo(int capitulo) {
        this.capitulo = capitulo;
    }

    public String toString() {
        return "Serie="+ serie + ", Capitulo="+ capitulo + ", tag=" + tag;
    }
}

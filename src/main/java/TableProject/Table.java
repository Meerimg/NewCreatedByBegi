package TableProject;

public abstract class Table {

    public String desk;
    private int nojki;

    public Table(String desk, int nojki) {
        this.desk = desk;
        this.nojki = nojki;
    }

    public int getNojki() {
        return nojki;
    }

    public void setNojki(int nojki) {
        this.nojki = nojki;
    }
}

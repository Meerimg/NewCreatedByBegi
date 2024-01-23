package TableProject;

public class Desktable extends Table implements Transformer{

    public Desktable(String desk, int nojki) {
        super(desk, nojki);
    }

    @Override
    public String toTransform() {
        return "switching....";
    }
}

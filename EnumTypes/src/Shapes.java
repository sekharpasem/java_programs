public enum Shapes {
    SQUARE(4, "S"), TRIANGLE(3,"T"), CIRCLE(0,"C"), HEXGON(6,"H");

    public int i;
    public String nn;

    Shapes(int i, String nn){
        this.i = i;
        this.nn = nn;

    }

    public int getSides(){
        return i;
    }

    public String getNn(){
        return nn;
    }
}



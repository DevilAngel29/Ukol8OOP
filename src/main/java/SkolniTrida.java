public class SkolniTrida {
    public String jmenoTridy;
    public int rocnik;

    public String jmenoUcitele;




    public SkolniTrida(String jmenoTridy, int rocnik, int listStudentu, String jmenoUcitele) {
        this.jmenoTridy = jmenoTridy;
        this.rocnik = rocnik;
        this.jmenoUcitele = jmenoUcitele;
    }

    public SkolniTrida() {

    }

    public String getJmenoTridy() {
        return jmenoTridy;
    }

    public void setJmenoTridy(String jmenoTridy) {
        this.jmenoTridy = jmenoTridy;
    }

    public int getRocnik() {
        return rocnik;
    }

    public void setRocnik(int rocnik) {
        this.rocnik = rocnik;
    }





    public String getJmenoUcitele() {
        return jmenoUcitele;
    }

    public void setJmenoUcitele(String jmenoUcitele) {
        this.jmenoUcitele = jmenoUcitele;
    }

    public String vypis(){
        String getSkolniTrida = ("Trida: " + jmenoTridy + "(rocnik: " + rocnik + ")"+System.lineSeparator()+
                "Tridni ucitel:" + jmenoUcitele);
        return getSkolniTrida;
    }



    @Override
    public String toString() {
        return vypis();
    }
}

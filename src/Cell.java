import java.util.ArrayList;
import java.util.List;

public class Cell {

    private String typ;
    private List<String> organella;

    public void przedstawSie(){
        System.out.println("Typ komorki: "+typ);
        System.out.println("Zawartosc: "+organella);
    }

    private Cell(CellBuilder builder){
        this.typ = builder.getType();
        organella = builder.getOrganella();
    }

    abstract static class CellBuilder{

        String typ = "";
        List<String> organella = new ArrayList<>();

        String getType(){
            return typ;
        }

        private List<String> getOrganella() {
            return organella;
        }

        public CellBuilder addCore(){
            if (!organella.contains("jadro")) organella.add("jadro");
            return this;
        }

        public CellBuilder addBlona(){
            organella.add("blona");
            return this;
        }

        public CellBuilder addCytoplazma(){
            organella.add("cytoplazma");
            return this;
        }

        public CellBuilder addRybosomy(){
            organella.add("rybosomy");
            return this;
        }

        public CellBuilder addMitochondria(){
            organella.add("mitochondium");
            return this;
        }

        public Cell build(){
            return new Cell(this);
        }

    }

    public static class AnimalCellBuilder extends CellBuilder{

        AnimalCellBuilder(){
            this.typ = "zwierzeca";
        }

    }

    public static class PlantCellBuilder extends CellBuilder {

        public PlantCellBuilder() {
            this.typ = "roslinna";
        }

        public PlantCellBuilder addScianaKom(){
            if (!organella.contains("sciana kom")) organella.add("sciana kom");
            return this;
        }
    }
}

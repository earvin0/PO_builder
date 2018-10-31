public class Start {
    public static void main(String[] args) {

        new Cell.AnimalCellBuilder().addCore().addBlona().addCytoplazma().addMitochondria().addRybosomy().build().przedstawSie();

        new Cell.PlantCellBuilder().addScianaKom().addCore().addRybosomy().addMitochondria().build().przedstawSie();

        //dodanie dwoch jader
        new Cell.PlantCellBuilder().addScianaKom().addScianaKom().addCore().addCore().addMitochondria().build().przedstawSie();
    }
}

class Toilet{
    private String idToilet;
    //private Image pictureToilet;
    private double [] locationToilet; //= new double[2];
    private String nameToilet;
    //private Building building;
    private int floor;

    Toilet(String idToilet, double [] locationToilet, String nameToilet){
        this.idToilet = idToilet;
        this.locationToilet = locationToilet;
        this.nameToilet = nameToilet;
    }
    public static void main(String[] args) {
        String idToilet = "001";
        double [] at = {0.11, 0.21};
        Toilet t1 = new Toilet("001",at,"toilet1");
        ptintToilet(t1);
    }

    public static  void ptintToilet(Toilet t){
        System.out.println(t.idToilet);
    }

}
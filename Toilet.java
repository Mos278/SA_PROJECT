

class Toilet{
    private String idToilet;
    //private BufferedImage pictureToilet;
    private String pictureToilet;
    private float [] locationToilet; //= new double[2];
    private String nameToilet;
    private Building building = null;
    private int floor = 0;

    Toilet(String idToilet, float [] locationToilet, String nameToilet,
    String pictureToilet, Building building, int floor){
        this.idToilet = idToilet;
        this.locationToilet = locationToilet;
        this.nameToilet = nameToilet;
        this.pictureToilet = pictureToilet;
        this.building = building;
        this.floor = floor;
    }
    public static void main(String[] args){
        float [] at = {0.11f, 0.21f};
        String path = "picture\\toilet1.jpg";
        //BufferedImage pictureToilet = ImageIO.read(new File(path));
        Toilet t1 = new Toilet("001",at,"toilet1",path,null, 0);
        System.out.println(t1.toString());
    }

    @Override
    public String toString() {
        String locaToilet = String.valueOf(this.locationToilet[0])+" "+String.valueOf(this.locationToilet[1]);
        return (this.idToilet + " " + this.nameToilet + " " + locaToilet + 
            " picture = " + this.pictureToilet + " at building "+ this.building+ " floor " + this.floor);
    }

    public void setlocationToilet(float [] x){
        this.locationToilet = x;
    }
    public void setnameToilet(String x){
        this.nameToilet = x;
    }
    public void setpictureToilet(String x){
        this.pictureToilet = x;
    }
    public void setbuilding(Building x){
        this.building = x;
    }


    public String getidToilet(){
        return this.idToilet;
    }
    public float[] getlocationToilet(){
        return this.locationToilet;
    }
    public String getnameToilet(){
        return this.nameToilet;
    }
    public String getpictureToilet(){
        return this.pictureToilet;
    }
    public Building getBuilding(){
        return this.building;
    }



}
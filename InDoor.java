
class InDoor extends AssessLocation {
    protected int floor;
    protected Building building;
    private String image;
    InDoor(AssessLocation location) {
        super(location.UserCoordinate);
    }

    public void Printtest() {
        {
            System.out.printf("%f , %f" , UserCoordinate[0],UserCoordinate[1]);
        }
    }
    public void Setindoor(int floor,Building Building){
        this.floor = floor;
        this.building = Building;
        this.image = Building.getpictureMap(floor);
    }
    public String showMap(){
        return this.image;
    }

    public void ShowFloor(){//test
        System.out.printf("%s , %d" , building,floor);
    }
    public static void main(String[] args) {
        float[] UserCoordinate = {0.1f, 2.0f};
        AssessLocation ass = new AssessLocation(UserCoordinate);
        InDoor inDoor = new InDoor(ass);


    }
   
}

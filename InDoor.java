
class InDoor extends AssessLocation {
    protected int floor;
    protected String building;
    protected String image;
    InDoor(AssessLocation location) {
        super(location.UserCoordinate);
    }

    public void Printtest() {
        {
            System.out.printf("%f , %f" , UserCoordinate[0],UserCoordinate[1]);
        }
    }
    public void Setindoor(int floor,String Building){
        this.floor = floor;
        this.building = Building;
    }
    public String showMap(String image){
        this.image = image;
        return this.image;
    }
}

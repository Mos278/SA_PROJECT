import java.awt.image.BufferedImage;
class Building{
    private float [] mapCoordinate = new float[2];
    private String buildingID;
    private String buildingName;
    private String pictureMap;
    private Toilet toilet_distance;
    private int nearest_floor;
    private int MaxLevel;

    Building(float [] mapCoordinate,String buildingID ,String buildingName, String pictureMap, Toilet toilet_distance, int nearest_floor,int MaxLevel ){
        this.mapCoordinate = mapCoordinate;
        this.buildingID = buildingID;
        this.buildingName = buildingName;
        this.pictureMap = pictureMap;
        this.toilet_distance = toilet_distance;
        this.nearest_floor = nearest_floor;
        this.MaxLevel = MaxLevel;
    }

    public int getMaxLevel(){
        return this.MaxLevel;
    }

    @Override
    public String toString() {
        return buildingID + " " + "Name : " + buildingName;
    }
}
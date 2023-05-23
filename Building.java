import java.awt.image.BufferedImage;
class Building{
    private float [] mapCoordinate = new float[2];
    private BufferedImage pictureMap;
    private int toilet_distance;
    private int nearest_floor;

    Building(float [] mapCoordinate, BufferedImage pictureMap, int toilet_distance, int nearest_floor ){
        this.mapCoordinate = mapCoordinate;
        this.pictureMap = pictureMap;
        this.toilet_distance = toilet_distance;
        this.nearest_floor = nearest_floor;
    }
}
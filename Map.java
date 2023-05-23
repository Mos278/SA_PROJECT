/*import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;*/


class Map {
    private float[] mapCoordinate;
    private String pictureMap;
    Map(float[] mapCoordinate, String map) /*throws IOException*/ {
        this.pictureMap = map;
        this.mapCoordinate = mapCoordinate;
    }
}
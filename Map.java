/*import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;*/


class Map {
    private String IDmap;
    private float[] mapCoordinate;
    private String pictureMap;
    Map(String IDmap,float[] mapCoordinate, String map) /*throws IOException*/ {
        this.IDmap = IDmap;
        this.pictureMap = map;
        this.mapCoordinate = mapCoordinate;
    }
}
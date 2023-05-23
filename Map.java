import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


class Map {
    private float[] mapCoordinate;
    private BufferedImage pictureMap;
    Map(BufferedImage map,float[] mapCoordinate) throws IOException {
        this.pictureMap = map;
        this.mapCoordinate = mapCoordinate;
    }

}
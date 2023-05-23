import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

class InDoor extends AssessLocation {
    protected int floor;
    protected String building;
    protected BufferedImage image;
    InDoor(AssessLocation location) {
        super(location.UserCoordinate);
    }

    public void Printtest() {
        {
            System.out.println(UserCoordinate);
        }
    }
    public void Setindoor(int floor,String Building){
        this.floor = floor;
        this.building = Building;
    }
    public BufferedImage showMap(BufferedImage image) throws IOException{
        this.image = image;
        return this.image;
    }
}

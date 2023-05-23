import java.time.LocalDateTime;
import java.awt.image.BufferedImage;

class Notification{
    private String idNoti;
    private Toilet toilet;
    private LocalDateTime date;
    private BufferedImage image;

    Notification(String idNoti, Toilet toilet, LocalDateTime date, BufferedImage image){
        this.idNoti = idNoti;
        this.toilet = toilet;
        this.date = date;
        this.image = image;
    }
}
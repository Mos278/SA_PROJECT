import java.time.LocalDateTime;
//import java.awt.image.BufferedImage;

class Notification{
    private String idNoti;
    private Toilet toilet;
    private LocalDateTime date;
    private String image;
    private String Description;

    Notification(String idNoti, Toilet toilet, LocalDateTime date, String image,String Description){
        this.idNoti = idNoti;
        this.toilet = toilet;
        this.date = date;
        this.image = image;
        this.Description = Description;
    }

    @Override
    public String toString(){
        return (this.idNoti+" "+ this.toilet.getidToilet()+" " +this.date + " "+ this.image + " " +" Description : "+ this.Description);
    }

     /* 
    public static void main(String[] args) {
        float [] at = {0.11f, 0.21f};
        String path = "picture\\toilet1.jpg";;
        Toilet t1 = new Toilet("001",at,"toilet1",path,null, 0);

        LocalDateTime date = LocalDateTime.now();
        Notification n = new Notification("001", t1, date, "picture\\toilet2.jpg");
        System.out.println(n.toString());
    }
    */

    /*public static  void printNotification(Notification n){  
        System.out.println(n.idNoti+" "+ n.toilet.getidToilet()+" " +n.date + " "+ n.image );
    }*/
}
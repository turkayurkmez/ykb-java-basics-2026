import java.util.Date;

public abstract class Document {

    private String title;
    private Date createdDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void copy(String from, String to){
        System.out.println("Dosya kopyalandı");
    }

    public void move(String from, String to){
        System.out.println("Taşındı...");
    }

    public abstract void open();
    public abstract void save();
    //public abstract void print();


}

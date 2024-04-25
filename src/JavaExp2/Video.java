package JavaExp2;

public class Video {
    private String title;
    private boolean checked;
    private int rate;
   
    //Constructor
    public Video(String title, boolean checked, int rate) {
        this.title = title;
        // False if not checked out , otherwise True
        this.checked = checked;
        this.rate = rate;
    }

    public void setTitle(String title) {
           this.title=title;
    }
    public void beingCheckedOut(boolean checked)
    {
        this.checked = checked;
    } 

    public void beingReturned(boolean returned)
    {
        if(returned==true)
          checked = false;
    }
    public void rating(int rating)
    {
        if(rating>5){
             System.out.println("Invalid rating");
             rating = 5;}
        this.rate = rating;
    }

    public String getTitle() {
        return title;
    }
   
    public boolean isCheckedOut() {
        if(checked==true) return false;
        return checked;
    }
    public int getRating() {
        return rate;
    }

}

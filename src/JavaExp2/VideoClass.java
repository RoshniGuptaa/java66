package JavaExp2;

import java.util.ArrayList;

public class VideoClass  {   
    ArrayList<Video> videos=new ArrayList<Video>();
    public void addVideo(String newVideo){
        Video nvd=new Video(newVideo,false,0);
        videos.add(nvd);
    }
    public void checkOut(String videoTitle)
    {
        for(int i=0;i<videos.size();i++)
        {
            if(videos.get(i).getTitle().equals(videoTitle))
            {
                videos.get(i).beingCheckedOut(true);
            }
        }
    }
    public void returnVideo(String videoTitle)
    {
        for(int i=0;i<videos.size();i++)
        {
            if(videos.get(i).getTitle().equals(videoTitle))
            {
                videos.get(i).beingReturned(true);
            }
        }
    }

    public void receiveRating(String videoTitle,int rate)
    {
        for(int i=0;i<videos.size();i++)
        {
            if(videos.get(i).getTitle().equals(videoTitle))
            {
                videos.get(i).rating(rate);
            }
        }
    }
    
    public  void listInventory()
    {
        System.out.println("----------------- Inventory System--------------");
        System.out.println("Video Title \t Video checkedOut \t Rating ");

        for(int i=0;i<videos.size();i++)
        {
            System.out.println(videos.get(i).getTitle()+"\t\t"+videos.get(i).isCheckedOut()+"\t\t"+videos.get(i).getRating());
        }
    }

    public ArrayList<Video> getVideos()
    {
        return videos;
    }

}

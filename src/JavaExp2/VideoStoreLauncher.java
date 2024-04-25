package JavaExp2;

import java.util.ArrayList;
import java.util.Scanner;

public class VideoStoreLauncher {
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        VideoClass store=new VideoClass();
        System.out.println("Enter no of videos you want to add in Video Store");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter title of video"+(i+1));
            String title=sc.nextLine();
            store.addVideo(title);
             //give rating to each video
             System.out.println("Enter rate of video"+(i+1));
             int rate=sc.nextInt();
             store.receiveRating(title, rate);

        }
        //give rating to each video

         ArrayList<Video> videos=new ArrayList<>();
         videos=store.getVideos();
         for(int i=0;i<n;i++)
         {
             //Rent each video 
             for(Video v : videos)
             {
                store.checkOut(v.getTitle());   
                if(v.getTitle().equals("Godfather II"))
                {
                    store.listInventory();
                }
             }
             // Return the video
             for(Video v : videos)
             {
                store.returnVideo(v.getTitle());
                System.out.println("Please give the rating for : " + v.getTitle());
                int r=sc.nextInt();
                store.receiveRating(v.getTitle(), r);
             }
             //Listing
             store.listInventory();
         }

    }
    
}

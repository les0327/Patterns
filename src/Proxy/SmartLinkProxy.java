package Proxy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Les
 * @version 3.0
 */
public class SmartLinkProxy implements IProxy {

    private Image image;

    /**
     * Load image
     *
     * @param imageName - name of image that we want to load
     */
    @Override
    public void loadImage(String imageName) {
        image.loadImage(imageName);
    }


    /**
     * Caches image to file
     */
    public void cache(){
        try(FileOutputStream fos = new FileOutputStream("cache.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){

            oos.writeObject(image);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

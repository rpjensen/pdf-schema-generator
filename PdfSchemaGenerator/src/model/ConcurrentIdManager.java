

package model;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * A class that holds a universal object identifier for objects in the model.
 * The IDs will be used to map objects in the JSON sent to and from the network
 * and will be stored in the database so that the PHP layer can recreate the object
 * references in the PDF renderer.
 * @author Ryan Jensen
 * @version November 20, 2014
 */
public class ConcurrentIdManager {
    private final AtomicInteger currentId = new AtomicInteger();
    
    public int getNextId(){
        return currentId.incrementAndGet();
    }
    
    public synchronized void setIfMax(int newId){
        if (currentId.get() < newId){
            currentId.set(newId);
        }
    }
    
    public int getId(){
        return currentId.get();
    }
}

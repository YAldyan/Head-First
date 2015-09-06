/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java.CloningObject;


/**
 *
 * @author Yuhariz
 */
public class Song implements Cloneable{
    
    private String title ;
    private String singer ;

    /**
     * @return the title
     */
    

    @Override
    public Object clone(){
        try {
            return super.clone() ;
        } catch (CloneNotSupportedException ex) {}
        return null;
    }
    
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the singer
     */
    public String getSinger() {
        return singer;
    }

    /**
     * @param singer the singer to set
     */
    public void setSinger(String singer) {
        this.singer = singer;
    }
    
    
}

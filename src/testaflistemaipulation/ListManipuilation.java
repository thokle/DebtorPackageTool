/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testaflistemaipulation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author tkt
 */
public class ListManipuilation {

   
    private List<ListObject> listObjects;
    
    public List<ListObject> createDebtorsList(List<ListObject> list){
        
    int startIndex=0;
    int endIndex=1000;        
    List<ListObject> listObjects ;
        listObjects = createSubList(startIndex, endIndex);
    removeFromList(listObjects );
  
    return   getListObjects();
    
    }

    public List<ListObject> createSubList(int startIndex, int endIndex) {
        List<ListObject> sublist = getListObjects().subList(startIndex, endIndex);
      
       
       return sublist;
    }
    
    public ArrayList<Boolean> sendDebtorsWithRest(List<ListObject> list){
       ArrayList<Boolean> result = new ArrayList<Boolean>();
      
       removeFromList(listObjects);
       
       
       return null;
    }
    
    public List<ListObject> removeFromList(List<ListObject> listObjects){
    
        for(int i=0;i<=listObjects.size();i++){
            getListObjects().remove(i);
        }
        
       
        
    return getListObjects();
    }

    /**
     * @return the listObjects
     */
    public List<ListObject> getListObjects() {
        return listObjects;
    }

    /**
     * @param listObjects the listObjects to set
     */
    public void setListObjects(List<ListObject> listObjects) {
        this.listObjects = listObjects;
    }
    
}

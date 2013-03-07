/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import testaflistemaipulation.ListManipuilation;
import testaflistemaipulation.ListObject;

/**
 *
 * @author tkt
 */
public class ListManipulationTest {
    
    private  ListManipuilation listManipuilation;
    
    public ListManipulationTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    listManipuilation = new ListManipuilation();
    }
    
    @After
    public void tearDown() {
        listManipuilation = null;
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
  @Test
  public void testAtSubListBliverOprettet(){
      listManipuilation.setListObjects(createBigListWith());
   List<ListObject> subList =   listManipuilation.createSubList(0, 1000);
   assertEquals(1000, subList.size());
  }
    
  
  @Test
  public void testAtListBliverToemt(){
  listManipuilation.setListObjects(createBigListWith());
  List<ListObject> emptyList = listManipuilation.createDebtorsList(createBigListWith());
  assertEquals(19000, emptyList.size());
  }
  
  @Test
  public void testAtListeBliverHeltToemt(){
  
  }
   
   private List<ListObject> createBigListWith(){
  
       
       List<ListObject> ls = new  ArrayList<ListObject>();
       
       for(int i=1;i<=20000;i++){
           ListObject lo = new ListObject();
           lo.setId(Long.parseLong(String.valueOf(i)));
           lo.setName("name:"+i);
           ls.add(lo);
       }
       
       return ls;
   
   
   }
}

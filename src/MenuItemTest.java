import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class MenuItemTest {
@Test
public void getIdtset(){
    MenuItem menuItem= new MenuItem(1,"doro",3333,"ethiopian doro");
    int id=menuItem.getId();
    Assertions.assertEquals(1,id);
}

    @Test
    public void getNametset(){
        MenuItem menuItem= new MenuItem(1,"doro",3333,"ethiopian doro");
        String name=menuItem.getName();
        Assertions.assertEquals("doro",name);
    }

    @Test
    public void getPricetset(){
        MenuItem menuItem= new MenuItem(1,"doro",3333,"ethiopian doro");
        double price=menuItem.getPrice();
        Assertions.assertEquals(3333,price);
    }

    @Test
    public void getDescriptiontset(){
        MenuItem menuItem= new MenuItem(1,"doro",3333,"ethiopian doro");
        String description=menuItem.getDescription();
        Assertions.assertEquals("ethiopian doro",description);
    }


}
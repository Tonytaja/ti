package amazon;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static framework.DriverProvider.prepareDriver;

public class AmazonTest {

    private PopUp popUp;
    private NaviTools naviTools;
    private LoginPage loginPage;
    private UserData userData;
    private NavMain navMain;
    private NavSearch navSearch;
    private MenuBooks menuBooks;
    private AddToTheCart addToTheCart;
    private MouseHover mouseHover;
    private MouseRightClick mouseRightClick;
    private DragAndDrop dragAndDrop;
    private MultiSelection multiSelection;

    @BeforeEach
    void beforeEach(){
        prepareDriver().get("https://www.amazon.pl/");
        //prepareDriver().get("https://www.actitime.com/");
        prepareDriver().manage().window().maximize();
        loginPage= new LoginPage();
        popUp = new PopUp();
        naviTools=new NaviTools();
        navMain= new NavMain();
        navSearch= new NavSearch();
        menuBooks= new MenuBooks();
        addToTheCart= new AddToTheCart();
        mouseHover= new MouseHover();
        mouseRightClick= new MouseRightClick();
        dragAndDrop= new DragAndDrop();
        multiSelection= new MultiSelection();

        popUp.pop();


    }

//    @Test
//    void amazonLogin(){
//        naviTools.navi();
//        loginPage.login(UserData.getUser());
//
//
//    }
//    @Test
//    void amazonMenu(){
//        navMain.menuBooks();
//        menuBooks.menuBooks();
//        addToTheCart.addToCart();
//    }
//    @Test
//    void amazonMouse() {
//        mouseHover.mouseHov();
//    }
//    @Test
//    void amazonMouseRC() throws InterruptedException {
//        mouseRightClick.mouseRC();
//    }

//    @Test
//    void dragAndDrop(){
//        dragAndDrop.dragAndDrop();
//    }
    @Test
    void multiSelect(){
        multiSelection.multi();
    }
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;


import java.util.List;

public class AmazonWebElements {

    public AmazonWebElements() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "nav-link-accountList")
    public WebElement movetoLogin;

    @FindBy(id = "nav-link-accountList-nav-line-1")
    public WebElement mainMenu;

    @FindBy(xpath = "(//span[@class='nav-action-inner'])[1]")
    public WebElement signInButton;

    @FindBy(id = "ap_email")
    public WebElement emailtextbox;

    @FindBy(className = "a-button-input")
    public WebElement continueButton;

    @FindBy(id = "auth-error-message-box")
    public WebElement errorMessage;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement searchResult;

    @FindBy(xpath = "(//div[@class='a-section a-spacing-medium'])[1]")//(//span[@class='a-price'])[1]")
    public WebElement firstItem;

    @FindBy(xpath = "(//span[@class='a-price'])[1]")
    public WebElement firstItemx;


    @FindBy(xpath = "//span[@id='price_inside_buybox']")
    public WebElement firstItemPrice;

    @FindBy(id = "add-to-cart-button")
    public WebElement addToCardButton;

    @FindBy(id = "attach-view-cart-button-form")
    public WebElement goToCart;

    @FindBy(id = "sc-subtotal-amount-activecart")
    public WebElement priceInCart;

    @FindBy(id = "s-result-sort-select")
    public WebElement sortedList;

    @FindBy(xpath = "(//img[@class='s-image'])[2]")
    public WebElement secondItem;

    @FindBy(id = "productTitle")
    public WebElement productTitle;

    @FindBy(id = "nav-hamburger-menu")
    public WebElement allButton;

    @FindBy(xpath = "(//*[text()='Computers'])[2]")
    public WebElement selectComputers;

    @FindBy(xpath = "//ul[@data-menu-id='6']//li")
    public List<WebElement> computersMenu;

    @FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[2]")
    public WebElement seagateCheckbox;

    @FindBy(xpath = "//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-4']")
    public List<WebElement> seagateResult;

    @FindBy(xpath = "//a[@data-menu-id='5']")
    public WebElement selectElectronics;

    @FindBy(xpath = "//ul[@data-menu-id='5']//li")
    public List<WebElement> electronicsMenu;

    @FindBy(xpath = "//*[text()='Camera & Photo']")
    public WebElement selectCamera;

    @FindBy(id="sc-subtotal-label-buybox")
    public WebElement labelTotal;

    @FindBy(xpath="(//input[@value='Delete'])[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[text()='Create a List']")
    public WebElement createList;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextBox;

    @FindBy(id = "auth-signin-button")
    public WebElement signIn;

    @FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
    public WebElement result;

    @FindBy(id="add-to-wishlist-button-submit")
    public WebElement addList;

    @FindBy(xpath = "(//span[@class='w-button-text'])[1]")
    public WebElement viewList;

    @FindBy(xpath = "//h3[@class='a-size-base']")
    public WebElement productInCart;

    @FindBy(name = "submit.deleteItem")
    public WebElement delete;

    @FindBy(xpath = "(//div[@class='a-alert-content'])[11]")
    public WebElement deleteAssert;

}




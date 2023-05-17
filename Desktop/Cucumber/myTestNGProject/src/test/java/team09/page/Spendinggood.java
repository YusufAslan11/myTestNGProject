package team09.page;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.bouncycastle.crypto.paddings.X923Padding;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team09.utilities.Driver;

public class Spendinggood {

    public Spendinggood(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//a[@class='register inline-type']")
    public WebElement register;

    @FindBy(xpath = "//a[@class='login inline-type']")
    public WebElement signIn;     //sign in

    @FindBy(id="reg_username")
    public WebElement usernameReg; //Sign up username

   @FindBy(id="username")
   public WebElement username;      //Sign in username

    @FindBy(id="reg_email")
    public WebElement mail17;     // YUSUF ASLAN ÖZEL MAİL

    @FindBy(id="reg_password")
    public WebElement passwordReg17;    //SignUp pass * // YUSUF ASLAN ÖZEL PASS

   @FindBy(id="password")
   public WebElement password17;       // SignIn pass ** // YUSUF ASLAN ÖZEL PASS

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;   // SignIn Button

    @FindBy(xpath = "//*[@id='menu-item-1074']/a")
    public WebElement myAccount;      // My Account


    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement storeManager;

    @FindBy(xpath = "//div[@class='wcfm_menu_items wcfm_menu_wcfm-products']")
    public WebElement products;

    @FindBy(xpath = "//span[@class='wcfm_sub_menu_items wcfm_sub_menu_items_product_manage moz_class']")
    public WebElement productsAddNew;

    @FindBy(id = "product_type")
    public WebElement  ddm;

    @FindBy(xpath = "//*[text()='Variable Product']")
    public WebElement variableProduct;

    @FindBy(id="register-policy")
    public WebElement privacyPolicy;   //Register policy onay

    @FindBy(xpath = "(//button[@type='submit'])[3]")
    public WebElement signupButton;    //Register signUp Button

    @FindBy(xpath="//*[text()='Become a Vendor']" )
    public WebElement becomeAVendor;  //Register become Vendor

    @FindBy(xpath = "//*[@class='register_as_vendor']")
    public WebElement signup;    //Signup vendor




}
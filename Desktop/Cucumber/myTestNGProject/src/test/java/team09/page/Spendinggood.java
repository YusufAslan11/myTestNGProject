package team09.page;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.bouncycastle.crypto.paddings.X923Padding;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team09.utilities.Driver;

public class Spendinggood {

    public Actions shortDescription;

    public Spendinggood() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@class='register inline-type']")
    public WebElement register;

    @FindBy(xpath = "//a[@class='login inline-type']")
    public WebElement signIn;     //sign in

    @FindBy(id = "reg_username")
    public WebElement usernameReg; //Sign up username

    @FindBy(id = "username")
    public WebElement username;      //Sign in username

    @FindBy(id = "reg_email")
    public WebElement mail17;     // YUSUF ASLAN ÖZEL MAİL

    @FindBy(id = "reg_password")
    public WebElement passwordReg17;    //SignUp pass * // YUSUF ASLAN ÖZEL PASS

    @FindBy(id = "password")
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
    public WebElement ddm;

    @FindBy(xpath = "//*[text()='Variable Product']")
    public WebElement variableProduct;

    @FindBy(id = "register-policy")
    public WebElement privacyPolicy;   //Register policy onay

    @FindBy(xpath = "(//button[@type='submit'])[3]")
    public WebElement signupButton;    //Register signUp Button

    @FindBy(xpath = "//*[text()='Become a Vendor']")
    public WebElement becomeAVendor;  //Register become Vendor

    @FindBy(xpath = "//*[@class='register_as_vendor']")
    public WebElement signup;    //Signup vendor



    @FindBy(id = "pro_title")
    public WebElement productTitle;

    @FindBy(id = "excerpt_ifr")
    public WebElement iframeShort;

    @FindBy(id="tinymce")
    public WebElement shortSpace;

    @FindBy(id = "description_ifr")
    public WebElement iframeLong;

    @FindBy(xpath = "//*[@id=\"tinymce\"]/p")
    public WebElement longSpace;

    @FindBy(id="featured_img_display")
    public WebElement imageAdd17;

    @FindBy(id="__wp-uploader-id-1")
    public WebElement selectFile17;

    @FindBy(xpath = "//*[@class='button media-button button-primary button-large media-button-select']")
    public WebElement lastSelectImg17;

    @FindBy(xpath = "//*[@id=\"product_cats_checklist\"]/li[8]/span[2]")
    public WebElement computersClick;

    @FindBy(xpath = "(//*[@name='product_cats[]'])[2]")
    public WebElement categories;

    @FindBy(xpath = "//p[text()='+Add new category']")
    public WebElement addNewCategories;

    @FindBy(id="wcfm_new_cat")
    public WebElement textSendNewCategorie;

    @FindBy(xpath = "(//button[@class='button wcfm_add_category_bt wcfm_add_taxonomy_bt'])[1]")
    public WebElement categoriesAdd;

    @FindBy(xpath = "//*[text()='+Add new Product brands']")
    public WebElement brandAdd;

    @FindBy(id="wcfm_new_product_brand")
    public WebElement writeBrandText;

    @FindBy(xpath = "(//button[@class='button wcfm_add_category_bt wcfm_add_taxonomy_bt'])[2]")
    public WebElement brandAdd2;

    @FindBy(id="product_tags")
    public WebElement textTag;


    //-------------------------------------------------
    //18
    //-------------------------------------------------
    @FindBy(id="product_url")
    public WebElement URL_External;

    @FindBy(id="button_text")
    public WebElement buttonText;

    @FindBy(id="regular_price")
    public WebElement price;

    @FindBy(id="sale_price")
    public WebElement salePrice;


    @FindBy(id = "mceu_19")
    public WebElement shortDescr;


    @FindBy(id = "featured_img_display")
    public WebElement imageAdd;

    @FindBy(id = "__wp-uploader-id-1")
    public WebElement imageSelect;




}
package team09.page;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.bouncycastle.crypto.paddings.X923Padding;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team09.utilities.Driver;

import java.util.List;

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

    @FindBy(id="catalog_visibility")
    public WebElement catalogVisibilityDdm;

    @FindBy(xpath = "(//div[@class='page_collapsible_content_holder'])[1]")
    public WebElement inventory17;

    @FindBy(id="sku")
    public WebElement sku17;

    @FindBy(id="manage_stock")
    public WebElement stokClick17;

    @FindBy(id="stock_qty")
    public WebElement stockQuantity17;

    @FindBy(id="backorders")
    public WebElement backOrders17;

    @FindBy(xpath = "//*[@class='wcfmfa fa-truck']")
    public WebElement shipping;

    @FindBy(id="weight")
    public WebElement weight17;

    @FindBy(id="width")
    public WebElement width17;

    @FindBy(id="height")
    public WebElement height17;

    @FindBy(id="_wcfmmp_processing_time")
    public WebElement processingTime17;

    @FindBy(id="attributes_is_active_1")
    public WebElement colorClick17;


    @FindBy(id="wcfm_products_simple_submit_button")
    public WebElement submitButton17;


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

    @FindBy(xpath = "//*[text()='External/Affiliate Product']")
    public WebElement externalAffiliateProduct;

    @FindBy(xpath = "//label[@class='wcfmfa fa-server']")
    public WebElement attributes18;

    @FindBy(xpath = "//*[@id=\"attributes\"]/div[2]/button[1]")
    public WebElement colorAddNEW17;

    @FindBy(id = "mceu_19")
    public WebElement shortDescr;



    @FindBy(id = "featured_img_display")
    public WebElement imageAdd;

    @FindBy(id = "__wp-uploader-id-1")
    public WebElement imageSelect;

   // NEW

    @FindBy(xpath = "//a[@class='login inline-type']")
    public WebElement signin;
    @FindBy(id = "username")
    public WebElement vendorEmailBox;
    @FindBy(xpath = "(//a[text()='My Account'])[1]")
    public WebElement myAccount18;
    @FindBy(xpath = "//a[text()='Store Manager']")
    public WebElement storeManager18;
    @FindBy(xpath = "(//span[@class='text'])[4]")
    public WebElement products18;
    @FindBy(xpath = "//span[@class='wcfm_sub_menu_items wcfm_sub_menu_items_product_manage moz_class']")
    public WebElement addNewLink;
    @FindBy(id = "product_type")
    public WebElement productType;
    @FindBy(xpath = "//img[@id='featured_img_display']")
    public WebElement featureImage;
    @FindBy(id = "menu-item-upload")
    public WebElement uploadedFile;
    @FindBy(id = "__wp-uploader-id-1")
    public WebElement selectFileButonu;
    @FindBy(xpath = "//button[@class='button media-button button-primary button-large media-button-select']")
    public WebElement selectButonu;
    @FindBy(id = "gallery_img_gimage_0_display")
    public WebElement galeriImage;
    @FindBy(id = "featured_img_remove_button")
    public WebElement crossSymbol;
    @FindBy(id = "gallery_img_gimage_0_remove_button")
    public WebElement crossSymbol2;
    @FindBy(id = "pro_title")
    public WebElement title;
    @FindBy(id = "excerpt_ifr")
    public WebElement iframe1;
    @FindBy(xpath = "(//body[@id='tinymce'])[1]")
    public WebElement shortDescription2;
    @FindBy(id = "description_ifr")
    public WebElement iframe2;
    @FindBy(xpath = "//input[@value='229']")
    public WebElement checkboxAccessories;
    @FindBy(xpath = "//p[text()=\"+Add new category\"]")
    public WebElement addNewCategory;
    @FindBy(xpath = "//input[@placeholder='Category Name']")
    public WebElement categoryName;
    @FindBy(xpath = "//select[@id='wcfm_new_parent_cat']")
    public WebElement dropdown;
    @FindBy(xpath = " (//button[@class='button wcfm_add_category_bt wcfm_add_taxonomy_bt'])[1]")
    public WebElement addButton;
    @FindBy(xpath = "//input[@value='303']")
    public WebElement checkboxBrand;
    @FindBy(xpath = "//p[text()=\"+Add new Product brands\"]")
    public WebElement addNewBrand;
    @FindBy(xpath = "//input[@placeholder='Product brands Name']")
    public WebElement productBrandName;
    @FindBy(xpath = "//select[@id='wcfm_new_parent_product_brand']")
    public WebElement dropdown2;
    @FindBy(xpath = " (//button[@class='button wcfm_add_category_bt wcfm_add_taxonomy_bt'])[2]")
    public WebElement addButton2;
    @FindBy(id = "product_tags")
    public WebElement tags;
    @FindBy(xpath = "//p[text()='Choose from the most used tags']")
    public WebElement chooseTags;
    @FindBy(xpath = "//a[@class='tag-cloud-link tag-link-657 tag-link-position-8']")
    public WebElement bagTag;
    @FindBy(id = "catalog_visibility")
    public WebElement catalogVisibility;
    @FindBy(id = "wcfm_products_manage_form_inventory_head")
    public WebElement inventory;
    @FindBy(id = "wcfm_products_manage_form_shipping_head")
    public WebElement shipping2;
    @FindBy(id = "wcfm_products_manage_form_attribute_head")
    public WebElement attributes;
    @FindBy(id = "wcfm_products_manage_form_linked_head")
    public WebElement linked;
    @FindBy(id = "wcfm_products_manage_form_yoast_head")
    public WebElement seo;
    @FindBy(id = "wcfm_products_manage_form_toptan-urun-gosterme-ayarlari_head")
    public WebElement tuga;
    @FindBy(id = "wcfm_products_manage_form_advanced_head")
    public WebElement advanced;
    @FindBy(id = "sku")
    public WebElement sku;
    @FindBy(id = "manage_stock")
    public WebElement checkboxManageStock;
    @FindBy(id = "sold_individually")
    public WebElement checkboxSoldIndividually;
    @FindBy(id = "stock_status")
    public WebElement stockStatus;
    @FindBy(id = "weight")
    public WebElement weight;
    @FindBy(id = "length")
    public WebElement length;
    @FindBy(id = "width")
    public WebElement width;
    @FindBy(id = "height")
    public WebElement height;
    @FindBy(id = "shipping_class")
    public WebElement shippingClass;
    @FindBy(id = "_wcfmmp_processing_time")
    public WebElement processingTime;
    @FindBy(xpath = "(//span[@class='fields_collapser attributes_collapser wcfmfa fa-arrow-circle-down'])[2]")
    public WebElement circleColor;
    @FindBy(xpath = "(//input[@class='select2-search__field'])[2]")
    public WebElement colorInput;
    @FindBy(xpath = "//li[@role='option']")
    public List<WebElement> colorInputList;
    @FindBy(xpath = "(//button[text()='Add New'])[1]")
    public WebElement colorAddNew;
    @FindBy(id = "attributes_is_active_2")
    public WebElement sizeButton;
    @FindBy(xpath = "(//input[@class='select2-search__field'])[3]")
    public WebElement sizeInput;
    @FindBy(xpath = "(//button[text()='Add New'])[2]")
    public WebElement sizeAddNew;
    @FindBy(xpath = "(//input[@class='select2-search__field'])[4]")
    public WebElement upsells;
    @FindBy(xpath = "(//input[@class='select2-search__field'])[5]")
    public WebElement crosssells;
    @FindBy(xpath = "//input[@id='yoast_wpseo_focuskw_text_input']")
    public WebElement seoEnter;
    @FindBy(xpath = "//textarea[@id='yoast_wpseo_metadesc']")
    public WebElement seoMetaDesc;
    @FindBy(xpath = "//select[@id='piecetype']")
    public WebElement pieceType;
    @FindBy(xpath = "//input[@id='unitpercart']")
    public WebElement unitsPerPiece;
    @FindBy(xpath = "//input[@id='minorderqtytr']")
    public WebElement minOrderQuantity;
    @FindBy(xpath = "//input[@id='enable_reviews']")
    public WebElement enableReviews;
    @FindBy(xpath = "//input[@id='menu_order']")
    public WebElement menuOrder;
    @FindBy(xpath = "//textarea[@id='purchase_note']")
    public WebElement purchaseNote;





}
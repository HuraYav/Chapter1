import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



import static com.codeborne.selenide.Selenide.$x;

public class POM {


    @FindBy(how = How.CLASS_NAME, using = "sd-burger-button")
    private SelenideElement catalogButton;

    @FindBy(how = How.LINK_TEXT, using = "Посуда для напитков")
    private SelenideElement catalogButtonFirst;

    @FindBy(how = How.CLASS_NAME, using = "cb-js-hover-gallery-item")
    private SelenideElement productButton;

    @FindBy(how = How.ID, using = "add_to_cart_update_2129794")
    private SelenideElement productButtonBuy;

    @FindBy(how = How.CLASS_NAME, using = "cb-n--notification-message__button")
    private SelenideElement buttonBasket;

    SelenideElement productTitle = $x("//*[@id=\"categories_view_pagination_contents\"]/div/div[1]/div/form/div/div[5]/a");

    @FindBy(how = How.ID, using = "button_cart_2129794")
    private SelenideElement productButtonBuyInProductPage;

    @FindBy(how = How.LINK_TEXT, using = "Оформить заказ")
    private SelenideElement createOrderButton;

    @FindBy(how = How.ID, using = "litecheckout_firstname")
    private SelenideElement firstNameField;

    @FindBy(how = How.ID, using = "litecheckout_lastname")
    private SelenideElement lastNameField;

    @FindBy(how = How.ID, using = "litecheckout_email")
    private SelenideElement emailField;

    @FindBy(how = How.ID, using = "litecheckout_phone")
    private SelenideElement phoneField;

    @FindBy(how = How.LINK_TEXT, using = "Добавить адрес доставки")
    private SelenideElement addAddressButton;

    @FindBy(how = How.ID, using = "user_delivery_address_form_address")
    private SelenideElement fieldAddAddress;

    @FindBy(how = How.ID, using = "user_delivery_address_form_name")
    private SelenideElement fieldNameAddress;

    @FindBy(how = How.ID, using = "user_delivery_address_form_address")
    private SelenideElement fieldaddressline;

    @FindBy(how = How.CLASS_NAME, using = "suggestions-suggestion")
    private SelenideElement addressline;

    @FindBy(how = How.ID, using = "user_delivery_address_form_name")
    private SelenideElement addNameAddress;

    @FindBy(how = How.CLASS_NAME, using = "user-delivery-address-form__submit")
    private SelenideElement addAddressButtonConfirm;

    @FindBy(how = How.ID, using = "elm_delivery_date_1")
    private SelenideElement addDataButton;

    SelenideElement addSelectData = $x("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[2]");

    @FindBy(how = How.ID, using = "fake_place_order_btn")
    private SelenideElement confirmOrderButton;

    public void clickFirstCatalogButton() {
        catalogButton.click();
        catalogButtonFirst.click();
    }

    public void clickProduct() {
        catalogButton.click();
        catalogButtonFirst.click();
        productButton.click();
    }

    public void addProductFromCategory() {
        catalogButton.click();
        catalogButtonFirst.click();
        productButtonBuy.click();
        buttonBasket.click();
    }

    public void addProductFromProductPage() {
        catalogButton.click();
        catalogButtonFirst.click();
        productTitle.click();
        productButtonBuyInProductPage.click();
        buttonBasket.click();
    }

    public void orderCreate() {
        catalogButton.click();
        catalogButtonFirst.click();
        productTitle.click();
        productButtonBuyInProductPage.click();
        buttonBasket.click();
        createOrderButton.click();
        addAllField("Петька", "Васильев", "79999999999", "kfenmfn@mail.ru");
        addAddressButton.click();
        setAddressline("Москва ");
        addressline.click();
        addNameAddress.click();
        setNameAddress("Топ Реклама Якитории");
        addAddressButtonConfirm.click();
        addDataButton.click();
        addSelectData.click();
        confirmOrderButton.click();
    }

    // метод заполнения поля ввода email
    public void setFirstName(String firstName) {
        firstNameField.setValue(firstName);
    }

    public void setLastName(String lastName) {
        lastNameField.setValue(lastName);
    }

    public void setPhone(String phone) {
        phoneField.setValue(phone);
    }

    public void setEmail(String email) {
        emailField.setValue(email);
    }

    public void setAddressline(String address) {
        fieldaddressline.setValue(address);
    }

    public void setNameAddress(String name) {
        addNameAddress.setValue(name);
    }

    public void addAllField(String firstName, String lastName, String phone, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
        setEmail(email);
    }
}


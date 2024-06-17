import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class POM {



    private SelenideElement menuButton = $(".cmx-header-menu__button .sd-burger-button");

    private SelenideElement menuItemFirst = $(".ty-menu__items .ty-menu__item-link");

    private SelenideElement productButton = $(".cmx-product-grid__item .product-title");

    private SelenideElement productButtonBuy = $(".cmx-product-grid__item .ty-btn__add-to-cart");

    private SelenideElement buttonBasket= $(".cb-n--notification-message__button.ty-btn__text");//.cmx-account-icons__title-wrapper

    private SelenideElement productButtonBuyInProductPage = $(".cmx-product-details__button-block .ty-btn__primary");

    private SelenideElement createOrderButton = $(".cb-cart-total .cb-cart-total__submit");

    private SelenideElement firstNameField = $(byId("litecheckout_firstname")) ;

    private SelenideElement lastNameField = $(byId("litecheckout_lastname"));

    private SelenideElement emailField = $(byId("litecheckout_email"));

    private SelenideElement phoneField = $(byId("litecheckout_phone"));

    private SelenideElement addAddressButton = $(byLinkText("Добавить адрес доставки"));

    private SelenideElement fieldNameAddress = $(byId("user_delivery_address_form_name"));

    private SelenideElement fieldaddressline = $(byId("user_delivery_address_form_address"));

    private SelenideElement addressline = $("div.suggestions-wrapper .suggestions-suggestion");

    private SelenideElement addAddressButtonConfirm = $(byClassName("user-delivery-address-form__submit"));

    private SelenideElement addDataButton = $(byId("elm_delivery_date_1"));

    private SelenideElement addSelectData = $x("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[2]");

    private SelenideElement confirmOrderButton = $(byId("fake_place_order_btn"));

    public void clickFirstCatalogButton() {
        menuButton.click();
        menuItemFirst.click();
    }

    public void clickProduct() {
        menuButton.click();
        menuItemFirst.click();
        productButton.click();
    }

    public void addProductFromCategory() {
        menuButton.click();
        menuItemFirst.click();
        productButtonBuy.click();
        buttonBasket.click();
    }

    public void addProductFromProductPage() {
        menuButton.click();
        menuItemFirst.click();
        productButton.click();
        productButtonBuyInProductPage.click();
        buttonBasket.click();
    }

    public void orderCreate() {
        menuButton.click();
        menuItemFirst.click();
        productButton.click();
        productButtonBuyInProductPage.click();
        buttonBasket.click();
        createOrderButton.click();
        addAllFields("Петька", "Васильев", "79999999999", "kfenmfn@mail.ru");
        addAddressButton.click();
        setAddressline("Москва ");
        addressline.click();
        fieldNameAddress.click();
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
        fieldNameAddress.setValue(name);
    }

    public void addAllFields(String firstName, String lastName, String phone, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
        setEmail(email);
    }
}


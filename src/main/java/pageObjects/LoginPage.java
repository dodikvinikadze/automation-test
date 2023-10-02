package pageObjects;
import com.codeborne.selenide.Condition;
import dataObjects.LoginData;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage  {
  public  SelenideElement

               usernameInput = $(byId("main-username")),
               passwordInput = $(byId("main-password")),
               loginButton = $(byText("შესვლა")),
               depositText = $(byText("შევსება")),
               topGames = $(byXpath("//*[text() = 'Top Games']")),
               slots = $(byText("სლოტები"));


    public void enterUsername(String username) {
        usernameInput.shouldBe(Condition.visible).setValue(LoginData.username);
    }

    public void enterPassword(String password) {
        passwordInput.shouldBe(Condition.visible).setValue(LoginData.password);
    }

    public void clickOnLogin() {
        loginButton.shouldBe(Condition.visible).click();

    }

    public void clickOnSlotsButton() {
    slots.shouldBe(Condition.visible).click();
    }
}

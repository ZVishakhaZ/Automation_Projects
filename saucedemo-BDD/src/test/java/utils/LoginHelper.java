package utils;

import page.LoginPage;

public class LoginHelper {

    public static void loginAsStandardUser() {

        DriverFactory.getDriver().get(ConfigReader.get("url"));
     
        LoginPage loginPage = new LoginPage();
        
        loginPage.login(
            ConfigReader.get("username"),
            ConfigReader.get("password")
        );
    }
}

package by.itacademy.pakulnitskaya;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeightCalcTest {

    @Test
    public void testFormWithEmptyValues() {
        //Starting a driver session
        WebDriver driver = new ChromeDriver();
        //Navigating to a web page
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        //Set an element for input Button
        String inputButtonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By inputButtonCalculateBy = By.xpath(inputButtonCalculateXpath);
        //Find an element
        WebElement inputButtonCalculateElement = driver.findElement(inputButtonCalculateBy);
        //Click on element
        inputButtonCalculateElement.click();
        //Set an element for text Alert
        String textEmptyValueAlertXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td";
        By textEmptyValueAlertBy = By.xpath(textEmptyValueAlertXpath);
        //Find an element
        WebElement testEmptyValueAlertElement = driver.findElement(textEmptyValueAlertBy);
        //Set Actual and Expected result
        String actualResult = testEmptyValueAlertElement.getText();
        String expectedResult = "Не указано имя.\n" + "Рост должен быть в диапазоне 50-300 см.\n" + "Вес должен быть в диапазоне 3-500 кг.\n" + "Не указан пол.";
        //Check whether Actual and Expected results are match
        Assertions.assertEquals(actualResult, expectedResult);
        //End the session
        driver.quit();
    }

    @Test
    public void testFormWithEmptyNameHeightWeight() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        String inputRadioGenderXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]";
        By inputRadioGenderBy = By.xpath(inputRadioGenderXpath);
        WebElement inputRadioGenderElement = driver.findElement(inputRadioGenderBy);
        inputRadioGenderElement.click();
        String inputButtonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By inputButtonCalculateBy = By.xpath(inputButtonCalculateXpath);
        WebElement inputButtonCalculateElement = driver.findElement(inputButtonCalculateBy);
        inputButtonCalculateElement.click();
        String textEmptyValueAlertXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td";
        By textEmptyValueAlertBy = By.xpath(textEmptyValueAlertXpath);
        WebElement testEmptyValueAlertElement = driver.findElement(textEmptyValueAlertBy);
        String actualResult = testEmptyValueAlertElement.getText();
        String expectedResult = "Не указано имя.\n" + "Рост должен быть в диапазоне 50-300 см.\n" + "Вес должен быть в диапазоне 3-500 кг.";
        Assertions.assertEquals(actualResult, expectedResult);
        driver.quit();
    }

    @Test
    public void testFormWithEmptyNameHeight() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        String inputFieldWeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By inputFieldWeightBy = By.xpath(inputFieldWeightXpath);
        WebElement inputFieldWeightElement = driver.findElement(inputFieldWeightBy);
        inputFieldWeightElement.sendKeys("100");
        String inputRadioGenderXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]";
        By inputRadioGenderBy = By.xpath(inputRadioGenderXpath);
        WebElement inputRadioGenderElement = driver.findElement(inputRadioGenderBy);
        inputRadioGenderElement.click();
        String inputButtonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By inputButtonCalculateBy = By.xpath(inputButtonCalculateXpath);
        WebElement inputButtonCalculateElement = driver.findElement(inputButtonCalculateBy);
        inputButtonCalculateElement.click();
        String textEmptyValueAlertXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td";
        By textEmptyValueAlertBy = By.xpath(textEmptyValueAlertXpath);
        WebElement testEmptyValueAlertElement = driver.findElement(textEmptyValueAlertBy);
        String actualResult = testEmptyValueAlertElement.getText();
        String expectedResult = "Не указано имя.\n" + "Рост должен быть в диапазоне 50-300 см.";
        Assertions.assertEquals(actualResult, expectedResult);
        driver.quit();
    }

    @Test
    public void testFormWithEmptyName() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        String inputFieldHeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputFieldHeightBy = By.xpath(inputFieldHeightXpath);
        WebElement inputFieldHeightElement = driver.findElement(inputFieldHeightBy);
        inputFieldHeightElement.sendKeys("50");
        String inputFieldWeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By inputFieldWeightBy = By.xpath(inputFieldWeightXpath);
        WebElement inputFieldWeightElement = driver.findElement(inputFieldWeightBy);
        inputFieldWeightElement.sendKeys("100");
        String inputRadioGenderXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]";
        By inputRadioGenderBy = By.xpath(inputRadioGenderXpath);
        WebElement inputRadioGenderElement = driver.findElement(inputRadioGenderBy);
        inputRadioGenderElement.click();
        String inputButtonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By inputButtonCalculateBy = By.xpath(inputButtonCalculateXpath);
        WebElement inputButtonCalculateElement = driver.findElement(inputButtonCalculateBy);
        inputButtonCalculateElement.click();
        String textEmptyValueAlertXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td";
        By textEmptyValueAlertBy = By.xpath(textEmptyValueAlertXpath);
        WebElement testEmptyValueAlertElement = driver.findElement(textEmptyValueAlertBy);
        String actualResult = testEmptyValueAlertElement.getText();
        String expectedResult = "Не указано имя.";
        Assertions.assertEquals(actualResult, expectedResult);
        driver.quit();
    }
}

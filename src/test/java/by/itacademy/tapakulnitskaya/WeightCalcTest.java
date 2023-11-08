package by.itacademy.tapakulnitskaya;

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
    }
}

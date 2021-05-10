package com.example.st_HW_89022;
import io.github.bonigarcia.seljup.SeleniumJupiter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

@ExtendWith(SeleniumJupiter.class)
class ApplicationSeleniumTest {

  @Test
  @DisplayName("Test web page using selenium")
  void applicationSeleniumTest(FirefoxDriver driver) {
    driver.get("http://localhost:8082/");
    driver.manage().window().setSize(new Dimension(1131, 697));
    driver.findElement(By.id("place")).click();
    driver.findElement(By.id("place")).clear();
    driver.findElement(By.id("place")).sendKeys("Lisboa");
    driver.findElement(By.cssSelector("button")).click();
    driver.findElement(By.id("place")).click();
    driver.findElement(By.id("place")).clear();
    driver.findElement(By.id("place")).sendKeys("Viseu");
    driver.findElement(By.id("place")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector("button")).click();
  }
}

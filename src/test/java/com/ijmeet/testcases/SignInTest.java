package com.ijmeet.testcases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.config.Constants;
import com.config.Keywords;
import com.config.TestListener;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

@Listeners(TestListener.class)
public class SignInTest extends BaseClass {
	@Test
	public void tc_001() {
		
		
		
		
		Constants.sip.clickOnSign();
		Constants.logger.info("Verify Sign In link");
		Constants.extent.createTest("tc_001 Sign In link");
	}

}
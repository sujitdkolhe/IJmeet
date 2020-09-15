package com.config;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.ijmeet.pageobject.SignInPage;
import com.ijmeet.pageobject.SignUpPage;

import ru.yandex.qatools.ashot.AShot;

public class Constants {

	public static WebDriver driver;
	public static WebElement element;
	public static Actions action;
	public static Object obj;
	public static JSONObject jsonObj;
	public static JSONArray jsonArray;
	public static List<String> expectedList;
	public static ArrayList<String> actualList;
	public static boolean isDisplay;
	public static String actual;
	public static String expected;
	public static ExtentTest test;
	public static ExtentReports extent;
	public static Logger logger;
	public static SignInPage sip;
	public static AShot ashot;
	public static SignUpPage signUpPage;
	
}


//>>>>>>> c9730fc99413124e79b6ec320065d8c7fa80f15f

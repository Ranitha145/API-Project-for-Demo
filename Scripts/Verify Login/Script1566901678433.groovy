import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demo.sentrifugo.com/')

WebUI.setText(findTestObject('Page_Sentrifugo - Open Source HRMS/input_Login_username'), 'EM01')

WebUI.setEncryptedText(findTestObject('Page_Sentrifugo - Open Source HRMS/input_Login_password'), 'hR/5cO+bsPVQ+DYkhQgwbQ==')

WebUI.click(findTestObject('Page_Sentrifugo - Open Source HRMS/input_Login_loginsubmit'))

Date today = new Date();
String todaysDate = today.format('MM_dd_yy');
String nowTime = today.format('hh_mm_ss');
WebUI.takeScreenshot("D:/Katalon/screenshot/image_"+ todaysDate +"-" + nowTime +".PNG");


WebUI.closeBrowser()


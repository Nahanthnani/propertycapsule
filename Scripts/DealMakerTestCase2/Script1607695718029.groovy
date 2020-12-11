import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.propertycapsule.com/')

WebUI.click(findTestObject('Object Repository/DealMaker/Page_PROPERTY CAPSULE Retail  Commercial Re_361e89/a_Deal Maker SignupLogin'))

WebUI.click(findTestObject('Object Repository/DealMaker/Page_PROPERTY CAPSULE Retail  Commercial Re_361e89/div_Continue with Linkedin'))

WebUI.setText(findTestObject('Object Repository/DealMaker/Page_LinkedIn Login, Sign in  LinkedIn/input_Welcome Back_session_key'), 
    'maturinahanth@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/DealMaker/Page_LinkedIn Login, Sign in  LinkedIn/input_Welcome Back_session_password'), 
    'ZaVLiWGQDFQ2KmhtRMEzLA==')

WebUI.click(findTestObject('Object Repository/DealMaker/Page_LinkedIn Login, Sign in  LinkedIn/button_Sign in'))

WebUI.click(findTestObject('Object Repository/DealMaker/Page_PROPERTY CAPSULE Retail  Commercial Re_361e89/img'))

WebUI.click(findTestObject('Object Repository/DealMaker/Page_PROPERTY CAPSULE Retail  Commercial Re_361e89/div_Logout'))

WebUI.closeBrowser()


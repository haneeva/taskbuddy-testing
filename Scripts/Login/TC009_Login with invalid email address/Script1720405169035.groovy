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

//Navigate to Website

WebUI.navigateToUrl(GlobalVariable.URL)

String ActualURL = WebUI.getUrl()
String ExpectedURL = 'https://task-buddy-d414881265e1.herokuapp.com/'

WebUI.verifyMatch(ActualURL, ExpectedURL, false) //Verify the URL is correct
println('The website is accessible')

//Click Login Menu

WebUI.click(findTestObject('Object Repository/Login/Page_TaskBuddy/a_Login'))

String ActualUrlLogin = WebUI.getUrl()
String ExpectedUrlLogin = 'https://task-buddy-d414881265e1.herokuapp.com/login'

WebUI.verifyMatch(ActualUrlLogin, ExpectedUrlLogin, false)

String ActualTitleLogin = WebUI.getText(findTestObject('Object Repository/Login/Page_TaskBuddy/strong_Login_title'))
String ExpectedTitleLogin = 'Login'

WebUI.verifyMatch(ActualTitleLogin, ExpectedTitleLogin, false)

println('The Login page is displayed')

WebUI.takeScreenshot('C:\\Taskbuddy\\LoginPage.png')

//Enter Invalid Username

WebUI.setText(findTestObject('Object Repository/Login/Page_TaskBuddy/input_Login_email'), username)

println('Username is filled')

//Enter Password

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_TaskBuddy/input_Login_password'), password)

println('Password is filled')

//Click Login Button

WebUI.click(findTestObject('Object Repository/Login/Page_TaskBuddy/input_Remember Me_remember'))

WebUI.click(findTestObject('Object Repository/Login/Page_TaskBuddy/input_Remember Me_btn login_btn'))

println('Login button is clickable')

//Verify an Error Login

String ActualErrorLogin = WebUI.getText(findTestObject('Object Repository/Login/Page_TaskBuddy/strong_These credentials do not match our records'))
String ExpectedErrorLogin = 'These credentials do not match our records.'

WebUI.verifyMatch(ActualErrorLogin, ExpectedErrorLogin, false)

WebUI.takeScreenshot('C:\\Taskbuddy\\ErrorInvalidEmail.png')

println('Login Unsuccessful')
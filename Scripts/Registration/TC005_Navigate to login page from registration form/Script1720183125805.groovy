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



//Navigate to Webiste

WebUI.navigateToUrl(GlobalVariable.URL)

String ActualURL = WebUI.getUrl()
String ExpectedURL = 'https://task-buddy-d414881265e1.herokuapp.com/'

WebUI.verifyMatch(ActualURL, ExpectedURL, false) //Verify the URL is correct
println('The website is accessible')

//Click Register Menu

WebUI.click(findTestObject('Object Repository/Registration/Page_TaskBuddy/a_Register'))

String ActualRegisterUrl = WebUI.getUrl()
String ExpectedRegisterUrl = 'https://task-buddy-d414881265e1.herokuapp.com/register'

WebUI.verifyMatch(ActualRegisterUrl, ExpectedRegisterUrl, false) //Verify the URL is correct
println('The url is correct')

String ActualRegisterTitle = WebUI.getText(findTestObject('Object Repository/Registration/Page_TaskBuddy/strong_Register_Title'))
String ExpectedRegisterTitle = 'Register'

WebUI.verifyMatch(ActualRegisterTitle, ExpectedRegisterTitle, false)//Verify the Title is correct
println('The title is Register')

//Click Login Hyperlink

WebUI.click(findTestObject('Object Repository/Registration/Page_TaskBuddy/a_Log In'))

println('The login button is clickable')

//Verify Login Page

String ActualLogin = WebUI.getUrl()
String ExpectedLogin = 'https://task-buddy-d414881265e1.herokuapp.com/login'

WebUI.verifyMatch(ActualLogin, ExpectedLogin, false)

WebUI.takeScreenshot('C:\\Taskbuddy\\LoginPage.png')
















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

//Login

WebUI.callTestCase(findTestCase('Login/TC008_Login successful'), [('username') : 'hanifah@yopmail.com', ('password') : 'wNodeYW9pq6nLRMlcvSa2A=='], 
    FailureHandling.STOP_ON_FAILURE)

//Navigate to Story Menu

WebUI.click(findTestObject('Object Repository/Story/Page_TaskBuddy/a_Story'))

String ActualUrlStory = WebUI.getUrl()
String ExpectedUrlStory = 'https://task-buddy-d414881265e1.herokuapp.com/dashboard/stories'

WebUI.verifyMatch(ActualUrlStory, ExpectedUrlStory, false)

println('Story menu is displayed')

//Search Valid Data

WebUI.setText(findTestObject('Object Repository/Story/Page_TaskBuddy/input_All Stories_title'), data)

println('data is filled')

//Click search button

WebUI.click(findTestObject('Object Repository/Story/Page_TaskBuddy/button_All Stories_btn btn-sm btn-outline-s_2a7ea7'))

println('search button is clickable')

//Verify valid data is displayed

WebUI.takeScreenshot('C:\\Taskbuddy\\Inquiry Valid Data.png')

println('Inquiry valid data')










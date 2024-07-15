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

//Click View button

WebUI.click(findTestObject('Object Repository/Story/Page_TaskBuddy/svg_Medium_svg-inline--fa fa-eye fa-w-18 text-dark'))

println('View button is clickable')

//Verify view story is successful

String ActualViewStory = WebUI.getText(findTestObject('Object Repository/Story/Page_TaskBuddy/strong_View_title'))
String ExpectedViewStory = 'Stroy Details'

WebUI.verifyMatch(ActualViewStory, ExpectedViewStory, false)

println('Story can be viewed')

WebUI.takeScreenshot('C:\\Taskbuddy\\View Story.png')











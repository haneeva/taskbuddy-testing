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

//Click Edit in the existing story

WebUI.click(findTestObject('Object Repository/Story/Page_TaskBuddy/svg_Medium_svg-inline--fa fa-pencil-alt fa-_72ea95'))

String ActualTitleEdit = WebUI.getText(findTestObject('Object Repository/Story/Page_TaskBuddy/strong_Edit_title'))
String ExpectedTitleEdit = 'Update Story'

WebUI.verifyMatch(ActualTitleEdit, ExpectedTitleEdit, false)

println('Update story form is displayed')

//Edit Description

WebUI.setText(findTestObject('Object Repository/Story/Page_TaskBuddy/textarea_Description_description'), description)

println('Description is filled')

//Click Update button

WebUI.scrollToElement(findTestObject('Object Repository/Story/Page_TaskBuddy/button_Update'), 2)

WebUI.click(findTestObject('Object Repository/Story/Page_TaskBuddy/button_Update'))

println('Update button is clickable')

//Verify updated story is successful

String ActualUpdateStory = WebUI.getUrl()
String ExpectedUpdateStory = 'https://task-buddy-d414881265e1.herokuapp.com/dashboard/stories'

WebUI.verifyMatch(ActualUpdateStory, ExpectedUpdateStory, false)

println('An existing story is updated successful')

WebUI.click(findTestObject('Object Repository/Story/Page_TaskBuddy/svg_Medium_svg-inline--fa fa-eye fa-w-18 text-dark'))

WebUI.takeScreenshot('C:\\Taskbuddy\\Update Story.png')











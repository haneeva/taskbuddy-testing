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

//Click New Add Story

WebUI.click(findTestObject('Object Repository/Story/Page_TaskBuddy/a_New'))

String ActualUrlCreateStory = WebUI.getUrl()
String ExpectedUrlCreateStory = 'https://task-buddy-d414881265e1.herokuapp.com/dashboard/stories/create'

WebUI.verifyMatch(ActualUrlCreateStory, ExpectedUrlCreateStory, false)

String ActualTitleCreateStory = WebUI.getText(findTestObject('Object Repository/Story/Page_TaskBuddy/strong_Title_Create_Story'))
String ExpectedTitleCreateStory = 'NEW STORY'

println('New Story is displayed')

//Enter Story Title

String ActualStoryTitleLabel = WebUI.getText(findTestObject('Object Repository/Story/Page_TaskBuddy/strong_Title_story'))
String ExpectedStoryTitleLabel = 'Story Title'

WebUI.verifyMatch(ActualStoryTitleLabel, ExpectedStoryTitleLabel, false)

WebUI.setText(findTestObject('Object Repository/Story/Page_TaskBuddy/input_Story Title_title'), storytitle)

println('Story Title is filled')


//Enter Story Label

String ActualStoryLabel = WebUI.getText(findTestObject('Object Repository/Story/Page_TaskBuddy/strong_Story_Label'))
String ExpectedStoryLabel = 'Story Label'

WebUI.verifyMatch(ActualStoryLabel, ExpectedStoryLabel, false)

WebUI.setText(findTestObject('Object Repository/Story/Page_TaskBuddy/input_Story Label_label'), storylabel)

println('Story Label is filled')

//Select Assign To

String ActualAssignToLabel = WebUI.getText(findTestObject('Object Repository/Story/Page_TaskBuddy/strong_AssignTo_Label'))
String ExpectedAssignToLabel = 'Assign To'

WebUI.verifyMatch(ActualAssignToLabel, ExpectedAssignToLabel, false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Story/Page_TaskBuddy/select_Assign person.                      _5f578b'),
	'68', true)

println('Assign To is selected')

//Select Story Status

String ActualStoryStatusLabel = WebUI.getText(findTestObject('Object Repository/Story/Page_TaskBuddy/strong_Story_Status'))
String ExpectedStoryStatusLabel = 'Story Status'

WebUI.verifyMatch(ActualStoryStatusLabel, ExpectedStoryStatusLabel, false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Story/Page_TaskBuddy/select_Select status.                      _371135'),
	'To do', true)

println('Story Status To is selected')

//Enter Story Points

String ActualStoryPointLabel = WebUI.getText(findTestObject('Object Repository/Story/Page_TaskBuddy/strong_Story_Points'))
String ExpectedStoryPointLabel = 'Story Points'

WebUI.verifyMatch(ActualStoryPointLabel, ExpectedStoryPointLabel, false)

WebUI.setText(findTestObject('Object Repository/Story/Page_TaskBuddy/input_-_points'), '8')

println('Story Point To is filled')

//Enter Description

String ActualDescriptionLabel = WebUI.getText(findTestObject('Object Repository/Story/Page_TaskBuddy/strong_Description'))
String ExpectedDescriptionLabel = 'Description'

WebUI.verifyMatch(ActualDescriptionLabel, ExpectedDescriptionLabel, false)

WebUI.setText(findTestObject('Object Repository/Story/Page_TaskBuddy/textarea_Description_description'), description)

println('Description To is filled')

//Click Save Button

WebUI.scrollToElement(findTestObject('Object Repository/Story/Page_TaskBuddy/button_Save'), 5)

WebUI.click(findTestObject('Object Repository/Story/Page_TaskBuddy/button_Save'))

println('Save button is clickable')

//Verify a new story cannot be created

String ActualStoryError = WebUI.getUrl()
String ExpectedStoryError = 'https://task-buddy-d414881265e1.herokuapp.com/dashboard/stories/create'

WebUI.verifyMatch(ActualStoryError, ExpectedStoryError, false)

println('A new story cannot be created')

WebUI.takeScreenshot('C:\\Taskbuddy\\Empty Story Priority.png')











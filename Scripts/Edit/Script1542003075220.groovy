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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.0.28:5053/')

'email'
WebUI.setText(findTestObject('Object Repository/Edit_or/Page_JIN Login/input_JIN_email'), 'maddie@gmail.com')

'password\r\n'
WebUI.setEncryptedText(findTestObject('Object Repository/Edit_or/Page_JIN Login/input_Email_password'), 'R2dZ4hvJ2ujoDGjQ2cClHw==')

'click login button\r\n'
WebUI.click(findTestObject('Object Repository/Edit_or/Page_JIN Login/button_LOG IN'))

'click menu'
WebUI.click(findTestObject('Object Repository/Edit_or/Page_Dashboard/i_menu'))

WebUI.delay(5)

'click bu settings'
WebUI.click(findTestObject('Object Repository/Edit_or/Page_Dashboard/div_ac_unit BU-Settings'))

'click add button\r\n'
WebUI.click(findTestObject('Object Repository/Edit_or/Page_Business Unit Info/i_add'))

WebUI.click(findTestObject('Object Repository/Edit_or/Page_Business Unit Info/label_Business Unit Code'))

'bu input code'
WebUI.setText(findTestObject('Object Repository/Edit_or/Page_Business Unit Info/input_Basic Info_code'), Buc, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Edit_or/Page_Business Unit Info/label_Business Unit Name'))

'bu input name'
WebUI.setText(findTestObject('Edit_or/Page_Business Unit Info/input__name'), Bun, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Edit_or/Page_Business Unit Info/label_Email'))

'input email'
WebUI.setText(findTestObject('Object Repository/Edit_or/Page_Business Unit Info/input_BU Admin Access_buAdminM'), email, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Edit_or/Page_Business Unit Info/label_First Name'))

'input firstname\r\n'
WebUI.setText(findTestObject('Object Repository/Edit_or/Page_Business Unit Info/input__buAdminFirstName'), firstname, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Edit_or/Page_Business Unit Info/label_Last Name'))

'input lastname'
WebUI.setText(findTestObject('Object Repository/Edit_or/Page_Business Unit Info/input__buAdminLastName'), lastname, FailureHandling.CONTINUE_ON_FAILURE)

'click select'
WebUI.click(findTestObject('Object Repository/Edit_or/Page_Business Unit Info/span_select_caret'))

'click dropdown option\r\n'
WebUI.click(findTestObject('Object Repository/Edit_or/Page_Business Unit Info/a_Afghanistan'))

'click select\r\n'
WebUI.click(findTestObject('Object Repository/Edit_or/Page_Business Unit Info/button_select'))

'click dropdown option\r\n'
WebUI.click(findTestObject('Object Repository/Edit_or/Page_Business Unit Info/a_Production'))

WebUI.click(findTestObject('Object Repository/Edit_or/Page_Business Unit Info/label_Contact Number'))

'input number\r\n'
WebUI.setText(findTestObject('verify2/Page_Business Unit Info/input__buContact'), contact, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Edit_or/Page_Business Unit Info/input_Address_address'), '12')

WebUI.setText(findTestObject('Object Repository/Edit_or/Page_Business Unit Info/input__city'), 'chennai')

WebUI.setText(findTestObject('Object Repository/Edit_or/Page_Business Unit Info/input__state'), 'tamil')

WebUI.click(findTestObject('Object Repository/Edit_or/Page_Business Unit Info/label_Zip Code'))

WebUI.setText(findTestObject('Object Repository/Edit_or/Page_Business Unit Info/input__zipcode'), '1234')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Edit_or/Page_Business Unit Info/a_save'), FailureHandling.CONTINUE_ON_FAILURE)

'verifying it is updating or not'
WebUI.verifyTextPresent('Connected Apps', false, FailureHandling.CONTINUE_ON_FAILURE)

'click search\r\n'
WebUI.click(findTestObject('verify2/Page_Business Unit Info/label_Search BU Name BU Code'))

'input search'
WebUI.setText(findTestObject('verify2/Page_Business Unit Info/input_search_search'), Buc, FailureHandling.CONTINUE_ON_FAILURE)

'verifying whether updating elements present or not'
WebUI.verifyTextPresent(Buc, false, FailureHandling.CONTINUE_ON_FAILURE)


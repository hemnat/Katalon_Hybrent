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

WebUI.navigateToUrl('https://qa39.rd.hybrent.com/b/#/selectuser')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_User Name_userName'), 'hemant')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Password_password'), '6KyWbXzygXY=')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Admin'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Departments'))

WebUI.click(findTestObject('Object Repository/Page_Department/button_Add'))

WebUI.click(findTestObject('Object Repository/Page_Department/a_--Select facility--'))

WebUI.click(findTestObject('Object Repository/Page_Department/button_Select'))

WebUI.setText(findTestObject('Object Repository/Page_Department/input_Mnemonic_mnemonic'), 'mne2383')

WebUI.setText(findTestObject('Object Repository/Page_Department/input_Name_name'), 'mne')

WebUI.doubleClick(findTestObject('Object Repository/Page_Department/input_Mnemonic_mnemonic'))

WebUI.setText(findTestObject('Object Repository/Page_Department/input_Name_name'), 'name87634')

WebUI.doubleClick(findTestObject('Object Repository/Page_Department/input_Name_name'))

WebUI.setText(findTestObject('Object Repository/Page_Department/input_Name_name'), 'name87634')

WebUI.click(findTestObject('Object Repository/Page_Department/span_Save'))

WebUI.setText(findTestObject('Object Repository/Page_Department/input_Search by_search-search'), 'name87634')

WebUI.click(findTestObject('Object Repository/Page_Department/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Department/div_name87634'))

WebUI.closeBrowser()


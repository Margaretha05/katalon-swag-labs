package fillForm

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys

public class FillFormCheckout{

	String defaultFirstName = "Etha First"
	String defaultLastName = "Simanjuntak Last"
	String defaultZip = "Simanjuntak Last"

	@Keyword
	def fillForm() {
		WebUI.setText(findTestObject('Checkout/txt_firstName'), defaultFirstName)
		WebUI.setText(findTestObject('Checkout/txt_lastName'), defaultLastName)
		WebUI.setText(findTestObject('Checkout/txt_zipcode'), defaultZip)
	}

	@Keyword
	def clickButton() {
		WebUI.click(findTestObject('Checkout/btn_continue'))
	}


	@Keyword
	def clearAllField() {
		WebUI.sendKeys(findTestObject('Checkout/txt_firstName'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))
		WebUI.sendKeys(findTestObject('Checkout/txt_lastName'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))
		WebUI.sendKeys(findTestObject('Checkout/txt_zipcode'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))
	}
}

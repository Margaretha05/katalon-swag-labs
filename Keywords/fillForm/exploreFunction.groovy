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

public class exploreFunction{

	//****Fungsi itu bisa beda-beda cara penulisanya*******

	//	@Keyword
	//	def fillForm(String firstName, String lastName, String zip) {
	//		WebUI.setText(findTestObject('Checkout/txt_firstName'), firstName)
	//		WebUI.setText(findTestObject('Checkout/txt_lastName'), lastName)
	//		WebUI.setText(findTestObject('Checkout/txt_zipcode'), zip)
	//	}

	//====================================================CASE 1==========================================================//
	//	case 1 -> WebUI.setText(findTestObject('Checkout/txt_firstName'), firstName) -> firstName disini itu bukan Value, tapi parameter, dimana parameter
	//	tersebut harus di define di function def fillForm(String firstName, String lastName, String zip) sesuatu yang nanti diinput user
	//	{pemanggilan di script}
	//	CustomKeywords.'fillForm.FillFormCheckout.fillForm'('franz', 'sinaga', '')

	@Keyword
	def case1(String firstName, String lastName, String zip) {
		WebUI.setText(findTestObject('Checkout/txt_firstName'), firstName)
		WebUI.setText(findTestObject('Checkout/txt_lastName'), lastName)
		WebUI.setText(findTestObject('Checkout/txt_zipcode'), zip)
	}

	//====================================================CASE 2==========================================================//
	//case 2 -> WebUI.setText(findTestObject('Checkout/txt_firstName'), 'firstName') -> firstName disini itu adalah Value, tapi parameter, dimana parameter
	//tersebut tidak harus di define di function def fillForm() {
	//{pemanggilan di script}
	//CustomKeywords.'fillForm.FillFormCheckout.fillForm'()

	@Keyword
	def case2() {
		WebUI.setText(findTestObject('Checkout/txt_firstName'), 'Nama 1')
		WebUI.setText(findTestObject('Checkout/txt_lastName'), 'Akhir')
		WebUI.setText(findTestObject('Checkout/txt_zipcode'), '123456')
	}


	//====================================================CASE 3==========================================================//
	//case 3 -> kita lgsg definisiin value -> String defaultFirstName = "default"
	//terus tinggal panggil si defaultFirstName: WebUI.setText(findTestObject('Checkout/txt_firstName'), defaultFirstName)
	//{pemanggilan di script}
	//CustomKeywords.'fillForm.FillFormCheckout.fillForm'()

	String defaultFirstName = "Etha First"
	String defaultLastName = "Simanjuntak Last"
	String defaultZip = "040321"

	@Keyword
	def case3() {
		WebUI.setText(findTestObject('Checkout/txt_firstName'), defaultFirstName)
		WebUI.setText(findTestObject('Checkout/txt_lastName'), defaultLastName)
		WebUI.setText(findTestObject('Checkout/txt_zipcode'), defaultZip)
	}
}


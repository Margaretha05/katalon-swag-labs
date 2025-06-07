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
import fillForm.FillFormCheckout as FillFormCheckout
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//FillFormCheckout form = new FillFormCheckout()
WebUI.callTestCase(findTestCase('Product/tc_product_addToCart'), [('name_item1') : 'Sauce Labs Backpack', ('name_item2') : 'Sauce Labs Bike Light'
        , ('id_item1') : 'add-to-cart-sauce-labs-backpack', ('id_item2') : 'add-to-cart-sauce-labs-bike-light'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Product/btn_checkout'))

WebUI.verifyElementText(findTestObject('Global Object/txt_titlePage'), 'Checkout: Your Information')

CustomKeywords.'fillForm.exploreFunction.case1'('Franz', 'Deddy', '040321')
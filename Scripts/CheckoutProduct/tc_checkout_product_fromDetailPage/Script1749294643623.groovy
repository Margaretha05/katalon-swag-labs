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

WebUI.callTestCase(findTestCase('InventoryPages/tc_inventory_detailProduct'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('InventoryProduct/btn_addtoCart'), 'Add to cart')

WebUI.click(findTestObject('InventoryProduct/btn_addtoCart'))

WebUI.click(findTestObject('Product/icon_cart'))

WebUI.verifyElementText(findTestObject('Global Object/txt_titlePage'), 'Your Cart')

WebUI.click(findTestObject('Product/btn_checkout'))

CustomKeywords.'fillForm.FillFormCheckout.fillForm'()

CustomKeywords.'fillForm.FillFormCheckout.clickButton'()

WebUI.click(findTestObject('CheckoutOverview/btn_finish'))

WebUI.verifyElementText(findTestObject('Global Object/txt_titlePage'), 'Checkout: Complete!')

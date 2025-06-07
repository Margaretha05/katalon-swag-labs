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



WebUI.callTestCase(findTestCase('Autentikasi/tc_login_valid'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('InventoryProduct/icon_sort'))

WebUI.click(findTestObject('InventoryProduct/list_sortInventory', [('option_value') : sort_by_A_to_Z]))

WebUI.delay(2)

CustomKeywords.'sorting.SortingText.SortAscending'(findTestObject('InventoryProduct/txt_inventoryName'))

WebUI.click(findTestObject('InventoryProduct/list_sortInventory', [('option_value') : sort_by_Z_to_A]))

WebUI.delay(2)

WebUI.click(findTestObject('InventoryProduct/list_sortInventory', [('option_value') : sort_by_low_to_high]))

WebUI.delay(2)

WebUI.click(findTestObject('InventoryProduct/list_sortInventory', [('option_value') : sort_by_high_to_low]))

WebUI.delay(2)

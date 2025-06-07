package sorting

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

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import org.openqa.selenium.WebElement

public class SortingText {
	@Keyword
	def SortAscending (TestObject to) {
		List<WebElement> nameElements = WebUiCommonHelper.findWebElements(to, 5) //

		// Tujuannya untuk mendapatkan text dari tiap2 web elements dan memasukkannya kedalam list string
		List<String> actualNames = nameElements.collect { it.text }
		List<String> expectedNames = new ArrayList<>(actualNames)
		Collections.sort(expectedNames) // Sort A to Z (Ascending)
		//Collections.sort(expectedNames, Collections.reverseOrder()) // Sort Z to A (Descending)

		if (actualNames == expectedNames) {
			WebUI.comment('✅ Items sorted ascending')
			assert true
		} else {
			WebUI.comment("❌ Items NOT sorted ascending!\nActual: ${actualNames}\nExpected: ${expectedNames}")
			assert false : 'Items not sorted A to Z'
		}
	}
}

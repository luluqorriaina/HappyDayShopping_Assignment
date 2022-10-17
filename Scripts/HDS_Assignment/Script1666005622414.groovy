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

Mobile.startApplication(GlobalVariable.G_HappyDayShopping, true)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('HappyDayShopping/search_button'), 0)

Mobile.tap(findTestObject('HappyDayShopping/search_field'), 0)

Mobile.setText(findTestObject('HappyDayShopping/search_field'), 'promo' + '\\n', 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('HappyDayShopping/promo_katinko'), 0)

Mobile.tap(findTestObject('HappyDayShopping/promo_katinko_addtobag'), 0)

Mobile.tap(findTestObject('HappyDayShopping/promo_item_back'), 0)

Mobile.tap(findTestObject('HappyDayShopping/promo_chicken'), 0)

Mobile.tap(findTestObject('HappyDayShopping/promo_chicken_addtobag'), 0)

Mobile.tap(findTestObject('HappyDayShopping/promo_item_back'), 0)

Mobile.tap(findTestObject('HappyDayShopping/promo_back'), 0)

Mobile.tap(findTestObject('HappyDayShopping/flash_sale_button'), 0)

Mobile.tap(findTestObject('HappyDayShopping/flash_sale_anlene'), 0)

Mobile.tap(findTestObject('HappyDayShopping/flash_sale_anlene_addtobag'), 0)

Mobile.tap(findTestObject('HappyDayShopping/promo_item_back'), 0)

Mobile.tap(findTestObject('HappyDayShopping/flash_sale_energen'), 0)

Mobile.tap(findTestObject('HappyDayShopping/promo_katinko_addtobag'), 0)

Mobile.tap(findTestObject('HappyDayShopping/your_bag_button'), 0)

Mobile.tap(findTestObject('HappyDayShopping/your_bag_next_button'), 0)

Mobile.tap(findTestObject('HappyDayShopping/clear_button'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('HappyDayShopping/yes_clear_popup'), 0)

Mobile.verifyElementVisible(findTestObject('HappyDayShopping/your_shopping_bag_is_waiting'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()


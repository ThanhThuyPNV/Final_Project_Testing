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
WebUI.navigateToUrl('https://meta.vn/')
WebUI.click(findTestObject('Object Repository/Login/Page_Mua hng online, Mua sm trc tuyn gi tt nht (1)/Page_Mua hng online, Mua sm trc tuyn gi tt nht/i_ng nhp_fa fa-user'))
WebUI.click(findTestObject('Object Repository/Login/Page_META.vn - Mua sm trc tuyn/a_ng nhp bng email'))
WebUI.setText(findTestObject('Object Repository/Login/Page_META.vn - Mua sm trc tuyn/input_form-input form-u actived'), 'phuong.zorum24student.passerellesnumeriques.org')
WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_META.vn - Mua sm trc tuyn/input_form-input form-p'), 'Evr8jbf0RWTxDTjuNeHdNw==')

WebUI.click(findTestObject('Object Repository/Login/Page_META.vn - Mua sm trc tuyn/a_ng nhp'))



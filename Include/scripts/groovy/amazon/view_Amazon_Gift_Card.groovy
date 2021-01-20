package amazon
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class view_Amazon_Gift_Card {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I navigate to Amazon Site")
	def I_navigate_to_Amazon_Site() {
		
		WebUI.openBrowser('https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&')
		WebUI.waitForPageLoad(30)
	}

	@When("I Enter username (.*) and password (.*)")
	def I_Enter_username_and_password(String username,String password) {

		WebUI.setText(findTestObject('Object Repository/Page_Amazon Sign-In/input_Email or mobile phone number_email'), username)
		WebUI.waitForPageLoad(30)
		WebUI.click(findTestObject('Object Repository/Page_Amazon Sign-In/input_Enter your email or mobile phone numb_fc7402'))

		WebUI.setText(findTestObject('Object Repository/Page_Amazon Sign-In/input_Forgot your password_password'), password)
		WebUI.waitForPageLoad(30)
	}

	@And('I click login button')
	def I_click_login_button(){
		WebUI.click(findTestObject('Object Repository/Page_Amazon Sign-In/input_Enter your password_signInSubmit'))
	}

	@Then("I should able to login successfully")
	def I_should_able_to_login_successfully() {
		WebUI.click(findTestObject('Object Repository/Page_Amazon.com Online Shopping for Electro_1f0c68/a_Gift Cards'))

		/*String Text=WebUI.getText('Object Repository/Page_Amazon.com Online Shopping for Electro_1f0c68/a_Gift Cards')
		println Text*/
	}
}
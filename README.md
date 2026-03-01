📱 Mobile Automation Framework – General Store App
🚀 Overview

This project is a Mobile Automation Framework built using:

Java

TestNG

Appium (UIAutomator2)

Page Object Model (POM)

Hybrid App Automation (Native + WebView)

The framework automates the General Store Android Application, including complete purchase flow and WebView handling.

🏗 Framework Architecture
MobileV3ow/
│
├── testBase/
│   └── BaseClass.java
│
├── pageObjects/
│   └── Page Classes (POM)
│
├── testCases/
│   ├── Tc_01LauncApp
│   ├── Tc_02Letshop
│   ├── Tc_03Us_Select
│   ├── Tc_04Validate_Toast
│   ├── Tc_05Addto_Cart
│   ├── Tc_06TermsandCondition
│   └── Tc_07CompletePurchase
│
├── resources/
│   └── General-Store.apk
│
└── testng.xml
🧪 Test Scenarios Covered
Test Case	Description
Tc_01LauncApp	Launch application
Tc_02Letshop	Fill user details
Tc_03Us_Select	Country selection
Tc_04Validate_Toast	Validate Toast message
Tc_05Addto_Cart	Add items to cart
Tc_06TermsandCondition	Validate terms and conditions
Tc_07CompletePurchase	Complete purchase & switch to WebView
⚙️ Parallel Execution Configuration

This framework supports parallel execution using TestNG.

<suite thread-count="2" name="Suite" parallel="true">

✔ Runs 2 threads simultaneously
✔ Executes AndroidTest1 and AndroidTest2 in parallel

🔧 Prerequisites

Java 21+

Maven

Appium 2.x

Android Studio

Android Emulator (API 36 recommended)

Node.js

▶️ How to Run Tests
1️⃣ Start Appium Server

Recommended (Auto Chromedriver Download):

appium --allow-insecure chromedriver_autodownload
2️⃣ Start Android Emulator

Example:

emulator-5554
3️⃣ Run TestNG Suite

From IDE:

Right click testng.xml

Run as TestNG Suite

Or using Maven:

mvn test
🌐 Hybrid App Handling

The framework handles:

driver.context("WEBVIEW_com.androidsample.generalstore");

For WebView automation:

Chromedriver version must match Chrome version inside emulator

OR use Appium auto-download option

📦 Key Capabilities Used
UiAutomator2Options options = new UiAutomator2Options();

options.setDeviceName("emulator-5554");
options.setApp("path_to_apk");
options.setAutomationName("UIAutomator2");

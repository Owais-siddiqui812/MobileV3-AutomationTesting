Mobile Automation Framework – General Store App
🚀 Overview

This project is a Mobile Test Automation Framework built using:

Java

Appium (UIAutomator2)

TestNG

Page Object Model (POM)

Hybrid App Automation (Native + WebView)

The framework automates the General Store Android Application, including complete purchase flow and WebView handling.

🏗 Framework Structure

MobileV3ow/
│
├── testBase/
│   └── BaseClass.java
│
├── pageObjects/
│   └── Page classes (POM)
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

Launch Application

Enter User Details

Country Selection

Toast Message Validation

Add Products to Cart

Validate Terms & Conditions

Complete Purchase

Switch to WebView and perform Web actions

🔧 Prerequisites

Java 21+

Maven

Appium 2.x

Node.js

Android Studio

Android Emulator (API 36 or above)

🌐Hybrid App Handling

This project handles Native and WebView contexts:

🧠 Framework Features

Page Object Model Design

Reusable Base Class

Hybrid App Automation

Toast Message Validation

Parallel Execution Support

Clean and Maintainable Code Structure

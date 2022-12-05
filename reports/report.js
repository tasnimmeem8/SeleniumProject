$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/doc.feature");
formatter.feature({
  "name": "Automated Leaftaps Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": ": TC001_Login and Logout",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@WIP"
    }
  ]
});
formatter.step({
  "name": "Launch chrome browser and load",
  "keyword": "Given "
});
formatter.step({
  "name": "enter username as \u003cusername\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "enter password as \u003cpassword\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "Click the login button",
  "keyword": "When "
});
formatter.step({
  "name": "its navigated Homepage",
  "keyword": "Then "
});
formatter.step({
  "name": "Click the logout button",
  "keyword": "Then "
});
formatter.step({
  "name": "Close browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "DemoSalesManager",
        "crmsfa"
      ]
    },
    {
      "cells": [
        "DemoCSR",
        "crmsfa"
      ]
    }
  ]
});
formatter.scenario({
  "name": ": TC001_Login and Logout",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@WIP"
    }
  ]
});
formatter.step({
  "name": "Launch chrome browser and load",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.launch_chrome_browser_and_load()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter username as DemoSalesManager",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.enter_username_as_DemoSalesManager(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password as crmsfa",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.enter_password_as_crmsfa(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "Login.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "its navigated Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.its_navigated_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.click_the_logout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": ": TC001_Login and Logout",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@WIP"
    }
  ]
});
formatter.step({
  "name": "Launch chrome browser and load",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.launch_chrome_browser_and_load()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter username as DemoCSR",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "error_message": "cucumber.runner.AmbiguousStepDefinitionsException: \"enter username as DemoCSR\" matches more than one step definition:\n  \"enter username as (.*)\" in Login.enter_username_as_DemoSalesManager(String)\n  \"enter username as DemoCSR\" in Login.enter_username_as_DemoCSR()\n\r\n\tat cucumber.runner.Glue.stepDefinitionMatch(Glue.java:92)\r\n\tat cucumber.runner.Runner.addTestStepsForPickleSteps(Runner.java:73)\r\n\tat cucumber.runner.Runner.createTestCaseForPickle(Runner.java:63)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:48)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runScenario(TestNGCucumberRunner.java:57)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.runScenario(AbstractTestNGCucumberTests.java:22)\r\n\tat java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:577)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:133)\r\n\tat org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:584)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:172)\r\n\tat org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)\r\n\tat org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:804)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:145)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)\r\n\tat java.base/java.util.ArrayList.forEach(ArrayList.java:1511)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:770)\r\n\tat org.testng.TestRunner.run(TestRunner.java:591)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:402)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:396)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:355)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:304)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1180)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1102)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1032)\r\n\tat org.testng.TestNG.run(TestNG.java:1000)\r\n\tat org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:115)\r\n\tat org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:251)\r\n\tat org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:77)\r\n",
  "status": "ambiguous"
});
formatter.step({
  "name": "enter password as crmsfa",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.enter_password_as_crmsfa(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "Login.click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "its navigated Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.its_navigated_Homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click the logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.click_the_logout_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});
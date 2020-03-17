$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/Testcase.feature");
formatter.feature({
  "line": 2,
  "name": "Jainbook Website",
  "description": "",
  "id": "jainbook-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@jainbookagency"
    }
  ]
});
formatter.scenario({
  "line": 28,
  "name": "",
  "description": "Login and cart details",
  "id": "jainbook-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@TC09_Jainbook"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "launch chrome application for ninth time",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "the user opens the jainbookagency  page",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "user gets the cart details",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "user  closes the page",
  "keyword": "Then "
});
formatter.match({
  "location": "Jainbook_Advancesearch.launch_chrome_application_for_ninth_time()"
});
formatter.result({
  "duration": 6277609598,
  "status": "passed"
});
formatter.match({
  "location": "Jainbook_Advancesearch.the_user_opens_the_jainbookagency_page()"
});
formatter.result({
  "duration": 3417368041,
  "status": "passed"
});
formatter.match({
  "location": "Jainbook_Advancesearch.user_gets_the_cart_details()"
});
formatter.result({
  "duration": 5447348760,
  "status": "passed"
});
formatter.match({
  "location": "Jainbook_Advancesearch.user_closes_the_page()"
});
formatter.result({
  "duration": 112641501,
  "error_message": "org.openqa.selenium.NoSuchSessionException: invalid session id\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027BLT079\u0027, ip: \u0027192.168.0.79\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.132, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\BLTUSE~1.BLT\\AppDa...}, goog:chromeOptions: {debuggerAddress: localhost:56664}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 699ea7d4853cbe18f36d7489a0e09e46\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.close(RemoteWebDriver.java:442)\r\n\tat com.pages.Jainbook_Advancesearchpage.quit(Jainbook_Advancesearchpage.java:120)\r\n\tat com.Stepdefinition.Jainbook_Advancesearch.user_closes_the_page(Jainbook_Advancesearch.java:104)\r\n\tat ✽.Then user  closes the page(src/main/resources/feature/Testcase.feature:33)\r\n",
  "status": "failed"
});
});
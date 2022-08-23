$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TechfiosLoginFromDatabase.feature");
formatter.feature({
  "line": 3,
  "name": "Validate Techfios login functionality",
  "description": "",
  "id": "validate-techfios-login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@DbLoginFeature"
    },
    {
      "line": 1,
      "name": "@Regression"
    },
    {
      "line": 1,
      "name": "@SedaMAMAC"
    }
  ]
});
formatter.before({
  "duration": 2486694400,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "User is on techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "TechfiosStepDefinitons.user_is_on_techfios_login_page()"
});
formatter.result({
  "duration": 271262200,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Login with valid credentials",
  "description": "",
  "id": "validate-techfios-login-functionality;login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@DBScenario1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User enters \"username\" from techfios database",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enters \"password\" from techfios database",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User clicks on signin button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 13
    }
  ],
  "location": "TechfiosStepDefinitons.user_enters_from_techfios_database(String)"
});
formatter.result({
  "duration": 3324049200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 13
    }
  ],
  "location": "TechfiosStepDefinitons.user_enters_from_techfios_database(String)"
});
formatter.result({
  "duration": 3114630600,
  "status": "passed"
});
formatter.match({
  "location": "TechfiosStepDefinitons.user_clicks_on_signin_button()"
});
formatter.result({
  "duration": 600916300,
  "status": "passed"
});
formatter.match({
  "location": "TechfiosStepDefinitons.user_should_land_on_dashboard_page()"
});
formatter.result({
  "duration": 107644100,
  "status": "passed"
});
});
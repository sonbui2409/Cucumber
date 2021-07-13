$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Loginfeature.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Login Feature",
  "description": "I want to use this template for my feature file",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 24,
  "name": "Login Valid Account",
  "description": "",
  "id": "login-feature;login-valid-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "I want to use \"Chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I want to login to page \"http://demo.guru99.com/v4/\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I input username as \"mngr340943\"",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I input password as \"rUpyjEd\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I Click to login button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I can see the home page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 15
    }
  ],
  "location": "LoginSteps.i_want_to_use(String)"
});
formatter.result({
  "duration": 2975589700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://demo.guru99.com/v4/",
      "offset": 25
    }
  ],
  "location": "LoginSteps.i_want_to_login_to_page(String)"
});
formatter.result({
  "duration": 7043476700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mngr340943",
      "offset": 21
    }
  ],
  "location": "LoginSteps.i_input_username_as(String)"
});
formatter.result({
  "duration": 128110600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rUpyjEd",
      "offset": 21
    }
  ],
  "location": "LoginSteps.i_input_password_as(String)"
});
formatter.result({
  "duration": 91210900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_Click_to_login_button()"
});
formatter.result({
  "duration": 2172772700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_can_see_the_home_page()"
});
formatter.result({
  "duration": 8504200,
  "status": "passed"
});
formatter.after({
  "duration": 107667100,
  "status": "passed"
});
formatter.uri("Loginfeature2.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Login Feature",
  "description": "I want to use this template for my feature file",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 24,
  "name": "Login Valid Account",
  "description": "",
  "id": "login-feature;login-valid-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "I want to use \"Firefox\"",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I want to login to page \"http://demo.guru99.com/v4/\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I input username as \"mngr340943\"",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I input password as \"rUpyjEd\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I Click to login button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I can see the home page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Firefox",
      "offset": 15
    }
  ],
  "location": "LoginSteps.i_want_to_use(String)"
});
formatter.result({
  "duration": 3963795000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://demo.guru99.com/v4/",
      "offset": 25
    }
  ],
  "location": "LoginSteps.i_want_to_login_to_page(String)"
});
formatter.result({
  "duration": 2866071100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mngr340943",
      "offset": 21
    }
  ],
  "location": "LoginSteps.i_input_username_as(String)"
});
formatter.result({
  "duration": 61722100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rUpyjEd",
      "offset": 21
    }
  ],
  "location": "LoginSteps.i_input_password_as(String)"
});
formatter.result({
  "duration": 19635900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_Click_to_login_button()"
});
formatter.result({
  "duration": 1995065200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_can_see_the_home_page()"
});
formatter.result({
  "duration": 2727500,
  "status": "passed"
});
formatter.after({
  "duration": 612651500,
  "status": "passed"
});
});
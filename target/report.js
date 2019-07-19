$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Selenium/Tarrifplan/features/twomapping.feature");
formatter.feature({
  "name": "to add my customer plan",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "to add customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user should be telecom homepage and click the add customer",
  "keyword": "Given "
});
formatter.match({
  "location": "Addcutomersteps.the_user_should_be_telecom_homepage_and_click_the_add_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user provide valid details",
  "rows": [
    {
      "cells": [
        "fname",
        "lname",
        "email",
        "address",
        "phone"
      ]
    },
    {
      "cells": [
        "sidhu",
        "js",
        "gg@gmail.com",
        "chennai",
        "6452121"
      ]
    },
    {
      "cells": [
        "vignesh",
        "m",
        "vv@gmail.com",
        "erode",
        "99541211"
      ]
    },
    {
      "cells": [
        "aravind",
        "s",
        "aa@gmail.com",
        "trichy",
        "545512"
      ]
    },
    {
      "cells": [
        "dinesh",
        "s",
        "ddd@gmail.com",
        "namakkal",
        "54515151"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Addcutomersteps.the_user_provide_valid_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user submits the form",
  "keyword": "And "
});
formatter.match({
  "location": "Addcutomersteps.the_user_submits_the_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To genatrate the customer id",
  "keyword": "Then "
});
formatter.match({
  "location": "Addcutomersteps.to_genatrate_the_customer_id()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
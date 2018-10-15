$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("quick_connect/quick_connect.feature");
formatter.feature({
  "line": 1,
  "name": "Quick Connect",
  "description": "",
  "id": "quick-connect",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2307341923,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "IPV should allow user to establish a vpn connection",
  "description": "",
  "id": "quick-connect;ipv-should-allow-user-to-establish-a-vpn-connection",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "IPV is accessible",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I attemp to connection",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I should successfully connect",
  "keyword": "Then "
});
formatter.match({
  "location": "IPSteps.ipvIsAccessible()"
});
formatter.result({
  "duration": 95112203,
  "status": "passed"
});
formatter.match({
  "location": "IPSteps.iAttempToConnection()"
});
formatter.result({
  "duration": 8188486827,
  "status": "passed"
});
formatter.match({
  "location": "IPSteps.iShouldSuccessfullyConnect()"
});
formatter.result({
  "duration": 1786593787,
  "status": "passed"
});
});
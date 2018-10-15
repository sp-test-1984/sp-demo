Feature: Quick Connect
    Scenario: IPV should allow user to establish a vpn connection
       Given IPV is accessible
       When I attemp to connection
       Then I should successfully connect
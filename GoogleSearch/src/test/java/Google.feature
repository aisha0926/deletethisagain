Feature: Google search

  As a person
  I want to search a word
  So that I can find information about it
#
#  Scenario: Push an item into a stack
#    Given an empty stack
#    When I push an item into the stack
#    Then the stack contains one item
#
#  Scenario: Push two items into a stack
#    Given an empty stack
#    When I push an item into the stack
#    And I push another item into the stack
#    Then the stack contains two items
#
#  Scenario: Pop a given item from the stack
#    Given an empty stack
#    When I push an item into the stack
#    And I pop from the stack
#    Then I get the same item back

#  Scenario: Pop a given item from the stack
#    Given aasdasdck
#    When Iasdasd
#    And I poasd
#    Then I get the saasd

  Scenario Outline: Searching keywords in google
    Given: I go to "<website>"
    When: I search the "<searchTerm>"
    Then: Information is displayed

    Examples:
      | website   | searchTerm |
      | https://www.bing.com | QAConsulting |
      | https://www.bing.com | Guru99 |
      | https://www.bing.com | BlazeDemo |
      | https://www.bing.com | Automated Testing |
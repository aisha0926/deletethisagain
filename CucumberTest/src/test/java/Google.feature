Feature: Searching google with keyword
  As a person
  I want to search keywords
  So that I can find informations

  Scenario Outline: Searching the keywords
    Given I go to "<website>" website
    When I search for "<keywords>" keyword
    Then I am taken to the page
    Examples:
    | website | keywords |
    | https://www.google.co.uk | mamamoo |
    | https://www.google.co.uk | tree |

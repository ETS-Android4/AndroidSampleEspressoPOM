Feature: Home Screen Features


#  Scenario: Sample Test
#    Given get '/'
#    When search for 'qaf github infostretch'
#    Then verify link with partial text 'qaf' is present
	#@Smoke
# #@dataFile: resources/env1/data/data.json
#  #META-DATA: {"dataFile":"resources/env1/data/data.json","description":"Facebook Search in Google"}

  @launchscreen
  Scenario: Verify Cards title presence
    Given User Launches App
    When User is on Home Screen
    Then Verify Cards title presence
#    Then Verify Dialogs presence and click
#    Then Verify Widgets presence and click

  @launchscreen
  Scenario: Verify Dialogs title presence
    Given User Launches App
    When User is on Home Screen
    Then Verify Cards title presence
    Then Verify Dialogs presence and click

  @launchscreen
  Scenario: Verify Widgets title presence
    Given User Launches App
    When User is on Home Screen
    Then Verify Cards title presence
    Then Verify Dialogs presence and click
    Then Verify Widgets presence and click

  @launchscreen
  Scenario: Verify Menu and Click Bottom Navigation
    Given User Launches App
    When User is on Home Screen
    Then Verify presence of Menu and click
    And Verify presence of Bottom Navigation and click
    Then Verify Blue bottom navigation presence
    Then Click back button

  @launchscreen
  Scenario: Verify About from Menu
    Given User Launches App
    When User is on Home Screen
    Then Verify presence of Menu and click
    And Verify  presence of About and click
    Then Verify Back button on About Screen

  @launchscreen
  Scenario: Verify My Apps from Menu
    Given User Launches App
    When User is on Home Screen
    Then Verify presence of Menu and click
    And Verify  presence of My Apps and click
    Then Verify Back button on My Apps Screen

  @launchscreen
  Scenario: Verify Recycler view from Menu
    Given User Launches App
    When User is on Home Screen
    Then Verify presence of Menu and click
    And Verify presence of Recycler view and click
#   Then Verify clicking Add button on bottom of screen
    Then Verify Back button on Recycler view Screen

#  @launchscreen
#  Scenario: Verify Green Yellow Red at bottom navigation
#    Given User Launches App
#    When User is on Home Screen
#    Then Verify presence of Menu and click
#    And Verify presence of Bottom Navigation and click
#    Then Verify Blue bottom navigation presence
#    Then Verify Green bottom navigation presence and click
#    Then Verify Yellow bottom navigation presence and click
#    Then Verify Red bottom navigation presence and click



[Drive link with the spreadsheet and diagrams](https://drive.google.com/drive/folders/1Uqw41vgWFhyYZAnJ7p62rF6t0JYFtLV8)

# Feature: Learning Path
  As a user
  I want to follow a learning path
  So that I can learn new skills

# Scenario 1: Select Backend Path
  Given I am on the home page
  When I select the Backend path
  Then I should see the modules related to Backend

# Scenario 2: Complete HTML Module
  Given I am on the Frontend path
  When I complete the HTML module
  Then the JavaScript module should be unlocked

# Scenario 3: Fail HTML Module Quiz
  Given I am taking the HTML module quiz
  When I fail the quiz
  Then I should have the option to retake the quiz

# Scenario 4: Pass HTML Module Quiz
  Given I am taking the HTML module quiz
  When I pass the quiz
  Then the JavaScript module should be unlocked

# Scenario 5: View HTML Module Explanatory Links
  Given I am on the HTML module
  When I click on the explanatory link
  Then I should be directed to the explanatory content

# Scenario 6: Select DevOps Path
  Given I am on the home page
  When I select the DevOps path
  Then I should see the modules related to DevOps

# Scenario 7: Complete Backend Path
  Given I am on the Backend path
  When I complete all the modules
  Then I should receive a completion certificate

# Scenario 8: View Progress on Frontend Path
  Given I am on the Frontend path
  When I view my progress
  Then I should see the completed modules and the pending ones

# Scenario 9: Return to Completed Module
  Given I have completed the HTML module
  When I return to the HTML module
  Then I should be able to review the content and the quiz

# Scenario 10: Try to Access Locked Module
  Given I am on the Frontend path
  When I try to access the JavaScript module without completing the HTML module
  Then I should be informed that I need to complete the HTML module first

## Copyright ®️ 2024 | techtree

# Minimal reproducible example for Intellij Idea issue [SCL-24824](https://youtrack.jetbrains.com/issue/SCL-24824/org.jetbrains.PropertyKey-smart-completion-and-find-usages-does-not-work-with-infix-notation)

Intellij create method intention issue

This project uses sbt version 1.9.9, Scala 3.7.4

Should open using Intellij Idea with the Scala plugin

![Intellij Idea create method issue](https://youtrack.jetbrains.com/api/files/74-3137288?sign=MTc2Njk2NjQwMDAwMHwxMS0xNDU5MjEzfDc0LTMxMzcyODh8Y01PS25seEQ4NzBFRzFMX0VVaUN4ak81ZDlyZjdSOWR0dU1nV0lOSTNCTQ0K&updated=1766757357963)

### Explain how the above behavior isn't what you expected

Looking at the screenshot above, you can see how the create method intention does not show up in scala 3 for
methods that don't exist.

In scala 2, the create method intention shows up as expected.

.idea folder included according to the default .gitignore file for Intellij Idea projects located
in idea/.gitignore

sbt artifacts are ignored in the top level .gitignore file

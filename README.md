# Minimal reproducible example for Intellij Idea issue [SCL-24825](https://youtrack.jetbrains.com/issue/SCL-24825/Create-method-intent-does-not-show-up-in-Scala-3)

Intellij create method intention issue

This project uses sbt version 1.9.9, Scala 3.7.4

Should open using Intellij Idea with the Scala plugin

![Intellij Idea create method issue](https://youtrack.jetbrains.com/api/files/74-3137313?sign=MTc2Njk2NjQwMDAwMHwxMS0xNDU5MjEzfDc0LTMxMzczMTN8WktVN08wcDludHV6MTUxSXVBWUtRcTRod0hwYktuNy1LTTZKTjBWZms3SQ0K&updated=1766759676418)

### Explain how the above behavior isn't what you expected

Looking at the screenshot above, you can see how the create method intention does not show up in scala 3 for
methods that don't exist.

In scala 2, the create method intention shows up as expected, as shown below.

![Intellij Idea create method issue](https://youtrack.jetbrains.com/api/files/74-3137314?sign=MTc2Njk2NjQwMDAwMHwxMS0xNDU5MjEzfDc0LTMxMzczMTR8OXluY2JwZUowOXZ6bnFyZ1l3SVNNRzdaOHpzeVlaVXZpelZlYW4tZVEzMA0K&updated=1766759737003)

When executing the intent, it shows up the following live template:

![Intellij Idea create method issue](https://youtrack.jetbrains.com/api/files/74-3137317?sign=MTc2Njk2NjQwMDAwMHwxMS0xNDU5MjEzfDc0LTMxMzczMTd8aUFXVl9GNm9CbV81bkl5cVFKellISmdIbjdxQXZtMTdveFBOSU52NWlQYw0K&updated=1766759786535)

.idea folder included according to the default .gitignore file for Intellij Idea projects located
in idea/.gitignore

sbt artifacts are ignored in the top level .gitignore file

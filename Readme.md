[![Build Status](https://app.travis-ci.com/gptshubham595/avl_java_travis.svg?branch=master)](https://app.travis-ci.com/gptshubham595/avl_java_travis)
[![Code Coverage](https://codecov.io/github/gptshubham595/avl_java_travis/coverage.svg)](https://codecov.io/gh/gptshubham595/avl_java_travis)

- It uses the [JUnit](https://junit.org) testing framework


## Code Coverage with CodeCov

This repository also integrates with Codecov to generate reports.

What's done for you:
- The [JaCoCo](https://www.jacoco.org) plugin is included in `pom.xml`
- On `.travis.yml`, `after_success` target executes the Codecov script.

If you want to use it:
- Go to the Codecov website and create an account and setup permissions.
- Add your repository (you can go there directly by going to https://codecov.io/gh/your-github-username/travis-ci-tutorial-java)
- Fix the `README.md` badge.

If you don't want it:
- Remove the [JaCoCo](https://www.jacoco.org) plugin from the `pom.xml`.
- Remove the `after_success` target in `.travis.yml`
- Remove the badge from `README.md`


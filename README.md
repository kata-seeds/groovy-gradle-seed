# [Kata Seeds](http://kata-seeds.github.io): [Groovy][groovy]

[![Build Status][travis-svg]][travis]

## Getting Started

Clone this repo with `git`:

    git clone https://github.com/kata-seeds/language-seed.git
    cd language-seed

Install dependencies and run your tests with `make`:

    make

You should eventually see 1 test ran and 0 failures. If `make` doesn't work for
you, please open an issue.

Optionally generate groovydoc.  View it at `build/docs/groovydoc/index.html`.

    ./gradlew groovydoc

Test with other versions of Groovy.

    GROOVY_VERSION="2.3.9" ./gradlew check

Now you can start your kata! May we suggest the [Game of Life][GoL]?

[GoL]: http://en.wikipedia.org/wiki/Conway's_Game_of_Life
[groovy]: http://groovy.codehaus.org/
[travis]: https://travis-ci.org/kata-seeds/groovy-gradle-seed
[travis-svg]: https://travis-ci.org/kata-seeds/groovy-gradle-seed.svg?branch=master
